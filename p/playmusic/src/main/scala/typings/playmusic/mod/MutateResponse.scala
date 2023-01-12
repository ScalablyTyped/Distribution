package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutateResponse extends StObject {
  
  var client_id: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var response_code: js.UndefOr[String] = js.undefined
}
object MutateResponse {
  
  inline def apply(): MutateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MutateResponse] (val x: Self) extends AnyVal {
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setResponse_code(value: String): Self = StObject.set(x, "response_code", value.asInstanceOf[js.Any])
    
    inline def setResponse_codeUndefined: Self = StObject.set(x, "response_code", js.undefined)
  }
}
