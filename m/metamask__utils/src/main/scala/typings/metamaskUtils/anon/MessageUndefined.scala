package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageUndefined extends StObject {
  
  var code: Unit
  
  var message: Unit
}
object MessageUndefined {
  
  inline def apply(code: Unit, message: Unit): MessageUndefined = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageUndefined]
  }
  
  extension [Self <: MessageUndefined](x: Self) {
    
    inline def setCode(value: Unit): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Unit): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
