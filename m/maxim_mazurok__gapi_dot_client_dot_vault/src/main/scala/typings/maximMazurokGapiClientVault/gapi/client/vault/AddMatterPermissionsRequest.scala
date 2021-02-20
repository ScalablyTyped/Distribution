package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddMatterPermissionsRequest extends StObject {
  
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
  implicit class AddMatterPermissionsRequestMutableBuilder[Self <: AddMatterPermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCcMe(value: Boolean): Self = StObject.set(x, "ccMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcMeUndefined: Self = StObject.set(x, "ccMe", js.undefined)
    
    @scala.inline
    def setMatterPermission(value: MatterPermission): Self = StObject.set(x, "matterPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatterPermissionUndefined: Self = StObject.set(x, "matterPermission", js.undefined)
    
    @scala.inline
    def setSendEmails(value: Boolean): Self = StObject.set(x, "sendEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendEmailsUndefined: Self = StObject.set(x, "sendEmails", js.undefined)
  }
}
