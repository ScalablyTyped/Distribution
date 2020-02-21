package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.`long-running`
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.all
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.asc
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.closed
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.created
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.desc
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.open
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.popularity
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListParams extends js.Object {
  /**
    * Filter pulls by base branch name. Example: `gh-pages`.
    */
  var base: js.UndefOr[String] = js.undefined
  /**
    * The direction of the sort. Can be either `asc` or `desc`. Default: `desc` when sort is `created` or sort is not specified, otherwise `asc`.
    */
  var direction: js.UndefOr[asc | desc] = js.undefined
  /**
    * Filter pulls by head user or head organization and branch name in the format of `user:ref-name` or `organization:ref-name`. For example: `github:new-script-format` or `octocat:test-branch`.
    */
  var head: js.UndefOr[String] = js.undefined
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
    * What to sort results by. Can be either `created`, `updated`, `popularity` (comment count) or `long-running` (age, filtering by pulls updated in the last month).
    */
  var sort: js.UndefOr[created | updated | popularity | `long-running`] = js.undefined
  /**
    * Either `open`, `closed`, or `all` to filter by state.
    */
  var state: js.UndefOr[open | closed | all] = js.undefined
}

object PullsListParams {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    base: String = null,
    direction: asc | desc = null,
    head: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    sort: created | updated | popularity | `long-running` = null,
    state: open | closed | all = null
  ): PullsListParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsListParams]
  }
}

