package typings.openui5.sapUiTableTableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table$ColumnSelectEventParameters extends StObject {
  
  /**
    * reference to the selected column
    */
  var column: js.UndefOr[typings.openui5.sapUiTableColumnMod.default] = js.undefined
}
object Table$ColumnSelectEventParameters {
  
  inline def apply(): Table$ColumnSelectEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table$ColumnSelectEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Table$ColumnSelectEventParameters] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: typings.openui5.sapUiTableColumnMod.default): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
  }
}
