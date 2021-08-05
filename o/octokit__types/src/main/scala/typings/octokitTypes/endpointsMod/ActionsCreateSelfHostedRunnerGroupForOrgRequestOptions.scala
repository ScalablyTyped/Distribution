package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.POST
import typings.octokitTypes.octokitTypesStrings.`SlashorgsSlashColonorgSlashactionsSlashrunner-groups`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsCreateSelfHostedRunnerGroupForOrgRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: POST
  
  var request: RequestRequestOptions
  
  var url: `SlashorgsSlashColonorgSlashactionsSlashrunner-groups`
}
object ActionsCreateSelfHostedRunnerGroupForOrgRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): ActionsCreateSelfHostedRunnerGroupForOrgRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "POST", request = request.asInstanceOf[js.Any], url = "/orgs/:org/actions/runner-groups")
    __obj.asInstanceOf[ActionsCreateSelfHostedRunnerGroupForOrgRequestOptions]
  }
  
  extension [Self <: ActionsCreateSelfHostedRunnerGroupForOrgRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: `SlashorgsSlashColonorgSlashactionsSlashrunner-groups`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
