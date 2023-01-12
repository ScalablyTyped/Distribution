package typings.paypalPaypalJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currencycode extends StObject {
  
  var currency_code: String
  
  var value: String
}
object Currencycode {
  
  inline def apply(currency_code: String, value: String): Currencycode = {
    val __obj = js.Dynamic.literal(currency_code = currency_code.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currencycode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Currencycode] (val x: Self) extends AnyVal {
    
    inline def setCurrency_code(value: String): Self = StObject.set(x, "currency_code", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
