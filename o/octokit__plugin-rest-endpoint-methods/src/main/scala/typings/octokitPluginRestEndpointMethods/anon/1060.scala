package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsListProjectsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListProjectsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1060` extends StObject {
  
  var parameters: RequestParameters & (Omit[TeamsListProjectsInOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[TeamsListProjectsInOrgResponseData]
}
object `1060` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[TeamsListProjectsInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsListProjectsInOrgResponseData]
  ): `1060` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1060`]
  }
  
  @scala.inline
  implicit class `1060MutableBuilder`[Self <: `1060`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[TeamsListProjectsInOrgEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListProjectsInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
