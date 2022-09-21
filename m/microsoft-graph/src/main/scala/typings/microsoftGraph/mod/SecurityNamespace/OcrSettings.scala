package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OcrSettings extends StObject {
  
  // Indicates whether or not OCR is enabled for the case.
  var isEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Maximum image size that will be processed in KB).
  var maxImageSize: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * The timeout duration for the OCR engine. A longer timeout might increase success of OCR, but might add to the total
    * processing time.
    */
  var timeout: js.UndefOr[NullableOption[String]] = js.undefined
}
object OcrSettings {
  
  inline def apply(): OcrSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OcrSettings]
  }
  
  extension [Self <: OcrSettings](x: Self) {
    
    inline def setIsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledNull: Self = StObject.set(x, "isEnabled", null)
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    inline def setMaxImageSize(value: NullableOption[Double]): Self = StObject.set(x, "maxImageSize", value.asInstanceOf[js.Any])
    
    inline def setMaxImageSizeNull: Self = StObject.set(x, "maxImageSize", null)
    
    inline def setMaxImageSizeUndefined: Self = StObject.set(x, "maxImageSize", js.undefined)
    
    inline def setTimeout(value: NullableOption[String]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutNull: Self = StObject.set(x, "timeout", null)
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
