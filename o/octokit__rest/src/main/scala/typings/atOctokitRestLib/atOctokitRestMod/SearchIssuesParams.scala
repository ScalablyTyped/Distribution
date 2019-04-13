package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchIssuesParams extends js.Object {
  /**
    * Determines whether the first search result returned is the highest number of matches (`desc`) or lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
    */
  var order: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.desc | atOctokitRestLib.atOctokitRestLibStrings.asc
  ] = js.undefined
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[scala.Double] = js.undefined
  /**
    * The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as GitHub.com. To learn more about the format of the query, see [Constructing a search query](#constructing-a-search-query). See "[Searching issues and pull requests](https://help.github.com/articles/searching-issues-and-pull-requests/)" for a detailed list of qualifiers.
    */
  var q: java.lang.String
  /**
    * Sorts the results of your query by the number of `comments`, `reactions`, `reactions-+1`, `reactions--1`, `reactions-smile`, `reactions-thinking_face`, `reactions-heart`, `reactions-tada`, or `interactions`. You can also sort results by how recently the items were `created` or `updated`,
    */
  var sort: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.comments | atOctokitRestLib.atOctokitRestLibStrings.reactions | atOctokitRestLib.atOctokitRestLibStrings.`reactions-+1` | atOctokitRestLib.atOctokitRestLibStrings.`reactions--1` | atOctokitRestLib.atOctokitRestLibStrings.`reactions-smile` | atOctokitRestLib.atOctokitRestLibStrings.`reactions-thinking_face` | atOctokitRestLib.atOctokitRestLibStrings.`reactions-heart` | atOctokitRestLib.atOctokitRestLibStrings.`reactions-tada` | atOctokitRestLib.atOctokitRestLibStrings.interactions | atOctokitRestLib.atOctokitRestLibStrings.created | atOctokitRestLib.atOctokitRestLibStrings.updated
  ] = js.undefined
}

object SearchIssuesParams {
  @scala.inline
  def apply(
    q: java.lang.String,
    order: atOctokitRestLib.atOctokitRestLibStrings.desc | atOctokitRestLib.atOctokitRestLibStrings.asc = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    sort: atOctokitRestLib.atOctokitRestLibStrings.comments | atOctokitRestLib.atOctokitRestLibStrings.reactions | atOctokitRestLib.atOctokitRestLibStrings.`reactions-+1` | atOctokitRestLib.atOctokitRestLibStrings.`reactions--1` | atOctokitRestLib.atOctokitRestLibStrings.`reactions-smile` | atOctokitRestLib.atOctokitRestLibStrings.`reactions-thinking_face` | atOctokitRestLib.atOctokitRestLibStrings.`reactions-heart` | atOctokitRestLib.atOctokitRestLibStrings.`reactions-tada` | atOctokitRestLib.atOctokitRestLibStrings.interactions | atOctokitRestLib.atOctokitRestLibStrings.created | atOctokitRestLib.atOctokitRestLibStrings.updated = null
  ): SearchIssuesParams = {
    val __obj = js.Dynamic.literal(q = q)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchIssuesParams]
  }
}

