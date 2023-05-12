package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppManagementPolicy
  extends StObject
     with PolicyBase {
  
  // Collection of applications and service principals to which the policy is applied.
  var appliesTo: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  // Denotes whether the policy is enabled.
  var isEnabled: js.UndefOr[Boolean] = js.undefined
  
  // Restrictions that apply to an application or service principal object.
  var restrictions: js.UndefOr[NullableOption[AppManagementConfiguration]] = js.undefined
}
object AppManagementPolicy {
  
  inline def apply(): AppManagementPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppManagementPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppManagementPolicy] (val x: Self) extends AnyVal {
    
    inline def setAppliesTo(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "appliesTo", value.asInstanceOf[js.Any])
    
    inline def setAppliesToNull: Self = StObject.set(x, "appliesTo", null)
    
    inline def setAppliesToUndefined: Self = StObject.set(x, "appliesTo", js.undefined)
    
    inline def setAppliesToVarargs(value: DirectoryObject*): Self = StObject.set(x, "appliesTo", js.Array(value*))
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    inline def setRestrictions(value: NullableOption[AppManagementConfiguration]): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsNull: Self = StObject.set(x, "restrictions", null)
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
  }
}
