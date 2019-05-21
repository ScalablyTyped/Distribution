package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListForUserEndpoint extends js.Object {
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var sort: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var username: java.lang.String
}

object ReposListForUserEndpoint {
  @scala.inline
  def apply(
    username: java.lang.String,
    direction: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    sort: java.lang.String = null,
    `type`: java.lang.String = null
  ): ReposListForUserEndpoint = {
    val __obj = js.Dynamic.literal(username = username)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReposListForUserEndpoint]
  }
}

