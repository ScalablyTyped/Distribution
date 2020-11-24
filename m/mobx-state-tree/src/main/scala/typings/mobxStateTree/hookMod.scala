package typings.mobxStateTree

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/core/node/Hook", JSImport.Namespace)
@js.native
object hookMod extends js.Object {
  
  @js.native
  sealed trait Hook extends js.Object
  @js.native
  object Hook extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Hook with String] = js.native
    
    @js.native
    sealed trait afterAttach extends Hook
    /* "afterAttach" */ @js.native
    object afterAttach extends TopLevel[afterAttach with String]
    
    @js.native
    sealed trait afterCreate extends Hook
    /* "afterCreate" */ @js.native
    object afterCreate extends TopLevel[afterCreate with String]
    
    @js.native
    sealed trait afterCreationFinalization extends Hook
    /* "afterCreationFinalization" */ @js.native
    object afterCreationFinalization extends TopLevel[afterCreationFinalization with String]
    
    @js.native
    sealed trait beforeDestroy extends Hook
    /* "beforeDestroy" */ @js.native
    object beforeDestroy extends TopLevel[beforeDestroy with String]
    
    @js.native
    sealed trait beforeDetach extends Hook
    /* "beforeDetach" */ @js.native
    object beforeDetach extends TopLevel[beforeDetach with String]
  }
  
  @js.native
  trait IHooks extends js.Object
  
  type IHooksGetter[T] = js.Function1[/* self */ T, IHooks]
}
