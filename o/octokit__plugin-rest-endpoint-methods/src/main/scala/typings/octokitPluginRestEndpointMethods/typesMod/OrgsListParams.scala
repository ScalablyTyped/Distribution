package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListParams extends js.Object {
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  /**
    * The integer ID of the last organization that you've seen.
    */
  var since: js.UndefOr[Double] = js.undefined
}

object OrgsListParams {
  @scala.inline
  def apply(page: Int | Double = null, per_page: Int | Double = null, since: Int | Double = null): OrgsListParams = {
    val __obj = js.Dynamic.literal()
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListParams]
  }
}

