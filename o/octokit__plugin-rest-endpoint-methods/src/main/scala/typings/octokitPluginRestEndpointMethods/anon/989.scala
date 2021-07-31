package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListForOrgEndpoint
import typings.octokitTypes.endpointsMod.ReposListForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `989` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposListForOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposListForOrgResponseData]
}
object `989` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposListForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListForOrgResponseData]
  ): `989` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`989`]
  }
  
  @scala.inline
  implicit class `989MutableBuilder`[Self <: `989`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ReposListForOrgEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
