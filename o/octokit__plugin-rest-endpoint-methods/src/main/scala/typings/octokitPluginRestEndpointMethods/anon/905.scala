package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentResponse202Data
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentResponse409Data
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `905` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposCreateDeploymentEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[
    ReposCreateDeploymentResponseData | ReposCreateDeploymentResponse202Data | ReposCreateDeploymentResponse409Data
  ]
}
object `905` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposCreateDeploymentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[
      ReposCreateDeploymentResponseData | ReposCreateDeploymentResponse202Data | ReposCreateDeploymentResponse409Data
    ]
  ): `905` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`905`]
  }
  
  extension [Self <: `905`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposCreateDeploymentEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(
      value: OctokitResponse[
          ReposCreateDeploymentResponseData | ReposCreateDeploymentResponse202Data | ReposCreateDeploymentResponse409Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
