package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationMethodTarget
  extends StObject
     with Entity {
  
  // Determines if the user is enforced to register the authentication method.
  var isRegistrationRequired: js.UndefOr[Boolean] = js.undefined
  
  // Possible values are: user, group.
  var targetType: js.UndefOr[AuthenticationMethodTargetType] = js.undefined
}
object AuthenticationMethodTarget {
  
  inline def apply(): AuthenticationMethodTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationMethodTarget]
  }
  
  extension [Self <: AuthenticationMethodTarget](x: Self) {
    
    inline def setIsRegistrationRequired(value: Boolean): Self = StObject.set(x, "isRegistrationRequired", value.asInstanceOf[js.Any])
    
    inline def setIsRegistrationRequiredUndefined: Self = StObject.set(x, "isRegistrationRequired", js.undefined)
    
    inline def setTargetType(value: AuthenticationMethodTargetType): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
  }
}
