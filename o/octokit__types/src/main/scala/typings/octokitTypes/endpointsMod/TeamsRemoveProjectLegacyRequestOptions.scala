package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.SlashteamsSlashColonteam_idSlashprojectsSlashColonproject_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsRemoveProjectLegacyRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: DELETE
  
  var request: RequestRequestOptions
  
  var url: SlashteamsSlashColonteam_idSlashprojectsSlashColonproject_id
}
object TeamsRemoveProjectLegacyRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): TeamsRemoveProjectLegacyRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "DELETE", request = request.asInstanceOf[js.Any], url = "/teams/:team_id/projects/:project_id")
    __obj.asInstanceOf[TeamsRemoveProjectLegacyRequestOptions]
  }
  
  @scala.inline
  implicit class TeamsRemoveProjectLegacyRequestOptionsMutableBuilder[Self <: TeamsRemoveProjectLegacyRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashteamsSlashColonteam_idSlashprojectsSlashColonproject_id): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
