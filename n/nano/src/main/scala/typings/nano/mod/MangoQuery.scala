package typings.nano.mod

import typings.nano.nanoBooleans.`false`
import typings.nano.nanoStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MangoQuery extends StObject {
  
  // A string that enables you to specify which page of results you require. Used for paging through result sets.
  var bookmark: js.UndefOr[String] = js.native
  
  // Include execution statistics in the query response. Optional, default: false.
  var execution_stats: js.UndefOr[Boolean] = js.native
  
  // JSON array specifying which fields of each object should be returned. If it is omitted,
  // the entire object is returned.
  // http://docs.couchdb.org/en/latest/api/database/find.html#filtering-fields
  var fields: js.UndefOr[js.Array[String]] = js.native
  
  // Maximum number of results returned. Default is 25.
  var limit: js.UndefOr[Double] = js.native
  
  // Read quorum needed for the result. This defaults to 1.
  var r: js.UndefOr[Double] = js.native
  
  // JSON object describing criteria used to select documents.
  var selector: MangoSelector = js.native
  
  // Skip the first 'n' results, where 'n' is the value specified.
  var skip: js.UndefOr[Double] = js.native
  
  // JSON array following sort syntax.
  var sort: js.UndefOr[js.Array[SortOrder]] = js.native
  
  // Whether or not the view results should be returned from a “stable” set of shards.
  var stable: js.UndefOr[Boolean] = js.native
  
  // Combination of update = false and stable = true options.Possible options: "ok", false (default).
  var stale: js.UndefOr[ok | `false`] = js.native
  
  // Whether to update the index prior to returning the result. Default is true.
  var update: js.UndefOr[Boolean] = js.native
  
  // Instruct a query to use a specific index.
  // Specified either as "<design_document>" or ["<design_document>", "<index_name>"].
  var use_index: js.UndefOr[String | (js.Tuple2[String, String])] = js.native
}
object MangoQuery {
  
  @scala.inline
  def apply(selector: MangoSelector): MangoQuery = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[MangoQuery]
  }
  
  @scala.inline
  implicit class MangoQueryMutableBuilder[Self <: MangoQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBookmark(value: String): Self = StObject.set(x, "bookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookmarkUndefined: Self = StObject.set(x, "bookmark", js.undefined)
    
    @scala.inline
    def setExecution_stats(value: Boolean): Self = StObject.set(x, "execution_stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecution_statsUndefined: Self = StObject.set(x, "execution_stats", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    @scala.inline
    def setSelector(value: MangoSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    @scala.inline
    def setSort(value: js.Array[SortOrder]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setSortVarargs(value: SortOrder*): Self = StObject.set(x, "sort", js.Array(value :_*))
    
    @scala.inline
    def setStable(value: Boolean): Self = StObject.set(x, "stable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStableUndefined: Self = StObject.set(x, "stable", js.undefined)
    
    @scala.inline
    def setStale(value: ok | `false`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
    
    @scala.inline
    def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    @scala.inline
    def setUse_index(value: String | (js.Tuple2[String, String])): Self = StObject.set(x, "use_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse_indexUndefined: Self = StObject.set(x, "use_index", js.undefined)
  }
}
