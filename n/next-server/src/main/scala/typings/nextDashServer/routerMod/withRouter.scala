package typings.nextDashServer.routerMod

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/router", "withRouter")
@js.native
object withRouter extends js.Object {
  def apply[T /* <: js.Object */, Q](Component: ComponentType[T with WithRouterProps[Q]]): ComponentType[Omit[T, String]] = js.native
}

