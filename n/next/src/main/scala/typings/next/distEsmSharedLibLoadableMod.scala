package typings.next

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSharedLibLoadableMod extends Shortcut {
  
  @JSImport("next/dist/esm/shared/lib/loadable", JSImport.Namespace)
  @js.native
  val ^ : ILoadable = js.native
  
  @js.native
  trait ILoadable extends StObject {
    
    def apply[P](opts: Any): ComponentClass[P, ComponentState] = js.native
    
    def Map[P](opts: Any): ComponentType[P] = js.native
    
    def preloadAll(): js.Promise[Any] = js.native
  }
  
  type _To = ILoadable
  
  /* This means you don't have to write `^`, but can instead just say `distEsmSharedLibLoadableMod.foo` */
  override def _to: ILoadable = ^
}
