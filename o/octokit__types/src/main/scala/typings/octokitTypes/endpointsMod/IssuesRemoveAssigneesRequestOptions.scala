package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashassignees
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuesRemoveAssigneesRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: DELETE
  
  var request: RequestRequestOptions
  
  var url: SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashassignees
}
object IssuesRemoveAssigneesRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): IssuesRemoveAssigneesRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "DELETE", request = request.asInstanceOf[js.Any], url = "/repos/:owner/:repo/issues/:issue_number/assignees")
    __obj.asInstanceOf[IssuesRemoveAssigneesRequestOptions]
  }
  
  extension [Self <: IssuesRemoveAssigneesRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashassignees): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
