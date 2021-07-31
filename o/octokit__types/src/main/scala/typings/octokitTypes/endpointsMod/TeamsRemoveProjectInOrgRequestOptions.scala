package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashprojectsSlashColonproject_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsRemoveProjectInOrgRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: DELETE
  
  var request: RequestRequestOptions
  
  var url: SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashprojectsSlashColonproject_id
}
object TeamsRemoveProjectInOrgRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): TeamsRemoveProjectInOrgRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "DELETE", request = request.asInstanceOf[js.Any], url = "/orgs/:org/teams/:team_slug/projects/:project_id")
    __obj.asInstanceOf[TeamsRemoveProjectInOrgRequestOptions]
  }
  
  @scala.inline
  implicit class TeamsRemoveProjectInOrgRequestOptionsMutableBuilder[Self <: TeamsRemoveProjectInOrgRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashprojectsSlashColonproject_id): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
