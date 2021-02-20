package typings.parsecurrency

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parsecurrency", JSImport.Namespace)
  @js.native
  def apply(currency: String): ParsedCurrency = js.native
  
  @js.native
  trait ParsedCurrency extends StObject {
    
    var currency: String = js.native
    
    var decimalSeparator: String = js.native
    
    var decimals: String = js.native
    
    var groupSeparator: String = js.native
    
    var integer: String = js.native
    
    var raw: String = js.native
    
    var symbol: String = js.native
    
    var value: Double = js.native
  }
  object ParsedCurrency {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ParsedCurrencyMutableBuilder[Self <: ParsedCurrency] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimals(value: String): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupSeparator(value: String): Self = StObject.set(x, "groupSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteger(value: String): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
