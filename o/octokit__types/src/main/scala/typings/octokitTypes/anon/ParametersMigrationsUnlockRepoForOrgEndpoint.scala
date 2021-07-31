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
  
  @scala.inline
  def apply(
    parameters: MigrationsUnlockRepoForOrgEndpoint,
    request: MigrationsUnlockRepoForOrgRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersMigrationsUnlockRepoForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsUnlockRepoForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsUnlockRepoForOrgEndpointMutableBuilder[Self <: ParametersMigrationsUnlockRepoForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsUnlockRepoForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsUnlockRepoForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
