package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsListCommentsEndpoint extends js.Object {
  var gist_id: java.lang.String
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
}

object GistsListCommentsEndpoint {
  @scala.inline
  def apply(
    gist_id: java.lang.String,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): GistsListCommentsEndpoint = {
    val __obj = js.Dynamic.literal(gist_id = gist_id)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsListCommentsEndpoint]
  }
}

