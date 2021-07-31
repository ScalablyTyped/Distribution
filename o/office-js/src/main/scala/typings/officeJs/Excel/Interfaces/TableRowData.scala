package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `tableRow.toJSON()`. */
trait TableRowData extends StObject {
  
  /**
    *
    * Returns the index number of the row within the rows collection of the table. Zero-indexed.
    *
    * [Api set: ExcelApi 1.1]
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
}
object TableRowData {
  
  @scala.inline
  def apply(): TableRowData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowData]
  }
  
  @scala.inline
  implicit class TableRowDataMutableBuilder[Self <: TableRowData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
