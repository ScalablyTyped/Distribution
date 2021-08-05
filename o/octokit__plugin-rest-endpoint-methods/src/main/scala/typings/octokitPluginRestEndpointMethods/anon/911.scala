package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsResponse201Data
import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `911` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposCreateOrUpdateFileContentsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[
    ReposCreateOrUpdateFileContentsResponseData | ReposCreateOrUpdateFileContentsResponse201Data
  ]
}
object `911` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposCreateOrUpdateFileContentsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[
      ReposCreateOrUpdateFileContentsResponseData | ReposCreateOrUpdateFileContentsResponse201Data
    ]
  ): `911` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`911`]
  }
  
  extension [Self <: `911`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ReposCreateOrUpdateFileContentsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(
      value: OctokitResponse[
          ReposCreateOrUpdateFileContentsResponseData | ReposCreateOrUpdateFileContentsResponse201Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
