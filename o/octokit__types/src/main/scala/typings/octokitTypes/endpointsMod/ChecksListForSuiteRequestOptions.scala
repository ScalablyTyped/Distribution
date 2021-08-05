package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.`SlashreposSlashColonownerSlashColonrepoSlashcheck-suitesSlashColoncheck_suite_idSlashcheck-runs`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChecksListForSuiteRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: `SlashreposSlashColonownerSlashColonrepoSlashcheck-suitesSlashColoncheck_suite_idSlashcheck-runs`
}
object ChecksListForSuiteRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): ChecksListForSuiteRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/repos/:owner/:repo/check-suites/:check_suite_id/check-runs")
    __obj.asInstanceOf[ChecksListForSuiteRequestOptions]
  }
  
  extension [Self <: ChecksListForSuiteRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(
      value: `SlashreposSlashColonownerSlashColonrepoSlashcheck-suitesSlashColoncheck_suite_idSlashcheck-runs`
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
