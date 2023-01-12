package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppliedConditionalAccessPolicy extends StObject {
  
  // Refers to the Name of the conditional access policy (example: 'Require MFA for Salesforce').
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Refers to the grant controls enforced by the conditional access policy (example: 'Require multi-factor
    * authentication').
    */
  var enforcedGrantControls: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // Refers to the session controls enforced by the conditional access policy (example: 'Require app enforced controls').
  var enforcedSessionControls: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // An identifier of the conditional access policy.
  var id: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Indicates the result of the CA policy that was triggered. Possible values are: success, failure, notApplied (Policy
    * isn't applied because policy conditions were not met),notEnabled (This is due to the policy in disabled state),
    * unknown, unknownFutureValue.
    */
  var result: js.UndefOr[NullableOption[AppliedConditionalAccessPolicyResult]] = js.undefined
}
object AppliedConditionalAccessPolicy {
  
  inline def apply(): AppliedConditionalAccessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppliedConditionalAccessPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppliedConditionalAccessPolicy] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnforcedGrantControls(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "enforcedGrantControls", value.asInstanceOf[js.Any])
    
    inline def setEnforcedGrantControlsNull: Self = StObject.set(x, "enforcedGrantControls", null)
    
    inline def setEnforcedGrantControlsUndefined: Self = StObject.set(x, "enforcedGrantControls", js.undefined)
    
    inline def setEnforcedGrantControlsVarargs(value: String*): Self = StObject.set(x, "enforcedGrantControls", js.Array(value*))
    
    inline def setEnforcedSessionControls(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "enforcedSessionControls", value.asInstanceOf[js.Any])
    
    inline def setEnforcedSessionControlsNull: Self = StObject.set(x, "enforcedSessionControls", null)
    
    inline def setEnforcedSessionControlsUndefined: Self = StObject.set(x, "enforcedSessionControls", js.undefined)
    
    inline def setEnforcedSessionControlsVarargs(value: String*): Self = StObject.set(x, "enforcedSessionControls", js.Array(value*))
    
    inline def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setResult(value: NullableOption[AppliedConditionalAccessPolicyResult]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultNull: Self = StObject.set(x, "result", null)
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
