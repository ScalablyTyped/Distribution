package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossTenantAccessPolicyTarget extends StObject {
  
  /**
    * The unique identifier of the user, group, or application; one of the following keywords: AllUsers and AllApplications;
    * or for targets that are applications, you may use reserved values.
    */
  var target: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The type of resource that you want to target. The possible values are: user, group, application, unknownFutureValue.
  var targetType: js.UndefOr[NullableOption[CrossTenantAccessPolicyTargetType]] = js.undefined
}
object CrossTenantAccessPolicyTarget {
  
  inline def apply(): CrossTenantAccessPolicyTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossTenantAccessPolicyTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrossTenantAccessPolicyTarget] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: NullableOption[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetType(value: NullableOption[CrossTenantAccessPolicyTargetType]): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeNull: Self = StObject.set(x, "targetType", null)
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
