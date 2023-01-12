package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationFlowsPolicy
  extends StObject
     with Entity {
  
  // Inherited property. A description of the policy. Optional. Read-only.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Inherited property. The human-readable name of the policy. Optional. Read-only.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Contains selfServiceSignUpAuthenticationFlowConfiguration settings that convey whether self-service sign-up is enabled
    * or disabled. Optional. Read-only.
    */
  var selfServiceSignUp: js.UndefOr[NullableOption[SelfServiceSignUpAuthenticationFlowConfiguration]] = js.undefined
}
object AuthenticationFlowsPolicy {
  
  inline def apply(): AuthenticationFlowsPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationFlowsPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationFlowsPolicy] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setSelfServiceSignUp(value: NullableOption[SelfServiceSignUpAuthenticationFlowConfiguration]): Self = StObject.set(x, "selfServiceSignUp", value.asInstanceOf[js.Any])
    
    inline def setSelfServiceSignUpNull: Self = StObject.set(x, "selfServiceSignUp", null)
    
    inline def setSelfServiceSignUpUndefined: Self = StObject.set(x, "selfServiceSignUp", js.undefined)
  }
}
