package typings.postmark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultResponseMod {
  
  @js.native
  trait DefaultResponse extends StObject {
    
    var ErrorCode: Double = js.native
    
    var Message: String = js.native
  }
  object DefaultResponse {
    
    @scala.inline
    def apply(ErrorCode: Double, Message: String): DefaultResponse = {
      val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultResponse]
    }
    
    @scala.inline
    implicit class DefaultResponseMutableBuilder[Self <: DefaultResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorCode(value: Double): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    }
  }
}
