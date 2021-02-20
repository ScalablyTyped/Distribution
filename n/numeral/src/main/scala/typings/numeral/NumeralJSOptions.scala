package typings.numeral

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumeralJSOptions extends StObject {
  
  var currentLocale: String = js.native
  
  var defaultFormat: String = js.native
  
  var nullFormat: String = js.native
  
  var scalePercentBy100: Boolean = js.native
  
  var zeroFormat: String = js.native
}
object NumeralJSOptions {
  
  @scala.inline
  def apply(
    currentLocale: String,
    defaultFormat: String,
    nullFormat: String,
    scalePercentBy100: Boolean,
    zeroFormat: String
  ): NumeralJSOptions = {
    val __obj = js.Dynamic.literal(currentLocale = currentLocale.asInstanceOf[js.Any], defaultFormat = defaultFormat.asInstanceOf[js.Any], nullFormat = nullFormat.asInstanceOf[js.Any], scalePercentBy100 = scalePercentBy100.asInstanceOf[js.Any], zeroFormat = zeroFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumeralJSOptions]
  }
  
  @scala.inline
  implicit class NumeralJSOptionsMutableBuilder[Self <: NumeralJSOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentLocale(value: String): Self = StObject.set(x, "currentLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFormat(value: String): Self = StObject.set(x, "defaultFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullFormat(value: String): Self = StObject.set(x, "nullFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalePercentBy100(value: Boolean): Self = StObject.set(x, "scalePercentBy100", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroFormat(value: String): Self = StObject.set(x, "zeroFormat", value.asInstanceOf[js.Any])
  }
}
