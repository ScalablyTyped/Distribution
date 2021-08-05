package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.SlashprojectsSlashColonproject_idSlashcollaboratorsSlashColonusername
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsRemoveCollaboratorRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: DELETE
  
  var request: RequestRequestOptions
  
  var url: SlashprojectsSlashColonproject_idSlashcollaboratorsSlashColonusername
}
object ProjectsRemoveCollaboratorRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): ProjectsRemoveCollaboratorRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "DELETE", request = request.asInstanceOf[js.Any], url = "/projects/:project_id/collaborators/:username")
    __obj.asInstanceOf[ProjectsRemoveCollaboratorRequestOptions]
  }
  
  extension [Self <: ProjectsRemoveCollaboratorRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: SlashprojectsSlashColonproject_idSlashcollaboratorsSlashColonusername): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
