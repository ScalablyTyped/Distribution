package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.SlashuserSlashmigrationsSlashColonmigration_idSlashreposSlashColonrepo_nameSlashlock
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationsUnlockRepoForAuthenticatedUserRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: DELETE
  
  var request: RequestRequestOptions
  
  var url: SlashuserSlashmigrationsSlashColonmigration_idSlashreposSlashColonrepo_nameSlashlock
}
object MigrationsUnlockRepoForAuthenticatedUserRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): MigrationsUnlockRepoForAuthenticatedUserRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "DELETE", request = request.asInstanceOf[js.Any], url = "/user/migrations/:migration_id/repos/:repo_name/lock")
    __obj.asInstanceOf[MigrationsUnlockRepoForAuthenticatedUserRequestOptions]
  }
  
  extension [Self <: MigrationsUnlockRepoForAuthenticatedUserRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: SlashuserSlashmigrationsSlashColonmigration_idSlashreposSlashColonrepo_nameSlashlock): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
