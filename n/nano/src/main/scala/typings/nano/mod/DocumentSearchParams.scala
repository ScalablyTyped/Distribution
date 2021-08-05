package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://console.bluemix.net/docs/services/Cloudant/api/search.html#queries
trait DocumentSearchParams extends StObject {
  
  // A bookmark that was received from a previous search. Used for pagination.
  var bookmark: js.UndefOr[String] = js.undefined
  
  // An array of field names for which facet counts are requested.
  var counts: js.UndefOr[js.Array[String]] = js.undefined
  
  // Filters the result set using key value pairs supplied to the drilldown parameter.
  var drilldown: js.UndefOr[js.Array[String]] = js.undefined
  
  // The name of a string field to group results by.
  var group_field: js.UndefOr[String] = js.undefined
  
  // The maximum group count when used in conjunction with group_field.
  var group_limit: js.UndefOr[Double] = js.undefined
  
  // Defines the order of the groups in a search when used with group_field.
  var group_sort: js.UndefOr[String | js.Array[String]] = js.undefined
  
  // Which fields are to be highlighted.
  var highlight_fields: js.UndefOr[js.Array[String]] = js.undefined
  
  // The number of gradments that are returned in highlights. Defaults to 1.
  var highlight_number: js.UndefOr[Double] = js.undefined
  
  // String used after a highlighted word. Defaults to </em>.
  var highlight_post_tag: js.UndefOr[String] = js.undefined
  
  // String used before a highlighted word. Defaults to <em>.
  var highlight_pre_tag: js.UndefOr[String] = js.undefined
  
  // The number of characters in each fragment for highlight. Defaults to 100.
  var highlight_size: js.UndefOr[Double] = js.undefined
  
  // Include the full document bodies in the response. Defaults to false
  var include_docs: js.UndefOr[Boolean] = js.undefined
  
  // An array of fields to include in the search results.
  var include_fields: js.UndefOr[js.Array[String]] = js.undefined
  
  // The maximum number of returned documents. Positive integer up to 200.
  var limit: js.UndefOr[Double] = js.undefined
  
  // Alias of 'query'. One of q or query must be present.
  var q: js.UndefOr[String] = js.undefined
  
  // The Lucene query to perform. One of q or query must be present.
  var query: js.UndefOr[String] = js.undefined
  
  // Defines ranges for faceted numeric search fields.
  var ranges: js.UndefOr[js.Object] = js.undefined
  
  // Specifies the sort order of the results.
  var sort: js.UndefOr[String | js.Array[String]] = js.undefined
  
  // Do not wait for the index to finish building to return results.
  var stale: js.UndefOr[Boolean] = js.undefined
}
object DocumentSearchParams {
  
  inline def apply(): DocumentSearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentSearchParams]
  }
  
  extension [Self <: DocumentSearchParams](x: Self) {
    
    inline def setBookmark(value: String): Self = StObject.set(x, "bookmark", value.asInstanceOf[js.Any])
    
    inline def setBookmarkUndefined: Self = StObject.set(x, "bookmark", js.undefined)
    
    inline def setCounts(value: js.Array[String]): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
    
    inline def setCountsUndefined: Self = StObject.set(x, "counts", js.undefined)
    
    inline def setCountsVarargs(value: String*): Self = StObject.set(x, "counts", js.Array(value :_*))
    
    inline def setDrilldown(value: js.Array[String]): Self = StObject.set(x, "drilldown", value.asInstanceOf[js.Any])
    
    inline def setDrilldownUndefined: Self = StObject.set(x, "drilldown", js.undefined)
    
    inline def setDrilldownVarargs(value: String*): Self = StObject.set(x, "drilldown", js.Array(value :_*))
    
    inline def setGroup_field(value: String): Self = StObject.set(x, "group_field", value.asInstanceOf[js.Any])
    
    inline def setGroup_fieldUndefined: Self = StObject.set(x, "group_field", js.undefined)
    
    inline def setGroup_limit(value: Double): Self = StObject.set(x, "group_limit", value.asInstanceOf[js.Any])
    
    inline def setGroup_limitUndefined: Self = StObject.set(x, "group_limit", js.undefined)
    
    inline def setGroup_sort(value: String | js.Array[String]): Self = StObject.set(x, "group_sort", value.asInstanceOf[js.Any])
    
    inline def setGroup_sortUndefined: Self = StObject.set(x, "group_sort", js.undefined)
    
    inline def setGroup_sortVarargs(value: String*): Self = StObject.set(x, "group_sort", js.Array(value :_*))
    
    inline def setHighlight_fields(value: js.Array[String]): Self = StObject.set(x, "highlight_fields", value.asInstanceOf[js.Any])
    
    inline def setHighlight_fieldsUndefined: Self = StObject.set(x, "highlight_fields", js.undefined)
    
    inline def setHighlight_fieldsVarargs(value: String*): Self = StObject.set(x, "highlight_fields", js.Array(value :_*))
    
    inline def setHighlight_number(value: Double): Self = StObject.set(x, "highlight_number", value.asInstanceOf[js.Any])
    
    inline def setHighlight_numberUndefined: Self = StObject.set(x, "highlight_number", js.undefined)
    
    inline def setHighlight_post_tag(value: String): Self = StObject.set(x, "highlight_post_tag", value.asInstanceOf[js.Any])
    
    inline def setHighlight_post_tagUndefined: Self = StObject.set(x, "highlight_post_tag", js.undefined)
    
    inline def setHighlight_pre_tag(value: String): Self = StObject.set(x, "highlight_pre_tag", value.asInstanceOf[js.Any])
    
    inline def setHighlight_pre_tagUndefined: Self = StObject.set(x, "highlight_pre_tag", js.undefined)
    
    inline def setHighlight_size(value: Double): Self = StObject.set(x, "highlight_size", value.asInstanceOf[js.Any])
    
    inline def setHighlight_sizeUndefined: Self = StObject.set(x, "highlight_size", js.undefined)
    
    inline def setInclude_docs(value: Boolean): Self = StObject.set(x, "include_docs", value.asInstanceOf[js.Any])
    
    inline def setInclude_docsUndefined: Self = StObject.set(x, "include_docs", js.undefined)
    
    inline def setInclude_fields(value: js.Array[String]): Self = StObject.set(x, "include_fields", value.asInstanceOf[js.Any])
    
    inline def setInclude_fieldsUndefined: Self = StObject.set(x, "include_fields", js.undefined)
    
    inline def setInclude_fieldsVarargs(value: String*): Self = StObject.set(x, "include_fields", js.Array(value :_*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRanges(value: js.Object): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setSort(value: String | js.Array[String]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: String*): Self = StObject.set(x, "sort", js.Array(value :_*))
    
    inline def setStale(value: Boolean): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    inline def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
  }
}
