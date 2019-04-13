package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListMilestonesForRepoParams extends js.Object {
  /**
    * The direction of the sort. Either `asc` or `desc`.
    */
  var direction: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.asc | atOctokitRestLib.atOctokitRestLibStrings.desc
  ] = js.undefined
  var owner: java.lang.String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var repo: java.lang.String
  /**
    * What to sort results by. Either `due_on` or `completeness`.
    */
  var sort: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.due_on | atOctokitRestLib.atOctokitRestLibStrings.completeness
  ] = js.undefined
  /**
    * The state of the milestone. Either `open`, `closed`, or `all`.
    */
  var state: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.open | atOctokitRestLib.atOctokitRestLibStrings.closed | atOctokitRestLib.atOctokitRestLibStrings.all
  ] = js.undefined
}

object IssuesListMilestonesForRepoParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    direction: atOctokitRestLib.atOctokitRestLibStrings.asc | atOctokitRestLib.atOctokitRestLibStrings.desc = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    sort: atOctokitRestLib.atOctokitRestLibStrings.due_on | atOctokitRestLib.atOctokitRestLibStrings.completeness = null,
    state: atOctokitRestLib.atOctokitRestLibStrings.open | atOctokitRestLib.atOctokitRestLibStrings.closed | atOctokitRestLib.atOctokitRestLibStrings.all = null
  ): IssuesListMilestonesForRepoParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesListMilestonesForRepoParams]
  }
}

