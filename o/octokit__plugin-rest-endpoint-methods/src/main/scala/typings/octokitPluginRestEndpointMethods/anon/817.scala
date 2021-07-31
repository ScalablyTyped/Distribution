package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsUpdateEndpoint
import typings.octokitTypes.endpointsMod.OrgsUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `817` extends StObject {
  
  var parameters: RequestParameters & (Omit[OrgsUpdateEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[OrgsUpdateResponseData]
}
object `817` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[OrgsUpdateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsUpdateResponseData]
  ): `817` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`817`]
  }
  
  @scala.inline
  implicit class `817MutableBuilder`[Self <: `817`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[OrgsUpdateEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsUpdateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
