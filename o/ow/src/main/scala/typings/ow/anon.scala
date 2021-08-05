package typings.ow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Message extends StObject {
    
    /**
      The error message which should be shown if the `validator` is `false`. Or a error function which returns the error message and accepts the label as first argument.
      */
    var message: String | (js.Function1[/* label */ String, String])
    
    /**
      Should be `true` if the validation is correct.
      */
    var validator: Boolean
  }
  object Message {
    
    inline def apply(message: String | (js.Function1[/* label */ String, String]), validator: Boolean): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: String | (js.Function1[/* label */ String, String])): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction1(value: /* label */ String => String): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
      
      inline def setValidator(value: Boolean): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    }
  }
}
