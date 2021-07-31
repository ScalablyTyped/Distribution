package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListCommentsEndpoint
import typings.octokitTypes.endpointsMod.IssuesListCommentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `735` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesListCommentsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesListCommentsResponseData]
}
object `735` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[IssuesListCommentsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListCommentsResponseData]
  ): `735` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`735`]
  }
  
  @scala.inline
  implicit class `735MutableBuilder`[Self <: `735`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[IssuesListCommentsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListCommentsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
