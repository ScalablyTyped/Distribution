package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepOptionDocument
  extends StObject
     with CaptureOptions {
  
  var countryFilter: js.UndefOr[js.Array[documentSelectionType]] = js.undefined
  
  var documentSelection: js.UndefOr[js.Array[documentSelectionType]] = js.undefined
  
  var documentTypes: js.UndefOr[StepOptionDocumentType] = js.undefined
  
  var forceCrossDevice: js.UndefOr[Boolean] = js.undefined
  
  var genericDocumentTypes: js.UndefOr[js.Array[GenericDocumentType]] = js.undefined
  
  var hideCountrySelection: js.UndefOr[Boolean] = js.undefined
  
  var photoCaptureFallback: js.UndefOr[scala.Nothing] = js.undefined
}
object StepOptionDocument {
  
  inline def apply(): StepOptionDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepOptionDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StepOptionDocument] (val x: Self) extends AnyVal {
    
    inline def setCountryFilter(value: js.Array[documentSelectionType]): Self = StObject.set(x, "countryFilter", value.asInstanceOf[js.Any])
    
    inline def setCountryFilterUndefined: Self = StObject.set(x, "countryFilter", js.undefined)
    
    inline def setCountryFilterVarargs(value: documentSelectionType*): Self = StObject.set(x, "countryFilter", js.Array(value*))
    
    inline def setDocumentSelection(value: js.Array[documentSelectionType]): Self = StObject.set(x, "documentSelection", value.asInstanceOf[js.Any])
    
    inline def setDocumentSelectionUndefined: Self = StObject.set(x, "documentSelection", js.undefined)
    
    inline def setDocumentSelectionVarargs(value: documentSelectionType*): Self = StObject.set(x, "documentSelection", js.Array(value*))
    
    inline def setDocumentTypes(value: StepOptionDocumentType): Self = StObject.set(x, "documentTypes", value.asInstanceOf[js.Any])
    
    inline def setDocumentTypesUndefined: Self = StObject.set(x, "documentTypes", js.undefined)
    
    inline def setForceCrossDevice(value: Boolean): Self = StObject.set(x, "forceCrossDevice", value.asInstanceOf[js.Any])
    
    inline def setForceCrossDeviceUndefined: Self = StObject.set(x, "forceCrossDevice", js.undefined)
    
    inline def setGenericDocumentTypes(value: js.Array[GenericDocumentType]): Self = StObject.set(x, "genericDocumentTypes", value.asInstanceOf[js.Any])
    
    inline def setGenericDocumentTypesUndefined: Self = StObject.set(x, "genericDocumentTypes", js.undefined)
    
    inline def setGenericDocumentTypesVarargs(value: GenericDocumentType*): Self = StObject.set(x, "genericDocumentTypes", js.Array(value*))
    
    inline def setHideCountrySelection(value: Boolean): Self = StObject.set(x, "hideCountrySelection", value.asInstanceOf[js.Any])
    
    inline def setHideCountrySelectionUndefined: Self = StObject.set(x, "hideCountrySelection", js.undefined)
  }
}
