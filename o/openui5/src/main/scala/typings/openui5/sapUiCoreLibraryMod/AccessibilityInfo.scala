package typings.openui5.sapUiCoreLibraryMod

import typings.openui5.sapUiCoreElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityInfo extends StObject {
  
  /**
    * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * A list of elements or controls that are aggregated by the given control (e.g. when the control is a layout).
    * Primitive values in the list will be ignored. **Note:** Children should only be provided when it is helpful
    * to understand the accessibility context (e.g. a form control shouldn`t provide details of its internals
    * (fields, labels, ...) but a layout should).
    */
  var children: js.UndefOr[js.Array[default]] = js.undefined
  
  /**
    * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * Describes the most relevant control state (e.g. the input's value) - it should be a translated text.
    * **Note:** The type and the enabled/editable state shouldn`t be handled here.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * Whether the control is editable. If not relevant, it shouldn`t be set or `null` can be provided.
    */
  var editable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * Whether the control is enabled. If not relevant, it shouldn`t be set or `null` can be provided.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * Whether the control can get the focus.
    */
  var focusable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * Whether the control is readonly. If not relevant, it shouldn`t be set or `null` can be provided.
    */
  var readonly: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * The WAI-ARIA role which is implemented by the control.
    */
  var role: js.UndefOr[String] = js.undefined
  
  /**
    * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * A translated text that represents the control type. Might correlate with the role.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object AccessibilityInfo {
  
  inline def apply(): AccessibilityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibilityInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessibilityInfo] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[default]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: default*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableNull: Self = StObject.set(x, "editable", null)
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
