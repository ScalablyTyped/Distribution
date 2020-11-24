package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddMatterPermissionsRequest extends js.Object {
  
  /** Only relevant if send_emails is true. True to CC requestor in the email message. False to not CC requestor. */
  var ccMe: js.UndefOr[Boolean] = js.native
  
  /** The MatterPermission to add. */
  var matterPermission: js.UndefOr[MatterPermission] = js.native
  
  /** True to send notification email to the added account. False to not send notification email. */
  var sendEmails: js.UndefOr[Boolean] = js.native
}
object AddMatterPermissionsRequest {
  
  @scala.inline
  def apply(): AddMatterPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddMatterPermissionsRequest]
  }
  
  @scala.inline
  implicit class AddMatterPermissionsRequestOps[Self <: AddMatterPermissionsRequest] (val x: Self) extends AnyVal {
    
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
    def setCcMe(value: Boolean): Self = this.set("ccMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCcMe: Self = this.set("ccMe", js.undefined)
    
    @scala.inline
    def setMatterPermission(value: MatterPermission): Self = this.set("matterPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatterPermission: Self = this.set("matterPermission", js.undefined)
    
    @scala.inline
    def setSendEmails(value: Boolean): Self = this.set("sendEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendEmails: Self = this.set("sendEmails", js.undefined)
  }
}
