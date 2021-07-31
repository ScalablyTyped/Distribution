package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsListOrgSecretsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListOrgSecretsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `575` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActionsListOrgSecretsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActionsListOrgSecretsResponseData]
}
object `575` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ActionsListOrgSecretsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListOrgSecretsResponseData]
  ): `575` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`575`]
  }
  
  @scala.inline
  implicit class `575MutableBuilder`[Self <: `575`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ActionsListOrgSecretsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListOrgSecretsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
