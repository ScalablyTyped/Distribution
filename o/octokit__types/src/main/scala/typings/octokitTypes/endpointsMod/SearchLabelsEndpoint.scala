package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.asc
import typings.octokitTypes.octokitTypesStrings.created
import typings.octokitTypes.octokitTypesStrings.desc
import typings.octokitTypes.octokitTypesStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchLabelsEndpoint extends js.Object {
  /**
    * Determines whether the first search result returned is the highest number of matches (`desc`) or lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
    */
  var order: js.UndefOr[desc | asc] = js.native
  /**
    * The search keywords. This endpoint does not accept qualifiers in the query. To learn more about the format of the query, see [Constructing a search query](https://developer.github.com/v3/search/#constructing-a-search-query).
    */
  var q: String = js.native
  /**
    * The id of the repository.
    */
  var repository_id: Double = js.native
  /**
    * Sorts the results of your query by when the label was `created` or `updated`. Default: [best match](https://developer.github.com/v3/search/#ranking-search-results)
    */
  var sort: js.UndefOr[created | updated] = js.native
}

object SearchLabelsEndpoint {
  @scala.inline
  def apply(q: String, repository_id: Double): SearchLabelsEndpoint = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchLabelsEndpoint]
  }
  @scala.inline
  implicit class SearchLabelsEndpointOps[Self <: SearchLabelsEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepository_id(value: Double): Self = this.set("repository_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: desc | asc): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setSort(value: created | updated): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

