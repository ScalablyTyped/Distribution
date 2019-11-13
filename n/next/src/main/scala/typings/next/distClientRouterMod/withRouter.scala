package typings.next.distClientRouterMod

import typings.next.distClientWithDashRouterMod.ExcludeRouterProps
import typings.next.distClientWithDashRouterMod.WithRouterProps
import typings.next.distNextDashServerLibUtilsMod.NextComponentType
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/client/router", "withRouter")
@js.native
object withRouter extends js.Object {
  def apply[P /* <: WithRouterProps */, C](ComposedComponent: NextComponentType[C, _, P]): ComponentClass[ExcludeRouterProps[P], ComponentState] = js.native
}

