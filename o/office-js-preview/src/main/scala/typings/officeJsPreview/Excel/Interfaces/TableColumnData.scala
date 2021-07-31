package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `tableColumn.toJSON()`. */
trait TableColumnData extends StObject {
  
  /**
    *
    * Retrieve the filter applied to the column.
    *
    * [Api set: ExcelApi 1.2]
    */
  var filter: js.UndefOr[FilterData] = js.undefined
  
  /**
    *
    * Returns a unique key that identifies the column within the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Returns the index number of the column within the columns collection of the table. Zero-indexed.
    *
    * [Api set: ExcelApi 1.1]
    */
  var index: js.UndefOr[Double] = js.undefined
  
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
object TableColumnData {
  
  @scala.inline
  def apply(): TableColumnData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableColumnData]
  }
  
  @scala.inline
  implicit class TableColumnDataMutableBuilder[Self <: TableColumnData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: FilterData): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
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
