package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhotoResponse extends StObject {
  
  /** The Photo resource, if the request was successful. */
  var photo: js.UndefOr[Photo] = js.undefined
  
  /** The status for the operation to get or update a single photo in the batch request. */
  var status: js.UndefOr[Status] = js.undefined
}
object PhotoResponse {
  
  inline def apply(): PhotoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhotoResponse]
  }
  
  extension [Self <: PhotoResponse](x: Self) {
    
    inline def setPhoto(value: Photo): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
