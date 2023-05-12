package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1091` extends StObject {
  
  var parameters: RequestParameters & (Omit[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /enterprises/{enterprise}/actions/runners/{runner_id}/labels']['parameters'] */ js.Any, 
    baseUrl | headers | mediaType
  ])
  
  var response: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /enterprises/{enterprise}/actions/runners/{runner_id}/labels']['response'] */ js.Any
}
object `1091` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /enterprises/{enterprise}/actions/runners/{runner_id}/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ]),
    response: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /enterprises/{enterprise}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ): `1091` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1091`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1091`] (val x: Self) extends AnyVal {
    
    inline def setParameters(
      value: RequestParameters & (Omit[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /enterprises/{enterprise}/actions/runners/{runner_id}/labels']['parameters'] */ js.Any, 
          baseUrl | headers | mediaType
        ])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /enterprises/{enterprise}/actions/runners/{runner_id}/labels']['response'] */ js.Any
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
