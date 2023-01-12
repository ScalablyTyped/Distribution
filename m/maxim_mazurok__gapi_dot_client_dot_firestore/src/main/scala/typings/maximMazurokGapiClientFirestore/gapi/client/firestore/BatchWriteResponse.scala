package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchWriteResponse extends StObject {
  
  /** The status of applying the writes. This i-th write status corresponds to the i-th write in the request. */
  var status: js.UndefOr[js.Array[Status]] = js.undefined
  
  /** The result of applying the writes. This i-th write result corresponds to the i-th write in the request. */
  var writeResults: js.UndefOr[js.Array[WriteResult]] = js.undefined
}
object BatchWriteResponse {
  
  inline def apply(): BatchWriteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchWriteResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchWriteResponse] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: js.Array[Status]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStatusVarargs(value: Status*): Self = StObject.set(x, "status", js.Array(value*))
    
    inline def setWriteResults(value: js.Array[WriteResult]): Self = StObject.set(x, "writeResults", value.asInstanceOf[js.Any])
    
    inline def setWriteResultsUndefined: Self = StObject.set(x, "writeResults", js.undefined)
    
    inline def setWriteResultsVarargs(value: WriteResult*): Self = StObject.set(x, "writeResults", js.Array(value*))
  }
}
