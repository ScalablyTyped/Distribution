package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p1beta1ImageAnnotationContext extends StObject {
  
  /** If the file was a PDF or TIFF, this field gives the page number within the file used to produce the image. */
  var pageNumber: js.UndefOr[Double] = js.undefined
  
  /** The URI of the file used to produce the image. */
  var uri: js.UndefOr[String] = js.undefined
}
object GoogleCloudVisionV1p1beta1ImageAnnotationContext {
  
  inline def apply(): GoogleCloudVisionV1p1beta1ImageAnnotationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1ImageAnnotationContext]
  }
  
  extension [Self <: GoogleCloudVisionV1p1beta1ImageAnnotationContext](x: Self) {
    
    inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
