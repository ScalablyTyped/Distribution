package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libI18nNumberFormatMod {
  
  inline def apply(pattern: String): Unit = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(pattern: Double): Unit = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/i18n/NumberFormat", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with NumberFormat {
    def this(pattern: String) = this()
    def this(pattern: Double) = this()
  }
  @JSImport("@nginstack/engine/lib/i18n/NumberFormat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Format {
    
    @JSImport("@nginstack/engine/lib/i18n/NumberFormat", "Format.CURRENCY")
    @js.native
    val CURRENCY: Double = js.native
    
    @JSImport("@nginstack/engine/lib/i18n/NumberFormat", "Format.DECIMAL")
    @js.native
    val DECIMAL: Double = js.native
    
    @JSImport("@nginstack/engine/lib/i18n/NumberFormat", "Format.INTEGER")
    @js.native
    val INTEGER: Double = js.native
    
    @JSImport("@nginstack/engine/lib/i18n/NumberFormat", "Format.PERCENT")
    @js.native
    val PERCENT: Double = js.native
    
    @JSImport("@nginstack/engine/lib/i18n/NumberFormat", "Format.SCIENTIFIC")
    @js.native
    val SCIENTIFIC: Double = js.native
  }
  type Format = Double
  
  @js.native
  trait NumberFormat extends StObject {
    
    /* private */ var addExponentPart_ : Any = js.native
    
    /* private */ var applyPattern_ : Any = js.native
    
    /* private */ var applyStandardPattern_ : Any = js.native
    
    /* private */ var decimalSeparatorAlwaysShown_ : Any = js.native
    
    def format(number: Double): String = js.native
    
    /* private */ var getDigit_ : Any = js.native
    
    /* private */ var groupingSize_ : Any = js.native
    
    /* private */ var intlCurrencyCode_ : Any = js.native
    
    /* private */ var maximumFractionDigits_ : Any = js.native
    
    /* private */ var maximumIntegerDigits_ : Any = js.native
    
    /* private */ var minExponentDigits_ : Any = js.native
    
    /* private */ var minimumFractionDigits_ : Any = js.native
    
    /* private */ var minimumIntegerDigits_ : Any = js.native
    
    /* private */ var multiplier_ : Any = js.native
    
    /* private */ var negativePrefix_ : Any = js.native
    
    /* private */ var negativeSuffix_ : Any = js.native
    
    def parse(text: String): Double = js.native
    def parse(text: String, opt_pos: js.Array[Double]): Double = js.native
    
    /* private */ var parseAffix_ : Any = js.native
    
    /* private */ var parseNumber_ : Any = js.native
    
    /* private */ var parseTrunk_ : Any = js.native
    
    /* private */ var positivePrefix_ : Any = js.native
    
    /* private */ var positiveSuffix_ : Any = js.native
    
    /* private */ var subformatExponential_ : Any = js.native
    
    /* private */ var subformatFixed_ : Any = js.native
    
    /* private */ var useExponentialNotation_ : Any = js.native
    
    /* private */ var useSignForPositiveExponent_ : Any = js.native
  }
}
