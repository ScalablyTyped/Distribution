package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListCommitCommentsForRepoEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommitCommentsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ReposListCommitCommentsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListCommitCommentsForRepoEndpoint extends StObject {
  
  var parameters: ReposListCommitCommentsForRepoEndpoint
  
  var request: ReposListCommitCommentsForRepoRequestOptions
  
  var response: OctokitResponse[ReposListCommitCommentsForRepoResponseData]
}
object ParametersReposListCommitCommentsForRepoEndpoint {
  
  inline def apply(
    parameters: ReposListCommitCommentsForRepoEndpoint,
    request: ReposListCommitCommentsForRepoRequestOptions,
    response: OctokitResponse[ReposListCommitCommentsForRepoResponseData]
  ): ParametersReposListCommitCommentsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCommitCommentsForRepoEndpoint]
  }
  
  extension [Self <: ParametersReposListCommitCommentsForRepoEndpoint](x: Self) {
    
    inline def setParameters(value: ReposListCommitCommentsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposListCommitCommentsForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListCommitCommentsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
