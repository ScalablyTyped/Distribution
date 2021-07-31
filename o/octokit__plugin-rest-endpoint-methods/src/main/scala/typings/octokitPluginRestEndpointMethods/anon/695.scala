package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GistsUpdateEndpoint
import typings.octokitTypes.endpointsMod.GistsUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `695` extends StObject {
  
  var parameters: RequestParameters & (Omit[GistsUpdateEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[GistsUpdateResponseData]
}
object `695` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[GistsUpdateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsUpdateResponseData]
  ): `695` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`695`]
  }
  
  @scala.inline
  implicit class `695MutableBuilder`[Self <: `695`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[GistsUpdateEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsUpdateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
