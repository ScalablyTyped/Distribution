package typings.openui5.sapUiTableTableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table$CustomFilterEventParameters extends StObject {
  
  /**
    * The column instance on which the custom filter button was pressed.
    */
  var column: js.UndefOr[typings.openui5.sapUiTableColumnMod.default] = js.undefined
  
  /**
    * Filter value.
    */
  var value: js.UndefOr[String] = js.undefined
}
object Table$CustomFilterEventParameters {
  
  inline def apply(): Table$CustomFilterEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table$CustomFilterEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Table$CustomFilterEventParameters] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: typings.openui5.sapUiTableColumnMod.default): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
