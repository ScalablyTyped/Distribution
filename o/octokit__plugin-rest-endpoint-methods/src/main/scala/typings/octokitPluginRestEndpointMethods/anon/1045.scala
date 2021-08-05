package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1045` extends StObject {
  
  var parameters: RequestParameters & (Omit[TeamsCreateDiscussionInOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[TeamsCreateDiscussionInOrgResponseData]
}
object `1045` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[TeamsCreateDiscussionInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsCreateDiscussionInOrgResponseData]
  ): `1045` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1045`]
  }
  
  extension [Self <: `1045`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[TeamsCreateDiscussionInOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsCreateDiscussionInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
