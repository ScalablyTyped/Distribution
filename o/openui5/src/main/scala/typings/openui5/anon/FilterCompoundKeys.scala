package typings.openui5.anon

import typings.openui5.sapMViewSettingsItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterCompoundKeys extends StObject {
  
  /**
    * The selected filter items in an object notation format: { parentKey: { key: boolean, key2: boolean, ...
    * }, ...}. If a custom control filter was displayed (for example, the user clicked on the filter item),
    * the value for its key is set to true to indicate that there has been an interaction with the control.
    */
  var filterCompoundKeys: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The selected filters in an array of ViewSettingsItem.
    */
  var filterItems: js.UndefOr[js.Array[default]] = js.undefined
  
  /**
    * The selected filter items in an object notation format: { key: boolean }. If a custom control filter
    * was displayed (for example, the user clicked on the filter item), the value for its key is set to true
    * to indicate that there has been an interaction with the control.
    */
  var filterKeys: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The selected filter items in a string format to display in the control's header bar in format "Filtered
    * by: key (subkey1, subkey2, subkey3)".
    */
  var filterString: js.UndefOr[String] = js.undefined
  
  /**
    * The selected group order (true = descending, false = ascending).
    */
  var groupDescending: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The selected group item.
    */
  var groupItem: js.UndefOr[default] = js.undefined
  
  /**
    * The selected preset filter item.
    */
  var presetFilterItem: js.UndefOr[default] = js.undefined
  
  /**
    * The selected sort order (true = descending, false = ascending).
    */
  var sortDescending: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The selected sort item.
    */
  var sortItem: js.UndefOr[default] = js.undefined
}
object FilterCompoundKeys {
  
  inline def apply(): FilterCompoundKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterCompoundKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterCompoundKeys] (val x: Self) extends AnyVal {
    
    inline def setFilterCompoundKeys(value: js.Object): Self = StObject.set(x, "filterCompoundKeys", value.asInstanceOf[js.Any])
    
    inline def setFilterCompoundKeysUndefined: Self = StObject.set(x, "filterCompoundKeys", js.undefined)
    
    inline def setFilterItems(value: js.Array[default]): Self = StObject.set(x, "filterItems", value.asInstanceOf[js.Any])
    
    inline def setFilterItemsUndefined: Self = StObject.set(x, "filterItems", js.undefined)
    
    inline def setFilterItemsVarargs(value: default*): Self = StObject.set(x, "filterItems", js.Array(value*))
    
    inline def setFilterKeys(value: js.Object): Self = StObject.set(x, "filterKeys", value.asInstanceOf[js.Any])
    
    inline def setFilterKeysUndefined: Self = StObject.set(x, "filterKeys", js.undefined)
    
    inline def setFilterString(value: String): Self = StObject.set(x, "filterString", value.asInstanceOf[js.Any])
    
    inline def setFilterStringUndefined: Self = StObject.set(x, "filterString", js.undefined)
    
    inline def setGroupDescending(value: Boolean): Self = StObject.set(x, "groupDescending", value.asInstanceOf[js.Any])
    
    inline def setGroupDescendingUndefined: Self = StObject.set(x, "groupDescending", js.undefined)
    
    inline def setGroupItem(value: default): Self = StObject.set(x, "groupItem", value.asInstanceOf[js.Any])
    
    inline def setGroupItemUndefined: Self = StObject.set(x, "groupItem", js.undefined)
    
    inline def setPresetFilterItem(value: default): Self = StObject.set(x, "presetFilterItem", value.asInstanceOf[js.Any])
    
    inline def setPresetFilterItemUndefined: Self = StObject.set(x, "presetFilterItem", js.undefined)
    
    inline def setSortDescending(value: Boolean): Self = StObject.set(x, "sortDescending", value.asInstanceOf[js.Any])
    
    inline def setSortDescendingUndefined: Self = StObject.set(x, "sortDescending", js.undefined)
    
    inline def setSortItem(value: default): Self = StObject.set(x, "sortItem", value.asInstanceOf[js.Any])
    
    inline def setSortItemUndefined: Self = StObject.set(x, "sortItem", js.undefined)
  }
}
