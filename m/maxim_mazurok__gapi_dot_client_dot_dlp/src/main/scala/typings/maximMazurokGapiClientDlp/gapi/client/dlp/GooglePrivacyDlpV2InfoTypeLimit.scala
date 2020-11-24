package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2InfoTypeLimit extends js.Object {
  
  /**
    * Type of information the findings limit applies to. Only one limit per info_type should be provided. If InfoTypeLimit does not have an info_type, the DLP API applies the limit
    * against all info_types that are found but not specified in another InfoTypeLimit.
    */
  var infoType: js.UndefOr[GooglePrivacyDlpV2InfoType] = js.native
  
  /** Max findings limit for the given infoType. */
  var maxFindings: js.UndefOr[Double] = js.native
}
object GooglePrivacyDlpV2InfoTypeLimit {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2InfoTypeLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InfoTypeLimit]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2InfoTypeLimitOps[Self <: GooglePrivacyDlpV2InfoTypeLimit] (val x: Self) extends AnyVal {
    
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
    def setInfoType(value: GooglePrivacyDlpV2InfoType): Self = this.set("infoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoType: Self = this.set("infoType", js.undefined)
    
    @scala.inline
    def setMaxFindings(value: Double): Self = this.set("maxFindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFindings: Self = this.set("maxFindings", js.undefined)
  }
}
