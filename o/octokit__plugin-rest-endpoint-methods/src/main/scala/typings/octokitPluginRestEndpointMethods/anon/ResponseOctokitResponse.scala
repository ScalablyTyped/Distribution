package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsCreateOrUpdateRepoSecretEndpoint
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseOctokitResponse extends StObject {
  
  var parameters: RequestParameters & (Omit[ActionsCreateOrUpdateRepoSecretEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[js.Any]
}
object ResponseOctokitResponse {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ActionsCreateOrUpdateRepoSecretEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[js.Any]
  ): ResponseOctokitResponse = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseOctokitResponse]
  }
  
  @scala.inline
  implicit class ResponseOctokitResponseMutableBuilder[Self <: ResponseOctokitResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[ActionsCreateOrUpdateRepoSecretEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
