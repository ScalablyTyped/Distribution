package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertTableColumnsRequest extends StObject {
  
  /**
    * The reference table cell location from which columns will be inserted. A new column will be inserted to the left (or right) of the column where the reference cell is. If the
    * reference cell is a merged cell, a new column will be inserted to the left (or right) of the merged cell.
    */
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  
  /** Whether to insert new columns to the right of the reference cell location. - `True`: insert to the right. - `False`: insert to the left. */
  var insertRight: js.UndefOr[Boolean] = js.undefined
  
  /** The number of columns to be inserted. Maximum 20 per request. */
  var number: js.UndefOr[Double] = js.undefined
  
  /** The table to insert columns into. */
  var tableObjectId: js.UndefOr[String] = js.undefined
}
object InsertTableColumnsRequest {
  
  inline def apply(): InsertTableColumnsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertTableColumnsRequest]
  }
  
  extension [Self <: InsertTableColumnsRequest](x: Self) {
    
    inline def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
    
    inline def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
    
    inline def setInsertRight(value: Boolean): Self = StObject.set(x, "insertRight", value.asInstanceOf[js.Any])
    
    inline def setInsertRightUndefined: Self = StObject.set(x, "insertRight", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setTableObjectId(value: String): Self = StObject.set(x, "tableObjectId", value.asInstanceOf[js.Any])
    
    inline def setTableObjectIdUndefined: Self = StObject.set(x, "tableObjectId", js.undefined)
  }
}
