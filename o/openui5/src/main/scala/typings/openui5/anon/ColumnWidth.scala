package typings.openui5.anon

import typings.openui5.sapUiCoreElementMod.default
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnWidth extends StObject {
  
  /**
    * The column being resized.
    */
  var column: js.UndefOr[default] = js.undefined
  
  /**
    * The new width of the column.
    */
  var width: js.UndefOr[CSSSize] = js.undefined
}
object ColumnWidth {
  
  inline def apply(): ColumnWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnWidth]
  }
  
  extension [Self <: ColumnWidth](x: Self) {
    
    inline def setColumn(value: default): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setWidth(value: CSSSize): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
