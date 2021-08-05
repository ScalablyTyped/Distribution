package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListCollaboratorsEndpoint
import typings.octokitTypes.endpointsMod.ReposListCollaboratorsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `979` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposListCollaboratorsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposListCollaboratorsResponseData]
}
object `979` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposListCollaboratorsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListCollaboratorsResponseData]
  ): `979` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`979`]
  }
  
  extension [Self <: `979`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposListCollaboratorsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListCollaboratorsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
