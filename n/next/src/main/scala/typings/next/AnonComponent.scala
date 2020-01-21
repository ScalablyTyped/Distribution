package typings.next

import typings.next.routerMod.NextRouter
import typings.next.utilsMod.NextComponentType
import typings.next.utilsMod.NextPageContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponent[P, R /* <: NextRouter */] extends js.Object {
  var Component: NextComponentType[NextPageContext, _, P]
  var router: R
}

object AnonComponent {
  @scala.inline
  def apply[P, R /* <: NextRouter */](Component: NextComponentType[NextPageContext, _, P], router: R): AnonComponent[P, R] = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonComponent[P, R]]
  }
}

