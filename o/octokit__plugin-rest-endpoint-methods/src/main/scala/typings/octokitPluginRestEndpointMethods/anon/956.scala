package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetDeployKeyEndpoint
import typings.octokitTypes.endpointsMod.ReposGetDeployKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `956` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetDeployKeyEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetDeployKeyResponseData]
}
object `956` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposGetDeployKeyEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetDeployKeyResponseData]
  ): `956` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`956`]
  }
  
  @scala.inline
  implicit class `956MutableBuilder`[Self <: `956`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ReposGetDeployKeyEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetDeployKeyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
