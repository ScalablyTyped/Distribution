package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.SlashappSlashinstallationsSlashColoninstallation_idSlashsuspended
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsUnsuspendInstallationRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: DELETE
  
  var request: RequestRequestOptions
  
  var url: SlashappSlashinstallationsSlashColoninstallation_idSlashsuspended
}
object AppsUnsuspendInstallationRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): AppsUnsuspendInstallationRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "DELETE", request = request.asInstanceOf[js.Any], url = "/app/installations/:installation_id/suspended")
    __obj.asInstanceOf[AppsUnsuspendInstallationRequestOptions]
  }
  
  @scala.inline
  implicit class AppsUnsuspendInstallationRequestOptionsMutableBuilder[Self <: AppsUnsuspendInstallationRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashappSlashinstallationsSlashColoninstallation_idSlashsuspended): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
