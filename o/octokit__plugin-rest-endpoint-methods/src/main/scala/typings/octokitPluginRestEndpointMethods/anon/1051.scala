package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1051` extends StObject {
  
  var parameters: RequestParameters & (Omit[TeamsGetDiscussionInOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[TeamsGetDiscussionInOrgResponseData]
}
object `1051` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[TeamsGetDiscussionInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsGetDiscussionInOrgResponseData]
  ): `1051` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1051`]
  }
  
  extension [Self <: `1051`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[TeamsGetDiscussionInOrgEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsGetDiscussionInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
