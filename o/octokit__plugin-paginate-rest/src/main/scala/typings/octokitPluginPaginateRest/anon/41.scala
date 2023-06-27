package typings.octokitPluginPaginateRest.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `41` extends StObject {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.ExtractOctokitResponse<@octokit/openapi-types.@octokit/openapi-types.paths['/orgs/{org}/codespaces/secrets/{secret_name}/repositories']['get']>['data']['repositories'] */ js.Any
}
object `41` {
  
  inline def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.ExtractOctokitResponse<@octokit/openapi-types.@octokit/openapi-types.paths['/orgs/{org}/codespaces/secrets/{secret_name}/repositories']['get']>['data']['repositories'] */ js.Any
  ): `41` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`41`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `41`] (val x: Self) extends AnyVal {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.ExtractOctokitResponse<@octokit/openapi-types.@octokit/openapi-types.paths['/orgs/{org}/codespaces/secrets/{secret_name}/repositories']['get']>['data']['repositories'] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
