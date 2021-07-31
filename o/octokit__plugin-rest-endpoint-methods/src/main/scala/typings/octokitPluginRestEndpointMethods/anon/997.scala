package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListPullRequestsAssociatedWithCommitEndpoint
import typings.octokitTypes.endpointsMod.ReposListPullRequestsAssociatedWithCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `997` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposListPullRequestsAssociatedWithCommitEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposListPullRequestsAssociatedWithCommitResponseData]
}
object `997` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposListPullRequestsAssociatedWithCommitEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListPullRequestsAssociatedWithCommitResponseData]
  ): `997` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`997`]
  }
  
  @scala.inline
  implicit class `997MutableBuilder`[Self <: `997`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[ReposListPullRequestsAssociatedWithCommitEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListPullRequestsAssociatedWithCommitResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
