package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.SlashuserSlashkeysSlashColonkey_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersGetPublicSshKeyForAuthenticatedRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: SlashuserSlashkeysSlashColonkey_id
}
object UsersGetPublicSshKeyForAuthenticatedRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): UsersGetPublicSshKeyForAuthenticatedRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/user/keys/:key_id")
    __obj.asInstanceOf[UsersGetPublicSshKeyForAuthenticatedRequestOptions]
  }
  
  @scala.inline
  implicit class UsersGetPublicSshKeyForAuthenticatedRequestOptionsMutableBuilder[Self <: UsersGetPublicSshKeyForAuthenticatedRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashuserSlashkeysSlashColonkey_id): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
