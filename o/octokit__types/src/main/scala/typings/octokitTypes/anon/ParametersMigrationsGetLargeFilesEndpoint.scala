package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsGetLargeFilesEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetLargeFilesRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsGetLargeFilesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsGetLargeFilesEndpoint extends js.Object {
  
  var parameters: MigrationsGetLargeFilesEndpoint = js.native
  
  var request: MigrationsGetLargeFilesRequestOptions = js.native
  
  var response: OctokitResponse[MigrationsGetLargeFilesResponseData] = js.native
}
object ParametersMigrationsGetLargeFilesEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsGetLargeFilesEndpoint,
    request: MigrationsGetLargeFilesRequestOptions,
    response: OctokitResponse[MigrationsGetLargeFilesResponseData]
  ): ParametersMigrationsGetLargeFilesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsGetLargeFilesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsGetLargeFilesEndpointOps[Self <: ParametersMigrationsGetLargeFilesEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: MigrationsGetLargeFilesEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsGetLargeFilesRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsGetLargeFilesResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
