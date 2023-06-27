package typings.openui5.sapUiTableTableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table$ColumnVisibilityEventParameters extends StObject {
  
  /**
    * affected column.
    */
  var column: js.UndefOr[typings.openui5.sapUiTableColumnMod.default] = js.undefined
  
  /**
    * new value of the visible property.
    */
  var newVisible: js.UndefOr[Boolean] = js.undefined
}
object Table$ColumnVisibilityEventParameters {
  
  inline def apply(): Table$ColumnVisibilityEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table$ColumnVisibilityEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Table$ColumnVisibilityEventParameters] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: typings.openui5.sapUiTableColumnMod.default): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setNewVisible(value: Boolean): Self = StObject.set(x, "newVisible", value.asInstanceOf[js.Any])
    
    inline def setNewVisibleUndefined: Self = StObject.set(x, "newVisible", js.undefined)
  }
}
