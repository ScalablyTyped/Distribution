package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.BillingGetGithubActionsBillingOrgEndpoint
import typings.octokitTypes.endpointsMod.BillingGetGithubActionsBillingOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `651` extends StObject {
  
  var parameters: RequestParameters & (Omit[BillingGetGithubActionsBillingOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[BillingGetGithubActionsBillingOrgResponseData]
}
object `651` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[BillingGetGithubActionsBillingOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[BillingGetGithubActionsBillingOrgResponseData]
  ): `651` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`651`]
  }
  
  @scala.inline
  implicit class `651MutableBuilder`[Self <: `651`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[BillingGetGithubActionsBillingOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[BillingGetGithubActionsBillingOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
