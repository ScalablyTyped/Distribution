package typings.numeral

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Billion extends StObject {
    
    var billion: String
    
    var million: String
    
    var thousand: String
    
    var trillion: String
  }
  object Billion {
    
    inline def apply(billion: String, million: String, thousand: String, trillion: String): Billion = {
      val __obj = js.Dynamic.literal(billion = billion.asInstanceOf[js.Any], million = million.asInstanceOf[js.Any], thousand = thousand.asInstanceOf[js.Any], trillion = trillion.asInstanceOf[js.Any])
      __obj.asInstanceOf[Billion]
    }
    
    extension [Self <: Billion](x: Self) {
      
      inline def setBillion(value: String): Self = StObject.set(x, "billion", value.asInstanceOf[js.Any])
      
      inline def setMillion(value: String): Self = StObject.set(x, "million", value.asInstanceOf[js.Any])
      
      inline def setThousand(value: String): Self = StObject.set(x, "thousand", value.asInstanceOf[js.Any])
      
      inline def setTrillion(value: String): Self = StObject.set(x, "trillion", value.asInstanceOf[js.Any])
    }
  }
  
  trait Decimal extends StObject {
    
    var decimal: String
    
    var thousands: String
  }
  object Decimal {
    
    inline def apply(decimal: String, thousands: String): Decimal = {
      val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
      __obj.asInstanceOf[Decimal]
    }
    
    extension [Self <: Decimal](x: Self) {
      
      inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      inline def setThousands(value: String): Self = StObject.set(x, "thousands", value.asInstanceOf[js.Any])
    }
  }
  
  trait Format extends StObject {
    
    var format: RegExp
    
    var unformat: RegExp
  }
  object Format {
    
    inline def apply(format: RegExp, unformat: RegExp): Format = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], unformat = unformat.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    extension [Self <: Format](x: Self) {
      
      inline def setFormat(value: RegExp): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setUnformat(value: RegExp): Self = StObject.set(x, "unformat", value.asInstanceOf[js.Any])
    }
  }
  
  trait Symbol extends StObject {
    
    var symbol: String
  }
  object Symbol {
    
    inline def apply(symbol: String): Symbol = {
      val __obj = js.Dynamic.literal(symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Symbol]
    }
    
    extension [Self <: Symbol](x: Self) {
      
      inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
}
