package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidthCalculation extends StObject {
  
  /**
    * This object contains all properties and their default values for the column width calculation
    */
  var widthCalculation: js.UndefOr[DefaultWidth] = js.undefined
}
object WidthCalculation {
  
  inline def apply(): WidthCalculation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidthCalculation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WidthCalculation] (val x: Self) extends AnyVal {
    
    inline def setWidthCalculation(value: DefaultWidth): Self = StObject.set(x, "widthCalculation", value.asInstanceOf[js.Any])
    
    inline def setWidthCalculationUndefined: Self = StObject.set(x, "widthCalculation", js.undefined)
  }
}
