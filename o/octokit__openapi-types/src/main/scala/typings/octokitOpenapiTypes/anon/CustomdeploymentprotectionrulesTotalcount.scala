package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomdeploymentprotectionrulesTotalcount extends StObject {
  
  var custom_deployment_protection_rules: js.UndefOr[js.Array[EnabledId]] = js.undefined
  
  /**
    * @description The number of enabled custom deployment protection rules for this environment
    * @example 10
    */
  var total_count: js.UndefOr[Double] = js.undefined
}
object CustomdeploymentprotectionrulesTotalcount {
  
  inline def apply(): CustomdeploymentprotectionrulesTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomdeploymentprotectionrulesTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomdeploymentprotectionrulesTotalcount] (val x: Self) extends AnyVal {
    
    inline def setCustom_deployment_protection_rules(value: js.Array[EnabledId]): Self = StObject.set(x, "custom_deployment_protection_rules", value.asInstanceOf[js.Any])
    
    inline def setCustom_deployment_protection_rulesUndefined: Self = StObject.set(x, "custom_deployment_protection_rules", js.undefined)
    
    inline def setCustom_deployment_protection_rulesVarargs(value: EnabledId*): Self = StObject.set(x, "custom_deployment_protection_rules", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_countUndefined: Self = StObject.set(x, "total_count", js.undefined)
  }
}
