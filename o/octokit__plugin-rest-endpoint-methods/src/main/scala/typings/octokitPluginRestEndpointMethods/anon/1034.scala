package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.SearchLabelsEndpoint
import typings.octokitTypes.endpointsMod.SearchLabelsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1034` extends StObject {
  
  var parameters: RequestParameters & (Omit[SearchLabelsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[SearchLabelsResponseData]
}
object `1034` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[SearchLabelsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[SearchLabelsResponseData]
  ): `1034` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1034`]
  }
  
  @scala.inline
  implicit class `1034MutableBuilder`[Self <: `1034`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[SearchLabelsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchLabelsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
