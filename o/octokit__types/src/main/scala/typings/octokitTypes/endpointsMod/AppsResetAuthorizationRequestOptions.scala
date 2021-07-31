package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.POST
import typings.octokitTypes.octokitTypesStrings.SlashapplicationsSlashColonclient_idSlashtokensSlashColonaccess_token
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsResetAuthorizationRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: POST
  
  var request: RequestRequestOptions
  
  var url: SlashapplicationsSlashColonclient_idSlashtokensSlashColonaccess_token
}
object AppsResetAuthorizationRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): AppsResetAuthorizationRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "POST", request = request.asInstanceOf[js.Any], url = "/applications/:client_id/tokens/:access_token")
    __obj.asInstanceOf[AppsResetAuthorizationRequestOptions]
  }
  
  @scala.inline
  implicit class AppsResetAuthorizationRequestOptionsMutableBuilder[Self <: AppsResetAuthorizationRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashapplicationsSlashColonclient_idSlashtokensSlashColonaccess_token): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
