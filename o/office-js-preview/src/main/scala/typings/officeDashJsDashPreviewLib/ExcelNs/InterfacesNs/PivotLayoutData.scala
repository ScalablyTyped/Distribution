package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "pivotLayout.toJSON()". */
trait PivotLayoutData extends js.Object {
  /**
    *
    * True if the field list should be shown or hidden from the UI.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var enableFieldList: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * This property indicates the PivotLayoutType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var layoutType: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.PivotLayoutType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Compact | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Tabular | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Outline
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
    officeDashJsDashPreviewLib.ExcelNs.SubtotalLocationType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AtTop | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AtBottom | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Off
  ] = js.undefined
}

