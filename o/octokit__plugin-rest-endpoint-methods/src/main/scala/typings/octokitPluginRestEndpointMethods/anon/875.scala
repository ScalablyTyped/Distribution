package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `875` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReactionsCreateForIssueCommentEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReactionsCreateForIssueCommentResponseData]
}
object `875` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReactionsCreateForIssueCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReactionsCreateForIssueCommentResponseData]
  ): `875` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`875`]
  }
  
  @scala.inline
  implicit class `875MutableBuilder`[Self <: `875`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[ReactionsCreateForIssueCommentEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsCreateForIssueCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
