package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TableColumn object, for use in `tableColumn.set({ ... })`. */
trait TableColumnUpdateData extends StObject {
  
  /**
    *
    * Specifies the name of the table column.
    *
    * [Api set: ExcelApi 1.1 for getting the name; 1.4 for setting it.]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
}
object TableColumnUpdateData {
  
  @scala.inline
  def apply(): TableColumnUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableColumnUpdateData]
  }
  
  @scala.inline
  implicit class TableColumnUpdateDataMutableBuilder[Self <: TableColumnUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
