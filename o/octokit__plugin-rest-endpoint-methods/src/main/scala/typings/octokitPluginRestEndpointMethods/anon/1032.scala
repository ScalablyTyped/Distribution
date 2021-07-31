package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.SearchCommitsEndpoint
import typings.octokitTypes.endpointsMod.SearchCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1032` extends StObject {
  
  var parameters: RequestParameters & (Omit[SearchCommitsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[SearchCommitsResponseData]
}
object `1032` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[SearchCommitsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[SearchCommitsResponseData]
  ): `1032` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1032`]
  }
  
  @scala.inline
  implicit class `1032MutableBuilder`[Self <: `1032`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[SearchCommitsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchCommitsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
