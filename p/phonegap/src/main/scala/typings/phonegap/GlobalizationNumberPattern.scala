package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalizationNumberPattern extends StObject {
  
  var decimal: String
  
  var fraction: Double
  
  var grouping: String
  
  var negative: String
  
  var pattern: String
  
  var positive: String
  
  var rounding: Double
  
  var symbol: String
}
object GlobalizationNumberPattern {
  
  inline def apply(
    decimal: String,
    fraction: Double,
    grouping: String,
    negative: String,
    pattern: String,
    positive: String,
    rounding: Double,
    symbol: String
  ): GlobalizationNumberPattern = {
    val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], fraction = fraction.asInstanceOf[js.Any], grouping = grouping.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], rounding = rounding.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalizationNumberPattern]
  }
  
  extension [Self <: GlobalizationNumberPattern](x: Self) {
    
    inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
    
    inline def setFraction(value: Double): Self = StObject.set(x, "fraction", value.asInstanceOf[js.Any])
    
    inline def setGrouping(value: String): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    inline def setNegative(value: String): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPositive(value: String): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
    
    inline def setRounding(value: Double): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
