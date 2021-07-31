package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetCombinedStatusForRefEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCombinedStatusForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `948` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetCombinedStatusForRefEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetCombinedStatusForRefResponseData]
}
object `948` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposGetCombinedStatusForRefEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetCombinedStatusForRefResponseData]
  ): `948` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`948`]
  }
  
  @scala.inline
  implicit class `948MutableBuilder`[Self <: `948`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[ReposGetCombinedStatusForRefEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCombinedStatusForRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
