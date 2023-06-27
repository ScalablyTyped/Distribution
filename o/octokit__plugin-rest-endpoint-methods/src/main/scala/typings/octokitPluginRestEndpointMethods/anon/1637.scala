package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesGeneratedEndpointsMod.ExtractOctokitResponse
import typings.octokitTypes.distTypesGeneratedEndpointsMod.ToOctokitParameters
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1637` extends StObject {
  
  var parameters: RequestParameters & (Omit[
    ToOctokitParameters[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/orgs/{org}/teams/{team_slug}/teams']['get'] */ js.Any
    ], 
    baseUrl | headers | mediaType
  ])
  
  var response: ExtractOctokitResponse[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/orgs/{org}/teams/{team_slug}/teams']['get'] */ js.Any
  ]
}
object `1637` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[
      ToOctokitParameters[
        /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/orgs/{org}/teams/{team_slug}/teams']['get'] */ js.Any
      ], 
      baseUrl | headers | mediaType
    ]),
    response: ExtractOctokitResponse[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/orgs/{org}/teams/{team_slug}/teams']['get'] */ js.Any
    ]
  ): `1637` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1637`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1637`] (val x: Self) extends AnyVal {
    
    inline def setParameters(
      value: RequestParameters & (Omit[
          ToOctokitParameters[
            /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/orgs/{org}/teams/{team_slug}/teams']['get'] */ js.Any
          ], 
          baseUrl | headers | mediaType
        ])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(
      value: ExtractOctokitResponse[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/orgs/{org}/teams/{team_slug}/teams']['get'] */ js.Any
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
