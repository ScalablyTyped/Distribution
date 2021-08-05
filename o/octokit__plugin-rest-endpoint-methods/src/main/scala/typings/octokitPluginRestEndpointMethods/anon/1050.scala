package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1050` extends StObject {
  
  var parameters: RequestParameters & (Omit[TeamsGetDiscussionCommentInOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[TeamsGetDiscussionCommentInOrgResponseData]
}
object `1050` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[TeamsGetDiscussionCommentInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsGetDiscussionCommentInOrgResponseData]
  ): `1050` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1050`]
  }
  
  extension [Self <: `1050`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[TeamsGetDiscussionCommentInOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsGetDiscussionCommentInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
