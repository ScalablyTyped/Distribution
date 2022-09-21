package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeUndefined extends StObject {
  
  var code: Unit
  
  var message: String
}
object CodeUndefined {
  
  inline def apply(code: Unit, message: String): CodeUndefined = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeUndefined]
  }
  
  extension [Self <: CodeUndefined](x: Self) {
    
    inline def setCode(value: Unit): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
