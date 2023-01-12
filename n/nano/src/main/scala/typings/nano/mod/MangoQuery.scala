package typings.nano.mod

import typings.nano.nanoBooleans.`false`
import typings.nano.nanoStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Mango query syntax.
  * @see Docs: {@link https://docs.couchdb.org/en/latest/api/database/find.html#db-find}  */
trait MangoQuery extends StObject {
  
  /** A string that enables you to specify which page of results you require.
    *
    * Used for paging through result sets. */
  var bookmark: js.UndefOr[String] = js.undefined
  
  /** Include execution statistics in the query response.
    *
    * Optional, default: false. */
  var execution_stats: js.UndefOr[Boolean] = js.undefined
  
  /** JSON array specifying which fields of each object should be returned.
    * 
    * If it is omitted, the entire object is returned.
    *
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/database/find.html#filtering-fields} */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Maximum number of results returned. @default 25 */
  var limit: js.UndefOr[Double] = js.undefined
  
  /** Read quorum needed for the result.
    *
    * @default 1 */
  var r: js.UndefOr[Double] = js.undefined
  
  /** JSON object describing criteria used to select documents. */
  var selector: MangoSelector
  
  /** Skip the first 'n' results, where 'n' is the value specified. */
  var skip: js.UndefOr[Double] = js.undefined
  
  /** JSON array following sort syntax. */
  var sort: js.UndefOr[js.Array[SortOrder]] = js.undefined
  
  /** Whether or not the view results should be returned from a “stable” set of shards. */
  var stable: js.UndefOr[Boolean] = js.undefined
  
  /** Combination of update = false and stable = true options.
    *
    * Possible options: "ok", false (default). */
  var stale: js.UndefOr[ok | `false`] = js.undefined
  
  /** Whether to update the index prior to returning the result.
    *
    * @default true */
  var update: js.UndefOr[Boolean] = js.undefined
  
  /* Instruct a query to use a specific index.
    *
    * Specified either as "<design_document>" or ["<design_document>", "<index_name>"]. */
  var use_index: js.UndefOr[String | (js.Tuple2[String, String])] = js.undefined
}
object MangoQuery {
  
  inline def apply(selector: MangoSelector): MangoQuery = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[MangoQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MangoQuery] (val x: Self) extends AnyVal {
    
    inline def setBookmark(value: String): Self = StObject.set(x, "bookmark", value.asInstanceOf[js.Any])
    
    inline def setBookmarkUndefined: Self = StObject.set(x, "bookmark", js.undefined)
    
    inline def setExecution_stats(value: Boolean): Self = StObject.set(x, "execution_stats", value.asInstanceOf[js.Any])
    
    inline def setExecution_statsUndefined: Self = StObject.set(x, "execution_stats", js.undefined)
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    inline def setSelector(value: MangoSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setSort(value: js.Array[SortOrder]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: SortOrder*): Self = StObject.set(x, "sort", js.Array(value*))
    
    inline def setStable(value: Boolean): Self = StObject.set(x, "stable", value.asInstanceOf[js.Any])
    
    inline def setStableUndefined: Self = StObject.set(x, "stable", js.undefined)
    
    inline def setStale(value: ok | `false`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    inline def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
    
    inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setUse_index(value: String | (js.Tuple2[String, String])): Self = StObject.set(x, "use_index", value.asInstanceOf[js.Any])
    
    inline def setUse_indexUndefined: Self = StObject.set(x, "use_index", js.undefined)
  }
}
