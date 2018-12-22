package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartPivotOptions.toJSON()". */

trait ChartPivotOptionsData extends js.Object {
  /**
               *
               * Represents whether to display axis field buttons on a PivotChart.
              The ShowAxisFieldButtons property corresponds to the Show Axis Field Buttons command on the Field Buttons drop-down list of the Analyze tab, which is available when a PivotChart is selected.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var showAxisFieldButtons: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents whether to display legend field buttons on a PivotChart.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var showLegendFieldButtons: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents whether to display report filter field buttons on a PivotChart.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var showReportFilterFieldButtons: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents whether to display show value field buttons on a PivotChart.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var showValueFieldButtons: js.UndefOr[scala.Boolean] = js.undefined
}

