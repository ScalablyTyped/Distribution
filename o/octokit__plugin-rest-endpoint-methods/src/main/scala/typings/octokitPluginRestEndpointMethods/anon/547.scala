package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `547` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActionsCreateRegistrationTokenForRepoEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActionsCreateRegistrationTokenForRepoResponseData]
}
object `547` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ActionsCreateRegistrationTokenForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsCreateRegistrationTokenForRepoResponseData]
  ): `547` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`547`]
  }
  
  @scala.inline
  implicit class `547MutableBuilder`[Self <: `547`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[ActionsCreateRegistrationTokenForRepoEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsCreateRegistrationTokenForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
