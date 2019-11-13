package typings.next

import typings.next.distNextDashServerLibRouterRouterMod.NextRouter
import typings.next.distNextDashServerLibUtilsMod.NextComponentType
import typings.next.distNextDashServerLibUtilsMod.NextPageContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComponentRouter[P, R /* <: NextRouter */] extends js.Object {
  var Component: NextComponentType[NextPageContext, _, P]
  var router: R
}

object Anon_ComponentRouter {
  @scala.inline
  def apply[P, R /* <: NextRouter */](Component: NextComponentType[NextPageContext, _, P], router: R): Anon_ComponentRouter[P, R] = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ComponentRouter[P, R]]
  }
}

