package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageArray extends StObject {
  
  var code: Double
  
  var message: js.Array[scala.Nothing]
}
object MessageArray {
  
  inline def apply(code: Double, message: js.Array[scala.Nothing]): MessageArray = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageArray] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: js.Array[scala.Nothing]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageVarargs(value: scala.Nothing*): Self = StObject.set(x, "message", js.Array(value*))
  }
}
