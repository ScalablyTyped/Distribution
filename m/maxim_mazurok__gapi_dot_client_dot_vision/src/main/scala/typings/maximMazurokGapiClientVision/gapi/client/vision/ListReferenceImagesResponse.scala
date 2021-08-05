package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReferenceImagesResponse extends StObject {
  
  /** The next_page_token returned from a previous List request, if any. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The maximum number of items to return. Default 10, maximum 100. */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /** The list of reference images. */
  var referenceImages: js.UndefOr[js.Array[ReferenceImage]] = js.undefined
}
object ListReferenceImagesResponse {
  
  inline def apply(): ListReferenceImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReferenceImagesResponse]
  }
  
  extension [Self <: ListReferenceImagesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setReferenceImages(value: js.Array[ReferenceImage]): Self = StObject.set(x, "referenceImages", value.asInstanceOf[js.Any])
    
    inline def setReferenceImagesUndefined: Self = StObject.set(x, "referenceImages", js.undefined)
    
    inline def setReferenceImagesVarargs(value: ReferenceImage*): Self = StObject.set(x, "referenceImages", js.Array(value :_*))
  }
}
