package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListEventsEndpoint
import typings.octokitTypes.endpointsMod.IssuesListEventsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `737` extends StObject {
  
  var parameters: RequestParameters with (Omit[IssuesListEventsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[IssuesListEventsResponseData] = js.native
}
object `737` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesListEventsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListEventsResponseData]
  ): `737` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`737`]
  }
  
  @scala.inline
  implicit class `737MutableBuilder`[Self <: `737`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[IssuesListEventsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListEventsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
