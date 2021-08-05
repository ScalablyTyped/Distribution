package typings.numbro

import typings.numbro.mod.numbro.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Billion extends StObject {
    
    var billion: js.UndefOr[String] = js.undefined
    
    var million: js.UndefOr[String] = js.undefined
    
    var thousand: js.UndefOr[String] = js.undefined
    
    var trillion: js.UndefOr[String] = js.undefined
  }
  object Billion {
    
    inline def apply(): Billion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Billion]
    }
    
    extension [Self <: Billion](x: Self) {
      
      inline def setBillion(value: String): Self = StObject.set(x, "billion", value.asInstanceOf[js.Any])
      
      inline def setBillionUndefined: Self = StObject.set(x, "billion", js.undefined)
      
      inline def setMillion(value: String): Self = StObject.set(x, "million", value.asInstanceOf[js.Any])
      
      inline def setMillionUndefined: Self = StObject.set(x, "million", js.undefined)
      
      inline def setThousand(value: String): Self = StObject.set(x, "thousand", value.asInstanceOf[js.Any])
      
      inline def setThousandUndefined: Self = StObject.set(x, "thousand", js.undefined)
      
      inline def setTrillion(value: String): Self = StObject.set(x, "trillion", value.asInstanceOf[js.Any])
      
      inline def setTrillionUndefined: Self = StObject.set(x, "trillion", js.undefined)
    }
  }
  
  trait Code extends StObject {
    
    var code: String
    
    var position: String
    
    var symbol: String
  }
  object Code {
    
    inline def apply(code: String, position: String, symbol: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
  
  trait Decimal extends StObject {
    
    var decimal: String
    
    var thousands: String
    
    var thousandsSize: js.UndefOr[Double] = js.undefined
  }
  object Decimal {
    
    inline def apply(decimal: String, thousands: String): Decimal = {
      val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
      __obj.asInstanceOf[Decimal]
    }
    
    extension [Self <: Decimal](x: Self) {
      
      inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      inline def setThousands(value: String): Self = StObject.set(x, "thousands", value.asInstanceOf[js.Any])
      
      inline def setThousandsSize(value: Double): Self = StObject.set(x, "thousandsSize", value.asInstanceOf[js.Any])
      
      inline def setThousandsSizeUndefined: Self = StObject.set(x, "thousandsSize", js.undefined)
    }
  }
  
  trait FourDigits extends StObject {
    
    var fourDigits: Format
    
    var fullWithNoDecimals: Format
    
    var fullWithTwoDecimals: Format
    
    var fullWithTwoDecimalsNoCurrency: Format
  }
  object FourDigits {
    
    inline def apply(
      fourDigits: Format,
      fullWithNoDecimals: Format,
      fullWithTwoDecimals: Format,
      fullWithTwoDecimalsNoCurrency: Format
    ): FourDigits = {
      val __obj = js.Dynamic.literal(fourDigits = fourDigits.asInstanceOf[js.Any], fullWithNoDecimals = fullWithNoDecimals.asInstanceOf[js.Any], fullWithTwoDecimals = fullWithTwoDecimals.asInstanceOf[js.Any], fullWithTwoDecimalsNoCurrency = fullWithTwoDecimalsNoCurrency.asInstanceOf[js.Any])
      __obj.asInstanceOf[FourDigits]
    }
    
    extension [Self <: FourDigits](x: Self) {
      
      inline def setFourDigits(value: Format): Self = StObject.set(x, "fourDigits", value.asInstanceOf[js.Any])
      
      inline def setFullWithNoDecimals(value: Format): Self = StObject.set(x, "fullWithNoDecimals", value.asInstanceOf[js.Any])
      
      inline def setFullWithTwoDecimals(value: Format): Self = StObject.set(x, "fullWithTwoDecimals", value.asInstanceOf[js.Any])
      
      inline def setFullWithTwoDecimalsNoCurrency(value: Format): Self = StObject.set(x, "fullWithTwoDecimalsNoCurrency", value.asInstanceOf[js.Any])
    }
  }
  
  trait Million extends StObject {
    
    var billion: String
    
    var million: String
    
    var thousand: String
    
    var trillion: String
  }
  object Million {
    
    inline def apply(billion: String, million: String, thousand: String, trillion: String): Million = {
      val __obj = js.Dynamic.literal(billion = billion.asInstanceOf[js.Any], million = million.asInstanceOf[js.Any], thousand = thousand.asInstanceOf[js.Any], trillion = trillion.asInstanceOf[js.Any])
      __obj.asInstanceOf[Million]
    }
    
    extension [Self <: Million](x: Self) {
      
      inline def setBillion(value: String): Self = StObject.set(x, "billion", value.asInstanceOf[js.Any])
      
      inline def setMillion(value: String): Self = StObject.set(x, "million", value.asInstanceOf[js.Any])
      
      inline def setThousand(value: String): Self = StObject.set(x, "thousand", value.asInstanceOf[js.Any])
      
      inline def setTrillion(value: String): Self = StObject.set(x, "trillion", value.asInstanceOf[js.Any])
    }
  }
}
