package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedRoleManagementPolicyRuleTarget extends StObject {
  
  // The type of caller that's the target of the policy rule. Allowed values are: None, Admin, EndUser.
  var caller: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The list of role settings that are enforced and cannot be overridden by child scopes. Use All for all settings.
  var enforcedSettings: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The list of role settings that can be inherited by child scopes. Use All for all settings.
  var inheritableSettings: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The role assignment type that's the target of policy rule. Allowed values are: Eligibility, Assignment.
  var level: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The role management operations that are the target of the policy rule. Allowed values are: All, Activate, Deactivate,
    * Assign, Update, Remove, Extend, Renew.
    */
  var operations: js.UndefOr[NullableOption[js.Array[UnifiedRoleManagementPolicyRuleTargetOperations]]] = js.undefined
  
  var targetObjects: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
}
object UnifiedRoleManagementPolicyRuleTarget {
  
  inline def apply(): UnifiedRoleManagementPolicyRuleTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedRoleManagementPolicyRuleTarget]
  }
  
  extension [Self <: UnifiedRoleManagementPolicyRuleTarget](x: Self) {
    
    inline def setCaller(value: NullableOption[String]): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
    
    inline def setCallerNull: Self = StObject.set(x, "caller", null)
    
    inline def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
    
    inline def setEnforcedSettings(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "enforcedSettings", value.asInstanceOf[js.Any])
    
    inline def setEnforcedSettingsNull: Self = StObject.set(x, "enforcedSettings", null)
    
    inline def setEnforcedSettingsUndefined: Self = StObject.set(x, "enforcedSettings", js.undefined)
    
    inline def setEnforcedSettingsVarargs(value: String*): Self = StObject.set(x, "enforcedSettings", js.Array(value*))
    
    inline def setInheritableSettings(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "inheritableSettings", value.asInstanceOf[js.Any])
    
    inline def setInheritableSettingsNull: Self = StObject.set(x, "inheritableSettings", null)
    
    inline def setInheritableSettingsUndefined: Self = StObject.set(x, "inheritableSettings", js.undefined)
    
    inline def setInheritableSettingsVarargs(value: String*): Self = StObject.set(x, "inheritableSettings", js.Array(value*))
    
    inline def setLevel(value: NullableOption[String]): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelNull: Self = StObject.set(x, "level", null)
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setOperations(value: NullableOption[js.Array[UnifiedRoleManagementPolicyRuleTargetOperations]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsNull: Self = StObject.set(x, "operations", null)
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: UnifiedRoleManagementPolicyRuleTargetOperations*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setTargetObjects(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "targetObjects", value.asInstanceOf[js.Any])
    
    inline def setTargetObjectsNull: Self = StObject.set(x, "targetObjects", null)
    
    inline def setTargetObjectsUndefined: Self = StObject.set(x, "targetObjects", js.undefined)
    
    inline def setTargetObjectsVarargs(value: DirectoryObject*): Self = StObject.set(x, "targetObjects", js.Array(value*))
  }
}
