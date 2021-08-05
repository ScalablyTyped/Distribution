package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsListDiscussionCommentsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListDiscussionCommentsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1055` extends StObject {
  
  var parameters: RequestParameters & (Omit[TeamsListDiscussionCommentsInOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[TeamsListDiscussionCommentsInOrgResponseData]
}
object `1055` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[TeamsListDiscussionCommentsInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsListDiscussionCommentsInOrgResponseData]
  ): `1055` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1055`]
  }
  
  extension [Self <: `1055`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[TeamsListDiscussionCommentsInOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsListDiscussionCommentsInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
