package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PUT
import typings.octokitTypes.octokitTypesStrings.SlashteamsSlashColonteam_idSlashprojectsSlashColonproject_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: PUT
  
  var request: RequestRequestOptions
  
  var url: SlashteamsSlashColonteam_idSlashprojectsSlashColonproject_id
}
object TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "PUT", request = request.asInstanceOf[js.Any], url = "/teams/:team_id/projects/:project_id")
    __obj.asInstanceOf[TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions]
  }
  
  @scala.inline
  implicit class TeamsAddOrUpdateProjectPermissionsLegacyRequestOptionsMutableBuilder[Self <: TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashteamsSlashColonteam_idSlashprojectsSlashColonproject_id): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
