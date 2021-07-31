package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.SearchTopicsEndpoint
import typings.octokitTypes.endpointsMod.SearchTopicsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1036` extends StObject {
  
  var parameters: RequestParameters & (Omit[SearchTopicsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[SearchTopicsResponseData]
}
object `1036` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[SearchTopicsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[SearchTopicsResponseData]
  ): `1036` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1036`]
  }
  
  @scala.inline
  implicit class `1036MutableBuilder`[Self <: `1036`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[SearchTopicsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchTopicsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
