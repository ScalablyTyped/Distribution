package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListBranchesEndpoint
import typings.octokitTypes.endpointsMod.ReposListBranchesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListBranchesEndpoint extends StObject {
  
  var parameters: ReposListBranchesEndpoint
  
  var response: OctokitResponse[ReposListBranchesResponseData]
}
object ParametersReposListBranchesEndpoint {
  
  inline def apply(parameters: ReposListBranchesEndpoint, response: OctokitResponse[ReposListBranchesResponseData]): ParametersReposListBranchesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListBranchesEndpoint]
  }
  
  extension [Self <: ParametersReposListBranchesEndpoint](x: Self) {
    
    inline def setParameters(value: ReposListBranchesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListBranchesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
