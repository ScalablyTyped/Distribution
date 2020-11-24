package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2QuasiId extends js.Object {
  
  /**
    * A column can be tagged with a custom tag. In this case, the user must indicate an auxiliary table that contains statistical information on the possible values of this column
    * (below).
    */
  var customTag: js.UndefOr[String] = js.native
  
  /** Required. Identifies the column. */
  var field: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.native
  
  /** If no semantic tag is indicated, we infer the statistical model from the distribution of values in the input data */
  var inferred: js.UndefOr[js.Any] = js.native
  
  /**
    * A column can be tagged with a InfoType to use the relevant public dataset as a statistical model of population, if available. We currently support US ZIP codes, region codes, ages
    * and genders. To programmatically obtain the list of supported InfoTypes, use ListInfoTypes with the supported_by=RISK_ANALYSIS filter.
    */
  var infoType: js.UndefOr[GooglePrivacyDlpV2InfoType] = js.native
}
object GooglePrivacyDlpV2QuasiId {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2QuasiId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2QuasiId]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2QuasiIdOps[Self <: GooglePrivacyDlpV2QuasiId] (val x: Self) extends AnyVal {
    
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
    def setCustomTag(value: String): Self = this.set("customTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomTag: Self = this.set("customTag", js.undefined)
    
    @scala.inline
    def setField(value: GooglePrivacyDlpV2FieldId): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setInferred(value: js.Any): Self = this.set("inferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInferred: Self = this.set("inferred", js.undefined)
    
    @scala.inline
    def setInfoType(value: GooglePrivacyDlpV2InfoType): Self = this.set("infoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoType: Self = this.set("infoType", js.undefined)
  }
}
