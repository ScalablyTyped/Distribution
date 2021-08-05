package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.SlashuserSlashgpg_keysSlashColongpg_key_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersDeleteGpgKeyForAuthenticatedRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: DELETE
  
  var request: RequestRequestOptions
  
  var url: SlashuserSlashgpg_keysSlashColongpg_key_id
}
object UsersDeleteGpgKeyForAuthenticatedRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): UsersDeleteGpgKeyForAuthenticatedRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "DELETE", request = request.asInstanceOf[js.Any], url = "/user/gpg_keys/:gpg_key_id")
    __obj.asInstanceOf[UsersDeleteGpgKeyForAuthenticatedRequestOptions]
  }
  
  extension [Self <: UsersDeleteGpgKeyForAuthenticatedRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: SlashuserSlashgpg_keysSlashColongpg_key_id): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
