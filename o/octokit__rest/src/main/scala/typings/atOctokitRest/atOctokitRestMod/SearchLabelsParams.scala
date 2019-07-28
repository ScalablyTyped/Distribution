package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.asc
import typings.atOctokitRest.atOctokitRestStrings.created
import typings.atOctokitRest.atOctokitRestStrings.desc
import typings.atOctokitRest.atOctokitRestStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchLabelsParams extends js.Object {
  /**
    * Determines whether the first search result returned is the highest number of matches (`desc`) or lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
    */
  var order: js.UndefOr[desc | asc] = js.undefined
  /**
    * The search keywords. This endpoint does not accept qualifiers in the query. To learn more about the format of the query, see [Constructing a search query](https://developer.github.com/v3/search/#constructing-a-search-query).
    */
  var q: String
  /**
    * The id of the repository.
    */
  var repository_id: Double
  /**
    * Sorts the results of your query by when the label was `created` or `updated`.
    */
  var sort: js.UndefOr[created | updated] = js.undefined
}

object SearchLabelsParams {
  @scala.inline
  def apply(q: String, repository_id: Double, order: desc | asc = null, sort: created | updated = null): SearchLabelsParams = {
    val __obj = js.Dynamic.literal(q = q, repository_id = repository_id)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchLabelsParams]
  }
}

