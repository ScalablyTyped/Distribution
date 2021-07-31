package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.SlashappSlashinstallationsSlashColoninstallation_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsGetInstallationRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: SlashappSlashinstallationsSlashColoninstallation_id
}
object AppsGetInstallationRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): AppsGetInstallationRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/app/installations/:installation_id")
    __obj.asInstanceOf[AppsGetInstallationRequestOptions]
  }
  
  @scala.inline
  implicit class AppsGetInstallationRequestOptionsMutableBuilder[Self <: AppsGetInstallationRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashappSlashinstallationsSlashColoninstallation_id): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
