package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookingCurrency
  extends StObject
     with Entity {
  
  // The currency symbol. For example, the currency symbol for the US dollar and for the Australian dollar is $.
  var symbol: js.UndefOr[String] = js.undefined
}
object BookingCurrency {
  
  inline def apply(): BookingCurrency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookingCurrency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BookingCurrency] (val x: Self) extends AnyVal {
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
