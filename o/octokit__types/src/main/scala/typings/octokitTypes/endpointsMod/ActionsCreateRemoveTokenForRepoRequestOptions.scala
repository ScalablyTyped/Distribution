package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.POST
import typings.octokitTypes.octokitTypesStrings.`SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunnersSlashremove-token`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsCreateRemoveTokenForRepoRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: POST
  
  var request: RequestRequestOptions
  
  var url: `SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunnersSlashremove-token`
}
object ActionsCreateRemoveTokenForRepoRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): ActionsCreateRemoveTokenForRepoRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "POST", request = request.asInstanceOf[js.Any], url = "/repos/:owner/:repo/actions/runners/remove-token")
    __obj.asInstanceOf[ActionsCreateRemoveTokenForRepoRequestOptions]
  }
  
  extension [Self <: ActionsCreateRemoveTokenForRepoRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: `SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunnersSlashremove-token`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
