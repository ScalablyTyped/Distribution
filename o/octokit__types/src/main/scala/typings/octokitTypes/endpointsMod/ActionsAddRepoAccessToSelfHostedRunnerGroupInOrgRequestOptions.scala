package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PUT
import typings.octokitTypes.octokitTypesStrings.`SlashorgsSlashColonorgSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashrepositoriesSlashColonrepository_id`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsAddRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: PUT
  
  var request: RequestRequestOptions
  
  var url: `SlashorgsSlashColonorgSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashrepositoriesSlashColonrepository_id`
}
object ActionsAddRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): ActionsAddRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "PUT", request = request.asInstanceOf[js.Any], url = "/orgs/:org/actions/runner-groups/:runner_group_id/repositories/:repository_id")
    __obj.asInstanceOf[ActionsAddRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions]
  }
  
  extension [Self <: ActionsAddRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(
      value: `SlashorgsSlashColonorgSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashrepositoriesSlashColonrepository_id`
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
