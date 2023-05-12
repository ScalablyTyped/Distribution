package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessPolicyDetail extends StObject {
  
  // Represents the type of conditions that govern when the policy applies.
  var conditions: js.UndefOr[ConditionalAccessConditionSet] = js.undefined
  
  // Represents grant controls that must be fulfilled for the policy.
  var grantControls: js.UndefOr[NullableOption[ConditionalAccessGrantControls]] = js.undefined
  
  // Represents a complex type of session controls that is enforced after sign-in.
  var sessionControls: js.UndefOr[NullableOption[ConditionalAccessSessionControls]] = js.undefined
}
object ConditionalAccessPolicyDetail {
  
  inline def apply(): ConditionalAccessPolicyDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessPolicyDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalAccessPolicyDetail] (val x: Self) extends AnyVal {
    
    inline def setConditions(value: ConditionalAccessConditionSet): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setGrantControls(value: NullableOption[ConditionalAccessGrantControls]): Self = StObject.set(x, "grantControls", value.asInstanceOf[js.Any])
    
    inline def setGrantControlsNull: Self = StObject.set(x, "grantControls", null)
    
    inline def setGrantControlsUndefined: Self = StObject.set(x, "grantControls", js.undefined)
    
    inline def setSessionControls(value: NullableOption[ConditionalAccessSessionControls]): Self = StObject.set(x, "sessionControls", value.asInstanceOf[js.Any])
    
    inline def setSessionControlsNull: Self = StObject.set(x, "sessionControls", null)
    
    inline def setSessionControlsUndefined: Self = StObject.set(x, "sessionControls", js.undefined)
  }
}
