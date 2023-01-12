package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddMatterPermissionsRequest extends StObject {
  
  /** Only relevant if **sendEmails** is **true**. To CC the requestor in the email message, set to **true**. To not CC requestor, set to **false**. */
  var ccMe: js.UndefOr[Boolean] = js.undefined
  
  /** The account and its role to add. */
  var matterPermission: js.UndefOr[MatterPermission] = js.undefined
  
  /** To send a notification email to the added account, set to **true**. To not send a notification email, set to **false**. */
  var sendEmails: js.UndefOr[Boolean] = js.undefined
}
object AddMatterPermissionsRequest {
  
  inline def apply(): AddMatterPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddMatterPermissionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddMatterPermissionsRequest] (val x: Self) extends AnyVal {
    
    inline def setCcMe(value: Boolean): Self = StObject.set(x, "ccMe", value.asInstanceOf[js.Any])
    
    inline def setCcMeUndefined: Self = StObject.set(x, "ccMe", js.undefined)
    
    inline def setMatterPermission(value: MatterPermission): Self = StObject.set(x, "matterPermission", value.asInstanceOf[js.Any])
    
    inline def setMatterPermissionUndefined: Self = StObject.set(x, "matterPermission", js.undefined)
    
    inline def setSendEmails(value: Boolean): Self = StObject.set(x, "sendEmails", value.asInstanceOf[js.Any])
    
    inline def setSendEmailsUndefined: Self = StObject.set(x, "sendEmails", js.undefined)
  }
}
