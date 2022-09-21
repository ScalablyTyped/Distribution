package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageResponse extends StObject {
  
  var args: js.UndefOr[js.Array[Any]] = js.undefined
  
  var id: Double
  
  var isPartialResponse: js.UndefOr[Boolean] = js.undefined
}
object MessageResponse {
  
  inline def apply(id: Double): MessageResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageResponse]
  }
  
  extension [Self <: MessageResponse](x: Self) {
    
    inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsPartialResponse(value: Boolean): Self = StObject.set(x, "isPartialResponse", value.asInstanceOf[js.Any])
    
    inline def setIsPartialResponseUndefined: Self = StObject.set(x, "isPartialResponse", js.undefined)
  }
}
