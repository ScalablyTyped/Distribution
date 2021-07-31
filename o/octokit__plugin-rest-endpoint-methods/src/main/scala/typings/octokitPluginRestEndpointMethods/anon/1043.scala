package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsCreateEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1043` extends StObject {
  
  var parameters: RequestParameters & (Omit[TeamsCreateEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[TeamsCreateResponseData]
}
object `1043` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[TeamsCreateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsCreateResponseData]
  ): `1043` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1043`]
  }
  
  @scala.inline
  implicit class `1043MutableBuilder`[Self <: `1043`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[TeamsCreateEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCreateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
