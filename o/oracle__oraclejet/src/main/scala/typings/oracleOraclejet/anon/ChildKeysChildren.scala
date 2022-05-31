package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.OptionsKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildKeysChildren extends StObject {
  
  var childKeys: js.UndefOr[OptionsKeys] = js.undefined
  
  var children: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object ChildKeysChildren {
  
  inline def apply(): ChildKeysChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildKeysChildren]
  }
  
  extension [Self <: ChildKeysChildren](x: Self) {
    
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
