package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeUndefinedMessageString extends StObject {
  
  var code: Unit
  
  var message: String
}
object CodeUndefinedMessageString {
  
  inline def apply(code: Unit, message: String): CodeUndefinedMessageString = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeUndefinedMessageString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeUndefinedMessageString] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Unit): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
