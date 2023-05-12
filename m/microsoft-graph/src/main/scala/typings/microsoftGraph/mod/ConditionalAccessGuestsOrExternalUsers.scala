package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessGuestsOrExternalUsers extends StObject {
  
  /**
    * The tenant IDs of the selected types of external users. Either all B2B tenant or a collection of tenant IDs. External
    * tenants can be specified only when the property guestOrExternalUserTypes is not null or an empty String.
    */
  var externalTenants: js.UndefOr[NullableOption[ConditionalAccessExternalTenants]] = js.undefined
  
  /**
    * Indicates internal guests or external user types. This is a multi-valued property. Possible values are: none,
    * internalGuest, b2bCollaborationGuest, b2bCollaborationMember, b2bDirectConnectUser, otherExternalUser, serviceProvider,
    * unknownFutureValue.
    */
  var guestOrExternalUserTypes: js.UndefOr[ConditionalAccessGuestOrExternalUserTypes] = js.undefined
}
object ConditionalAccessGuestsOrExternalUsers {
  
  inline def apply(): ConditionalAccessGuestsOrExternalUsers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessGuestsOrExternalUsers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalAccessGuestsOrExternalUsers] (val x: Self) extends AnyVal {
    
    inline def setExternalTenants(value: NullableOption[ConditionalAccessExternalTenants]): Self = StObject.set(x, "externalTenants", value.asInstanceOf[js.Any])
    
    inline def setExternalTenantsNull: Self = StObject.set(x, "externalTenants", null)
    
    inline def setExternalTenantsUndefined: Self = StObject.set(x, "externalTenants", js.undefined)
    
    inline def setGuestOrExternalUserTypes(value: ConditionalAccessGuestOrExternalUserTypes): Self = StObject.set(x, "guestOrExternalUserTypes", value.asInstanceOf[js.Any])
    
    inline def setGuestOrExternalUserTypesUndefined: Self = StObject.set(x, "guestOrExternalUserTypes", js.undefined)
  }
}
