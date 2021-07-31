package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListMilestonesEndpoint
import typings.octokitTypes.endpointsMod.IssuesListMilestonesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `746` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesListMilestonesEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesListMilestonesResponseData]
}
object `746` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[IssuesListMilestonesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListMilestonesResponseData]
  ): `746` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`746`]
  }
  
  @scala.inline
  implicit class `746MutableBuilder`[Self <: `746`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[IssuesListMilestonesEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListMilestonesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
