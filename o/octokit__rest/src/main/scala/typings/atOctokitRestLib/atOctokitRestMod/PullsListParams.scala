package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListParams extends js.Object {
  /**
    * Filter pulls by base branch name. Example: `gh-pages`.
    */
  var base: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The direction of the sort. Can be either `asc` or `desc`.
    */
  var direction: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.asc | atOctokitRestLib.atOctokitRestLibStrings.desc
  ] = js.undefined
  /**
    * Filter pulls by head user or head organization and branch name in the format of `user:ref-name` or `organization:ref-name`. For example: `github:new-script-format` or `octocat:test-branch`.
    */
  var head: js.UndefOr[java.lang.String] = js.undefined
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
    * What to sort results by. Can be either `created`, `updated`, `popularity` (comment count) or `long-running` (age, filtering by pulls updated in the last month).
    */
  var sort: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.created | atOctokitRestLib.atOctokitRestLibStrings.updated | atOctokitRestLib.atOctokitRestLibStrings.popularity | atOctokitRestLib.atOctokitRestLibStrings.`long-running`
  ] = js.undefined
  /**
    * Either `open`, `closed`, or `all` to filter by state.
    */
  var state: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.open | atOctokitRestLib.atOctokitRestLibStrings.closed | atOctokitRestLib.atOctokitRestLibStrings.all
  ] = js.undefined
}

object PullsListParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    base: java.lang.String = null,
    direction: atOctokitRestLib.atOctokitRestLibStrings.asc | atOctokitRestLib.atOctokitRestLibStrings.desc = null,
    head: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    sort: atOctokitRestLib.atOctokitRestLibStrings.created | atOctokitRestLib.atOctokitRestLibStrings.updated | atOctokitRestLib.atOctokitRestLibStrings.popularity | atOctokitRestLib.atOctokitRestLibStrings.`long-running` = null,
    state: atOctokitRestLib.atOctokitRestLibStrings.open | atOctokitRestLib.atOctokitRestLibStrings.closed | atOctokitRestLib.atOctokitRestLibStrings.all = null
  ): PullsListParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (base != null) __obj.updateDynamic("base")(base)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsListParams]
  }
}

