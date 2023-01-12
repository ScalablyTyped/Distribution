package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.textbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextBoxWidget
  extends StObject
     with WidgetBase
     with Widget {
  
  var maxLength: js.UndefOr[Double] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var `type`: textbox
}
object TextBoxWidget {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): TextBoxWidget = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("textbox")
    __obj.asInstanceOf[TextBoxWidget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextBoxWidget] (val x: Self) extends AnyVal {
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setOnChange(value: /* text */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: textbox): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
