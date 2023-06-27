package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.distTypesGeneratedEndpointsMod.ExtractOctokitResponse
import typings.octokitTypes.distTypesGeneratedEndpointsMod.ToOctokitParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersResponse extends StObject {
  
  var parameters: ToOctokitParameters[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/app/installations']['get'] */ js.Any
  ]
  
  var response: ExtractOctokitResponse[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/app/installations']['get'] */ js.Any
  ]
}
object ParametersResponse {
  
  inline def apply(
    parameters: ToOctokitParameters[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/app/installations']['get'] */ js.Any
    ],
    response: ExtractOctokitResponse[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/app/installations']['get'] */ js.Any
    ]
  ): ParametersResponse = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersResponse] (val x: Self) extends AnyVal {
    
    inline def setParameters(
      value: ToOctokitParameters[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/app/installations']['get'] */ js.Any
        ]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(
      value: ExtractOctokitResponse[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/app/installations']['get'] */ js.Any
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
