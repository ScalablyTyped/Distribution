package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2DeidentifyConfig extends js.Object {
  
  /** Treat the dataset as free-form text and apply the same free text transformation everywhere. */
  var infoTypeTransformations: js.UndefOr[GooglePrivacyDlpV2InfoTypeTransformations] = js.native
  
  /** Treat the dataset as structured. Transformations can be applied to specific locations within structured datasets, such as transforming a column within a table. */
  var recordTransformations: js.UndefOr[GooglePrivacyDlpV2RecordTransformations] = js.native
  
  /** Mode for handling transformation errors. If left unspecified, the default mode is `TransformationErrorHandling.ThrowError`. */
  var transformationErrorHandling: js.UndefOr[GooglePrivacyDlpV2TransformationErrorHandling] = js.native
}
object GooglePrivacyDlpV2DeidentifyConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2DeidentifyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DeidentifyConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2DeidentifyConfigOps[Self <: GooglePrivacyDlpV2DeidentifyConfig] (val x: Self) extends AnyVal {
    
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
    def setInfoTypeTransformations(value: GooglePrivacyDlpV2InfoTypeTransformations): Self = this.set("infoTypeTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoTypeTransformations: Self = this.set("infoTypeTransformations", js.undefined)
    
    @scala.inline
    def setRecordTransformations(value: GooglePrivacyDlpV2RecordTransformations): Self = this.set("recordTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordTransformations: Self = this.set("recordTransformations", js.undefined)
    
    @scala.inline
    def setTransformationErrorHandling(value: GooglePrivacyDlpV2TransformationErrorHandling): Self = this.set("transformationErrorHandling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformationErrorHandling: Self = this.set("transformationErrorHandling", js.undefined)
  }
}
