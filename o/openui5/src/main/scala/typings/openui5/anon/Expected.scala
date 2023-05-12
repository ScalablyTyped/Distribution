package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expected extends StObject {
  
  var actual: String
  
  var expected: js.Array[js.Object]
  
  var message: String
  
  var result: Boolean
}
object Expected {
  
  inline def apply(actual: String, expected: js.Array[js.Object], message: String, result: Boolean): Expected = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expected]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Expected] (val x: Self) extends AnyVal {
    
    inline def setActual(value: String): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setExpected(value: js.Array[js.Object]): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    
    inline def setExpectedVarargs(value: js.Object*): Self = StObject.set(x, "expected", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
