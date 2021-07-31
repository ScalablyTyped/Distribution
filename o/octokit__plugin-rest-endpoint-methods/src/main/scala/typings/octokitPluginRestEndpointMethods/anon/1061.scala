package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsListReposInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListReposInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1061` extends StObject {
  
  var parameters: RequestParameters & (Omit[TeamsListReposInOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[TeamsListReposInOrgResponseData]
}
object `1061` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[TeamsListReposInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsListReposInOrgResponseData]
  ): `1061` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1061`]
  }
  
  @scala.inline
  implicit class `1061MutableBuilder`[Self <: `1061`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[TeamsListReposInOrgEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListReposInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
