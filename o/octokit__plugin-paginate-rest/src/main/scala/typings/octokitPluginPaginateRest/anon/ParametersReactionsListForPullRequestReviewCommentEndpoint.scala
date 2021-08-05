package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReactionsListForPullRequestReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForPullRequestReviewCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReactionsListForPullRequestReviewCommentEndpoint extends StObject {
  
  var parameters: ReactionsListForPullRequestReviewCommentEndpoint
  
  var response: OctokitResponse[ReactionsListForPullRequestReviewCommentResponseData]
}
object ParametersReactionsListForPullRequestReviewCommentEndpoint {
  
  inline def apply(
    parameters: ReactionsListForPullRequestReviewCommentEndpoint,
    response: OctokitResponse[ReactionsListForPullRequestReviewCommentResponseData]
  ): ParametersReactionsListForPullRequestReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForPullRequestReviewCommentEndpoint]
  }
  
  extension [Self <: ParametersReactionsListForPullRequestReviewCommentEndpoint](x: Self) {
    
    inline def setParameters(value: ReactionsListForPullRequestReviewCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReactionsListForPullRequestReviewCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
