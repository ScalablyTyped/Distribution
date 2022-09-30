package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureOptions extends StObject {
  
  var requestedVariant: js.UndefOr[RequestedVariant] = js.undefined
  
  var uploadFallback: js.UndefOr[Boolean] = js.undefined
  
  var useUploader: js.UndefOr[Boolean] = js.undefined
  
  var useWebcam: js.UndefOr[Boolean] = js.undefined
}
object CaptureOptions {
  
  inline def apply(): CaptureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureOptions]
  }
  
  extension [Self <: CaptureOptions](x: Self) {
    
    inline def setRequestedVariant(value: RequestedVariant): Self = StObject.set(x, "requestedVariant", value.asInstanceOf[js.Any])
    
    inline def setRequestedVariantUndefined: Self = StObject.set(x, "requestedVariant", js.undefined)
    
    inline def setUploadFallback(value: Boolean): Self = StObject.set(x, "uploadFallback", value.asInstanceOf[js.Any])
    
    inline def setUploadFallbackUndefined: Self = StObject.set(x, "uploadFallback", js.undefined)
    
    inline def setUseUploader(value: Boolean): Self = StObject.set(x, "useUploader", value.asInstanceOf[js.Any])
    
    inline def setUseUploaderUndefined: Self = StObject.set(x, "useUploader", js.undefined)
    
    inline def setUseWebcam(value: Boolean): Self = StObject.set(x, "useWebcam", value.asInstanceOf[js.Any])
    
    inline def setUseWebcamUndefined: Self = StObject.set(x, "useWebcam", js.undefined)
  }
}
