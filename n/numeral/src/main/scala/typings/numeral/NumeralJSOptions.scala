package typings.numeral

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumeralJSOptions extends StObject {
  
  var currentLocale: String
  
  var defaultFormat: String
  
  var nullFormat: String
  
  var scalePercentBy100: Boolean
  
  var zeroFormat: String
}
object NumeralJSOptions {
  
  inline def apply(
    currentLocale: String,
    defaultFormat: String,
    nullFormat: String,
    scalePercentBy100: Boolean,
    zeroFormat: String
  ): NumeralJSOptions = {
    val __obj = js.Dynamic.literal(currentLocale = currentLocale.asInstanceOf[js.Any], defaultFormat = defaultFormat.asInstanceOf[js.Any], nullFormat = nullFormat.asInstanceOf[js.Any], scalePercentBy100 = scalePercentBy100.asInstanceOf[js.Any], zeroFormat = zeroFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumeralJSOptions]
  }
  
  extension [Self <: NumeralJSOptions](x: Self) {
    
    inline def setCurrentLocale(value: String): Self = StObject.set(x, "currentLocale", value.asInstanceOf[js.Any])
    
    inline def setDefaultFormat(value: String): Self = StObject.set(x, "defaultFormat", value.asInstanceOf[js.Any])
    
    inline def setNullFormat(value: String): Self = StObject.set(x, "nullFormat", value.asInstanceOf[js.Any])
    
    inline def setScalePercentBy100(value: Boolean): Self = StObject.set(x, "scalePercentBy100", value.asInstanceOf[js.Any])
    
    inline def setZeroFormat(value: String): Self = StObject.set(x, "zeroFormat", value.asInstanceOf[js.Any])
  }
}
