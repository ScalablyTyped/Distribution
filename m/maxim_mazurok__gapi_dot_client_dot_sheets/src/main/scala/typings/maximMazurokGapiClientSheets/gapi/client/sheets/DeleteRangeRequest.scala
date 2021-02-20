package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRangeRequest extends StObject {
  
  /** The range of cells to delete. */
  var range: js.UndefOr[GridRange] = js.native
  
  /**
    * The dimension from which deleted cells will be replaced with. If ROWS, existing cells will be shifted upward to replace the deleted cells. If COLUMNS, existing cells will be shifted
    * left to replace the deleted cells.
    */
  var shiftDimension: js.UndefOr[String] = js.native
}
object DeleteRangeRequest {
  
  @scala.inline
  def apply(): DeleteRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRangeRequest]
  }
  
  @scala.inline
  implicit class DeleteRangeRequestMutableBuilder[Self <: DeleteRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setShiftDimension(value: String): Self = StObject.set(x, "shiftDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftDimensionUndefined: Self = StObject.set(x, "shiftDimension", js.undefined)
  }
}
