package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposUploadReleaseAssetEndpoint
import typings.octokitTypes.endpointsMod.ReposUploadReleaseAssetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1030` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposUploadReleaseAssetEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposUploadReleaseAssetResponseData]
}
object `1030` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposUploadReleaseAssetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposUploadReleaseAssetResponseData]
  ): `1030` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1030`]
  }
  
  @scala.inline
  implicit class `1030MutableBuilder`[Self <: `1030`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ReposUploadReleaseAssetEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUploadReleaseAssetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
