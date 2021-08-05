package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateInOrgEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateInOrgRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposCreateInOrgEndpoint extends StObject {
  
  var parameters: ReposCreateInOrgEndpoint
  
  var request: ReposCreateInOrgRequestOptions
  
  var response: OctokitResponse[ReposCreateInOrgResponseData]
}
object ParametersReposCreateInOrgEndpoint {
  
  inline def apply(
    parameters: ReposCreateInOrgEndpoint,
    request: ReposCreateInOrgRequestOptions,
    response: OctokitResponse[ReposCreateInOrgResponseData]
  ): ParametersReposCreateInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateInOrgEndpoint]
  }
  
  extension [Self <: ParametersReposCreateInOrgEndpoint](x: Self) {
    
    inline def setParameters(value: ReposCreateInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposCreateInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposCreateInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
