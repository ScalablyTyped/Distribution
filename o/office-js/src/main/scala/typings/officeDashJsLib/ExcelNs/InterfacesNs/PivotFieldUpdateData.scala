package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotField object, for use in "pivotField.set({ ... })". */

trait PivotFieldUpdateData extends js.Object {
  /**
               *
               * Name of the PivotField.
               *
               * [Api set: ExcelApi 1.8]
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Determines whether to show all items of the PivotField.
               *
               * [Api set: ExcelApi 1.8]
               */
  var showAllItems: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Subtotals of the PivotField.
               *
               * [Api set: ExcelApi 1.8]
               */
  var subtotals: js.UndefOr[officeDashJsLib.ExcelNs.Subtotals] = js.undefined
}

