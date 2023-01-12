package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeBoolean extends StObject {
  
  var code: Boolean
  
  var message: String
}
object CodeBoolean {
  
  inline def apply(code: Boolean, message: String): CodeBoolean = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeBoolean] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
