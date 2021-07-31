package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetPagesEndpoint
import typings.octokitTypes.endpointsMod.ReposGetPagesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `961` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetPagesEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetPagesResponseData]
}
object `961` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposGetPagesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetPagesResponseData]
  ): `961` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`961`]
  }
  
  @scala.inline
  implicit class `961MutableBuilder`[Self <: `961`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ReposGetPagesEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetPagesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
