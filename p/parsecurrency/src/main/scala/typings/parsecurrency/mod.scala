package typings.parsecurrency

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(currency: String): ParsedCurrency = ^.asInstanceOf[js.Dynamic].apply(currency.asInstanceOf[js.Any]).asInstanceOf[ParsedCurrency]
  
  @JSImport("parsecurrency", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ParsedCurrency extends StObject {
    
    var currency: String
    
    var decimalSeparator: String
    
    var decimals: String
    
    var groupSeparator: String
    
    var integer: String
    
    var raw: String
    
    var symbol: String
    
    var value: Double
  }
  object ParsedCurrency {
    
    inline def apply(
      currency: String,
      decimalSeparator: String,
      decimals: String,
      groupSeparator: String,
      integer: String,
      raw: String,
      symbol: String,
      value: Double
    ): ParsedCurrency = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimalSeparator = decimalSeparator.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], groupSeparator = groupSeparator.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedCurrency]
    }
    
    extension [Self <: ParsedCurrency](x: Self) {
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
      
      inline def setDecimals(value: String): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
      
      inline def setGroupSeparator(value: String): Self = StObject.set(x, "groupSeparator", value.asInstanceOf[js.Any])
      
      inline def setInteger(value: String): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
