package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ChecksUpdateEndpoint
import typings.octokitTypes.endpointsMod.ChecksUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `667` extends StObject {
  
  var parameters: RequestParameters & (Omit[ChecksUpdateEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ChecksUpdateResponseData]
}
object `667` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ChecksUpdateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ChecksUpdateResponseData]
  ): `667` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`667`]
  }
  
  @scala.inline
  implicit class `667MutableBuilder`[Self <: `667`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ChecksUpdateEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksUpdateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
