package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotLayout object, for use in "pivotLayout.set({ ... })". */

trait PivotLayoutUpdateData extends js.Object {
  /**
               *
               * This property indicates the PivotLayoutType of all fields on the PivotTable. If fields have different states, this will be null.
               *
               * [Api set: ExcelApi 1.8]
               */
  var layoutType: js.UndefOr[
    officeDashJsLib.ExcelNs.PivotLayoutType | officeDashJsLib.officeDashJsLibStrings.Compact | officeDashJsLib.officeDashJsLibStrings.Tabular | officeDashJsLib.officeDashJsLibStrings.Outline
  ] = js.undefined
  /**
               *
               * True if the PivotTable report shows grand totals for columns.
               *
               * [Api set: ExcelApi 1.8]
               */
  var showColumnGrandTotals: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * True if the PivotTable report shows grand totals for rows.
               *
               * [Api set: ExcelApi 1.8]
               */
  var showRowGrandTotals: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * This property indicates the SubtotalLocationType of all fields on the PivotTable. If fields have different states, this will be null.
               *
               * [Api set: ExcelApi 1.8]
               */
  var subtotalLocation: js.UndefOr[
    officeDashJsLib.ExcelNs.SubtotalLocationType | officeDashJsLib.officeDashJsLibStrings.AtTop | officeDashJsLib.officeDashJsLibStrings.AtBottom | officeDashJsLib.officeDashJsLibStrings.Off
  ] = js.undefined
}

