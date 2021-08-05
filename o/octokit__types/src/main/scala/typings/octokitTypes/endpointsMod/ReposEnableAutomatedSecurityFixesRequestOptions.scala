package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PUT
import typings.octokitTypes.octokitTypesStrings.`SlashreposSlashColonownerSlashColonrepoSlashautomated-security-fixes`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposEnableAutomatedSecurityFixesRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: PUT
  
  var request: RequestRequestOptions
  
  var url: `SlashreposSlashColonownerSlashColonrepoSlashautomated-security-fixes`
}
object ReposEnableAutomatedSecurityFixesRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): ReposEnableAutomatedSecurityFixesRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "PUT", request = request.asInstanceOf[js.Any], url = "/repos/:owner/:repo/automated-security-fixes")
    __obj.asInstanceOf[ReposEnableAutomatedSecurityFixesRequestOptions]
  }
  
  extension [Self <: ReposEnableAutomatedSecurityFixesRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: `SlashreposSlashColonownerSlashColonrepoSlashautomated-security-fixes`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
