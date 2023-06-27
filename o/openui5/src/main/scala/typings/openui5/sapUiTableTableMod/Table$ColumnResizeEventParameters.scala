package typings.openui5.sapUiTableTableMod

import typings.openui5.sapUiCoreLibraryMod.CSSSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table$ColumnResizeEventParameters extends StObject {
  
  /**
    * resized column.
    */
  var column: js.UndefOr[typings.openui5.sapUiTableColumnMod.default] = js.undefined
  
  /**
    * new width of the table column as CSS Size definition.
    */
  var width: js.UndefOr[CSSSize] = js.undefined
}
object Table$ColumnResizeEventParameters {
  
  inline def apply(): Table$ColumnResizeEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table$ColumnResizeEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Table$ColumnResizeEventParameters] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: typings.openui5.sapUiTableColumnMod.default): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setWidth(value: CSSSize): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
