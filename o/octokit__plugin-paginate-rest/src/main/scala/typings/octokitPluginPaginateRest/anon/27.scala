package typings.octokitPluginPaginateRest.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27` extends StObject {
  
  var parameters: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/runner-groups/{runner_group_id}/repositories']['parameters'] */ js.Any
  
  var response: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/runner-groups/{runner_group_id}/repositories']['response'] */ js.Any) & `26`
}
object `27` {
  
  inline def apply(
    parameters: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/runner-groups/{runner_group_id}/repositories']['parameters'] */ js.Any,
    response: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/runner-groups/{runner_group_id}/repositories']['response'] */ js.Any) & `26`
  ): `27` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`27`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `27`] (val x: Self) extends AnyVal {
    
    inline def setParameters(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/runner-groups/{runner_group_id}/repositories']['parameters'] */ js.Any
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/runner-groups/{runner_group_id}/repositories']['response'] */ js.Any) & `26`
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
