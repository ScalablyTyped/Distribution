package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.dropdown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownWidget
  extends StObject
     with WidgetBase
     with Widget {
  
  var items: js.UndefOr[js.Array[String]] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  
  var selectedIndex: js.UndefOr[Double] = js.undefined
  
  var `type`: dropdown
}
object DropdownWidget {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): DropdownWidget = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dropdown")
    __obj.asInstanceOf[DropdownWidget]
  }
  
  extension [Self <: DropdownWidget](x: Self) {
    
    inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setOnChange(value: /* index */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
    
    inline def setType(value: dropdown): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
