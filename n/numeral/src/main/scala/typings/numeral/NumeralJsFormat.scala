package typings.numeral

import typings.numeral.anon.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://numeraljs.com/#custom-formats
trait NumeralJsFormat extends StObject {
  
  def format(value: js.Any, format: String, roundingFunction: RoundingFunction): String
  
  var regexps: Format
  
  def unformat(value: String): Double
}
object NumeralJsFormat {
  
  @scala.inline
  def apply(format: (js.Any, String, RoundingFunction) => String, regexps: Format, unformat: String => Double): NumeralJsFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction3(format), regexps = regexps.asInstanceOf[js.Any], unformat = js.Any.fromFunction1(unformat))
    __obj.asInstanceOf[NumeralJsFormat]
  }
  
  @scala.inline
  implicit class NumeralJsFormatMutableBuilder[Self <: NumeralJsFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: (js.Any, String, RoundingFunction) => String): Self = StObject.set(x, "format", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRegexps(value: Format): Self = StObject.set(x, "regexps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnformat(value: String => Double): Self = StObject.set(x, "unformat", js.Any.fromFunction1(value))
  }
}
