package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPermission extends StObject {
  
  /** GTM Account access permissions. @mutable tagmanager.accounts.permissions.create @mutable tagmanager.accounts.permissions.update */
  var accountAccess: js.UndefOr[AccountAccess] = js.native
  
  /** The Account ID uniquely identifies the GTM Account. */
  var accountId: js.UndefOr[String] = js.native
  
  /** GTM Container access permissions. @mutable tagmanager.accounts.permissions.create @mutable tagmanager.accounts.permissions.update */
  var containerAccess: js.UndefOr[js.Array[ContainerAccess]] = js.native
  
  /** User's email address. @mutable tagmanager.accounts.permissions.create */
  var emailAddress: js.UndefOr[String] = js.native
  
  /** GTM UserPermission's API relative path. */
  var path: js.UndefOr[String] = js.native
}
object UserPermission {
  
  @scala.inline
  def apply(): UserPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPermission]
  }
  
  @scala.inline
  implicit class UserPermissionMutableBuilder[Self <: UserPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountAccess(value: AccountAccess): Self = StObject.set(x, "accountAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountAccessUndefined: Self = StObject.set(x, "accountAccess", js.undefined)
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setContainerAccess(value: js.Array[ContainerAccess]): Self = StObject.set(x, "containerAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerAccessUndefined: Self = StObject.set(x, "containerAccess", js.undefined)
    
    @scala.inline
    def setContainerAccessVarargs(value: ContainerAccess*): Self = StObject.set(x, "containerAccess", js.Array(value :_*))
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
