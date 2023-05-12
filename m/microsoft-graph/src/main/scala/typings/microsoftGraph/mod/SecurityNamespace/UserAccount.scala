package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAccount extends StObject {
  
  // The user account's displayed name.
  var accountName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The user object identifier in Azure AD.
  var azureAdUserId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the Active Directory domain of which the user is a member.
  var domainName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The user principal name of the account in Azure AD.
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The local security identifier of the user account.
  var userSid: js.UndefOr[NullableOption[String]] = js.undefined
}
object UserAccount {
  
  inline def apply(): UserAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserAccount] (val x: Self) extends AnyVal {
    
    inline def setAccountName(value: NullableOption[String]): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameNull: Self = StObject.set(x, "accountName", null)
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    inline def setAzureAdUserId(value: NullableOption[String]): Self = StObject.set(x, "azureAdUserId", value.asInstanceOf[js.Any])
    
    inline def setAzureAdUserIdNull: Self = StObject.set(x, "azureAdUserId", null)
    
    inline def setAzureAdUserIdUndefined: Self = StObject.set(x, "azureAdUserId", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDomainName(value: NullableOption[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameNull: Self = StObject.set(x, "domainName", null)
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    inline def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    inline def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
    
    inline def setUserSid(value: NullableOption[String]): Self = StObject.set(x, "userSid", value.asInstanceOf[js.Any])
    
    inline def setUserSidNull: Self = StObject.set(x, "userSid", null)
    
    inline def setUserSidUndefined: Self = StObject.set(x, "userSid", js.undefined)
  }
}
