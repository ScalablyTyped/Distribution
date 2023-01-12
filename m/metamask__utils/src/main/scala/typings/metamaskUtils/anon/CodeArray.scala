package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeArray extends StObject {
  
  var code: js.Array[scala.Nothing]
  
  var message: String
}
object CodeArray {
  
  inline def apply(code: js.Array[scala.Nothing], message: String): CodeArray = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeArray] (val x: Self) extends AnyVal {
    
    inline def setCode(value: js.Array[scala.Nothing]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeVarargs(value: scala.Nothing*): Self = StObject.set(x, "code", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
