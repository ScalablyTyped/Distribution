package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetDeploymentEndpoint
import typings.octokitTypes.endpointsMod.ReposGetDeploymentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `957` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetDeploymentEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetDeploymentResponseData]
}
object `957` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposGetDeploymentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetDeploymentResponseData]
  ): `957` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`957`]
  }
  
  @scala.inline
  implicit class `957MutableBuilder`[Self <: `957`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ReposGetDeploymentEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetDeploymentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
