package typings.mobxReact

import typings.react.mod.Component
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disposeOnUnmountMod {
  
  @JSImport("mobx-react/dist/disposeOnUnmount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def disposeOnUnmount(target: Component[js.Any, js.Any, js.Any], propertyKey: PropertyKey): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disposeOnUnmount")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def disposeOnUnmount_TF_UnionDisposerArrayDisposer_TF[TF /* <: Disposer | js.Array[Disposer] */](target: Component[js.Any, js.Any, js.Any], fn: TF): TF = (^.asInstanceOf[js.Dynamic].applyDynamic("disposeOnUnmount")(target.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[TF]
  
  type Disposer = js.Function0[Unit]
}
