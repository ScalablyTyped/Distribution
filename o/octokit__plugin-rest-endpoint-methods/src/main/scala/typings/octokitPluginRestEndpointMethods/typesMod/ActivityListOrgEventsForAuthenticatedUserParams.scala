package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListOrgEventsForAuthenticatedUserParams extends js.Object {
  var org: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var username: String
}

object ActivityListOrgEventsForAuthenticatedUserParams {
  @scala.inline
  def apply(org: String, username: String, page: Int | Double = null, per_page: Int | Double = null): ActivityListOrgEventsForAuthenticatedUserParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityListOrgEventsForAuthenticatedUserParams]
  }
}

