package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  var columnCount: scala.Double
  /**
    *
    * Gets the number of rows selected.
    *
    * [Api set: ExcelApi 1.2]
    */
  var rowCount: scala.Double
  /**
    *
    * Gets the index of the first column of the selection (zero-based).
    *
    * [Api set: ExcelApi 1.2]
    */
  var startColumn: scala.Double
  /**
    *
    * Gets the index of the first row of the selection (zero-based).
    *
    * [Api set: ExcelApi 1.2]
    */
  var startRow: scala.Double
}

object BindingSelectionChangedEventArgs {
  @scala.inline
  def apply(
    binding: Binding,
    columnCount: scala.Double,
    rowCount: scala.Double,
    startColumn: scala.Double,
    startRow: scala.Double
  ): BindingSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("binding")(binding)
    __obj.updateDynamic("columnCount")(columnCount)
    __obj.updateDynamic("rowCount")(rowCount)
    __obj.updateDynamic("startColumn")(startColumn)
    __obj.updateDynamic("startRow")(startRow)
    __obj.asInstanceOf[BindingSelectionChangedEventArgs]
  }
}

