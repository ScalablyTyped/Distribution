package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2TimePartConfig extends js.Object {
  
  /** The part of the time to keep. */
  var partToExtract: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2TimePartConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2TimePartConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2TimePartConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2TimePartConfigOps[Self <: GooglePrivacyDlpV2TimePartConfig] (val x: Self) extends AnyVal {
    
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
    def setPartToExtract(value: String): Self = this.set("partToExtract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartToExtract: Self = this.set("partToExtract", js.undefined)
  }
}
