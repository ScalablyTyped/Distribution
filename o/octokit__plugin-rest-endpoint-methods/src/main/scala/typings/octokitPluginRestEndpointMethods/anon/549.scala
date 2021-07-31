package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `549` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActionsCreateRemoveTokenForRepoEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActionsCreateRemoveTokenForRepoResponseData]
}
object `549` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ActionsCreateRemoveTokenForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsCreateRemoveTokenForRepoResponseData]
  ): `549` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`549`]
  }
  
  @scala.inline
  implicit class `549MutableBuilder`[Self <: `549`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[ActionsCreateRemoveTokenForRepoEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsCreateRemoveTokenForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
