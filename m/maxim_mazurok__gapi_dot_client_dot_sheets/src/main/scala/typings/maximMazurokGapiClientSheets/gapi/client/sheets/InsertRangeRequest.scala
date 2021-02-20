package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertRangeRequest extends StObject {
  
  /** The range to insert new cells into. */
  var range: js.UndefOr[GridRange] = js.native
  
  /** The dimension which will be shifted when inserting cells. If ROWS, existing cells will be shifted down. If COLUMNS, existing cells will be shifted right. */
  var shiftDimension: js.UndefOr[String] = js.native
}
object InsertRangeRequest {
  
  @scala.inline
  def apply(): InsertRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertRangeRequest]
  }
  
  @scala.inline
  implicit class InsertRangeRequestMutableBuilder[Self <: InsertRangeRequest] (val x: Self) extends AnyVal {
    
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
