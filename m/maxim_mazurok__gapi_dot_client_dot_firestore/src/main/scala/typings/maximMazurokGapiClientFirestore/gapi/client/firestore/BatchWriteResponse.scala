package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchWriteResponse extends StObject {
  
  /** The status of applying the writes. This i-th write status corresponds to the i-th write in the request. */
  var status: js.UndefOr[js.Array[Status]] = js.native
  
  /** The result of applying the writes. This i-th write result corresponds to the i-th write in the request. */
  var writeResults: js.UndefOr[js.Array[WriteResult]] = js.native
}
object BatchWriteResponse {
  
  @scala.inline
  def apply(): BatchWriteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchWriteResponse]
  }
  
  @scala.inline
  implicit class BatchWriteResponseMutableBuilder[Self <: BatchWriteResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: js.Array[Status]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStatusVarargs(value: Status*): Self = StObject.set(x, "status", js.Array(value :_*))
    
    @scala.inline
    def setWriteResults(value: js.Array[WriteResult]): Self = StObject.set(x, "writeResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteResultsUndefined: Self = StObject.set(x, "writeResults", js.undefined)
    
    @scala.inline
    def setWriteResultsVarargs(value: WriteResult*): Self = StObject.set(x, "writeResults", js.Array(value :_*))
  }
}
