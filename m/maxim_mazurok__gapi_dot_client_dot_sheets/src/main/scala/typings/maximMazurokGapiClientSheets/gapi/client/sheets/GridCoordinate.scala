package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridCoordinate extends StObject {
  
  /** The column index of the coordinate. */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /** The row index of the coordinate. */
  var rowIndex: js.UndefOr[Double] = js.undefined
  
  /** The sheet this coordinate is on. */
  var sheetId: js.UndefOr[Double] = js.undefined
}
object GridCoordinate {
  
  inline def apply(): GridCoordinate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridCoordinate]
  }
  
  extension [Self <: GridCoordinate](x: Self) {
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
