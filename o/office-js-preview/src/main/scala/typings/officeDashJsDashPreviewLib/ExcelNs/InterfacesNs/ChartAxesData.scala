package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartAxes.toJSON()". */
trait ChartAxesData extends js.Object {
  /**
    *
    * Represents the category axis in a chart. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var categoryAxis: js.UndefOr[ChartAxisData] = js.undefined
  /**
    *
    * Represents the series axis of a 3-dimensional chart. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var seriesAxis: js.UndefOr[ChartAxisData] = js.undefined
  /**
    *
    * Represents the value axis in an axis. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var valueAxis: js.UndefOr[ChartAxisData] = js.undefined
}

