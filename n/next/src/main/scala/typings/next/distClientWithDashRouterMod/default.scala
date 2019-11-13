package typings.next.distClientWithDashRouterMod

import typings.next.distNextDashServerLibUtilsMod.NextComponentType
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/client/with-router", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[P /* <: WithRouterProps */, C](ComposedComponent: NextComponentType[C, _, P]): ComponentClass[ExcludeRouterProps[P], ComponentState] = js.native
}

