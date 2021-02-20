package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p2beta1ImageAnnotationContext extends StObject {
  
  /** If the file was a PDF or TIFF, this field gives the page number within the file used to produce the image. */
  var pageNumber: js.UndefOr[Double] = js.native
  
  /** The URI of the file used to produce the image. */
  var uri: js.UndefOr[String] = js.native
}
object GoogleCloudVisionV1p2beta1ImageAnnotationContext {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p2beta1ImageAnnotationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p2beta1ImageAnnotationContext]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p2beta1ImageAnnotationContextMutableBuilder[Self <: GoogleCloudVisionV1p2beta1ImageAnnotationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
