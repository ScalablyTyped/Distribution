package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListCommitCommentsForRepoEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommitCommentsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `981` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposListCommitCommentsForRepoEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposListCommitCommentsForRepoResponseData]
}
object `981` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposListCommitCommentsForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListCommitCommentsForRepoResponseData]
  ): `981` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`981`]
  }
  
  @scala.inline
  implicit class `981MutableBuilder`[Self <: `981`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[ReposListCommitCommentsForRepoEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListCommitCommentsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
