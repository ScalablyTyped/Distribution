package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2SaveFindings extends js.Object {
  
  /** Location to store findings outside of DLP. */
  var outputConfig: js.UndefOr[GooglePrivacyDlpV2OutputStorageConfig] = js.native
}
object GooglePrivacyDlpV2SaveFindings {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2SaveFindings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2SaveFindings]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2SaveFindingsOps[Self <: GooglePrivacyDlpV2SaveFindings] (val x: Self) extends AnyVal {
    
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
    def setOutputConfig(value: GooglePrivacyDlpV2OutputStorageConfig): Self = this.set("outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputConfig: Self = this.set("outputConfig", js.undefined)
  }
}
