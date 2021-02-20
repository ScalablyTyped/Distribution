package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutateResponse extends StObject {
  
  var client_id: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var response_code: js.UndefOr[String] = js.native
}
object MutateResponse {
  
  @scala.inline
  def apply(): MutateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutateResponse]
  }
  
  @scala.inline
  implicit class MutateResponseMutableBuilder[Self <: MutateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setResponse_code(value: String): Self = StObject.set(x, "response_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse_codeUndefined: Self = StObject.set(x, "response_code", js.undefined)
  }
}
