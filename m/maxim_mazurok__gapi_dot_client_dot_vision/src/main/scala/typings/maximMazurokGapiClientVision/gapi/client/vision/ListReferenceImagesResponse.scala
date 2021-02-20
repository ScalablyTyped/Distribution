package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReferenceImagesResponse extends StObject {
  
  /** The next_page_token returned from a previous List request, if any. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The maximum number of items to return. Default 10, maximum 100. */
  var pageSize: js.UndefOr[Double] = js.native
  
  /** The list of reference images. */
  var referenceImages: js.UndefOr[js.Array[ReferenceImage]] = js.native
}
object ListReferenceImagesResponse {
  
  @scala.inline
  def apply(): ListReferenceImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReferenceImagesResponse]
  }
  
  @scala.inline
  implicit class ListReferenceImagesResponseMutableBuilder[Self <: ListReferenceImagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setReferenceImages(value: js.Array[ReferenceImage]): Self = StObject.set(x, "referenceImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceImagesUndefined: Self = StObject.set(x, "referenceImages", js.undefined)
    
    @scala.inline
    def setReferenceImagesVarargs(value: ReferenceImage*): Self = StObject.set(x, "referenceImages", js.Array(value :_*))
  }
}
