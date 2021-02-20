package typings.nwJs.mod.global.NWJSHelpers

import typings.nwJs.mod.global.nw.Menu
import typings.nwJs.nwJsStrings.checkbox
import typings.nwJs.nwJsStrings.normal
import typings.nwJs.nwJsStrings.separator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for MenuItem.
  */
@js.native
trait MenuItemOption extends StObject {
  
  /**
    * {boolean} (Optional) Whether the checkbox is checked or not. It"s set to false by default.
    */
  var checked: js.UndefOr[Boolean] = js.native
  
  /**
    * {Function} (Optional) The callback function when item is triggered by mouse click or keyboard shortcut
    */
  var click: js.UndefOr[js.Function] = js.native
  
  /**
    * {boolean} (Optional) Whether the item is enabled or disabled. It"s set to true by default.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * {string} (Optional) Icon for normal item or checkbox
    */
  var icon: js.UndefOr[String] = js.native
  
  /**
    * {string} (Optional) The key of the shortcut
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * {string} (Optional) Label for normal item or checkbox
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * {string} (Optional) The modifiers of the shortcut
    */
  var modifiers: js.UndefOr[String] = js.native
  
  /**
    * {nw.Menu} (Optional) A submenu
    */
  var submenu: js.UndefOr[Menu] = js.native
  
  /**
    * {string} (Optional) Tooltip for normal item or checkbox
    */
  var tooltip: js.UndefOr[String] = js.native
  
  /**
    * {string} (Optional) The type of the item. Three types are accepted: normal, checkbox, separator
    */
  var `type`: js.UndefOr[String | normal | checkbox | separator] = js.native
}
object MenuItemOption {
  
  @scala.inline
  def apply(): MenuItemOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemOption]
  }
  
  @scala.inline
  implicit class MenuItemOptionMutableBuilder[Self <: MenuItemOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setClick(value: js.Function): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setModifiers(value: String): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    @scala.inline
    def setSubmenu(value: Menu): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setType(value: String | normal | checkbox | separator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
