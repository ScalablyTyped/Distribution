package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.OptionsKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildKeys extends StObject {
  
  var childKeys: js.UndefOr[OptionsKeys] = js.undefined
  
  var children: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object ChildKeys {
  
  inline def apply(): ChildKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildKeys] (val x: Self) extends AnyVal {
    
    inline def setChildKeys(value: OptionsKeys): Self = StObject.set(x, "childKeys", value.asInstanceOf[js.Any])
    
    inline def setChildKeysUndefined: Self = StObject.set(x, "childKeys", js.undefined)
    
    inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
