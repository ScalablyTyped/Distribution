package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.SlashapplicationsSlashColonclient_idSlashgrantsSlashColonaccess_token
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsRevokeGrantForApplicationRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: DELETE
  
  var request: RequestRequestOptions
  
  var url: SlashapplicationsSlashColonclient_idSlashgrantsSlashColonaccess_token
}
object AppsRevokeGrantForApplicationRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): AppsRevokeGrantForApplicationRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "DELETE", request = request.asInstanceOf[js.Any], url = "/applications/:client_id/grants/:access_token")
    __obj.asInstanceOf[AppsRevokeGrantForApplicationRequestOptions]
  }
  
  @scala.inline
  implicit class AppsRevokeGrantForApplicationRequestOptionsMutableBuilder[Self <: AppsRevokeGrantForApplicationRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashapplicationsSlashColonclient_idSlashgrantsSlashColonaccess_token): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
