package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListCommentsForCommitEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommentsForCommitRequestOptions
import typings.octokitTypes.endpointsMod.ReposListCommentsForCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListCommentsForCommitEndpoint extends StObject {
  
  var parameters: ReposListCommentsForCommitEndpoint
  
  var request: ReposListCommentsForCommitRequestOptions
  
  var response: OctokitResponse[ReposListCommentsForCommitResponseData]
}
object ParametersReposListCommentsForCommitEndpoint {
  
  inline def apply(
    parameters: ReposListCommentsForCommitEndpoint,
    request: ReposListCommentsForCommitRequestOptions,
    response: OctokitResponse[ReposListCommentsForCommitResponseData]
  ): ParametersReposListCommentsForCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCommentsForCommitEndpoint]
  }
  
  extension [Self <: ParametersReposListCommentsForCommitEndpoint](x: Self) {
    
    inline def setParameters(value: ReposListCommentsForCommitEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposListCommentsForCommitRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListCommentsForCommitResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
