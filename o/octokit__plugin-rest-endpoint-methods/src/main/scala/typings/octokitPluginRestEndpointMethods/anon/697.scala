package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GitCreateBlobEndpoint
import typings.octokitTypes.endpointsMod.GitCreateBlobResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `697` extends StObject {
  
  var parameters: RequestParameters & (Omit[GitCreateBlobEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[GitCreateBlobResponseData]
}
object `697` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[GitCreateBlobEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitCreateBlobResponseData]
  ): `697` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`697`]
  }
  
  @scala.inline
  implicit class `697MutableBuilder`[Self <: `697`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[GitCreateBlobEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitCreateBlobResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
