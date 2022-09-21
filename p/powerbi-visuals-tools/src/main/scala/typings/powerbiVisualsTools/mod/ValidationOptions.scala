package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationOptions extends StObject {
  
  var numberRange: js.UndefOr[NumberRange] = js.undefined
}
object ValidationOptions {
  
  inline def apply(): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptions]
  }
  
  extension [Self <: ValidationOptions](x: Self) {
    
    inline def setNumberRange(value: NumberRange): Self = StObject.set(x, "numberRange", value.asInstanceOf[js.Any])
    
    inline def setNumberRangeUndefined: Self = StObject.set(x, "numberRange", js.undefined)
  }
}
