package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1066` extends StObject {
  
  var parameters: RequestParameters & (Omit[TeamsUpdateDiscussionInOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[TeamsUpdateDiscussionInOrgResponseData]
}
object `1066` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[TeamsUpdateDiscussionInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsUpdateDiscussionInOrgResponseData]
  ): `1066` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1066`]
  }
  
  @scala.inline
  implicit class `1066MutableBuilder`[Self <: `1066`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[TeamsUpdateDiscussionInOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsUpdateDiscussionInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
