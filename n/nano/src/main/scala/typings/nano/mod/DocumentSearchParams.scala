package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://console.bluemix.net/docs/services/Cloudant/api/search.html#queries
@js.native
trait DocumentSearchParams extends js.Object {
  
  // A bookmark that was received from a previous search. Used for pagination.
  var bookmark: js.UndefOr[String] = js.native
  
  // An array of field names for which facet counts are requested.
  var counts: js.UndefOr[js.Array[String]] = js.native
  
  // Filters the result set using key value pairs supplied to the drilldown parameter.
  var drilldown: js.UndefOr[js.Array[String]] = js.native
  
  // The name of a string field to group results by.
  var group_field: js.UndefOr[String] = js.native
  
  // The maximum group count when used in conjunction with group_field.
  var group_limit: js.UndefOr[Double] = js.native
  
  // Defines the order of the groups in a search when used with group_field.
  var group_sort: js.UndefOr[String | js.Array[String]] = js.native
  
  // Which fields are to be highlighted.
  var highlight_fields: js.UndefOr[js.Array[String]] = js.native
  
  // The number of gradments that are returned in highlights. Defaults to 1.
  var highlight_number: js.UndefOr[Double] = js.native
  
  // String used after a highlighted word. Defaults to </em>.
  var highlight_post_tag: js.UndefOr[String] = js.native
  
  // String used before a highlighted word. Defaults to <em>.
  var highlight_pre_tag: js.UndefOr[String] = js.native
  
  // The number of characters in each fragment for highlight. Defaults to 100.
  var highlight_size: js.UndefOr[Double] = js.native
  
  // Include the full document bodies in the response. Defaults to false
  var include_docs: js.UndefOr[Boolean] = js.native
  
  // An array of fields to include in the search results.
  var include_fields: js.UndefOr[js.Array[String]] = js.native
  
  // The maximum number of returned documents. Positive integer up to 200.
  var limit: js.UndefOr[Double] = js.native
  
  // Alias of 'query'. One of q or query must be present.
  var q: js.UndefOr[String] = js.native
  
  // The Lucene query to perform. One of q or query must be present.
  var query: js.UndefOr[String] = js.native
  
  // Defines ranges for faceted numeric search fields.
  var ranges: js.UndefOr[js.Object] = js.native
  
  // Specifies the sort order of the results.
  var sort: js.UndefOr[String | js.Array[String]] = js.native
  
  // Do not wait for the index to finish building to return results.
  var stale: js.UndefOr[Boolean] = js.native
}
object DocumentSearchParams {
  
  @scala.inline
  def apply(): DocumentSearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentSearchParams]
  }
  
  @scala.inline
  implicit class DocumentSearchParamsOps[Self <: DocumentSearchParams] (val x: Self) extends AnyVal {
    
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
    def setBookmark(value: String): Self = this.set("bookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBookmark: Self = this.set("bookmark", js.undefined)
    
    @scala.inline
    def setCountsVarargs(value: String*): Self = this.set("counts", js.Array(value :_*))
    
    @scala.inline
    def setCounts(value: js.Array[String]): Self = this.set("counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounts: Self = this.set("counts", js.undefined)
    
    @scala.inline
    def setDrilldownVarargs(value: String*): Self = this.set("drilldown", js.Array(value :_*))
    
    @scala.inline
    def setDrilldown(value: js.Array[String]): Self = this.set("drilldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrilldown: Self = this.set("drilldown", js.undefined)
    
    @scala.inline
    def setGroup_field(value: String): Self = this.set("group_field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup_field: Self = this.set("group_field", js.undefined)
    
    @scala.inline
    def setGroup_limit(value: Double): Self = this.set("group_limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup_limit: Self = this.set("group_limit", js.undefined)
    
    @scala.inline
    def setGroup_sortVarargs(value: String*): Self = this.set("group_sort", js.Array(value :_*))
    
    @scala.inline
    def setGroup_sort(value: String | js.Array[String]): Self = this.set("group_sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup_sort: Self = this.set("group_sort", js.undefined)
    
    @scala.inline
    def setHighlight_fieldsVarargs(value: String*): Self = this.set("highlight_fields", js.Array(value :_*))
    
    @scala.inline
    def setHighlight_fields(value: js.Array[String]): Self = this.set("highlight_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight_fields: Self = this.set("highlight_fields", js.undefined)
    
    @scala.inline
    def setHighlight_number(value: Double): Self = this.set("highlight_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight_number: Self = this.set("highlight_number", js.undefined)
    
    @scala.inline
    def setHighlight_post_tag(value: String): Self = this.set("highlight_post_tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight_post_tag: Self = this.set("highlight_post_tag", js.undefined)
    
    @scala.inline
    def setHighlight_pre_tag(value: String): Self = this.set("highlight_pre_tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight_pre_tag: Self = this.set("highlight_pre_tag", js.undefined)
    
    @scala.inline
    def setHighlight_size(value: Double): Self = this.set("highlight_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight_size: Self = this.set("highlight_size", js.undefined)
    
    @scala.inline
    def setInclude_docs(value: Boolean): Self = this.set("include_docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude_docs: Self = this.set("include_docs", js.undefined)
    
    @scala.inline
    def setInclude_fieldsVarargs(value: String*): Self = this.set("include_fields", js.Array(value :_*))
    
    @scala.inline
    def setInclude_fields(value: js.Array[String]): Self = this.set("include_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude_fields: Self = this.set("include_fields", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setRanges(value: js.Object): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    
    @scala.inline
    def setSortVarargs(value: String*): Self = this.set("sort", js.Array(value :_*))
    
    @scala.inline
    def setSort(value: String | js.Array[String]): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setStale(value: Boolean): Self = this.set("stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStale: Self = this.set("stale", js.undefined)
  }
}
