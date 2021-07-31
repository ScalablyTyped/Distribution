package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsCreateFromManifestEndpoint
import typings.octokitTypes.endpointsMod.AppsCreateFromManifestResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `623` extends StObject {
  
  var parameters: RequestParameters & (Omit[AppsCreateFromManifestEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[AppsCreateFromManifestResponseData]
}
object `623` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[AppsCreateFromManifestEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsCreateFromManifestResponseData]
  ): `623` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`623`]
  }
  
  @scala.inline
  implicit class `623MutableBuilder`[Self <: `623`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[AppsCreateFromManifestEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsCreateFromManifestResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
