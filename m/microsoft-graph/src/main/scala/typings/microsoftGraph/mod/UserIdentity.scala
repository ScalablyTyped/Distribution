package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserIdentity extends StObject {
  
  // The identity's display name. Note that this may not always be available or up-to-date.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Unique identifier for the identity.
  var id: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates the client IP address used by user performing the activity (audit log only).
  var ipAddress: js.UndefOr[NullableOption[String]] = js.native
  
  // The userPrincipalName attribute of the user.
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.native
}
object UserIdentity {
  
  @scala.inline
  def apply(): UserIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserIdentity]
  }
  
  @scala.inline
  implicit class UserIdentityMutableBuilder[Self <: UserIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIpAddress(value: NullableOption[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    @scala.inline
    def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    @scala.inline
    def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}
