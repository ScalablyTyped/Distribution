package typings.octokitPluginRestEndpointMethods.typesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.all
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.asc
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.closed
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.completeness
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.desc
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.due_on
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListMilestonesForRepoParams extends js.Object {
  /**
    * The direction of the sort. Either `asc` or `desc`.
    */
  var direction: js.UndefOr[asc | desc] = js.undefined
  var owner: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
  /**
    * What to sort results by. Either `due_on` or `completeness`.
    */
  var sort: js.UndefOr[due_on | completeness] = js.undefined
  /**
    * The state of the milestone. Either `open`, `closed`, or `all`.
    */
  var state: js.UndefOr[open | closed | all] = js.undefined
}

object IssuesListMilestonesForRepoParams {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    direction: asc | desc = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    sort: due_on | completeness = null,
    state: open | closed | all = null
  ): IssuesListMilestonesForRepoParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesListMilestonesForRepoParams]
  }
}

