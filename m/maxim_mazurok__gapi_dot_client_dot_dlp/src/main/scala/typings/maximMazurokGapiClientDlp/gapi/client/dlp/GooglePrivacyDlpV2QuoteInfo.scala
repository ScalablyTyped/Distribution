package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2QuoteInfo extends js.Object {
  
  /** The date time indicated by the quote. */
  var dateTime: js.UndefOr[GooglePrivacyDlpV2DateTime] = js.native
}
object GooglePrivacyDlpV2QuoteInfo {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2QuoteInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2QuoteInfo]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2QuoteInfoOps[Self <: GooglePrivacyDlpV2QuoteInfo] (val x: Self) extends AnyVal {
    
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
    def setDateTime(value: GooglePrivacyDlpV2DateTime): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTime: Self = this.set("dateTime", js.undefined)
  }
}
