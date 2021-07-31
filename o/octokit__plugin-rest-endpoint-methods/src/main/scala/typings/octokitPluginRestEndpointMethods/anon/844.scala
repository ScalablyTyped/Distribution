package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ProjectsUpdateColumnEndpoint
import typings.octokitTypes.endpointsMod.ProjectsUpdateColumnResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `844` extends StObject {
  
  var parameters: RequestParameters & (Omit[ProjectsUpdateColumnEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ProjectsUpdateColumnResponseData]
}
object `844` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ProjectsUpdateColumnEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsUpdateColumnResponseData]
  ): `844` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`844`]
  }
  
  @scala.inline
  implicit class `844MutableBuilder`[Self <: `844`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ProjectsUpdateColumnEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsUpdateColumnResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
