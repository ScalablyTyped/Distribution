package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListDeploymentsEndpoint
import typings.octokitTypes.endpointsMod.ReposListDeploymentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `987` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposListDeploymentsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposListDeploymentsResponseData] = js.native
}
object `987` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListDeploymentsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListDeploymentsResponseData]
  ): `987` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`987`]
  }
  
  @scala.inline
  implicit class `987MutableBuilder`[Self <: `987`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposListDeploymentsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListDeploymentsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
