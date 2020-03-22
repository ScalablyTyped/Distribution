package typings.octokitPluginRestEndpointMethods.typesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.asc
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.created
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.desc
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListReposStarredByUserParams extends js.Object {
  /**
    * One of `asc` (ascending) or `desc` (descending).
    */
  var direction: js.UndefOr[asc | desc] = js.undefined
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  /**
    * One of `created` (when the repository was starred) or `updated` (when it was last pushed to).
    */
  var sort: js.UndefOr[created | updated] = js.undefined
  var username: String
}

object ActivityListReposStarredByUserParams {
  @scala.inline
  def apply(
    username: String,
    direction: asc | desc = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    sort: created | updated = null
  ): ActivityListReposStarredByUserParams = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityListReposStarredByUserParams]
  }
}

