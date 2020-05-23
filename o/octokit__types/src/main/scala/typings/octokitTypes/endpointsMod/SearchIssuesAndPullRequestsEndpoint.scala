package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`reactions--1`
import typings.octokitTypes.octokitTypesStrings.`reactions-Plussign1`
import typings.octokitTypes.octokitTypesStrings.`reactions-heart`
import typings.octokitTypes.octokitTypesStrings.`reactions-smile`
import typings.octokitTypes.octokitTypesStrings.`reactions-tada`
import typings.octokitTypes.octokitTypesStrings.`reactions-thinking_face`
import typings.octokitTypes.octokitTypesStrings.asc
import typings.octokitTypes.octokitTypesStrings.comments
import typings.octokitTypes.octokitTypesStrings.created
import typings.octokitTypes.octokitTypesStrings.desc
import typings.octokitTypes.octokitTypesStrings.interactions
import typings.octokitTypes.octokitTypesStrings.reactions
import typings.octokitTypes.octokitTypesStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchIssuesAndPullRequestsEndpoint extends js.Object {
  /**
    * Determines whether the first search result returned is the highest number of matches (`desc`) or lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
    */
  var order: js.UndefOr[desc | asc] = js.undefined
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  /**
    * The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as GitHub.com. To learn more about the format of the query, see [Constructing a search query](https://developer.github.com/v3/search/#constructing-a-search-query). See "[Searching issues and pull requests](https://help.github.com/articles/searching-issues-and-pull-requests/)" for a detailed list of qualifiers.
    */
  var q: String
  /**
    * Sorts the results of your query by the number of `comments`, `reactions`, `reactions-+1`, `reactions--1`, `reactions-smile`, `reactions-thinking_face`, `reactions-heart`, `reactions-tada`, or `interactions`. You can also sort results by how recently the items were `created` or `updated`, Default: [best match](https://developer.github.com/v3/search/#ranking-search-results)
    */
  var sort: js.UndefOr[
    comments | reactions | `reactions-Plussign1` | `reactions--1` | `reactions-smile` | `reactions-thinking_face` | `reactions-heart` | `reactions-tada` | interactions | created | updated
  ] = js.undefined
}

object SearchIssuesAndPullRequestsEndpoint {
  @scala.inline
  def apply(
    q: String,
    order: desc | asc = null,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined,
    sort: comments | reactions | `reactions-Plussign1` | `reactions--1` | `reactions-smile` | `reactions-thinking_face` | `reactions-heart` | `reactions-tada` | interactions | created | updated = null
  ): SearchIssuesAndPullRequestsEndpoint = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchIssuesAndPullRequestsEndpoint]
  }
}

