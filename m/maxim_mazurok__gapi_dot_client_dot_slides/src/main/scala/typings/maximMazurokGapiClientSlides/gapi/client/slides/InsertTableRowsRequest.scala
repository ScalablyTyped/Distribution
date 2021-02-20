package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertTableRowsRequest extends StObject {
  
  /**
    * The reference table cell location from which rows will be inserted. A new row will be inserted above (or below) the row where the reference cell is. If the reference cell is a
    * merged cell, a new row will be inserted above (or below) the merged cell.
    */
  var cellLocation: js.UndefOr[TableCellLocation] = js.native
  
  /** Whether to insert new rows below the reference cell location. - `True`: insert below the cell. - `False`: insert above the cell. */
  var insertBelow: js.UndefOr[Boolean] = js.native
  
  /** The number of rows to be inserted. Maximum 20 per request. */
  var number: js.UndefOr[Double] = js.native
  
  /** The table to insert rows into. */
  var tableObjectId: js.UndefOr[String] = js.native
}
object InsertTableRowsRequest {
  
  @scala.inline
  def apply(): InsertTableRowsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertTableRowsRequest]
  }
  
  @scala.inline
  implicit class InsertTableRowsRequestMutableBuilder[Self <: InsertTableRowsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
    
    @scala.inline
    def setInsertBelow(value: Boolean): Self = StObject.set(x, "insertBelow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertBelowUndefined: Self = StObject.set(x, "insertBelow", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setTableObjectId(value: String): Self = StObject.set(x, "tableObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableObjectIdUndefined: Self = StObject.set(x, "tableObjectId", js.undefined)
  }
}
