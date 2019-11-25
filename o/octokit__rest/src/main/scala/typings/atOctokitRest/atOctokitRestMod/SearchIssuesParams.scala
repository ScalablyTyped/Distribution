package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.`reactions-+1`
import typings.atOctokitRest.atOctokitRestStrings.`reactions--1`
import typings.atOctokitRest.atOctokitRestStrings.`reactions-heart`
import typings.atOctokitRest.atOctokitRestStrings.`reactions-smile`
import typings.atOctokitRest.atOctokitRestStrings.`reactions-tada`
import typings.atOctokitRest.atOctokitRestStrings.`reactions-thinking_face`
import typings.atOctokitRest.atOctokitRestStrings.asc
import typings.atOctokitRest.atOctokitRestStrings.comments
import typings.atOctokitRest.atOctokitRestStrings.created
import typings.atOctokitRest.atOctokitRestStrings.desc
import typings.atOctokitRest.atOctokitRestStrings.interactions
import typings.atOctokitRest.atOctokitRestStrings.reactions
import typings.atOctokitRest.atOctokitRestStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchIssuesParams extends js.Object {
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
    comments | reactions | `reactions-+1` | `reactions--1` | `reactions-smile` | `reactions-thinking_face` | `reactions-heart` | `reactions-tada` | interactions | created | updated
  ] = js.undefined
}

object SearchIssuesParams {
  @scala.inline
  def apply(
    q: String,
    order: desc | asc = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    sort: comments | reactions | `reactions-+1` | `reactions--1` | `reactions-smile` | `reactions-thinking_face` | `reactions-heart` | `reactions-tada` | interactions | created | updated = null
  ): SearchIssuesParams = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchIssuesParams]
  }
}

