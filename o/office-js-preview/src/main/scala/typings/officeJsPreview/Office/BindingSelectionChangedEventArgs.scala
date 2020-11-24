package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the binding that raised the SelectionChanged event.
  */
@js.native
trait BindingSelectionChangedEventArgs extends js.Object {
  
  /**
    * Gets an {@link Office.Binding} object that represents the binding that raised the SelectionChanged event.
    */
  var binding: Binding = js.native
  
  /**
    * Gets the number of columns selected. If a single cell is selected returns 1.
    *
    * If the user makes a non-contiguous selection, the count for the last contiguous selection within the binding is returned.
    *
    * For Word, this property will work only for bindings of {@link Office.BindingType} "table". If the binding is of type "matrix", null is
    * returned. Also, the call will fail if the table contains merged cells, because the structure of the table must be uniform for this property
    * to work correctly.
    */
  var columnCount: Double = js.native
  
  /**
    * Gets the number of rows selected. If a single cell is selected returns 1.
    *
    * If the user makes a non-contiguous selection, the count for the last contiguous selection within the binding is returned.
    *
    * For Word, this property will work only for bindings of {@link Office.BindingType} "table". If the binding is of type "matrix", null is
    * returned. Also, the call will fail if the table contains merged cells, because the structure of the table must be uniform for this property
    * to work correctly.
    */
  var rowCount: Double = js.native
  
  /**
    * The zero-based index of the first column of the selection counting from the leftmost column in the binding.
    *
    * If the user makes a non-contiguous selection, the coordinates for the last contiguous selection within the binding are returned.
    *
    * For Word, this property will work only for bindings of {@link Office.BindingType} "table". If the binding is of type "matrix", null is
    * returned. Also, the call will fail if the table contains merged cells, because the structure of the table must be uniform for this property
    * to work correctly.
    */
  var startColumn: Double = js.native
  
  /**
    * The zero-based index of the first row of the selection counting from the first row in the binding.
    *
    * If the user makes a non-contiguous selection, the coordinates for the last contiguous selection within the binding are returned.
    *
    * For Word, this property will work only for bindings of {@link Office.BindingType} "table". If the binding is of type "matrix", null is
    * returned. Also, the call will fail if the table contains merged cells, because the structure of the table must be uniform for this property
    * to work correctly.
    */
  var startRow: Double = js.native
  
  /**
    * Gets an {@link Office.EventType} enumeration value that identifies the kind of event that was raised.
    */
  var `type`: EventType = js.native
}
object BindingSelectionChangedEventArgs {
  
  @scala.inline
  def apply(
    binding: Binding,
    columnCount: Double,
    rowCount: Double,
    startColumn: Double,
    startRow: Double,
    `type`: EventType
  ): BindingSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingSelectionChangedEventArgs]
  }
  
  @scala.inline
  implicit class BindingSelectionChangedEventArgsOps[Self <: BindingSelectionChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBinding(value: Binding): Self = this.set("binding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnCount(value: Double): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumn(value: Double): Self = this.set("startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRow(value: Double): Self = this.set("startRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: EventType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
