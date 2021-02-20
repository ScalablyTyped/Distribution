package typings.numbro

import typings.numbro.mod.numbro.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Billion extends StObject {
    
    var billion: js.UndefOr[String] = js.native
    
    var million: js.UndefOr[String] = js.native
    
    var thousand: js.UndefOr[String] = js.native
    
    var trillion: js.UndefOr[String] = js.native
  }
  object Billion {
    
    @scala.inline
    def apply(): Billion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Billion]
    }
    
    @scala.inline
    implicit class BillionMutableBuilder[Self <: Billion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBillion(value: String): Self = StObject.set(x, "billion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBillionUndefined: Self = StObject.set(x, "billion", js.undefined)
      
      @scala.inline
      def setMillion(value: String): Self = StObject.set(x, "million", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMillionUndefined: Self = StObject.set(x, "million", js.undefined)
      
      @scala.inline
      def setThousand(value: String): Self = StObject.set(x, "thousand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThousandUndefined: Self = StObject.set(x, "thousand", js.undefined)
      
      @scala.inline
      def setTrillion(value: String): Self = StObject.set(x, "trillion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrillionUndefined: Self = StObject.set(x, "trillion", js.undefined)
    }
  }
  
  @js.native
  trait Code extends StObject {
    
    var code: String = js.native
    
    var position: String = js.native
    
    var symbol: String = js.native
  }
  object Code {
    
    @scala.inline
    def apply(code: String, position: String, symbol: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Decimal extends StObject {
    
    var decimal: String = js.native
    
    var thousands: String = js.native
    
    var thousandsSize: js.UndefOr[Double] = js.native
  }
  object Decimal {
    
    @scala.inline
    def apply(decimal: String, thousands: String): Decimal = {
      val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
      __obj.asInstanceOf[Decimal]
    }
    
    @scala.inline
    implicit class DecimalMutableBuilder[Self <: Decimal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThousands(value: String): Self = StObject.set(x, "thousands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThousandsSize(value: Double): Self = StObject.set(x, "thousandsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThousandsSizeUndefined: Self = StObject.set(x, "thousandsSize", js.undefined)
    }
  }
  
  @js.native
  trait FourDigits extends StObject {
    
    var fourDigits: Format = js.native
    
    var fullWithNoDecimals: Format = js.native
    
    var fullWithTwoDecimals: Format = js.native
    
    var fullWithTwoDecimalsNoCurrency: Format = js.native
  }
  object FourDigits {
    
    @scala.inline
    def apply(
      fourDigits: Format,
      fullWithNoDecimals: Format,
      fullWithTwoDecimals: Format,
      fullWithTwoDecimalsNoCurrency: Format
    ): FourDigits = {
      val __obj = js.Dynamic.literal(fourDigits = fourDigits.asInstanceOf[js.Any], fullWithNoDecimals = fullWithNoDecimals.asInstanceOf[js.Any], fullWithTwoDecimals = fullWithTwoDecimals.asInstanceOf[js.Any], fullWithTwoDecimalsNoCurrency = fullWithTwoDecimalsNoCurrency.asInstanceOf[js.Any])
      __obj.asInstanceOf[FourDigits]
    }
    
    @scala.inline
    implicit class FourDigitsMutableBuilder[Self <: FourDigits] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFourDigits(value: Format): Self = StObject.set(x, "fourDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWithNoDecimals(value: Format): Self = StObject.set(x, "fullWithNoDecimals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWithTwoDecimals(value: Format): Self = StObject.set(x, "fullWithTwoDecimals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWithTwoDecimalsNoCurrency(value: Format): Self = StObject.set(x, "fullWithTwoDecimalsNoCurrency", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Million extends StObject {
    
    var billion: String = js.native
    
    var million: String = js.native
    
    var thousand: String = js.native
    
    var trillion: String = js.native
  }
  object Million {
    
    @scala.inline
    def apply(billion: String, million: String, thousand: String, trillion: String): Million = {
      val __obj = js.Dynamic.literal(billion = billion.asInstanceOf[js.Any], million = million.asInstanceOf[js.Any], thousand = thousand.asInstanceOf[js.Any], trillion = trillion.asInstanceOf[js.Any])
      __obj.asInstanceOf[Million]
    }
    
    @scala.inline
    implicit class MillionMutableBuilder[Self <: Million] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBillion(value: String): Self = StObject.set(x, "billion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMillion(value: String): Self = StObject.set(x, "million", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThousand(value: String): Self = StObject.set(x, "thousand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrillion(value: String): Self = StObject.set(x, "trillion", value.asInstanceOf[js.Any])
    }
  }
}
