package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeNumber extends StObject {
  
  var code: Double
  
  var message: Unit
}
object CodeNumber {
  
  inline def apply(code: Double, message: Unit): CodeNumber = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeNumber]
  }
  
  extension [Self <: CodeNumber](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Unit): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
