package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsDeleteArchiveForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsDeleteArchiveForOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersMigrationsDeleteArchiveForOrgEndpoint extends StObject {
  
  var parameters: MigrationsDeleteArchiveForOrgEndpoint
  
  var request: MigrationsDeleteArchiveForOrgRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersMigrationsDeleteArchiveForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsDeleteArchiveForOrgEndpoint,
    request: MigrationsDeleteArchiveForOrgRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersMigrationsDeleteArchiveForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsDeleteArchiveForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsDeleteArchiveForOrgEndpointMutableBuilder[Self <: ParametersMigrationsDeleteArchiveForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsDeleteArchiveForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsDeleteArchiveForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
