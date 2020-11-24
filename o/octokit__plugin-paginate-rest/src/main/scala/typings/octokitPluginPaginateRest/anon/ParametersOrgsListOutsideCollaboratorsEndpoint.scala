package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListOutsideCollaboratorsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListOutsideCollaboratorsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListOutsideCollaboratorsEndpoint extends js.Object {
  
  var parameters: OrgsListOutsideCollaboratorsEndpoint = js.native
  
  var response: OctokitResponse[OrgsListOutsideCollaboratorsResponseData] = js.native
}
object ParametersOrgsListOutsideCollaboratorsEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListOutsideCollaboratorsEndpoint,
    response: OctokitResponse[OrgsListOutsideCollaboratorsResponseData]
  ): ParametersOrgsListOutsideCollaboratorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListOutsideCollaboratorsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListOutsideCollaboratorsEndpointOps[Self <: ParametersOrgsListOutsideCollaboratorsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: OrgsListOutsideCollaboratorsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListOutsideCollaboratorsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
