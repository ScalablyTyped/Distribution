package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the selection that raised the "SelectionChanged" event.
  
  **Note**: If multiple, discontiguous cells are selected, `Binding.onSelectionChanged` only reports row and column information for one selection. Use `Worksheet.onSelectionChanged` for multiple selected ranges.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait BindingSelectionChangedEventArgs extends js.Object {
  /**
    *
    * Gets a temporary `Binding` object that contains the ID of the `Binding` object that raised the event. 
    * Use that ID with `BindingCollection.getItem(id)` to get the binding.
    *
    * [Api set: ExcelApi 1.2]
    */
  var binding: Binding = js.native
  /**
    *
    * Gets the number of columns selected.
    *
    * [Api set: ExcelApi 1.2]
    */
  var columnCount: Double = js.native
  /**
    *
    * Gets the number of rows selected.
    *
    * [Api set: ExcelApi 1.2]
    */
  var rowCount: Double = js.native
  /**
    *
    * Gets the index of the first column of the selection (zero-based).
    *
    * [Api set: ExcelApi 1.2]
    */
  var startColumn: Double = js.native
  /**
    *
    * Gets the index of the first row of the selection (zero-based).
    *
    * [Api set: ExcelApi 1.2]
    */
  var startRow: Double = js.native
}

object BindingSelectionChangedEventArgs {
  @scala.inline
  def apply(binding: Binding, columnCount: Double, rowCount: Double, startColumn: Double, startRow: Double): BindingSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any])
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
  }
  
}

