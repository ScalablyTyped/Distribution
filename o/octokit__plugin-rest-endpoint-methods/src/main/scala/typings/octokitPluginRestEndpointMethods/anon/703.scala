package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GitGetBlobEndpoint
import typings.octokitTypes.endpointsMod.GitGetBlobResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `703` extends StObject {
  
  var parameters: RequestParameters & (Omit[GitGetBlobEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[GitGetBlobResponseData]
}
object `703` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[GitGetBlobEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitGetBlobResponseData]
  ): `703` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`703`]
  }
  
  @scala.inline
  implicit class `703MutableBuilder`[Self <: `703`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[GitGetBlobEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitGetBlobResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
