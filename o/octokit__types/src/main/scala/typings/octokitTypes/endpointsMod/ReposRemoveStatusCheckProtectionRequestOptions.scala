package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.SlashreposSlashColonownerSlashColonrepoSlashbranchesSlashColonbranchSlashprotectionSlashrequired_status_checks
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposRemoveStatusCheckProtectionRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: DELETE
  
  var request: RequestRequestOptions
  
  var url: SlashreposSlashColonownerSlashColonrepoSlashbranchesSlashColonbranchSlashprotectionSlashrequired_status_checks
}
object ReposRemoveStatusCheckProtectionRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): ReposRemoveStatusCheckProtectionRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "DELETE", request = request.asInstanceOf[js.Any], url = "/repos/:owner/:repo/branches/:branch/protection/required_status_checks")
    __obj.asInstanceOf[ReposRemoveStatusCheckProtectionRequestOptions]
  }
  
  @scala.inline
  implicit class ReposRemoveStatusCheckProtectionRequestOptionsMutableBuilder[Self <: ReposRemoveStatusCheckProtectionRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(
      value: SlashreposSlashColonownerSlashColonrepoSlashbranchesSlashColonbranchSlashprotectionSlashrequired_status_checks
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
