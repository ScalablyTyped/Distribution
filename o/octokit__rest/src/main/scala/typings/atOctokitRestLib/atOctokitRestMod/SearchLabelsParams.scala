package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchLabelsParams extends js.Object {
  /**
    * Determines whether the first search result returned is the highest number of matches (`desc`) or lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
    */
  var order: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.desc | atOctokitRestLib.atOctokitRestLibStrings.asc
  ] = js.undefined
  /**
    * The search keywords. This endpoint does not accept qualifiers in the query. To learn more about the format of the query, see [Constructing a search query](#constructing-a-search-query).
    */
  var q: java.lang.String
  /**
    * The id of the repository.
    */
  var repository_id: scala.Double
  /**
    * Sorts the results of your query by when the label was `created` or `updated`.
    */
  var sort: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.created | atOctokitRestLib.atOctokitRestLibStrings.updated
  ] = js.undefined
}

object SearchLabelsParams {
  @scala.inline
  def apply(
    q: java.lang.String,
    repository_id: scala.Double,
    order: atOctokitRestLib.atOctokitRestLibStrings.desc | atOctokitRestLib.atOctokitRestLibStrings.asc = null,
    sort: atOctokitRestLib.atOctokitRestLibStrings.created | atOctokitRestLib.atOctokitRestLibStrings.updated = null
  ): SearchLabelsParams = {
    val __obj = js.Dynamic.literal(q = q, repository_id = repository_id)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchLabelsParams]
  }
}

