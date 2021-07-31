package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsGetRepoSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetRepoSecretResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `566` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActionsGetRepoSecretEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActionsGetRepoSecretResponseData]
}
object `566` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ActionsGetRepoSecretEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetRepoSecretResponseData]
  ): `566` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`566`]
  }
  
  @scala.inline
  implicit class `566MutableBuilder`[Self <: `566`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ActionsGetRepoSecretEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetRepoSecretResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
