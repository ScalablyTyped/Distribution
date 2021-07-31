package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.`SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashteam-syncSlashgroup-mappings`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsListIdPGroupsInOrgRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: `SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashteam-syncSlashgroup-mappings`
}
object TeamsListIdPGroupsInOrgRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): TeamsListIdPGroupsInOrgRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/orgs/:org/teams/:team_slug/team-sync/group-mappings")
    __obj.asInstanceOf[TeamsListIdPGroupsInOrgRequestOptions]
  }
  
  @scala.inline
  implicit class TeamsListIdPGroupsInOrgRequestOptionsMutableBuilder[Self <: TeamsListIdPGroupsInOrgRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: `SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashteam-syncSlashgroup-mappings`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
