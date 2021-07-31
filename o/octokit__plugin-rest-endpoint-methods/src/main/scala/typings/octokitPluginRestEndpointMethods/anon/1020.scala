package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposUpdateEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1020` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposUpdateEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposUpdateResponseData]
}
object `1020` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposUpdateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposUpdateResponseData]
  ): `1020` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1020`]
  }
  
  @scala.inline
  implicit class `1020MutableBuilder`[Self <: `1020`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ReposUpdateEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
