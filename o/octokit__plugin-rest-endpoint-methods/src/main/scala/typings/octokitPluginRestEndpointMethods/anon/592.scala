package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActivityGetFeedsEndpoint
import typings.octokitTypes.endpointsMod.ActivityGetFeedsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `592` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActivityGetFeedsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActivityGetFeedsResponseData]
}
object `592` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ActivityGetFeedsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActivityGetFeedsResponseData]
  ): `592` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`592`]
  }
  
  @scala.inline
  implicit class `592MutableBuilder`[Self <: `592`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ActivityGetFeedsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityGetFeedsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
