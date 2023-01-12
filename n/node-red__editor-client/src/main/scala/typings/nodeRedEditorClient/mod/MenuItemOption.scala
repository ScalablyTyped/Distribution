package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItemOption extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var group: js.UndefOr[Boolean] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var onselect: js.UndefOr[String | (js.Function1[/* repeated */ Any, Unit])] = js.undefined
  
  var options: js.UndefOr[js.Array[MenuItemOption | Null]] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var setting: js.UndefOr[String] = js.undefined
  
  var sublabel: js.UndefOr[String] = js.undefined
  
  var toggle: js.UndefOr[Boolean] = js.undefined
}
object MenuItemOption {
  
  inline def apply(): MenuItemOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuItemOption] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOnselect(value: String | (js.Function1[/* repeated */ Any, Unit])): Self = StObject.set(x, "onselect", value.asInstanceOf[js.Any])
    
    inline def setOnselectFunction1(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onselect", js.Any.fromFunction1(value))
    
    inline def setOnselectUndefined: Self = StObject.set(x, "onselect", js.undefined)
    
    inline def setOptions(value: js.Array[MenuItemOption | Null]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: (MenuItemOption | Null)*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSetting(value: String): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
    
    inline def setSettingUndefined: Self = StObject.set(x, "setting", js.undefined)
    
    inline def setSublabel(value: String): Self = StObject.set(x, "sublabel", value.asInstanceOf[js.Any])
    
    inline def setSublabelUndefined: Self = StObject.set(x, "sublabel", js.undefined)
    
    inline def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}
