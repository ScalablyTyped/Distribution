package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies a cell, or row, or column, by its zero-based row and/or column number. Example: `{row: 3, column: 4}` specifies the cell in the 3rd 
  * (zero-based) row in the 4th (zero-based) column.
  */
trait RangeCoordinates extends StObject {
  
  /**
    * The zero-based column of the range. If not specified, all cells, in the row specified by `row` are included.
    */
  var column: js.UndefOr[Double] = js.undefined
  
  /**
    * The zero-based row of the range. If not specified, all cells, in the column specified by `column` are included.
    */
  var row: js.UndefOr[Double] = js.undefined
}
object RangeCoordinates {
  
  @scala.inline
  def apply(): RangeCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeCoordinates]
  }
  
  @scala.inline
  implicit class RangeCoordinatesMutableBuilder[Self <: RangeCoordinates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
