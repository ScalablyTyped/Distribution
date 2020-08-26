package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`21`
import typings.octokitTypes.octokitTypesStrings.`author-date`
import typings.octokitTypes.octokitTypesStrings.`committer-date`
import typings.octokitTypes.octokitTypesStrings.asc
import typings.octokitTypes.octokitTypesStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  q :string,   sort :'author-date' | 'committer-date' | undefined,   order :'desc' | 'asc' | undefined,   per_page :number | undefined,   page :number | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'cloak'> */
@js.native
trait SearchCommitsEndpoint extends js.Object {
  var mediaType: `21` = js.native
  /**
    * Determines whether the first search result returned is the highest number of matches (`desc`) or lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
    */
  var order: js.UndefOr[desc | asc] = js.native
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.native
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.native
  /**
    * The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as GitHub.com. To learn more about the format of the query, see [Constructing a search query](https://developer.github.com/v3/search/#constructing-a-search-query). See "[Searching commits](https://docs.github.com/articles/searching-commits/)" for a detailed list of qualifiers.
    */
  var q: String = js.native
  /**
    * Sorts the results of your query by `author-date` or `committer-date`. Default: [best match](https://developer.github.com/v3/search/#ranking-search-results)
    */
  var sort: js.UndefOr[`author-date` | `committer-date`] = js.native
}

object SearchCommitsEndpoint {
  @scala.inline
  def apply(mediaType: `21`, q: String): SearchCommitsEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCommitsEndpoint]
  }
  @scala.inline
  implicit class SearchCommitsEndpointOps[Self <: SearchCommitsEndpoint] (val x: Self) extends AnyVal {
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
    def setMediaType(value: `21`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: desc | asc): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPer_page(value: Double): Self = this.set("per_page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePer_page: Self = this.set("per_page", js.undefined)
    @scala.inline
    def setSort(value: `author-date` | `committer-date`): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

