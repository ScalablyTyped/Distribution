package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsDownloadArchiveForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsDownloadArchiveForOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsDownloadArchiveForOrgEndpoint extends js.Object {
  
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
  implicit class ParametersMigrationsDownloadArchiveForOrgEndpointOps[Self <: ParametersMigrationsDownloadArchiveForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: MigrationsDownloadArchiveForOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsDownloadArchiveForOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
