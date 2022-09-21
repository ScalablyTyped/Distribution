package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamworkUserIdentity
  extends StObject
     with Identity {
  
  /**
    * Type of user. Possible values are: aadUser, onPremiseAadUser, anonymousGuest, federatedUser,
    * personalMicrosoftAccountUser, skypeUser, phoneUser, unknownFutureValue and emailUser.
    */
  var userIdentityType: js.UndefOr[NullableOption[TeamworkUserIdentityType]] = js.undefined
}
object TeamworkUserIdentity {
  
  inline def apply(): TeamworkUserIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamworkUserIdentity]
  }
  
  extension [Self <: TeamworkUserIdentity](x: Self) {
    
    inline def setUserIdentityType(value: NullableOption[TeamworkUserIdentityType]): Self = StObject.set(x, "userIdentityType", value.asInstanceOf[js.Any])
    
    inline def setUserIdentityTypeNull: Self = StObject.set(x, "userIdentityType", null)
    
    inline def setUserIdentityTypeUndefined: Self = StObject.set(x, "userIdentityType", js.undefined)
  }
}
