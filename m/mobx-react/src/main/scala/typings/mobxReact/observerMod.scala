package typings.mobxReact

import typings.mobxReact.ireactcomponentMod.IReactComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react/dist/observer", JSImport.Namespace)
@js.native
object observerMod extends js.Object {
  def observer[T /* <: IReactComponent[_] */](component: T): T = js.native
}

