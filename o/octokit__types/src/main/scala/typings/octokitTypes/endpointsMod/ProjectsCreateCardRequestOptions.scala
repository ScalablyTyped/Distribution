package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.POST
import typings.octokitTypes.octokitTypesStrings.SlashprojectsSlashcolumnsSlashColoncolumn_idSlashcards
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsCreateCardRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: POST
  
  var request: RequestRequestOptions
  
  var url: SlashprojectsSlashcolumnsSlashColoncolumn_idSlashcards
}
object ProjectsCreateCardRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): ProjectsCreateCardRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "POST", request = request.asInstanceOf[js.Any], url = "/projects/columns/:column_id/cards")
    __obj.asInstanceOf[ProjectsCreateCardRequestOptions]
  }
  
  extension [Self <: ProjectsCreateCardRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: SlashprojectsSlashcolumnsSlashColoncolumn_idSlashcards): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
