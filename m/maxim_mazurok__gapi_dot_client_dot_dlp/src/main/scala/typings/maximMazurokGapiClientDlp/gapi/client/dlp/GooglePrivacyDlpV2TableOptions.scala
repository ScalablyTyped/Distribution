package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2TableOptions extends js.Object {
  
  /**
    * The columns that are the primary keys for table objects included in ContentItem. A copy of this cell's value will stored alongside alongside each finding so that the finding can be
    * traced to the specific row it came from. No more than 3 may be provided.
    */
  var identifyingFields: js.UndefOr[js.Array[GooglePrivacyDlpV2FieldId]] = js.native
}
object GooglePrivacyDlpV2TableOptions {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2TableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2TableOptions]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2TableOptionsOps[Self <: GooglePrivacyDlpV2TableOptions] (val x: Self) extends AnyVal {
    
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
    def setIdentifyingFieldsVarargs(value: GooglePrivacyDlpV2FieldId*): Self = this.set("identifyingFields", js.Array(value :_*))
    
    @scala.inline
    def setIdentifyingFields(value: js.Array[GooglePrivacyDlpV2FieldId]): Self = this.set("identifyingFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifyingFields: Self = this.set("identifyingFields", js.undefined)
  }
}
