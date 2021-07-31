package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListTagsEndpoint
import typings.octokitTypes.endpointsMod.ReposListTagsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1000` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposListTagsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposListTagsResponseData]
}
object `1000` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposListTagsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListTagsResponseData]
  ): `1000` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1000`]
  }
  
  @scala.inline
  implicit class `1000MutableBuilder`[Self <: `1000`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ReposListTagsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListTagsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
