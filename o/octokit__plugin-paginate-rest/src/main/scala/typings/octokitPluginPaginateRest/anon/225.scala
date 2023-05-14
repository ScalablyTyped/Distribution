package typings.octokitPluginPaginateRest.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `225` extends StObject {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.ExtractOctokitResponse<@octokit/openapi-types.@octokit/openapi-types.paths['/user/codespaces/secrets']['get']>['data']['secrets'] */ js.Any
}
object `225` {
  
  inline def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.ExtractOctokitResponse<@octokit/openapi-types.@octokit/openapi-types.paths['/user/codespaces/secrets']['get']>['data']['secrets'] */ js.Any
  ): `225` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`225`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `225`] (val x: Self) extends AnyVal {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.ExtractOctokitResponse<@octokit/openapi-types.@octokit/openapi-types.paths['/user/codespaces/secrets']['get']>['data']['secrets'] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
