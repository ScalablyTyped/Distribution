package typings.openui5.sapUiTableTableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table$ColumnFreezeEventParameters extends StObject {
  
  /**
    * reference to the column to freeze
    */
  var column: js.UndefOr[typings.openui5.sapUiTableColumnMod.default] = js.undefined
}
object Table$ColumnFreezeEventParameters {
  
  inline def apply(): Table$ColumnFreezeEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table$ColumnFreezeEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Table$ColumnFreezeEventParameters] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: typings.openui5.sapUiTableColumnMod.default): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
  }
}
