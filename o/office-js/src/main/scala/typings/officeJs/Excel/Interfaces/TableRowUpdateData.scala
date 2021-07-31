package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TableRow object, for use in `tableRow.set({ ... })`. */
trait TableRowUpdateData extends StObject {
  
  /**
    *
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
}
object TableRowUpdateData {
  
  @scala.inline
  def apply(): TableRowUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowUpdateData]
  }
  
  @scala.inline
  implicit class TableRowUpdateDataMutableBuilder[Self <: TableRowUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
