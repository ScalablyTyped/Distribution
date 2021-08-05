package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridRange extends StObject {
  
  /** The end column (exclusive) of the range, or not set if unbounded. */
  var endColumnIndex: js.UndefOr[Double] = js.undefined
  
  /** The end row (exclusive) of the range, or not set if unbounded. */
  var endRowIndex: js.UndefOr[Double] = js.undefined
  
  /** The sheet this range is on. */
  var sheetId: js.UndefOr[Double] = js.undefined
  
  /** The start column (inclusive) of the range, or not set if unbounded. */
  var startColumnIndex: js.UndefOr[Double] = js.undefined
  
  /** The start row (inclusive) of the range, or not set if unbounded. */
  var startRowIndex: js.UndefOr[Double] = js.undefined
}
object GridRange {
  
  inline def apply(): GridRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridRange]
  }
  
  extension [Self <: GridRange](x: Self) {
    
    inline def setEndColumnIndex(value: Double): Self = StObject.set(x, "endColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setEndColumnIndexUndefined: Self = StObject.set(x, "endColumnIndex", js.undefined)
    
    inline def setEndRowIndex(value: Double): Self = StObject.set(x, "endRowIndex", value.asInstanceOf[js.Any])
    
    inline def setEndRowIndexUndefined: Self = StObject.set(x, "endRowIndex", js.undefined)
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
    
    inline def setStartColumnIndex(value: Double): Self = StObject.set(x, "startColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setStartColumnIndexUndefined: Self = StObject.set(x, "startColumnIndex", js.undefined)
    
    inline def setStartRowIndex(value: Double): Self = StObject.set(x, "startRowIndex", value.asInstanceOf[js.Any])
    
    inline def setStartRowIndexUndefined: Self = StObject.set(x, "startRowIndex", js.undefined)
  }
}
