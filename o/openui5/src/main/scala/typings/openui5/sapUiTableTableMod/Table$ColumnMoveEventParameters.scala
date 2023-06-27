package typings.openui5.sapUiTableTableMod

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table$ColumnMoveEventParameters extends StObject {
  
  /**
    * moved column.
    */
  var column: js.UndefOr[typings.openui5.sapUiTableColumnMod.default] = js.undefined
  
  /**
    * new position of the column.
    */
  var newPos: js.UndefOr[int] = js.undefined
}
object Table$ColumnMoveEventParameters {
  
  inline def apply(): Table$ColumnMoveEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table$ColumnMoveEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Table$ColumnMoveEventParameters] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: typings.openui5.sapUiTableColumnMod.default): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setNewPos(value: int): Self = StObject.set(x, "newPos", value.asInstanceOf[js.Any])
    
    inline def setNewPosUndefined: Self = StObject.set(x, "newPos", js.undefined)
  }
}
