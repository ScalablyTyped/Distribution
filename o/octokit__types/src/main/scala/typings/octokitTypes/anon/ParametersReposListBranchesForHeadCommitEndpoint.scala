package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListBranchesForHeadCommitEndpoint
import typings.octokitTypes.endpointsMod.ReposListBranchesForHeadCommitRequestOptions
import typings.octokitTypes.endpointsMod.ReposListBranchesForHeadCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListBranchesForHeadCommitEndpoint extends StObject {
  
  var parameters: ReposListBranchesForHeadCommitEndpoint
  
  var request: ReposListBranchesForHeadCommitRequestOptions
  
  var response: OctokitResponse[ReposListBranchesForHeadCommitResponseData]
}
object ParametersReposListBranchesForHeadCommitEndpoint {
  
  inline def apply(
    parameters: ReposListBranchesForHeadCommitEndpoint,
    request: ReposListBranchesForHeadCommitRequestOptions,
    response: OctokitResponse[ReposListBranchesForHeadCommitResponseData]
  ): ParametersReposListBranchesForHeadCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListBranchesForHeadCommitEndpoint]
  }
  
  extension [Self <: ParametersReposListBranchesForHeadCommitEndpoint](x: Self) {
    
    inline def setParameters(value: ReposListBranchesForHeadCommitEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposListBranchesForHeadCommitRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListBranchesForHeadCommitResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
