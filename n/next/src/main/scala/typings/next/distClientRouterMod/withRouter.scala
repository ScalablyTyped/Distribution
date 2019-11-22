package typings.next.distClientRouterMod

import typings.next.distClientWithDashRouterMod.ExcludeRouterProps
import typings.next.distClientWithDashRouterMod.WithRouterProps
import typings.next.distNextDashServerLibUtilsMod.NextComponentType
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/client/router", "withRouter")
@js.native
object withRouter extends js.Object {
  def apply[P /* <: WithRouterProps */, C](ComposedComponent: NextComponentType[C, _, P]): ComponentType[ExcludeRouterProps[P]] = js.native
}

