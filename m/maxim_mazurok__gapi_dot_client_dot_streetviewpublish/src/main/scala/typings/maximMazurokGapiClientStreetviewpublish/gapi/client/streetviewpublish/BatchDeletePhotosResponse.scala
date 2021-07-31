package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeletePhotosResponse extends StObject {
  
  /** The status for the operation to delete a single Photo in the batch request. */
  var status: js.UndefOr[js.Array[Status]] = js.undefined
}
object BatchDeletePhotosResponse {
  
  @scala.inline
  def apply(): BatchDeletePhotosResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeletePhotosResponse]
  }
  
  @scala.inline
  implicit class BatchDeletePhotosResponseMutableBuilder[Self <: BatchDeletePhotosResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: js.Array[Status]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStatusVarargs(value: Status*): Self = StObject.set(x, "status", js.Array(value :_*))
  }
}
