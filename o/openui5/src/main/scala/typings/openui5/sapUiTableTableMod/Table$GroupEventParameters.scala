package typings.openui5.sapUiTableTableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table$GroupEventParameters extends StObject {
  
  /**
    * grouped column.
    */
  var column: js.UndefOr[typings.openui5.sapUiTableColumnMod.default] = js.undefined
}
object Table$GroupEventParameters {
  
  inline def apply(): Table$GroupEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table$GroupEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Table$GroupEventParameters] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: typings.openui5.sapUiTableColumnMod.default): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
  }
}
