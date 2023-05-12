package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Customdeploymentprotectionrules extends StObject {
  
  var custom_deployment_protection_rules: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['deployment-protection-rule'] */ js.Any
    ]
  ] = js.undefined
  
  /**
    * @description The number of enabled custom deployment protection rules for this environment
    * @example 10
    */
  var total_count: js.UndefOr[Double] = js.undefined
}
object Customdeploymentprotectionrules {
  
  inline def apply(): Customdeploymentprotectionrules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Customdeploymentprotectionrules]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Customdeploymentprotectionrules] (val x: Self) extends AnyVal {
    
    inline def setCustom_deployment_protection_rules(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['deployment-protection-rule'] */ js.Any
        ]
    ): Self = StObject.set(x, "custom_deployment_protection_rules", value.asInstanceOf[js.Any])
    
    inline def setCustom_deployment_protection_rulesUndefined: Self = StObject.set(x, "custom_deployment_protection_rules", js.undefined)
    
    inline def setCustom_deployment_protection_rulesVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['deployment-protection-rule'] */ js.Any)*
    ): Self = StObject.set(x, "custom_deployment_protection_rules", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_countUndefined: Self = StObject.set(x, "total_count", js.undefined)
  }
}
