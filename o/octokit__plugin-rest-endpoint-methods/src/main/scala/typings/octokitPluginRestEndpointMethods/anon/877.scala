package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `877` extends StObject {
  
  var parameters: RequestParameters & (Omit[
    ReactionsCreateForTeamDiscussionCommentInOrgEndpoint, 
    baseUrl | headers | mediaType
  ])
  
  var response: OctokitResponse[ReactionsCreateForTeamDiscussionCommentInOrgResponseData]
}
object `877` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[
      ReactionsCreateForTeamDiscussionCommentInOrgEndpoint, 
      baseUrl | headers | mediaType
    ]),
    response: OctokitResponse[ReactionsCreateForTeamDiscussionCommentInOrgResponseData]
  ): `877` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`877`]
  }
  
  extension [Self <: `877`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[
          ReactionsCreateForTeamDiscussionCommentInOrgEndpoint, 
          baseUrl | headers | mediaType
        ])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReactionsCreateForTeamDiscussionCommentInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
