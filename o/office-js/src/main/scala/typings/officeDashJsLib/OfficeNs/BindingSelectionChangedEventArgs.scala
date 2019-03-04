package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the binding that raised the SelectionChanged event.
  * 
  * @remarks
  * <table><tr><td>Hosts</td><td>Access, Excel, Word</td></tr></table>
  */
trait BindingSelectionChangedEventArgs extends js.Object {
  /**
    * Gets an {@link Office.Binding} object that represents the binding that raised the SelectionChanged event.
    */
  var binding: Binding
  /**
    * Gets the number of columns selected. If a single cell is selected returns 1. 
    * 
    * If the user makes a non-contiguous selection, the count for the last contiguous selection within the binding is returned. 
    * 
    * For Word, this property will work only for bindings of {@link Office.BindingType} "table". If the binding is of type "matrix", null is 
    * returned. Also, the call will fail if the table contains merged cells, because the structure of the table must be uniform for this property 
    * to work correctly.
    */
  var columnCount: scala.Double
  /**
    * Gets the number of rows selected. If a single cell is selected returns 1. 
    * 
    * If the user makes a non-contiguous selection, the count for the last contiguous selection within the binding is returned. 
    * 
    * For Word, this property will work only for bindings of {@link Office.BindingType} "table". If the binding is of type "matrix", null is 
    * returned. Also, the call will fail if the table contains merged cells, because the structure of the table must be uniform for this property 
    * to work correctly.
    */
  var rowCount: scala.Double
  /**
    * The zero-based index of the first column of the selection counting from the leftmost column in the binding. 
    * 
    * If the user makes a non-contiguous selection, the coordinates for the last contiguous selection within the binding are returned. 
    * 
    * For Word, this property will work only for bindings of {@link Office.BindingType} "table". If the binding is of type "matrix", null is 
    * returned. Also, the call will fail if the table contains merged cells, because the structure of the table must be uniform for this property 
    * to work correctly.
    */
  var startColumn: scala.Double
  /**
    * The zero-based index of the first row of the selection counting from the first row in the binding. 
    * 
    * If the user makes a non-contiguous selection, the coordinates for the last contiguous selection within the binding are returned. 
    * 
    * For Word, this property will work only for bindings of {@link Office.BindingType} "table". If the binding is of type "matrix", null is 
    * returned. Also, the call will fail if the table contains merged cells, because the structure of the table must be uniform for this property 
    * to work correctly.
    */
  var startRow: scala.Double
  /**
    * Gets an {@link Office.EventType} enumeration value that identifies the kind of event that was raised.
    */
  var `type`: EventType
}

object BindingSelectionChangedEventArgs {
  @scala.inline
  def apply(
    binding: Binding,
    columnCount: scala.Double,
    rowCount: scala.Double,
    startColumn: scala.Double,
    startRow: scala.Double,
    `type`: EventType
  ): BindingSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(binding = binding, columnCount = columnCount, rowCount = rowCount, startColumn = startColumn, startRow = startRow)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BindingSelectionChangedEventArgs]
  }
}

