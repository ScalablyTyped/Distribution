package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunsSlashColonrun_idSlashartifacts
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsListWorkflowRunArtifactsRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunsSlashColonrun_idSlashartifacts
}
object ActionsListWorkflowRunArtifactsRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): ActionsListWorkflowRunArtifactsRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/repos/:owner/:repo/actions/runs/:run_id/artifacts")
    __obj.asInstanceOf[ActionsListWorkflowRunArtifactsRequestOptions]
  }
  
  extension [Self <: ActionsListWorkflowRunArtifactsRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunsSlashColonrun_idSlashartifacts): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
