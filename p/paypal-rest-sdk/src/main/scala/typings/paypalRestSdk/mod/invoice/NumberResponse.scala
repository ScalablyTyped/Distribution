package typings.paypalRestSdk.mod.invoice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberResponse extends StObject {
  
  var number: String
}
object NumberResponse {
  
  inline def apply(number: String): NumberResponse = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberResponse] (val x: Self) extends AnyVal {
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
