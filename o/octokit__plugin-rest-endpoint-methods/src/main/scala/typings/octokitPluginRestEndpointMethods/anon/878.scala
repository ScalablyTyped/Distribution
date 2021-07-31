package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionInOrgEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `878` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReactionsCreateForTeamDiscussionInOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReactionsCreateForTeamDiscussionInOrgResponseData]
}
object `878` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReactionsCreateForTeamDiscussionInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReactionsCreateForTeamDiscussionInOrgResponseData]
  ): `878` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`878`]
  }
  
  @scala.inline
  implicit class `878MutableBuilder`[Self <: `878`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[ReactionsCreateForTeamDiscussionInOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsCreateForTeamDiscussionInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
