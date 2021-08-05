package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceAccountDelegationInfo extends StObject {
  
  /** First party (Google) identity as the real authority. */
  var firstPartyPrincipal: js.UndefOr[FirstPartyPrincipal] = js.undefined
  
  /** A string representing the principal_subject associated with the identity. See go/3pical for more info on how principal_subject is formatted. */
  var principalSubject: js.UndefOr[String] = js.undefined
  
  /** Third party identity as the real authority. */
  var thirdPartyPrincipal: js.UndefOr[ThirdPartyPrincipal] = js.undefined
}
object ServiceAccountDelegationInfo {
  
  inline def apply(): ServiceAccountDelegationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAccountDelegationInfo]
  }
  
  extension [Self <: ServiceAccountDelegationInfo](x: Self) {
    
    inline def setFirstPartyPrincipal(value: FirstPartyPrincipal): Self = StObject.set(x, "firstPartyPrincipal", value.asInstanceOf[js.Any])
    
    inline def setFirstPartyPrincipalUndefined: Self = StObject.set(x, "firstPartyPrincipal", js.undefined)
    
    inline def setPrincipalSubject(value: String): Self = StObject.set(x, "principalSubject", value.asInstanceOf[js.Any])
    
    inline def setPrincipalSubjectUndefined: Self = StObject.set(x, "principalSubject", js.undefined)
    
    inline def setThirdPartyPrincipal(value: ThirdPartyPrincipal): Self = StObject.set(x, "thirdPartyPrincipal", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyPrincipalUndefined: Self = StObject.set(x, "thirdPartyPrincipal", js.undefined)
  }
}
