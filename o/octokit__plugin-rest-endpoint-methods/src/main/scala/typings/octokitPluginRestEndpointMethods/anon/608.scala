package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByUserResponse200Data
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `608` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActivityListReposStarredByUserEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[
    ActivityListReposStarredByUserResponseData | ActivityListReposStarredByUserResponse200Data
  ]
}
object `608` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ActivityListReposStarredByUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[
      ActivityListReposStarredByUserResponseData | ActivityListReposStarredByUserResponse200Data
    ]
  ): `608` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`608`]
  }
  
  extension [Self <: `608`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ActivityListReposStarredByUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(
      value: OctokitResponse[
          ActivityListReposStarredByUserResponseData | ActivityListReposStarredByUserResponse200Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
