package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartAxes object, for use in "chartAxes.set({ ... })". */

trait ChartAxesUpdateData extends js.Object {
  /**
              *
              * Represents the category axis in a chart.
              *
              * [Api set: ExcelApi 1.1]
              */
  var categoryAxis: js.UndefOr[ChartAxisUpdateData] = js.undefined
  /**
              *
              * Represents the series axis of a 3-dimensional chart.
              *
              * [Api set: ExcelApi 1.1]
              */
  var seriesAxis: js.UndefOr[ChartAxisUpdateData] = js.undefined
  /**
              *
              * Represents the value axis in an axis.
              *
              * [Api set: ExcelApi 1.1]
              */
  var valueAxis: js.UndefOr[ChartAxisUpdateData] = js.undefined
}

