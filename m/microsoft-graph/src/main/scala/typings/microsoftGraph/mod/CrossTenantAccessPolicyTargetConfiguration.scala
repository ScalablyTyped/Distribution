package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossTenantAccessPolicyTargetConfiguration extends StObject {
  
  // Defines whether access is allowed or blocked. The possible values are: allowed, blocked, unknownFutureValue.
  var accessType: js.UndefOr[NullableOption[CrossTenantAccessPolicyTargetConfigurationAccessType]] = js.undefined
  
  // Specifies whether to target users, groups, or applications with this rule.
  var targets: js.UndefOr[NullableOption[js.Array[CrossTenantAccessPolicyTarget]]] = js.undefined
}
object CrossTenantAccessPolicyTargetConfiguration {
  
  inline def apply(): CrossTenantAccessPolicyTargetConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossTenantAccessPolicyTargetConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrossTenantAccessPolicyTargetConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAccessType(value: NullableOption[CrossTenantAccessPolicyTargetConfigurationAccessType]): Self = StObject.set(x, "accessType", value.asInstanceOf[js.Any])
    
    inline def setAccessTypeNull: Self = StObject.set(x, "accessType", null)
    
    inline def setAccessTypeUndefined: Self = StObject.set(x, "accessType", js.undefined)
    
    inline def setTargets(value: NullableOption[js.Array[CrossTenantAccessPolicyTarget]]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsNull: Self = StObject.set(x, "targets", null)
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: CrossTenantAccessPolicyTarget*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}
