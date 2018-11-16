package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "pivotField.toJSON()". */

trait PivotFieldData extends js.Object {
  /**
               *
               * Id of the PivotField.
               *
               * [Api set: ExcelApi 1.8]
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
              *
              * Returns the PivotFields associated with the PivotField.
              *
              * [Api set: ExcelApi 1.8]
              */
  var items: js.UndefOr[js.Array[PivotItemData]] = js.undefined
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

