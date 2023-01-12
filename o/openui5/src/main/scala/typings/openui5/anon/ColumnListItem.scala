package typings.openui5.anon

import typings.openui5.sapMColumnMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnListItem extends StObject {
  
  /**
    * Column in which the context menu was opened. **Note:** This parameter might be undefined for the items
    * that are not part of a column definition.
    */
  var column: js.UndefOr[default] = js.undefined
  
  /**
    * Item in which the context menu was opened.
    */
  var listItem: js.UndefOr[typings.openui5.sapMColumnListItemMod.default] = js.undefined
}
object ColumnListItem {
  
  inline def apply(): ColumnListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnListItem] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: default): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setListItem(value: typings.openui5.sapMColumnListItemMod.default): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
    
    inline def setListItemUndefined: Self = StObject.set(x, "listItem", js.undefined)
  }
}
