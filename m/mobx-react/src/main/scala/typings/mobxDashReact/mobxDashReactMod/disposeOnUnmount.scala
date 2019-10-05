package typings.mobxDashReact.mobxDashReactMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react", "disposeOnUnmount")
@js.native
object disposeOnUnmount extends js.Object {
  def apply(target: Component[_, _, _], propertyKey: String): Unit = js.native
  def apply[TF /* <: Disposer | js.Array[Disposer] */](target: Component[_, _, _], fn: TF): TF = js.native
}

