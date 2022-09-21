package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.colourpicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColourPickerWidget
  extends StObject
     with WidgetBase
     with Widget {
  
  var colour: js.UndefOr[Double] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* colour */ Double, Unit]] = js.undefined
  
  var `type`: colourpicker
}
object ColourPickerWidget {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): ColourPickerWidget = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("colourpicker")
    __obj.asInstanceOf[ColourPickerWidget]
  }
  
  extension [Self <: ColourPickerWidget](x: Self) {
    
    inline def setColour(value: Double): Self = StObject.set(x, "colour", value.asInstanceOf[js.Any])
    
    inline def setColourUndefined: Self = StObject.set(x, "colour", js.undefined)
    
    inline def setOnChange(value: /* colour */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setType(value: colourpicker): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
