package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartTitle.toJSON()". */

trait ChartTitleData extends js.Object {
  /**
              *
              * Represents the formatting of a chart title, which includes fill and font formatting. Read-only.
              *
              * [Api set: ExcelApi 1.1]
              */
  var format: js.UndefOr[ChartTitleFormatData] = js.undefined
  /**
               *
               * Returns the height, in points, of the chart title. Null if chart title is not visible. Read-only.
               *
               * [Api set: ExcelApi 1.7]
               */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the horizontal alignment for chart title.
               *
               * [Api set: ExcelApi 1.7]
               */
  var horizontalAlignment: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartTextHorizontalAlignment | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.Distributed
  ] = js.undefined
  /**
               *
               * Represents the distance, in points, from the left edge of chart title to the left edge of chart area. Null if chart title is not visible.
               *
               * [Api set: ExcelApi 1.7]
               */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Boolean value representing if the chart title will overlay the chart or not.
               *
               * [Api set: ExcelApi 1.1]
               */
  var overlay: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the position of chart title. See Excel.ChartTitlePosition for details.
               *
               * [Api set: ExcelApi 1.7]
               */
  var position: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartTitlePosition | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Bottom | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Right
  ] = js.undefined
  /**
               *
               * Represents a boolean value that determines if the chart title has a shadow.
               *
               * [Api set: ExcelApi 1.7]
               */
  var showShadow: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the title text of a chart.
               *
               * [Api set: ExcelApi 1.1]
               */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Represents the text orientation of chart title. The value should be an integer either from -90 to 90, or 180 for vertically-oriented text.
               *
               * [Api set: ExcelApi 1.7]
               */
  var textOrientation: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the distance, in points, from the top edge of chart title to the top of chart area. Null if chart title is not visible.
               *
               * [Api set: ExcelApi 1.7]
               */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the vertical alignment of chart title. See Excel.ChartTextVerticalAlignment for details.
               *
               * [Api set: ExcelApi 1.7]
               */
  var verticalAlignment: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartTextVerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Bottom | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.Distributed
  ] = js.undefined
  /**
               *
               * A boolean value the represents the visibility of a chart title object.
               *
               * [Api set: ExcelApi 1.1]
               */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Returns the width, in points, of the chart title. Null if chart title is not visible. Read-only.
               *
               * [Api set: ExcelApi 1.7]
               */
  var width: js.UndefOr[scala.Double] = js.undefined
}

