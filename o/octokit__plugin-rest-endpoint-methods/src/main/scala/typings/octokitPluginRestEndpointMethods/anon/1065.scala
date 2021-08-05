package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1065` extends StObject {
  
  var parameters: RequestParameters & (Omit[TeamsUpdateDiscussionCommentInOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[TeamsUpdateDiscussionCommentInOrgResponseData]
}
object `1065` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[TeamsUpdateDiscussionCommentInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsUpdateDiscussionCommentInOrgResponseData]
  ): `1065` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1065`]
  }
  
  extension [Self <: `1065`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[TeamsUpdateDiscussionCommentInOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsUpdateDiscussionCommentInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
