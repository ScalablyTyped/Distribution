package typings.octokitPluginPaginateRest.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `102` extends StObject {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.ExtractOctokitResponse<@octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/actions/runs/{run_id}/attempts/{attempt_number}/jobs']['get']>['data']['jobs'] */ js.Any
}
object `102` {
  
  inline def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.ExtractOctokitResponse<@octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/actions/runs/{run_id}/attempts/{attempt_number}/jobs']['get']>['data']['jobs'] */ js.Any
  ): `102` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`102`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `102`] (val x: Self) extends AnyVal {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.ExtractOctokitResponse<@octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/actions/runs/{run_id}/attempts/{attempt_number}/jobs']['get']>['data']['jobs'] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
