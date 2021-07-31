package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentStatusEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentStatusResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `906` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposCreateDeploymentStatusEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposCreateDeploymentStatusResponseData]
}
object `906` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposCreateDeploymentStatusEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreateDeploymentStatusResponseData]
  ): `906` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`906`]
  }
  
  @scala.inline
  implicit class `906MutableBuilder`[Self <: `906`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[ReposCreateDeploymentStatusEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateDeploymentStatusResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
