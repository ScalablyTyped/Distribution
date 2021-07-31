package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListDeploymentStatusesEndpoint
import typings.octokitTypes.endpointsMod.ReposListDeploymentStatusesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `986` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposListDeploymentStatusesEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposListDeploymentStatusesResponseData]
}
object `986` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposListDeploymentStatusesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListDeploymentStatusesResponseData]
  ): `986` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`986`]
  }
  
  @scala.inline
  implicit class `986MutableBuilder`[Self <: `986`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[ReposListDeploymentStatusesEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListDeploymentStatusesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
