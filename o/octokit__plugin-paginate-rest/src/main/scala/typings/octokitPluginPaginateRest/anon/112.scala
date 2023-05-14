package typings.octokitPluginPaginateRest.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `112` extends StObject {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.ExtractOctokitResponse<@octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/actions/workflows/{workflow_id}/runs']['get']>['data']['workflow_runs'] */ js.Any
}
object `112` {
  
  inline def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.ExtractOctokitResponse<@octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/actions/workflows/{workflow_id}/runs']['get']>['data']['workflow_runs'] */ js.Any
  ): `112` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`112`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `112`] (val x: Self) extends AnyVal {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.ExtractOctokitResponse<@octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/actions/workflows/{workflow_id}/runs']['get']>['data']['workflow_runs'] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
