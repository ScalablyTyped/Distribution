package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPermission extends StObject {
  
  /** GTM Account access permissions. @mutable tagmanager.accounts.permissions.create @mutable tagmanager.accounts.permissions.update */
  var accountAccess: js.UndefOr[AccountAccess] = js.undefined
  
  /** The Account ID uniquely identifies the GTM Account. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** GTM Container access permissions. @mutable tagmanager.accounts.permissions.create @mutable tagmanager.accounts.permissions.update */
  var containerAccess: js.UndefOr[js.Array[ContainerAccess]] = js.undefined
  
  /** User's email address. @mutable tagmanager.accounts.permissions.create */
  var emailAddress: js.UndefOr[String] = js.undefined
  
  /** GTM UserPermission's API relative path. */
  var path: js.UndefOr[String] = js.undefined
}
object UserPermission {
  
  inline def apply(): UserPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPermission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserPermission] (val x: Self) extends AnyVal {
    
    inline def setAccountAccess(value: AccountAccess): Self = StObject.set(x, "accountAccess", value.asInstanceOf[js.Any])
    
    inline def setAccountAccessUndefined: Self = StObject.set(x, "accountAccess", js.undefined)
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setContainerAccess(value: js.Array[ContainerAccess]): Self = StObject.set(x, "containerAccess", value.asInstanceOf[js.Any])
    
    inline def setContainerAccessUndefined: Self = StObject.set(x, "containerAccess", js.undefined)
    
    inline def setContainerAccessVarargs(value: ContainerAccess*): Self = StObject.set(x, "containerAccess", js.Array(value*))
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
