package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsUnlockRepoForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsUnlockRepoForOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersMigrationsUnlockRepoForOrgEndpoint extends StObject {
  
  var parameters: MigrationsUnlockRepoForOrgEndpoint
  
  var request: MigrationsUnlockRepoForOrgRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersMigrationsUnlockRepoForOrgEndpoint {
  
  inline def apply(
    parameters: MigrationsUnlockRepoForOrgEndpoint,
    request: MigrationsUnlockRepoForOrgRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersMigrationsUnlockRepoForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsUnlockRepoForOrgEndpoint]
  }
  
  extension [Self <: ParametersMigrationsUnlockRepoForOrgEndpoint](x: Self) {
    
    inline def setParameters(value: MigrationsUnlockRepoForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: MigrationsUnlockRepoForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
