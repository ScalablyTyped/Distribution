package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionCommentInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionCommentInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsCreateDiscussionCommentInOrgEndpoint extends js.Object {
  
  var parameters: TeamsCreateDiscussionCommentInOrgEndpoint = js.native
  
  var request: TeamsCreateDiscussionCommentInOrgRequestOptions = js.native
  
  var response: OctokitResponse[TeamsCreateDiscussionCommentInOrgResponseData] = js.native
}
object ParametersTeamsCreateDiscussionCommentInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsCreateDiscussionCommentInOrgEndpoint,
    request: TeamsCreateDiscussionCommentInOrgRequestOptions,
    response: OctokitResponse[TeamsCreateDiscussionCommentInOrgResponseData]
  ): ParametersTeamsCreateDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateDiscussionCommentInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsCreateDiscussionCommentInOrgEndpointOps[Self <: ParametersTeamsCreateDiscussionCommentInOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsCreateDiscussionCommentInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsCreateDiscussionCommentInOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCreateDiscussionCommentInOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
