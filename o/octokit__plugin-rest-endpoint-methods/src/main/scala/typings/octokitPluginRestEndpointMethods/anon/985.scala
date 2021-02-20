package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListDeployKeysEndpoint
import typings.octokitTypes.endpointsMod.ReposListDeployKeysResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `985` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposListDeployKeysEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposListDeployKeysResponseData] = js.native
}
object `985` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListDeployKeysEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListDeployKeysResponseData]
  ): `985` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`985`]
  }
  
  @scala.inline
  implicit class `985MutableBuilder`[Self <: `985`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposListDeployKeysEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListDeployKeysResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
