package typings.openui5.sapUiTableTableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table$FilterEventParameters extends StObject {
  
  /**
    * filtered column.
    */
  var column: js.UndefOr[typings.openui5.sapUiTableColumnMod.default] = js.undefined
  
  /**
    * filter value.
    */
  var value: js.UndefOr[String] = js.undefined
}
object Table$FilterEventParameters {
  
  inline def apply(): Table$FilterEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table$FilterEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Table$FilterEventParameters] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: typings.openui5.sapUiTableColumnMod.default): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
