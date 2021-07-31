package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ProjectsListCardsEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListCardsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `833` extends StObject {
  
  var parameters: RequestParameters & (Omit[ProjectsListCardsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ProjectsListCardsResponseData]
}
object `833` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ProjectsListCardsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsListCardsResponseData]
  ): `833` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`833`]
  }
  
  @scala.inline
  implicit class `833MutableBuilder`[Self <: `833`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ProjectsListCardsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsListCardsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
