package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeidentifyConfig extends StObject {
  
  /** Configures de-id of application/DICOM content. */
  var dicom: js.UndefOr[DicomConfig] = js.undefined
  
  /** Configures de-id of application/FHIR content. */
  var fhir: js.UndefOr[FhirConfig] = js.undefined
  
  /** Configures de-identification of image pixels wherever they are found in the source_dataset. */
  var image: js.UndefOr[ImageConfig] = js.undefined
  
  /** Configures de-identification of text wherever it is found in the source_dataset. */
  var text: js.UndefOr[TextConfig] = js.undefined
}
object DeidentifyConfig {
  
  @scala.inline
  def apply(): DeidentifyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeidentifyConfig]
  }
  
  @scala.inline
  implicit class DeidentifyConfigMutableBuilder[Self <: DeidentifyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDicom(value: DicomConfig): Self = StObject.set(x, "dicom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDicomUndefined: Self = StObject.set(x, "dicom", js.undefined)
    
    @scala.inline
    def setFhir(value: FhirConfig): Self = StObject.set(x, "fhir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFhirUndefined: Self = StObject.set(x, "fhir", js.undefined)
    
    @scala.inline
    def setImage(value: ImageConfig): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setText(value: TextConfig): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
