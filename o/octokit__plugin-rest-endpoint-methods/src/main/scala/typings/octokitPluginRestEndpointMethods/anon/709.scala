package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GitUpdateRefEndpoint
import typings.octokitTypes.endpointsMod.GitUpdateRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `709` extends StObject {
  
  var parameters: RequestParameters with (Omit[GitUpdateRefEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GitUpdateRefResponseData] = js.native
}
object `709` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GitUpdateRefEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitUpdateRefResponseData]
  ): `709` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`709`]
  }
  
  @scala.inline
  implicit class `709MutableBuilder`[Self <: `709`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[GitUpdateRefEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitUpdateRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
