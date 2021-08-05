package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsDownloadArchiveForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsDownloadArchiveForOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersMigrationsDownloadArchiveForOrgEndpoint extends StObject {
  
  var parameters: MigrationsDownloadArchiveForOrgEndpoint
  
  var request: MigrationsDownloadArchiveForOrgRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersMigrationsDownloadArchiveForOrgEndpoint {
  
  inline def apply(
    parameters: MigrationsDownloadArchiveForOrgEndpoint,
    request: MigrationsDownloadArchiveForOrgRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersMigrationsDownloadArchiveForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsDownloadArchiveForOrgEndpoint]
  }
  
  extension [Self <: ParametersMigrationsDownloadArchiveForOrgEndpoint](x: Self) {
    
    inline def setParameters(value: MigrationsDownloadArchiveForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: MigrationsDownloadArchiveForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
