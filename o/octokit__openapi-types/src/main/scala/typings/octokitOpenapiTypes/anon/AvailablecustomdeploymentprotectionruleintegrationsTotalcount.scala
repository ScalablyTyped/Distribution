package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailablecustomdeploymentprotectionruleintegrationsTotalcount extends StObject {
  
  var available_custom_deployment_protection_rule_integrations: js.UndefOr[js.Array[Integrationurl]] = js.undefined
  
  /**
    * @description The total number of custom deployment protection rule integrations available for this environment.
    * @example 35
    */
  var total_count: js.UndefOr[Double] = js.undefined
}
object AvailablecustomdeploymentprotectionruleintegrationsTotalcount {
  
  inline def apply(): AvailablecustomdeploymentprotectionruleintegrationsTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailablecustomdeploymentprotectionruleintegrationsTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvailablecustomdeploymentprotectionruleintegrationsTotalcount] (val x: Self) extends AnyVal {
    
    inline def setAvailable_custom_deployment_protection_rule_integrations(value: js.Array[Integrationurl]): Self = StObject.set(x, "available_custom_deployment_protection_rule_integrations", value.asInstanceOf[js.Any])
    
    inline def setAvailable_custom_deployment_protection_rule_integrationsUndefined: Self = StObject.set(x, "available_custom_deployment_protection_rule_integrations", js.undefined)
    
    inline def setAvailable_custom_deployment_protection_rule_integrationsVarargs(value: Integrationurl*): Self = StObject.set(x, "available_custom_deployment_protection_rule_integrations", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_countUndefined: Self = StObject.set(x, "total_count", js.undefined)
  }
}
