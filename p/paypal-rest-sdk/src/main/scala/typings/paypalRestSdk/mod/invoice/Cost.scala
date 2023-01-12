package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cost extends StObject {
  
  var amount: js.UndefOr[Currency] = js.undefined
  
  var percent: js.UndefOr[Double] = js.undefined
}
object Cost {
  
  inline def apply(): Cost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cost] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Currency): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
  }
}
