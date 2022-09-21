package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelWidget
  extends StObject
     with WidgetBase
     with Widget {
  
  var onChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var textAlign: js.UndefOr[TextAlignment] = js.undefined
  
  var `type`: label
}
object LabelWidget {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): LabelWidget = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("label")
    __obj.asInstanceOf[LabelWidget]
  }
  
  extension [Self <: LabelWidget](x: Self) {
    
    inline def setOnChange(value: /* index */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: TextAlignment): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: label): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
