package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddHeldAccountsRequest extends StObject {
  
  /** Account IDs to identify which accounts to add. Only account_ids or only emails should be specified, but not both. */
  var accountIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Emails to identify which accounts to add. Only emails or only account_ids should be specified, but not both. */
  var emails: js.UndefOr[js.Array[String]] = js.native
}
object AddHeldAccountsRequest {
  
  @scala.inline
  def apply(): AddHeldAccountsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddHeldAccountsRequest]
  }
  
  @scala.inline
  implicit class AddHeldAccountsRequestMutableBuilder[Self <: AddHeldAccountsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: js.Array[String]): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    @scala.inline
    def setAccountIdsVarargs(value: String*): Self = StObject.set(x, "accountIds", js.Array(value :_*))
    
    @scala.inline
    def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    @scala.inline
    def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value :_*))
  }
}
