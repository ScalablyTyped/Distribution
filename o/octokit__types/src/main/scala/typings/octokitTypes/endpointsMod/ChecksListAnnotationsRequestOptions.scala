package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.`SlashreposSlashColonownerSlashColonrepoSlashcheck-runsSlashColoncheck_run_idSlashannotations`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChecksListAnnotationsRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: `SlashreposSlashColonownerSlashColonrepoSlashcheck-runsSlashColoncheck_run_idSlashannotations`
}
object ChecksListAnnotationsRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): ChecksListAnnotationsRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/repos/:owner/:repo/check-runs/:check_run_id/annotations")
    __obj.asInstanceOf[ChecksListAnnotationsRequestOptions]
  }
  
  extension [Self <: ChecksListAnnotationsRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(
      value: `SlashreposSlashColonownerSlashColonrepoSlashcheck-runsSlashColoncheck_run_idSlashannotations`
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
