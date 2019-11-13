package typings.next.distClientWithDashRouterMod

import typings.next.distNextDashServerLibRouterRouterMod.NextRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithRouterProps extends js.Object {
  var router: NextRouter
}

object WithRouterProps {
  @scala.inline
  def apply(router: NextRouter): WithRouterProps = {
    val __obj = js.Dynamic.literal(router = router)
  
    __obj.asInstanceOf[WithRouterProps]
  }
}

