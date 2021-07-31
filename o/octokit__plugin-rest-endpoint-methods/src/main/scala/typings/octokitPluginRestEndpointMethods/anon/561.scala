package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsGetArtifactEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetArtifactResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `561` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActionsGetArtifactEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActionsGetArtifactResponseData]
}
object `561` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ActionsGetArtifactEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetArtifactResponseData]
  ): `561` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`561`]
  }
  
  @scala.inline
  implicit class `561MutableBuilder`[Self <: `561`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ActionsGetArtifactEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetArtifactResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
