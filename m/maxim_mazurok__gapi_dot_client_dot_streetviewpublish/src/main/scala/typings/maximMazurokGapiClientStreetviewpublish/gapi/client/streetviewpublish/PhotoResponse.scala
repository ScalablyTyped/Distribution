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
  
  @scala.inline
  def apply(): PhotoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhotoResponse]
  }
  
  @scala.inline
  implicit class PhotoResponseMutableBuilder[Self <: PhotoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoto(value: Photo): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
