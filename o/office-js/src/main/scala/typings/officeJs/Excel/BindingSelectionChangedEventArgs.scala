package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the selection that raised the selection changed event.
  
  **Note**: If multiple, discontiguous cells are selected, `Binding.onSelectionChanged` only reports row and column information for one selection. Use `Worksheet.onSelectionChanged` for multiple selected ranges.
  *
  * @remarks
  * [Api set: ExcelApi 1.2]
  */
trait BindingSelectionChangedEventArgs extends StObject {
  
  /**
    * Gets a temporary `Binding` object that contains the ID of the `Binding` object that raised the event. Use that ID with `BindingCollection.getItem(id)` to get the binding.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var binding: Binding
  
  /**
    * Gets the number of columns selected.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var columnCount: Double
  
  /**
    * Gets the number of rows selected.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var rowCount: Double
  
  /**
    * Gets the index of the first column of the selection (zero-based).
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var startColumn: Double
  
  /**
    * Gets the index of the first row of the selection (zero-based).
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var startRow: Double
}
object BindingSelectionChangedEventArgs {
  
  inline def apply(binding: Binding, columnCount: Double, rowCount: Double, startColumn: Double, startRow: Double): BindingSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingSelectionChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BindingSelectionChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setBinding(value: Binding): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    inline def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
  }
}
