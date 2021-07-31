package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposUpdateCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateCommitCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1022` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposUpdateCommitCommentEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposUpdateCommitCommentResponseData]
}
object `1022` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposUpdateCommitCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposUpdateCommitCommentResponseData]
  ): `1022` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1022`]
  }
  
  @scala.inline
  implicit class `1022MutableBuilder`[Self <: `1022`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ReposUpdateCommitCommentEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdateCommitCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
