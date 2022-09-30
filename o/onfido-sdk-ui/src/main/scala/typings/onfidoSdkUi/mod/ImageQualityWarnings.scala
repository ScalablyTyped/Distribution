package typings.onfidoSdkUi.mod

import typings.onfidoSdkUi.anon.Valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<onfido-sdk-ui.onfido-sdk-ui.ImageQualityValidationTypes, {  valid :boolean}>> */
trait ImageQualityWarnings extends StObject {
  
  var detect_blur: js.UndefOr[Valid] = js.undefined
  
  var detect_cutoff: js.UndefOr[Valid] = js.undefined
  
  var detect_document: js.UndefOr[Valid] = js.undefined
  
  var detect_glare: js.UndefOr[Valid] = js.undefined
}
object ImageQualityWarnings {
  
  inline def apply(): ImageQualityWarnings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageQualityWarnings]
  }
  
  extension [Self <: ImageQualityWarnings](x: Self) {
    
    inline def setDetect_blur(value: Valid): Self = StObject.set(x, "detect_blur", value.asInstanceOf[js.Any])
    
    inline def setDetect_blurUndefined: Self = StObject.set(x, "detect_blur", js.undefined)
    
    inline def setDetect_cutoff(value: Valid): Self = StObject.set(x, "detect_cutoff", value.asInstanceOf[js.Any])
    
    inline def setDetect_cutoffUndefined: Self = StObject.set(x, "detect_cutoff", js.undefined)
    
    inline def setDetect_document(value: Valid): Self = StObject.set(x, "detect_document", value.asInstanceOf[js.Any])
    
    inline def setDetect_documentUndefined: Self = StObject.set(x, "detect_document", js.undefined)
    
    inline def setDetect_glare(value: Valid): Self = StObject.set(x, "detect_glare", value.asInstanceOf[js.Any])
    
    inline def setDetect_glareUndefined: Self = StObject.set(x, "detect_glare", js.undefined)
  }
}
