package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActualExpected extends StObject {
  
  var actual: String
  
  var expected: String
  
  var message: String
  
  var result: Boolean
}
object ActualExpected {
  
  inline def apply(actual: String, expected: String, message: String, result: Boolean): ActualExpected = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActualExpected]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActualExpected] (val x: Self) extends AnyVal {
    
    inline def setActual(value: String): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setExpected(value: String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
