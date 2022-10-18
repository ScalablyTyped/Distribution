package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** _all_docs response.
  * @see Docs: {@link http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs} */
trait DocumentListResponse[D] extends StObject {
  
  /** Offset where the document list started. */
  var offset: Double
  
  /** Array of view row objects.
    *
    * By default the information returned contains only the document ID and revision. */
  var rows: js.Array[DocumentResponseRow[D]]
  
  /** Number of documents in the database/view.
    *
    * Note that this is not the number of rows returned in the actual query.  */
  var total_rows: Double
  
  /** Current update sequence for the database. */
  var update_seq: js.UndefOr[Double] = js.undefined
}
object DocumentListResponse {
  
  inline def apply[D](offset: Double, rows: js.Array[DocumentResponseRow[D]], total_rows: Double): DocumentListResponse[D] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentListResponse[D]]
  }
  
  extension [Self <: DocumentListResponse[?], D](x: Self & DocumentListResponse[D]) {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setRows(value: js.Array[DocumentResponseRow[D]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: DocumentResponseRow[D]*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setTotal_rows(value: Double): Self = StObject.set(x, "total_rows", value.asInstanceOf[js.Any])
    
    inline def setUpdate_seq(value: Double): Self = StObject.set(x, "update_seq", value.asInstanceOf[js.Any])
    
    inline def setUpdate_seqUndefined: Self = StObject.set(x, "update_seq", js.undefined)
  }
}
