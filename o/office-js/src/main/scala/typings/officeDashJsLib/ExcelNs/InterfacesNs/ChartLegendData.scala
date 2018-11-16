package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartLegend.toJSON()". */

trait ChartLegendData extends js.Object {
  /**
              *
              * Represents the formatting of a chart legend, which includes fill and font formatting. Read-only.
              *
              * [Api set: ExcelApi 1.1]
              */
  var format: js.UndefOr[ChartLegendFormatData] = js.undefined
  /**
               *
               * Represents the height, in points, of the legend on the chart. Null if legend is not visible.
               *
               * [Api set: ExcelApi 1.7]
               */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the left, in points, of a chart legend. Null if legend is not visible.
               *
               * [Api set: ExcelApi 1.7]
               */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
              *
              * Represents a collection of legendEntries in the legend. Read-only.
              *
              * [Api set: ExcelApi 1.7]
              */
  var legendEntries: js.UndefOr[js.Array[ChartLegendEntryData]] = js.undefined
  /**
               *
               * Boolean value for whether the chart legend should overlap with the main body of the chart.
               *
               * [Api set: ExcelApi 1.1]
               */
  var overlay: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the position of the legend on the chart. See Excel.ChartLegendPosition for details.
               *
               * [Api set: ExcelApi 1.1]
               */
  var position: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartLegendPosition | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Bottom | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Corner | officeDashJsLib.officeDashJsLibStrings.Custom
  ] = js.undefined
  /**
               *
               * Represents if the legend has a shadow on the chart.
               *
               * [Api set: ExcelApi 1.7]
               */
  var showShadow: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the top of a chart legend.
               *
               * [Api set: ExcelApi 1.7]
               */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * A boolean value the represents the visibility of a ChartLegend object.
               *
               * [Api set: ExcelApi 1.1]
               */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the width, in points, of the legend on the chart. Null if legend is not visible.
               *
               * [Api set: ExcelApi 1.7]
               */
  var width: js.UndefOr[scala.Double] = js.undefined
}

