package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreateDeployKeyEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateDeployKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `904` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposCreateDeployKeyEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposCreateDeployKeyResponseData]
}
object `904` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposCreateDeployKeyEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreateDeployKeyResponseData]
  ): `904` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`904`]
  }
  
  @scala.inline
  implicit class `904MutableBuilder`[Self <: `904`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ReposCreateDeployKeyEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateDeployKeyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
