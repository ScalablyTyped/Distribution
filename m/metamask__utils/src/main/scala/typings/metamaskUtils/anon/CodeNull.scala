package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeNull extends StObject {
  
  var code: Null
  
  var message: String
}
object CodeNull {
  
  inline def apply(code: Null, message: String): CodeNull = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeNull]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeNull] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Null): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
