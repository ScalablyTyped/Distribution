package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsListReposForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsListReposForOrgRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsListReposForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersMigrationsListReposForOrgEndpoint extends StObject {
  
  var parameters: MigrationsListReposForOrgEndpoint
  
  var request: MigrationsListReposForOrgRequestOptions
  
  var response: OctokitResponse[MigrationsListReposForOrgResponseData]
}
object ParametersMigrationsListReposForOrgEndpoint {
  
  inline def apply(
    parameters: MigrationsListReposForOrgEndpoint,
    request: MigrationsListReposForOrgRequestOptions,
    response: OctokitResponse[MigrationsListReposForOrgResponseData]
  ): ParametersMigrationsListReposForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsListReposForOrgEndpoint]
  }
  
  extension [Self <: ParametersMigrationsListReposForOrgEndpoint](x: Self) {
    
    inline def setParameters(value: MigrationsListReposForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: MigrationsListReposForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[MigrationsListReposForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
