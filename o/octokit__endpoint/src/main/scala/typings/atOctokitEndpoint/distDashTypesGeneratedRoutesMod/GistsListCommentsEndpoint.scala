package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsListCommentsEndpoint extends js.Object {
  var gist_id: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
}

object GistsListCommentsEndpoint {
  @scala.inline
  def apply(gist_id: String, page: Int | Double = null, per_page: Int | Double = null): GistsListCommentsEndpoint = {
    val __obj = js.Dynamic.literal(gist_id = gist_id)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsListCommentsEndpoint]
  }
}

