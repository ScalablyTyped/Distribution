package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.SlashprojectsSlashColonproject_idSlashcollaboratorsSlashColonusernameSlashpermission
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsGetPermissionForUserRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: SlashprojectsSlashColonproject_idSlashcollaboratorsSlashColonusernameSlashpermission
}
object ProjectsGetPermissionForUserRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): ProjectsGetPermissionForUserRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/projects/:project_id/collaborators/:username/permission")
    __obj.asInstanceOf[ProjectsGetPermissionForUserRequestOptions]
  }
  
  extension [Self <: ProjectsGetPermissionForUserRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: SlashprojectsSlashColonproject_idSlashcollaboratorsSlashColonusernameSlashpermission): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
