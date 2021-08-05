package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdatePhotosRequest extends StObject {
  
  /** Required. List of UpdatePhotoRequests. */
  var updatePhotoRequests: js.UndefOr[js.Array[UpdatePhotoRequest]] = js.undefined
}
object BatchUpdatePhotosRequest {
  
  inline def apply(): BatchUpdatePhotosRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdatePhotosRequest]
  }
  
  extension [Self <: BatchUpdatePhotosRequest](x: Self) {
    
    inline def setUpdatePhotoRequests(value: js.Array[UpdatePhotoRequest]): Self = StObject.set(x, "updatePhotoRequests", value.asInstanceOf[js.Any])
    
    inline def setUpdatePhotoRequestsUndefined: Self = StObject.set(x, "updatePhotoRequests", js.undefined)
    
    inline def setUpdatePhotoRequestsVarargs(value: UpdatePhotoRequest*): Self = StObject.set(x, "updatePhotoRequests", js.Array(value :_*))
  }
}
