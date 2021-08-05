package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsListDiscussionsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListDiscussionsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1056` extends StObject {
  
  var parameters: RequestParameters & (Omit[TeamsListDiscussionsInOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[TeamsListDiscussionsInOrgResponseData]
}
object `1056` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[TeamsListDiscussionsInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsListDiscussionsInOrgResponseData]
  ): `1056` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1056`]
  }
  
  extension [Self <: `1056`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[TeamsListDiscussionsInOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsListDiscussionsInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
