package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCellLocation extends StObject {
  
  /** The 0-based column index. */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /** The 0-based row index. */
  var rowIndex: js.UndefOr[Double] = js.undefined
}
object TableCellLocation {
  
  inline def apply(): TableCellLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableCellLocation] (val x: Self) extends AnyVal {
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
