package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateDocumentRequest extends StObject {
  
  /** A list of updates to apply to the document. */
  var requests: js.UndefOr[js.Array[Request]] = js.undefined
  
  /** Provides control over how write requests are executed. */
  var writeControl: js.UndefOr[WriteControl] = js.undefined
}
object BatchUpdateDocumentRequest {
  
  inline def apply(): BatchUpdateDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateDocumentRequest]
  }
  
  extension [Self <: BatchUpdateDocumentRequest](x: Self) {
    
    inline def setRequests(value: js.Array[Request]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: Request*): Self = StObject.set(x, "requests", js.Array(value :_*))
    
    inline def setWriteControl(value: WriteControl): Self = StObject.set(x, "writeControl", value.asInstanceOf[js.Any])
    
    inline def setWriteControlUndefined: Self = StObject.set(x, "writeControl", js.undefined)
  }
}
