package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalizationDateOptions extends StObject {
  
  var formatLength: js.UndefOr[String] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
}
object GlobalizationDateOptions {
  
  inline def apply(): GlobalizationDateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalizationDateOptions]
  }
  
  extension [Self <: GlobalizationDateOptions](x: Self) {
    
    inline def setFormatLength(value: String): Self = StObject.set(x, "formatLength", value.asInstanceOf[js.Any])
    
    inline def setFormatLengthUndefined: Self = StObject.set(x, "formatLength", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
