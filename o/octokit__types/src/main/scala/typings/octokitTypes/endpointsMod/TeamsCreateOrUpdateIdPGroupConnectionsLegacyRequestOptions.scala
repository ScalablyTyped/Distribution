package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PATCH
import typings.octokitTypes.octokitTypesStrings.`SlashteamsSlashColonteam_idSlashteam-syncSlashgroup-mappings`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsCreateOrUpdateIdPGroupConnectionsLegacyRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: PATCH
  
  var request: RequestRequestOptions
  
  var url: `SlashteamsSlashColonteam_idSlashteam-syncSlashgroup-mappings`
}
object TeamsCreateOrUpdateIdPGroupConnectionsLegacyRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): TeamsCreateOrUpdateIdPGroupConnectionsLegacyRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "PATCH", request = request.asInstanceOf[js.Any], url = "/teams/:team_id/team-sync/group-mappings")
    __obj.asInstanceOf[TeamsCreateOrUpdateIdPGroupConnectionsLegacyRequestOptions]
  }
  
  extension [Self <: TeamsCreateOrUpdateIdPGroupConnectionsLegacyRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: PATCH): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: `SlashteamsSlashColonteam_idSlashteam-syncSlashgroup-mappings`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
