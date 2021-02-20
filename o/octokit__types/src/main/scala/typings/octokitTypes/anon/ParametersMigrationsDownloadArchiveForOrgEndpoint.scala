package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsDownloadArchiveForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsDownloadArchiveForOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsDownloadArchiveForOrgEndpoint extends StObject {
  
  var parameters: MigrationsDownloadArchiveForOrgEndpoint = js.native
  
  var request: MigrationsDownloadArchiveForOrgRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersMigrationsDownloadArchiveForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsDownloadArchiveForOrgEndpoint,
    request: MigrationsDownloadArchiveForOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersMigrationsDownloadArchiveForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsDownloadArchiveForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsDownloadArchiveForOrgEndpointMutableBuilder[Self <: ParametersMigrationsDownloadArchiveForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsDownloadArchiveForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsDownloadArchiveForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
