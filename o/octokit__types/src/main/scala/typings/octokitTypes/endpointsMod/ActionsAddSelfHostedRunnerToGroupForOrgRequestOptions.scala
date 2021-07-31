package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PUT
import typings.octokitTypes.octokitTypesStrings.`SlashorgsSlashColonorgSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashrunnersSlashColonrunner_id`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsAddSelfHostedRunnerToGroupForOrgRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: PUT
  
  var request: RequestRequestOptions
  
  var url: `SlashorgsSlashColonorgSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashrunnersSlashColonrunner_id`
}
object ActionsAddSelfHostedRunnerToGroupForOrgRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): ActionsAddSelfHostedRunnerToGroupForOrgRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "PUT", request = request.asInstanceOf[js.Any], url = "/orgs/:org/actions/runner-groups/:runner_group_id/runners/:runner_id")
    __obj.asInstanceOf[ActionsAddSelfHostedRunnerToGroupForOrgRequestOptions]
  }
  
  @scala.inline
  implicit class ActionsAddSelfHostedRunnerToGroupForOrgRequestOptionsMutableBuilder[Self <: ActionsAddSelfHostedRunnerToGroupForOrgRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(
      value: `SlashorgsSlashColonorgSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashrunnersSlashColonrunner_id`
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
