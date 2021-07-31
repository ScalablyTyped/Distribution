package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.SlashuserSlashmigrationsSlashColonmigration_idSlasharchive
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationsDeleteArchiveForAuthenticatedUserRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: DELETE
  
  var request: RequestRequestOptions
  
  var url: SlashuserSlashmigrationsSlashColonmigration_idSlasharchive
}
object MigrationsDeleteArchiveForAuthenticatedUserRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): MigrationsDeleteArchiveForAuthenticatedUserRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "DELETE", request = request.asInstanceOf[js.Any], url = "/user/migrations/:migration_id/archive")
    __obj.asInstanceOf[MigrationsDeleteArchiveForAuthenticatedUserRequestOptions]
  }
  
  @scala.inline
  implicit class MigrationsDeleteArchiveForAuthenticatedUserRequestOptionsMutableBuilder[Self <: MigrationsDeleteArchiveForAuthenticatedUserRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashuserSlashmigrationsSlashColonmigration_idSlasharchive): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
