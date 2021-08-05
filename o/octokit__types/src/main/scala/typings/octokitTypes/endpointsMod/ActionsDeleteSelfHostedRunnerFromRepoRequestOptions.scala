package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunnersSlashColonrunner_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsDeleteSelfHostedRunnerFromRepoRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: DELETE
  
  var request: RequestRequestOptions
  
  var url: SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunnersSlashColonrunner_id
}
object ActionsDeleteSelfHostedRunnerFromRepoRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): ActionsDeleteSelfHostedRunnerFromRepoRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "DELETE", request = request.asInstanceOf[js.Any], url = "/repos/:owner/:repo/actions/runners/:runner_id")
    __obj.asInstanceOf[ActionsDeleteSelfHostedRunnerFromRepoRequestOptions]
  }
  
  extension [Self <: ActionsDeleteSelfHostedRunnerFromRepoRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunnersSlashColonrunner_id): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
