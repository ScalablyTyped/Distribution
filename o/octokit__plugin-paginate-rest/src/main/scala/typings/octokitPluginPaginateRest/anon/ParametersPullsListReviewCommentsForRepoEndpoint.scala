package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.PullsListReviewCommentsForRepoEndpoint
import typings.octokitTypes.endpointsMod.PullsListReviewCommentsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsListReviewCommentsForRepoEndpoint extends StObject {
  
  var parameters: PullsListReviewCommentsForRepoEndpoint
  
  var response: OctokitResponse[PullsListReviewCommentsForRepoResponseData]
}
object ParametersPullsListReviewCommentsForRepoEndpoint {
  
  inline def apply(
    parameters: PullsListReviewCommentsForRepoEndpoint,
    response: OctokitResponse[PullsListReviewCommentsForRepoResponseData]
  ): ParametersPullsListReviewCommentsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListReviewCommentsForRepoEndpoint]
  }
  
  extension [Self <: ParametersPullsListReviewCommentsForRepoEndpoint](x: Self) {
    
    inline def setParameters(value: PullsListReviewCommentsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsListReviewCommentsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
