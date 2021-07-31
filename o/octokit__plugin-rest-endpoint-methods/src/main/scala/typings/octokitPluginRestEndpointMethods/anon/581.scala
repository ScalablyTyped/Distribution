package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `581` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActionsListSelfHostedRunnersForOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData]
}
object `581` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ActionsListSelfHostedRunnersForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData]
  ): `581` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`581`]
  }
  
  @scala.inline
  implicit class `581MutableBuilder`[Self <: `581`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[ActionsListSelfHostedRunnersForOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
