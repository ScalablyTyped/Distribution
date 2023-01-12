package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.checkbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckboxWidget
  extends StObject
     with WidgetBase
     with Widget {
  
  var isChecked: js.UndefOr[Boolean] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* isChecked */ Boolean, Unit]] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var `type`: checkbox
}
object CheckboxWidget {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): CheckboxWidget = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("checkbox")
    __obj.asInstanceOf[CheckboxWidget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckboxWidget] (val x: Self) extends AnyVal {
    
    inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
    
    inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
    
    inline def setOnChange(value: /* isChecked */ Boolean => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: checkbox): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
