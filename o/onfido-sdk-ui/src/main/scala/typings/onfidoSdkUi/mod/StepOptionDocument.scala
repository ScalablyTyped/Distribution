package typings.onfidoSdkUi.mod

import typings.onfidoSdkUi.anon.PartialRecordDocumentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepOptionDocument
  extends StObject
     with CaptureOptions {
  
  var documentTypes: js.UndefOr[PartialRecordDocumentType] = js.undefined
  
  var forceCrossDevice: js.UndefOr[Boolean] = js.undefined
  
  var photoCaptureFallback: js.UndefOr[scala.Nothing] = js.undefined
  
  var useLiveDocumentCapture: js.UndefOr[Boolean] = js.undefined
}
object StepOptionDocument {
  
  inline def apply(): StepOptionDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepOptionDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StepOptionDocument] (val x: Self) extends AnyVal {
    
    inline def setDocumentTypes(value: PartialRecordDocumentType): Self = StObject.set(x, "documentTypes", value.asInstanceOf[js.Any])
    
    inline def setDocumentTypesUndefined: Self = StObject.set(x, "documentTypes", js.undefined)
    
    inline def setForceCrossDevice(value: Boolean): Self = StObject.set(x, "forceCrossDevice", value.asInstanceOf[js.Any])
    
    inline def setForceCrossDeviceUndefined: Self = StObject.set(x, "forceCrossDevice", js.undefined)
    
    inline def setUseLiveDocumentCapture(value: Boolean): Self = StObject.set(x, "useLiveDocumentCapture", value.asInstanceOf[js.Any])
    
    inline def setUseLiveDocumentCaptureUndefined: Self = StObject.set(x, "useLiveDocumentCapture", js.undefined)
  }
}
