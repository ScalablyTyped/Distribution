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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageUndefined] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Unit): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Unit): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
