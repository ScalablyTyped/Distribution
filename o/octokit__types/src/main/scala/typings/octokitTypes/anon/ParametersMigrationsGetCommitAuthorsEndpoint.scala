package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsGetCommitAuthorsEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetCommitAuthorsRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsGetCommitAuthorsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsGetCommitAuthorsEndpoint extends js.Object {
  
  var parameters: MigrationsGetCommitAuthorsEndpoint = js.native
  
  var request: MigrationsGetCommitAuthorsRequestOptions = js.native
  
  var response: OctokitResponse[MigrationsGetCommitAuthorsResponseData] = js.native
}
object ParametersMigrationsGetCommitAuthorsEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsGetCommitAuthorsEndpoint,
    request: MigrationsGetCommitAuthorsRequestOptions,
    response: OctokitResponse[MigrationsGetCommitAuthorsResponseData]
  ): ParametersMigrationsGetCommitAuthorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsGetCommitAuthorsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsGetCommitAuthorsEndpointOps[Self <: ParametersMigrationsGetCommitAuthorsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: MigrationsGetCommitAuthorsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsGetCommitAuthorsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsGetCommitAuthorsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
