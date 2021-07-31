package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesGetMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesGetMilestoneResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `732` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesGetMilestoneEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesGetMilestoneResponseData]
}
object `732` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[IssuesGetMilestoneEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesGetMilestoneResponseData]
  ): `732` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`732`]
  }
  
  @scala.inline
  implicit class `732MutableBuilder`[Self <: `732`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[IssuesGetMilestoneEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesGetMilestoneResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
