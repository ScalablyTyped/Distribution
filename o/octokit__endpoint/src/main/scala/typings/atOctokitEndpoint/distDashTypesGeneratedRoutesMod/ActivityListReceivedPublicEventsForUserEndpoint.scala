package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListReceivedPublicEventsForUserEndpoint extends js.Object {
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var username: String
}

object ActivityListReceivedPublicEventsForUserEndpoint {
  @scala.inline
  def apply(username: String, page: Int | Double = null, per_page: Int | Double = null): ActivityListReceivedPublicEventsForUserEndpoint = {
    val __obj = js.Dynamic.literal(username = username)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityListReceivedPublicEventsForUserEndpoint]
  }
}

