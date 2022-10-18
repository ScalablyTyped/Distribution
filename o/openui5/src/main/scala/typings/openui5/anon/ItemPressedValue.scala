package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemPressedValue extends StObject {
  
  /**
    * Indicates whether the change event was caused by selecting an item in the list
    */
  var itemPressed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The new `value` of the `control`
    */
  var value: js.UndefOr[String] = js.undefined
}
object ItemPressedValue {
  
  inline def apply(): ItemPressedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemPressedValue]
  }
  
  extension [Self <: ItemPressedValue](x: Self) {
    
    inline def setItemPressed(value: Boolean): Self = StObject.set(x, "itemPressed", value.asInstanceOf[js.Any])
    
    inline def setItemPressedUndefined: Self = StObject.set(x, "itemPressed", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
