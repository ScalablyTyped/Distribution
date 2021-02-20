package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesCreateMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesCreateMilestoneResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `724` extends StObject {
  
  var parameters: RequestParameters with (Omit[IssuesCreateMilestoneEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[IssuesCreateMilestoneResponseData] = js.native
}
object `724` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesCreateMilestoneEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesCreateMilestoneResponseData]
  ): `724` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`724`]
  }
  
  @scala.inline
  implicit class `724MutableBuilder`[Self <: `724`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[IssuesCreateMilestoneEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesCreateMilestoneResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
