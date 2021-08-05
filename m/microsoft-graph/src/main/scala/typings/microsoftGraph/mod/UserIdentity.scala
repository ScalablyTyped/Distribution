package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserIdentity extends StObject {
  
  // The identity's display name. Note that this may not always be available or up-to-date.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique identifier for the identity.
  var id: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates the client IP address used by user performing the activity (audit log only).
  var ipAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The userPrincipalName attribute of the user.
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
}
object UserIdentity {
  
  inline def apply(): UserIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserIdentity]
  }
  
  extension [Self <: UserIdentity](x: Self) {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIpAddress(value: NullableOption[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    inline def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    inline def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}
