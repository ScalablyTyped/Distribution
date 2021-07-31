package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `742` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesListForRepoEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesListForRepoResponseData]
}
object `742` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[IssuesListForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListForRepoResponseData]
  ): `742` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`742`]
  }
  
  @scala.inline
  implicit class `742MutableBuilder`[Self <: `742`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[IssuesListForRepoEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
