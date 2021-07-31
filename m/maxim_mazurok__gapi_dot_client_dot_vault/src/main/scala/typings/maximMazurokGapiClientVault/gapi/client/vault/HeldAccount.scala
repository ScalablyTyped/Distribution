package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeldAccount extends StObject {
  
  /** The account's ID as provided by the Admin SDK. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** The primary email address of the account. If used as an input, this takes precedence over account ID. */
  var email: js.UndefOr[String] = js.undefined
  
  /** Output only. The first name of the account holder. */
  var firstName: js.UndefOr[String] = js.undefined
  
  /** Output only. When the account was put on hold. */
  var holdTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The last name of the account holder. */
  var lastName: js.UndefOr[String] = js.undefined
}
object HeldAccount {
  
  @scala.inline
  def apply(): HeldAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeldAccount]
  }
  
  @scala.inline
  implicit class HeldAccountMutableBuilder[Self <: HeldAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    @scala.inline
    def setHoldTime(value: String): Self = StObject.set(x, "holdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoldTimeUndefined: Self = StObject.set(x, "holdTime", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
  }
}
