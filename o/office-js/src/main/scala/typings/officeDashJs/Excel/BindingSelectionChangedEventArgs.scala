package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the binding that raised the SelectionChanged event.
  *
  * [Api set: ExcelApi 1.2]
  */
trait BindingSelectionChangedEventArgs extends js.Object {
  /**
    *
    * Gets the Binding object that represents the binding that raised the SelectionChanged event.
    *
    * [Api set: ExcelApi 1.2]
    */
  var binding: Binding
  /**
    *
    * Gets the number of columns selected.
    *
    * [Api set: ExcelApi 1.2]
    */
  var columnCount: Double
  /**
    *
    * Gets the number of rows selected.
    *
    * [Api set: ExcelApi 1.2]
    */
  var rowCount: Double
  /**
    *
    * Gets the index of the first column of the selection (zero-based).
    *
    * [Api set: ExcelApi 1.2]
    */
  var startColumn: Double
  /**
    *
    * Gets the index of the first row of the selection (zero-based).
    *
    * [Api set: ExcelApi 1.2]
    */
  var startRow: Double
}

object BindingSelectionChangedEventArgs {
  @scala.inline
  def apply(binding: Binding, columnCount: Double, rowCount: Double, startColumn: Double, startRow: Double): BindingSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(binding = binding, columnCount = columnCount, rowCount = rowCount, startColumn = startColumn, startRow = startRow)
  
    __obj.asInstanceOf[BindingSelectionChangedEventArgs]
  }
}

