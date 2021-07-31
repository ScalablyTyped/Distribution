package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdatePhotosRequest extends StObject {
  
  /** Required. List of UpdatePhotoRequests. */
  var updatePhotoRequests: js.UndefOr[js.Array[UpdatePhotoRequest]] = js.undefined
}
object BatchUpdatePhotosRequest {
  
  @scala.inline
  def apply(): BatchUpdatePhotosRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdatePhotosRequest]
  }
  
  @scala.inline
  implicit class BatchUpdatePhotosRequestMutableBuilder[Self <: BatchUpdatePhotosRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdatePhotoRequests(value: js.Array[UpdatePhotoRequest]): Self = StObject.set(x, "updatePhotoRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatePhotoRequestsUndefined: Self = StObject.set(x, "updatePhotoRequests", js.undefined)
    
    @scala.inline
    def setUpdatePhotoRequestsVarargs(value: UpdatePhotoRequest*): Self = StObject.set(x, "updatePhotoRequests", js.Array(value :_*))
  }
}
