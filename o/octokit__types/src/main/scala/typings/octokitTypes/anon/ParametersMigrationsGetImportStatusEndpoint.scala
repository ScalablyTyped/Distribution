package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsGetImportStatusEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetImportStatusRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsGetImportStatusResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsGetImportStatusEndpoint extends js.Object {
  
  var parameters: MigrationsGetImportStatusEndpoint = js.native
  
  var request: MigrationsGetImportStatusRequestOptions = js.native
  
  var response: OctokitResponse[MigrationsGetImportStatusResponseData] = js.native
}
object ParametersMigrationsGetImportStatusEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsGetImportStatusEndpoint,
    request: MigrationsGetImportStatusRequestOptions,
    response: OctokitResponse[MigrationsGetImportStatusResponseData]
  ): ParametersMigrationsGetImportStatusEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsGetImportStatusEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsGetImportStatusEndpointOps[Self <: ParametersMigrationsGetImportStatusEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: MigrationsGetImportStatusEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsGetImportStatusRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsGetImportStatusResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
