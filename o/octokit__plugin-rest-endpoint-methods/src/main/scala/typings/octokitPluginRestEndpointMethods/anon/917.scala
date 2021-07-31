package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposDeleteEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `917` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposDeleteEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposDeleteResponseData]
}
object `917` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposDeleteEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposDeleteResponseData]
  ): `917` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`917`]
  }
  
  @scala.inline
  implicit class `917MutableBuilder`[Self <: `917`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ReposDeleteEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposDeleteResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
