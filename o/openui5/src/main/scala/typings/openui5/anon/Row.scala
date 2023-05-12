package typings.openui5.anon

import typings.openui5.sapUiTableRowActionItemMod.RowActionItem
import typings.openui5.sapUiTableRowMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Row extends StObject {
  
  /**
    * The item which was pressed.
    */
  var item: js.UndefOr[RowActionItem] = js.undefined
  
  /**
    * The table row to which the pressed item belongs to.
    */
  var row: js.UndefOr[default] = js.undefined
}
object Row {
  
  inline def apply(): Row = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Row]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Row] (val x: Self) extends AnyVal {
    
    inline def setItem(value: RowActionItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setRow(value: default): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
