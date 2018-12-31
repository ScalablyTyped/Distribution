package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for how to get the data in a binding.
  *
  * @remarks
  * If the rows option is used, the value must be "thisRow".
  */
trait GetBindingDataOptions extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.undefined
  /**
    * The expected shape of the selection. Use {@link Office.CoercionType} or text value. Default: The original, uncoerced type of the binding.
    */
  var coercionType: js.UndefOr[CoercionType | java.lang.String] = js.undefined
  /**
    * For table or matrix bindings, specifies the number of columns offset from the startColumn. Default is all subsequent columns.
    */
  var columnCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify whether to get only the visible (filtered in) data or all the data (default is all). Useful when filtering data. 
    * Use Office.FilterType or text value.
    */
  var filterType: js.UndefOr[FilterType | java.lang.String] = js.undefined
  /**
    * For table or matrix bindings, specifies the number of rows offset from the startRow. Default is all subsequent rows.
    */
  var rowCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Only for table bindings in content add-ins for Access. Specifies the pre-defined string "thisRow" to get data in the currently selected row.
    */
  var rows: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For table or matrix bindings, specifies the zero-based starting column for a subset of the data in the binding. Default is first column.
    */
  var startColumn: js.UndefOr[scala.Double] = js.undefined
  /**
    * For table or matrix bindings, specifies the zero-based starting row for a subset of the data in the binding. Default is first row.
    */
  var startRow: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies whether values, such as numbers and dates, are returned with their formatting applied. Use Office.ValueFormat or text value. 
    * Default: Unformatted data.
    */
  var valueFormat: js.UndefOr[ValueFormat | java.lang.String] = js.undefined
}

