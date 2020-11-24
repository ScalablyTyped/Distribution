package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeidentifyConfig extends js.Object {
  
  /** Configures de-id of application/DICOM content. */
  var dicom: js.UndefOr[DicomConfig] = js.native
  
  /** Configures de-id of application/FHIR content. */
  var fhir: js.UndefOr[FhirConfig] = js.native
  
  /** Configures de-identification of image pixels wherever they are found in the source_dataset. */
  var image: js.UndefOr[ImageConfig] = js.native
  
  /** Configures de-identification of text wherever it is found in the source_dataset. */
  var text: js.UndefOr[TextConfig] = js.native
}
object DeidentifyConfig {
  
  @scala.inline
  def apply(): DeidentifyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeidentifyConfig]
  }
  
  @scala.inline
  implicit class DeidentifyConfigOps[Self <: DeidentifyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDicom(value: DicomConfig): Self = this.set("dicom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDicom: Self = this.set("dicom", js.undefined)
    
    @scala.inline
    def setFhir(value: FhirConfig): Self = this.set("fhir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFhir: Self = this.set("fhir", js.undefined)
    
    @scala.inline
    def setImage(value: ImageConfig): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setText(value: TextConfig): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
