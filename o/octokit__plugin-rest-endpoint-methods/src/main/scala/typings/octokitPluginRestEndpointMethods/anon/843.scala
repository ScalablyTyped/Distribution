package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ProjectsUpdateCardEndpoint
import typings.octokitTypes.endpointsMod.ProjectsUpdateCardResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `843` extends StObject {
  
  var parameters: RequestParameters & (Omit[ProjectsUpdateCardEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ProjectsUpdateCardResponseData]
}
object `843` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ProjectsUpdateCardEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsUpdateCardResponseData]
  ): `843` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`843`]
  }
  
  @scala.inline
  implicit class `843MutableBuilder`[Self <: `843`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ProjectsUpdateCardEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsUpdateCardResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
