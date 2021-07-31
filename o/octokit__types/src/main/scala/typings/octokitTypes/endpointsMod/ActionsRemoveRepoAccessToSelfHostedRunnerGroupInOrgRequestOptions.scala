package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.`SlashorgsSlashColonorgSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashrepositoriesSlashColonrepository_id`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsRemoveRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: DELETE
  
  var request: RequestRequestOptions
  
  var url: `SlashorgsSlashColonorgSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashrepositoriesSlashColonrepository_id`
}
object ActionsRemoveRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): ActionsRemoveRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "DELETE", request = request.asInstanceOf[js.Any], url = "/orgs/:org/actions/runner-groups/:runner_group_id/repositories/:repository_id")
    __obj.asInstanceOf[ActionsRemoveRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions]
  }
  
  @scala.inline
  implicit class ActionsRemoveRepoAccessToSelfHostedRunnerGroupInOrgRequestOptionsMutableBuilder[Self <: ActionsRemoveRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(
      value: `SlashorgsSlashColonorgSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashrepositoriesSlashColonrepository_id`
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
