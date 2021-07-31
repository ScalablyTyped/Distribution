package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PUT
import typings.octokitTypes.octokitTypesStrings.SlashreposSlashColonownerSlashColonrepoSlashbranchesSlashColonbranchSlashprotectionSlashrequired_status_checksSlashcontexts
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposSetStatusCheckContextsRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: PUT
  
  var request: RequestRequestOptions
  
  var url: SlashreposSlashColonownerSlashColonrepoSlashbranchesSlashColonbranchSlashprotectionSlashrequired_status_checksSlashcontexts
}
object ReposSetStatusCheckContextsRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): ReposSetStatusCheckContextsRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "PUT", request = request.asInstanceOf[js.Any], url = "/repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts")
    __obj.asInstanceOf[ReposSetStatusCheckContextsRequestOptions]
  }
  
  @scala.inline
  implicit class ReposSetStatusCheckContextsRequestOptionsMutableBuilder[Self <: ReposSetStatusCheckContextsRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(
      value: SlashreposSlashColonownerSlashColonrepoSlashbranchesSlashColonbranchSlashprotectionSlashrequired_status_checksSlashcontexts
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
