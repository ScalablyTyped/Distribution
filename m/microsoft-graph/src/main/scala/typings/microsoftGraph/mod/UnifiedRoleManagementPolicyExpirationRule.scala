package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedRoleManagementPolicyExpirationRule
  extends StObject
     with UnifiedRoleManagementPolicyRule {
  
  // Indicates whether expiration is required or if it's a permanently active assignment or eligibility.
  var isExpirationRequired: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The maximum duration allowed for eligibility or assignment which is not permanent. Required when isExpirationRequired
    * is true.
    */
  var maximumDuration: js.UndefOr[NullableOption[String]] = js.undefined
}
object UnifiedRoleManagementPolicyExpirationRule {
  
  inline def apply(): UnifiedRoleManagementPolicyExpirationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedRoleManagementPolicyExpirationRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnifiedRoleManagementPolicyExpirationRule] (val x: Self) extends AnyVal {
    
    inline def setIsExpirationRequired(value: NullableOption[Boolean]): Self = StObject.set(x, "isExpirationRequired", value.asInstanceOf[js.Any])
    
    inline def setIsExpirationRequiredNull: Self = StObject.set(x, "isExpirationRequired", null)
    
    inline def setIsExpirationRequiredUndefined: Self = StObject.set(x, "isExpirationRequired", js.undefined)
    
    inline def setMaximumDuration(value: NullableOption[String]): Self = StObject.set(x, "maximumDuration", value.asInstanceOf[js.Any])
    
    inline def setMaximumDurationNull: Self = StObject.set(x, "maximumDuration", null)
    
    inline def setMaximumDurationUndefined: Self = StObject.set(x, "maximumDuration", js.undefined)
  }
}
