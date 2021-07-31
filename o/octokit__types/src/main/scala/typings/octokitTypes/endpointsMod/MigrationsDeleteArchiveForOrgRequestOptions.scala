package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.SlashorgsSlashColonorgSlashmigrationsSlashColonmigration_idSlasharchive
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationsDeleteArchiveForOrgRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: DELETE
  
  var request: RequestRequestOptions
  
  var url: SlashorgsSlashColonorgSlashmigrationsSlashColonmigration_idSlasharchive
}
object MigrationsDeleteArchiveForOrgRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): MigrationsDeleteArchiveForOrgRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "DELETE", request = request.asInstanceOf[js.Any], url = "/orgs/:org/migrations/:migration_id/archive")
    __obj.asInstanceOf[MigrationsDeleteArchiveForOrgRequestOptions]
  }
  
  @scala.inline
  implicit class MigrationsDeleteArchiveForOrgRequestOptionsMutableBuilder[Self <: MigrationsDeleteArchiveForOrgRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashorgsSlashColonorgSlashmigrationsSlashColonmigration_idSlasharchive): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
