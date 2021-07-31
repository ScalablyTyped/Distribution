package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListCommentsForCommitEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommentsForCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListCommentsForCommitEndpoint extends StObject {
  
  var parameters: ReposListCommentsForCommitEndpoint
  
  var response: OctokitResponse[ReposListCommentsForCommitResponseData]
}
object ParametersReposListCommentsForCommitEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListCommentsForCommitEndpoint,
    response: OctokitResponse[ReposListCommentsForCommitResponseData]
  ): ParametersReposListCommentsForCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCommentsForCommitEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListCommentsForCommitEndpointMutableBuilder[Self <: ParametersReposListCommentsForCommitEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListCommentsForCommitEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListCommentsForCommitResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
