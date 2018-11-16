package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartDataLabel.toJSON()". */

trait ChartDataLabelData extends js.Object {
  /**
               *
               * Boolean value representing if data label automatically generates appropriate text based on context.
               *
               * [Api set: ExcelApi 1.8]
               */
  var autoText: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Represents the format of chart data label.
              *
              * [Api set: ExcelApi 1.8]
              */
  var format: js.UndefOr[ChartDataLabelFormatData] = js.undefined
  /**
               *
               * String value that represents the formula of chart data label using A1-style notation.
               *
               * [Api set: ExcelApi 1.8]
               */
  var formula: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Returns the height, in points, of the chart data label. Read-only. Null if chart data label is not visible.
               *
               * [Api set: ExcelApi 1.8]
               */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the horizontal alignment for chart data label. See Excel.ChartTextHorizontalAlignment for details.
              This property is valid only when TextOrientation of data label is 90, -90 or 180.
               *
               * [Api set: ExcelApi 1.8]
               */
  var horizontalAlignment: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartTextHorizontalAlignment | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.Distributed
  ] = js.undefined
  /**
               *
               * Represents the distance, in points, from the left edge of chart data label to the left edge of chart area. Null if chart data label is not visible.
               *
               * [Api set: ExcelApi 1.8]
               */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * String value that represents the format code for data label.
               *
               * [Api set: ExcelApi 1.8]
               */
  var numberFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * DataLabelPosition value that represents the position of the data label. See Excel.ChartDataLabelPosition for details.
               *
               * [Api set: ExcelApi 1.7]
               */
  var position: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartDataLabelPosition | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.InsideEnd | officeDashJsLib.officeDashJsLibStrings.InsideBase | officeDashJsLib.officeDashJsLibStrings.OutsideEnd | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Bottom | officeDashJsLib.officeDashJsLibStrings.BestFit | officeDashJsLib.officeDashJsLibStrings.Callout
  ] = js.undefined
  /**
               *
               * String representing the separator used for the data label on a chart.
               *
               * [Api set: ExcelApi 1.7]
               */
  var separator: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Boolean value representing if the data label bubble size is visible or not.
               *
               * [Api set: ExcelApi 1.7]
               */
  var showBubbleSize: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Boolean value representing if the data label category name is visible or not.
               *
               * [Api set: ExcelApi 1.7]
               */
  var showCategoryName: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Boolean value representing if the data label legend key is visible or not.
               *
               * [Api set: ExcelApi 1.7]
               */
  var showLegendKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Boolean value representing if the data label percentage is visible or not.
               *
               * [Api set: ExcelApi 1.7]
               */
  var showPercentage: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Boolean value representing if the data label series name is visible or not.
               *
               * [Api set: ExcelApi 1.7]
               */
  var showSeriesName: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Boolean value representing if the data label value is visible or not.
               *
               * [Api set: ExcelApi 1.7]
               */
  var showValue: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * String representing the text of the data label on a chart.
               *
               * [Api set: ExcelApi 1.8]
               */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Represents the text orientation of chart data label. The value should be an integer either from -90 to 90, or 180 for vertically-oriented text.
               *
               * [Api set: ExcelApi 1.8]
               */
  var textOrientation: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the distance, in points, from the top edge of chart data label to the top of chart area. Null if chart data label is not visible.
               *
               * [Api set: ExcelApi 1.8]
               */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the vertical alignment of chart data label. See Excel.ChartTextVerticalAlignment for details.
              This property is valid only when TextOrientation of data label is 0.
               *
               * [Api set: ExcelApi 1.8]
               */
  var verticalAlignment: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartTextVerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Bottom | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.Distributed
  ] = js.undefined
  /**
               *
               * Returns the width, in points, of the chart data label. Read-only. Null if chart data label is not visible.
               *
               * [Api set: ExcelApi 1.8]
               */
  var width: js.UndefOr[scala.Double] = js.undefined
}

