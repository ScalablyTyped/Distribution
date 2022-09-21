package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageNull extends StObject {
  
  var code: Double
  
  var message: Null
}
object MessageNull {
  
  inline def apply(code: Double, message: Null): MessageNull = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageNull]
  }
  
  extension [Self <: MessageNull](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Null): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
