package typings.mobxReact

import typings.react.mod.Component
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-react/dist/disposeOnUnmount", JSImport.Namespace)
@js.native
object disposeOnUnmountMod extends js.Object {
  
  def disposeOnUnmount(target: Component[_, _, _], propertyKey: PropertyKey): Unit = js.native
  def disposeOnUnmount[TF /* <: Disposer | js.Array[Disposer] */](target: Component[_, _, _], fn: TF): TF = js.native
  
  type Disposer = js.Function0[Unit]
}
