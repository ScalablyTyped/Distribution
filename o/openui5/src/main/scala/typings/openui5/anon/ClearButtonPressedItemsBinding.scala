package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearButtonPressedItemsBinding extends StObject {
  
  /**
    * Returns if the Clear button is pressed.
    */
  var clearButtonPressed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines the Items binding of the Table Select Dialog. Only available if the items aggregation is bound
    * to a model.
    */
  var itemsBinding: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies the value entered in the search field.
    */
  var value: js.UndefOr[String] = js.undefined
}
object ClearButtonPressedItemsBinding {
  
  inline def apply(): ClearButtonPressedItemsBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearButtonPressedItemsBinding]
  }
  
  extension [Self <: ClearButtonPressedItemsBinding](x: Self) {
    
    inline def setClearButtonPressed(value: Boolean): Self = StObject.set(x, "clearButtonPressed", value.asInstanceOf[js.Any])
    
    inline def setClearButtonPressedUndefined: Self = StObject.set(x, "clearButtonPressed", js.undefined)
    
    inline def setItemsBinding(value: Any): Self = StObject.set(x, "itemsBinding", value.asInstanceOf[js.Any])
    
    inline def setItemsBindingUndefined: Self = StObject.set(x, "itemsBinding", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
