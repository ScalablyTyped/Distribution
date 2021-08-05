package typings.postmark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultResponseMod {
  
  trait DefaultResponse extends StObject {
    
    var ErrorCode: Double
    
    var Message: String
  }
  object DefaultResponse {
    
    inline def apply(ErrorCode: Double, Message: String): DefaultResponse = {
      val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultResponse]
    }
    
    extension [Self <: DefaultResponse](x: Self) {
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    }
  }
}
