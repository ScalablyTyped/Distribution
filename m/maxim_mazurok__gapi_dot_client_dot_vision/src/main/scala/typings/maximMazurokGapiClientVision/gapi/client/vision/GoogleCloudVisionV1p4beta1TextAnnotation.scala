package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p4beta1TextAnnotation extends StObject {
  
  /** List of pages detected by OCR. */
  var pages: js.UndefOr[js.Array[GoogleCloudVisionV1p4beta1Page]] = js.undefined
  
  /** UTF-8 text detected on the pages. */
  var text: js.UndefOr[String] = js.undefined
}
object GoogleCloudVisionV1p4beta1TextAnnotation {
  
  inline def apply(): GoogleCloudVisionV1p4beta1TextAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1TextAnnotation]
  }
  
  extension [Self <: GoogleCloudVisionV1p4beta1TextAnnotation](x: Self) {
    
    inline def setPages(value: js.Array[GoogleCloudVisionV1p4beta1Page]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setPagesVarargs(value: GoogleCloudVisionV1p4beta1Page*): Self = StObject.set(x, "pages", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
