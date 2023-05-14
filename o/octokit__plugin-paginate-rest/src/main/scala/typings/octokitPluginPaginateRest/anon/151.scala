package typings.octokitPluginPaginateRest.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `151` extends StObject {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.ExtractOctokitResponse<@octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/environments/{environment_name}/deployment_protection_rules/apps']['get']>['data']['available_custom_deployment_protection_rule_integrations'] */ js.Any
}
object `151` {
  
  inline def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.ExtractOctokitResponse<@octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/environments/{environment_name}/deployment_protection_rules/apps']['get']>['data']['available_custom_deployment_protection_rule_integrations'] */ js.Any
  ): `151` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`151`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `151`] (val x: Self) extends AnyVal {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.ExtractOctokitResponse<@octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/environments/{environment_name}/deployment_protection_rules/apps']['get']>['data']['available_custom_deployment_protection_rule_integrations'] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
