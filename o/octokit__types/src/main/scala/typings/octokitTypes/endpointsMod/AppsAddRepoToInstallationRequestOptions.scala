package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PUT
import typings.octokitTypes.octokitTypesStrings.SlashuserSlashinstallationsSlashColoninstallation_idSlashrepositoriesSlashColonrepository_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsAddRepoToInstallationRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: PUT
  
  var request: RequestRequestOptions
  
  var url: SlashuserSlashinstallationsSlashColoninstallation_idSlashrepositoriesSlashColonrepository_id
}
object AppsAddRepoToInstallationRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): AppsAddRepoToInstallationRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "PUT", request = request.asInstanceOf[js.Any], url = "/user/installations/:installation_id/repositories/:repository_id")
    __obj.asInstanceOf[AppsAddRepoToInstallationRequestOptions]
  }
  
  @scala.inline
  implicit class AppsAddRepoToInstallationRequestOptionsMutableBuilder[Self <: AppsAddRepoToInstallationRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(
      value: SlashuserSlashinstallationsSlashColoninstallation_idSlashrepositoriesSlashColonrepository_id
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
