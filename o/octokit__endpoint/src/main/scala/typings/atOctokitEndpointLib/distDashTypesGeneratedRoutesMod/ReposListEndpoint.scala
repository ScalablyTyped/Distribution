package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListEndpoint extends js.Object {
  var affiliation: js.UndefOr[java.lang.String] = js.undefined
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var sort: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var visibility: js.UndefOr[java.lang.String] = js.undefined
}

object ReposListEndpoint {
  @scala.inline
  def apply(
    affiliation: java.lang.String = null,
    direction: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    sort: java.lang.String = null,
    `type`: java.lang.String = null,
    visibility: java.lang.String = null
  ): ReposListEndpoint = {
    val __obj = js.Dynamic.literal()
    if (affiliation != null) __obj.updateDynamic("affiliation")(affiliation)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[ReposListEndpoint]
  }
}

