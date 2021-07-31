package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentFetchResponse[D] extends StObject {
  
  var offset: Double
  
  var rows: js.Array[DocumentResponseRow[D] | DocumentLookupFailure]
  
  var total_rows: Double
  
  var update_seq: js.UndefOr[Double] = js.undefined
}
object DocumentFetchResponse {
  
  @scala.inline
  def apply[D](offset: Double, rows: js.Array[DocumentResponseRow[D] | DocumentLookupFailure], total_rows: Double): DocumentFetchResponse[D] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentFetchResponse[D]]
  }
  
  @scala.inline
  implicit class DocumentFetchResponseMutableBuilder[Self <: DocumentFetchResponse[?], D] (val x: Self & DocumentFetchResponse[D]) extends AnyVal {
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: js.Array[DocumentResponseRow[D] | DocumentLookupFailure]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: (DocumentResponseRow[D] | DocumentLookupFailure)*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setTotal_rows(value: Double): Self = StObject.set(x, "total_rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate_seq(value: Double): Self = StObject.set(x, "update_seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate_seqUndefined: Self = StObject.set(x, "update_seq", js.undefined)
  }
}
