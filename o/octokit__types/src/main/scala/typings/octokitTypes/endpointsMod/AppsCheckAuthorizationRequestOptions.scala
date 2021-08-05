package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.SlashapplicationsSlashColonclient_idSlashtokensSlashColonaccess_token
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsCheckAuthorizationRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: SlashapplicationsSlashColonclient_idSlashtokensSlashColonaccess_token
}
object AppsCheckAuthorizationRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): AppsCheckAuthorizationRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/applications/:client_id/tokens/:access_token")
    __obj.asInstanceOf[AppsCheckAuthorizationRequestOptions]
  }
  
  extension [Self <: AppsCheckAuthorizationRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: SlashapplicationsSlashColonclient_idSlashtokensSlashColonaccess_token): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
