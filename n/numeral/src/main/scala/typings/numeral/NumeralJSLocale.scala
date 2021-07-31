package typings.numeral

import typings.numeral.anon.Billion
import typings.numeral.anon.Decimal
import typings.numeral.anon.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumeralJSLocale extends StObject {
  
  var abbreviations: Billion
  
  var currency: Symbol
  
  var delimiters: Decimal
  
  def ordinal(num: Double): String
}
object NumeralJSLocale {
  
  @scala.inline
  def apply(abbreviations: Billion, currency: Symbol, delimiters: Decimal, ordinal: Double => String): NumeralJSLocale = {
    val __obj = js.Dynamic.literal(abbreviations = abbreviations.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], delimiters = delimiters.asInstanceOf[js.Any], ordinal = js.Any.fromFunction1(ordinal))
    __obj.asInstanceOf[NumeralJSLocale]
  }
  
  @scala.inline
  implicit class NumeralJSLocaleMutableBuilder[Self <: NumeralJSLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbbreviations(value: Billion): Self = StObject.set(x, "abbreviations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: Symbol): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiters(value: Decimal): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdinal(value: Double => String): Self = StObject.set(x, "ordinal", js.Any.fromFunction1(value))
  }
}
