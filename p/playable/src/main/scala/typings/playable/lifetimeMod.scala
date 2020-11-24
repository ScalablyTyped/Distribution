package typings.playable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/core/dependency-container/constants/Lifetime", JSImport.Namespace)
@js.native
object lifetimeMod extends js.Object {
  
  @js.native
  sealed trait Lifetime extends js.Object
  @js.native
  object Lifetime extends js.Object {
    
    @js.native
    sealed trait SCOPED extends Lifetime
    
    @js.native
    sealed trait SINGLETON extends Lifetime
    
    @js.native
    sealed trait TRANSIENT extends Lifetime
  }
  
  @js.native
  object default extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Lifetime with String] = js.native
    
    /* "scoped" */ val SCOPED: typings.playable.lifetimeMod.Lifetime.SCOPED with String = js.native
    
    /* "singleton" */ val SINGLETON: typings.playable.lifetimeMod.Lifetime.SINGLETON with String = js.native
    
    /* "transient" */ val TRANSIENT: typings.playable.lifetimeMod.Lifetime.TRANSIENT with String = js.native
  }
}
