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

trait `874` extends StObject {
  
  var parameters: RequestParameters & (Omit[
    ToOctokitParameters[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/actions/jobs/{job_id}/logs']['get'] */ js.Any
    ], 
    baseUrl | headers | mediaType
  ])
  
  var response: ExtractOctokitResponse[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/actions/jobs/{job_id}/logs']['get'] */ js.Any
  ]
}
object `874` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[
      ToOctokitParameters[
        /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/actions/jobs/{job_id}/logs']['get'] */ js.Any
      ], 
      baseUrl | headers | mediaType
    ]),
    response: ExtractOctokitResponse[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/actions/jobs/{job_id}/logs']['get'] */ js.Any
    ]
  ): `874` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`874`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `874`] (val x: Self) extends AnyVal {
    
    inline def setParameters(
      value: RequestParameters & (Omit[
          ToOctokitParameters[
            /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/actions/jobs/{job_id}/logs']['get'] */ js.Any
          ], 
          baseUrl | headers | mediaType
        ])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(
      value: ExtractOctokitResponse[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/actions/jobs/{job_id}/logs']['get'] */ js.Any
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
