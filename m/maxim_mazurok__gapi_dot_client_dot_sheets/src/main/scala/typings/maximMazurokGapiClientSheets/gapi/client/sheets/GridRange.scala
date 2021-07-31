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
  
  @scala.inline
  def apply(): GridRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridRange]
  }
  
  @scala.inline
  implicit class GridRangeMutableBuilder[Self <: GridRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndColumnIndex(value: Double): Self = StObject.set(x, "endColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndColumnIndexUndefined: Self = StObject.set(x, "endColumnIndex", js.undefined)
    
    @scala.inline
    def setEndRowIndex(value: Double): Self = StObject.set(x, "endRowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndRowIndexUndefined: Self = StObject.set(x, "endRowIndex", js.undefined)
    
    @scala.inline
    def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
    
    @scala.inline
    def setStartColumnIndex(value: Double): Self = StObject.set(x, "startColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumnIndexUndefined: Self = StObject.set(x, "startColumnIndex", js.undefined)
    
    @scala.inline
    def setStartRowIndex(value: Double): Self = StObject.set(x, "startRowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRowIndexUndefined: Self = StObject.set(x, "startRowIndex", js.undefined)
  }
}
