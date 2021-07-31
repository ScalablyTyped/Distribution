package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.`SlashreposSlashColonownerSlashColonrepoSlashautomated-security-fixes`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposDisableAutomatedSecurityFixesRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: DELETE
  
  var request: RequestRequestOptions
  
  var url: `SlashreposSlashColonownerSlashColonrepoSlashautomated-security-fixes`
}
object ReposDisableAutomatedSecurityFixesRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): ReposDisableAutomatedSecurityFixesRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "DELETE", request = request.asInstanceOf[js.Any], url = "/repos/:owner/:repo/automated-security-fixes")
    __obj.asInstanceOf[ReposDisableAutomatedSecurityFixesRequestOptions]
  }
  
  @scala.inline
  implicit class ReposDisableAutomatedSecurityFixesRequestOptionsMutableBuilder[Self <: ReposDisableAutomatedSecurityFixesRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: `SlashreposSlashColonownerSlashColonrepoSlashautomated-security-fixes`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
