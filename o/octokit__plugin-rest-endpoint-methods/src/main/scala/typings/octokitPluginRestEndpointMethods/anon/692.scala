package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GistsListStarredEndpoint
import typings.octokitTypes.endpointsMod.GistsListStarredResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `692` extends StObject {
  
  var parameters: RequestParameters & (Omit[GistsListStarredEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[GistsListStarredResponseData]
}
object `692` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[GistsListStarredEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsListStarredResponseData]
  ): `692` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`692`]
  }
  
  @scala.inline
  implicit class `692MutableBuilder`[Self <: `692`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[GistsListStarredEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListStarredResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
