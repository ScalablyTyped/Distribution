package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListOutsideCollaborators_Options extends js.Object {
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var org: java.lang.String
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
}

object OrgsListOutsideCollaborators_Options {
  @scala.inline
  def apply(
    org: java.lang.String,
    filter: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): OrgsListOutsideCollaborators_Options = {
    val __obj = js.Dynamic.literal(org = org)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListOutsideCollaborators_Options]
  }
}

