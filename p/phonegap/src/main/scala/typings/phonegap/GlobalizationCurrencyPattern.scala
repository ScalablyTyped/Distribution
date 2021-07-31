package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalizationCurrencyPattern extends StObject {
  
  var code: String
  
  var decimal: String
  
  var fraction: Double
  
  var grouping: String
  
  var pattern: String
  
  var rounding: Double
}
object GlobalizationCurrencyPattern {
  
  @scala.inline
  def apply(
    code: String,
    decimal: String,
    fraction: Double,
    grouping: String,
    pattern: String,
    rounding: Double
  ): GlobalizationCurrencyPattern = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], fraction = fraction.asInstanceOf[js.Any], grouping = grouping.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], rounding = rounding.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalizationCurrencyPattern]
  }
  
  @scala.inline
  implicit class GlobalizationCurrencyPatternMutableBuilder[Self <: GlobalizationCurrencyPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFraction(value: Double): Self = StObject.set(x, "fraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrouping(value: String): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRounding(value: Double): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
  }
}
