package typings.nano.mod

import typings.nano.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view
trait DocumentViewResponse[V, D] extends StObject {
  
  // Offset where the document list started.
  var offset: Double
  
  //  Array of view row objects. By default the information returned contains only the document ID and revision.
  var rows: js.Array[Id[V, D]]
  
  // Number of documents in the database/view.
  var total_rows: Double
  
  // Current update sequence for the database
  var update_seq: js.Any
}
object DocumentViewResponse {
  
  inline def apply[V, D](offset: Double, rows: js.Array[Id[V, D]], total_rows: Double, update_seq: js.Any): DocumentViewResponse[V, D] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any], update_seq = update_seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentViewResponse[V, D]]
  }
  
  extension [Self <: DocumentViewResponse[?, ?], V, D](x: Self & (DocumentViewResponse[V, D])) {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setRows(value: js.Array[Id[V, D]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: (Id[V, D])*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    inline def setTotal_rows(value: Double): Self = StObject.set(x, "total_rows", value.asInstanceOf[js.Any])
    
    inline def setUpdate_seq(value: js.Any): Self = StObject.set(x, "update_seq", value.asInstanceOf[js.Any])
  }
}
