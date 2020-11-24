package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Error extends js.Object {
  
  /** Detailed error codes and messages. */
  var details: js.UndefOr[GoogleRpcStatus] = js.native
  
  /** The times the error occurred. */
  var timestamps: js.UndefOr[js.Array[String]] = js.native
}
object GooglePrivacyDlpV2Error {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Error = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Error]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ErrorOps[Self <: GooglePrivacyDlpV2Error] (val x: Self) extends AnyVal {
    
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
    def setDetails(value: GoogleRpcStatus): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setTimestampsVarargs(value: String*): Self = this.set("timestamps", js.Array(value :_*))
    
    @scala.inline
    def setTimestamps(value: js.Array[String]): Self = this.set("timestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamps: Self = this.set("timestamps", js.undefined)
  }
}
