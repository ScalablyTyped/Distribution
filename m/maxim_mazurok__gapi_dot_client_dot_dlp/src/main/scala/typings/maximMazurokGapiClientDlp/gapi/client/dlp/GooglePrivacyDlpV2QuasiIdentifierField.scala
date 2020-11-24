package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2QuasiIdentifierField extends js.Object {
  
  /**
    * A column can be tagged with a custom tag. In this case, the user must indicate an auxiliary table that contains statistical information on the possible values of this column
    * (below).
    */
  var customTag: js.UndefOr[String] = js.native
  
  /** Identifies the column. */
  var field: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.native
}
object GooglePrivacyDlpV2QuasiIdentifierField {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2QuasiIdentifierField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2QuasiIdentifierField]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2QuasiIdentifierFieldOps[Self <: GooglePrivacyDlpV2QuasiIdentifierField] (val x: Self) extends AnyVal {
    
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
  }
}
