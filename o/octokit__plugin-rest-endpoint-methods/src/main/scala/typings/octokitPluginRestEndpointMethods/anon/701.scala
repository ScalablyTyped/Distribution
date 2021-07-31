package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GitCreateTreeEndpoint
import typings.octokitTypes.endpointsMod.GitCreateTreeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `701` extends StObject {
  
  var parameters: RequestParameters & (Omit[GitCreateTreeEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[GitCreateTreeResponseData]
}
object `701` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[GitCreateTreeEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitCreateTreeResponseData]
  ): `701` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`701`]
  }
  
  @scala.inline
  implicit class `701MutableBuilder`[Self <: `701`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[GitCreateTreeEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitCreateTreeResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
