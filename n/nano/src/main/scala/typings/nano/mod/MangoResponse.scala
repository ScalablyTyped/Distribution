package typings.nano.mod

import typings.nano.anon.IdRev
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Mango response.
  * @see Docs: {@link https://docs.couchdb.org/en/latest/api/database/find.html#db-find}  */
trait MangoResponse[D] extends StObject {
  
  /** A string that enables you to specify which page of results you require.
    *
    * Used for paging through result sets. */
  var bookmark: js.UndefOr[String] = js.undefined
  
  /** Array of documents matching the search.
    * 
    * In each matching document, the fields specified in the fields part of the request body are listed, along with
    * their values. */
  var docs: js.Array[D & IdRev]
  
  /** Basic execution statistics for a specific request. */
  var execution_stats: js.UndefOr[MangoExecutionStats] = js.undefined
  
  /** Execution warnings */
  var warning: js.UndefOr[String] = js.undefined
}
object MangoResponse {
  
  inline def apply[D](docs: js.Array[D & IdRev]): MangoResponse[D] = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MangoResponse[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MangoResponse[?], D] (val x: Self & MangoResponse[D]) extends AnyVal {
    
    inline def setBookmark(value: String): Self = StObject.set(x, "bookmark", value.asInstanceOf[js.Any])
    
    inline def setBookmarkUndefined: Self = StObject.set(x, "bookmark", js.undefined)
    
    inline def setDocs(value: js.Array[D & IdRev]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsVarargs(value: (D & IdRev)*): Self = StObject.set(x, "docs", js.Array(value*))
    
    inline def setExecution_stats(value: MangoExecutionStats): Self = StObject.set(x, "execution_stats", value.asInstanceOf[js.Any])
    
    inline def setExecution_statsUndefined: Self = StObject.set(x, "execution_stats", js.undefined)
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
