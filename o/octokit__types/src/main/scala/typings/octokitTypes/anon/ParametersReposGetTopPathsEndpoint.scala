package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetTopPathsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetTopPathsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetTopPathsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetTopPathsEndpoint extends js.Object {
  
  var parameters: ReposGetTopPathsEndpoint = js.native
  
  var request: ReposGetTopPathsRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetTopPathsResponseData] = js.native
}
object ParametersReposGetTopPathsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetTopPathsEndpoint,
    request: ReposGetTopPathsRequestOptions,
    response: OctokitResponse[ReposGetTopPathsResponseData]
  ): ParametersReposGetTopPathsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetTopPathsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetTopPathsEndpointOps[Self <: ParametersReposGetTopPathsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposGetTopPathsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetTopPathsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetTopPathsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
