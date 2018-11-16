package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chart.toJSON()". */

trait ChartData extends js.Object {
  /**
              *
              * Represents chart axes. Read-only.
              *
              * [Api set: ExcelApi 1.1]
              */
  var axes: js.UndefOr[ChartAxesData] = js.undefined
  /**
               *
               * Returns or sets a ChartCategoryLabelLevel enumeration constant referring to
              the level of where the category labels are being sourced from. Read/Write.
               *
               * [Api set: ExcelApi 1.8]
               */
  var categoryLabelLevel: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the type of the chart. See Excel.ChartType for details.
               *
               * [Api set: ExcelApi 1.7]
               */
  var chartType: js.UndefOr[/* LimitUnionLength: was union type with length 83 */js.Any] = js.undefined
  /**
              *
              * Represents the datalabels on the chart. Read-only.
              *
              * [Api set: ExcelApi 1.1]
              */
  var dataLabels: js.UndefOr[ChartDataLabelsData] = js.undefined
  /**
               *
               * Returns or sets the way that blank cells are plotted on a chart. Read/Write.
               *
               * [Api set: ExcelApi 1.8]
               */
  var displayBlanksAs: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartDisplayBlanksAs | officeDashJsLib.officeDashJsLibStrings.NotPlotted | officeDashJsLib.officeDashJsLibStrings.Zero | officeDashJsLib.officeDashJsLibStrings.Interplotted
  ] = js.undefined
  /**
              *
              * Encapsulates the format properties for the chart area. Read-only.
              *
              * [Api set: ExcelApi 1.1]
              */
  var format: js.UndefOr[ChartAreaFormatData] = js.undefined
  /**
               *
               * Represents the height, in points, of the chart object.
               *
               * [Api set: ExcelApi 1.1]
               */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * The unique id of chart. Read-only.
               *
               * [Api set: ExcelApi 1.7]
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * The distance, in points, from the left side of the chart to the worksheet origin.
               *
               * [Api set: ExcelApi 1.1]
               */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
              *
              * Represents the legend for the chart. Read-only.
              *
              * [Api set: ExcelApi 1.1]
              */
  var legend: js.UndefOr[ChartLegendData] = js.undefined
  /**
               *
               * Represents the name of a chart object.
               *
               * [Api set: ExcelApi 1.1]
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
              *
              * Represents the plotArea for the chart.
              *
              * [Api set: ExcelApi 1.8]
              */
  var plotArea: js.UndefOr[ChartPlotAreaData] = js.undefined
  /**
               *
               * Returns or sets the way columns or rows are used as data series on the chart. Read/Write.
               *
               * [Api set: ExcelApi 1.8]
               */
  var plotBy: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartPlotBy | officeDashJsLib.officeDashJsLibStrings.Rows | officeDashJsLib.officeDashJsLibStrings.Columns
  ] = js.undefined
  /**
               *
               * True if only visible cells are plotted. False if both visible and hidden cells are plotted. Read/Write.
               *
               * [Api set: ExcelApi 1.8]
               */
  var plotVisibleOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Represents either a single series or collection of series in the chart. Read-only.
              *
              * [Api set: ExcelApi 1.1]
              */
  var series: js.UndefOr[js.Array[ChartSeriesData]] = js.undefined
  /**
               *
               * Returns or sets a ChartSeriesNameLevel enumeration constant referring to
              the level of where the series names are being sourced from. Read/Write.
               *
               * [Api set: ExcelApi 1.8]
               */
  var seriesNameLevel: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents whether to display all field buttons on a PivotChart.
               *
               * [Api set: ExcelApi 1.7]
               */
  var showAllFieldButtons: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents whether to to show the data labels when the value is greater than the maximum value on the value axis.
              If value axis became smaller than the size of data points, you can use this property to set whether to show the data labels.
              This property applies to 2-D charts only.
               *
               * [Api set: ExcelApi 1.8]
               */
  var showDataLabelsOverMaximum: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Returns or sets the chart style for the chart. Read/Write.
               *
               * [Api set: ExcelApi 1.8]
               */
  var style: js.UndefOr[scala.Double] = js.undefined
  /**
              *
              * Represents the title of the specified chart, including the text, visibility, position, and formating of the title. Read-only.
              *
              * [Api set: ExcelApi 1.1]
              */
  var title: js.UndefOr[ChartTitleData] = js.undefined
  /**
               *
               * Represents the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart).
               *
               * [Api set: ExcelApi 1.1]
               */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the width, in points, of the chart object.
               *
               * [Api set: ExcelApi 1.1]
               */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
              *
              * The worksheet containing the current chart. Read-only.
              *
              * [Api set: ExcelApi 1.2]
              */
  var worksheet: js.UndefOr[WorksheetData] = js.undefined
}

