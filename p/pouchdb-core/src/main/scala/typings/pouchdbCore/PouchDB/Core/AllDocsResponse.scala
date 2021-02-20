package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.anon.Doc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllDocsResponse[Content /* <: js.Object */] extends StObject {
  
  /** The `skip` if provided, or in CouchDB the actual offset */
  var offset: Double = js.native
  
  var rows: js.Array[Doc[Content]] = js.native
  
  var total_rows: Double = js.native
  
  var update_seq: js.UndefOr[Double | String] = js.native
}
object AllDocsResponse {
  
  @scala.inline
  def apply[Content /* <: js.Object */](offset: Double, rows: js.Array[Doc[Content]], total_rows: Double): AllDocsResponse[Content] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDocsResponse[Content]]
  }
  
  @scala.inline
  implicit class AllDocsResponseMutableBuilder[Self <: AllDocsResponse[_], Content /* <: js.Object */] (val x: Self with AllDocsResponse[Content]) extends AnyVal {
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: js.Array[Doc[Content]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: Doc[Content]*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setTotal_rows(value: Double): Self = StObject.set(x, "total_rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate_seq(value: Double | String): Self = StObject.set(x, "update_seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate_seqUndefined: Self = StObject.set(x, "update_seq", js.undefined)
  }
}
