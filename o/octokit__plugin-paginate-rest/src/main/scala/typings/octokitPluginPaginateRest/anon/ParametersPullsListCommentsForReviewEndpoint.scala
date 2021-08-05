package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.PullsListCommentsForReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsListCommentsForReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsListCommentsForReviewEndpoint extends StObject {
  
  var parameters: PullsListCommentsForReviewEndpoint
  
  var response: OctokitResponse[PullsListCommentsForReviewResponseData]
}
object ParametersPullsListCommentsForReviewEndpoint {
  
  inline def apply(
    parameters: PullsListCommentsForReviewEndpoint,
    response: OctokitResponse[PullsListCommentsForReviewResponseData]
  ): ParametersPullsListCommentsForReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListCommentsForReviewEndpoint]
  }
  
  extension [Self <: ParametersPullsListCommentsForReviewEndpoint](x: Self) {
    
    inline def setParameters(value: PullsListCommentsForReviewEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsListCommentsForReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
