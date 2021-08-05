package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PUT
import typings.octokitTypes.octokitTypesStrings.SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashmembershipsSlashColonusername
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsAddOrUpdateMembershipForUserInOrgRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: PUT
  
  var request: RequestRequestOptions
  
  var url: SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashmembershipsSlashColonusername
}
object TeamsAddOrUpdateMembershipForUserInOrgRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): TeamsAddOrUpdateMembershipForUserInOrgRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "PUT", request = request.asInstanceOf[js.Any], url = "/orgs/:org/teams/:team_slug/memberships/:username")
    __obj.asInstanceOf[TeamsAddOrUpdateMembershipForUserInOrgRequestOptions]
  }
  
  extension [Self <: TeamsAddOrUpdateMembershipForUserInOrgRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashmembershipsSlashColonusername): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
