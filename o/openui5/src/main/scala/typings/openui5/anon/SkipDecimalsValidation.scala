package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkipDecimalsValidation extends StObject {
  
  /**
    * Whether to skip validation of the number of decimals based on the code list customizing; since 1.93.0
    */
  var skipDecimalsValidation: js.UndefOr[Boolean] = js.undefined
}
object SkipDecimalsValidation {
  
  inline def apply(): SkipDecimalsValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkipDecimalsValidation]
  }
  
  extension [Self <: SkipDecimalsValidation](x: Self) {
    
    inline def setSkipDecimalsValidation(value: Boolean): Self = StObject.set(x, "skipDecimalsValidation", value.asInstanceOf[js.Any])
    
    inline def setSkipDecimalsValidationUndefined: Self = StObject.set(x, "skipDecimalsValidation", js.undefined)
  }
}
