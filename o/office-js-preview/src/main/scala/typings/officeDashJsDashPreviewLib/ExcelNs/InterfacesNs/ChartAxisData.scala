package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartAxis.toJSON()". */

trait ChartAxisData extends js.Object {
  /**
               *
               * Represents the alignment for the specified axis tick label. See Excel.ChartTextHorizontalAlignment for detail.
               *
               * [Api set: ExcelApi 1.8]
               */
  var alignment: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartTickLabelAlignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Left | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Right
  ] = js.undefined
  /**
               *
               * Represents the group for the specified axis. See Excel.ChartAxisGroup for details. Read-only.
               *
               * [Api set: ExcelApi 1.7]
               */
  var axisGroup: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartAxisGroup | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Primary | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Secondary
  ] = js.undefined
  /**
               *
               * Returns or sets the base unit for the specified category axis.
               *
               * [Api set: ExcelApi 1.7]
               */
  var baseTimeUnit: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartAxisTimeUnit | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Days | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Months | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Years
  ] = js.undefined
  /**
               *
               * Returns or sets the category axis type.
               *
               * [Api set: ExcelApi 1.7]
               */
  var categoryType: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartAxisCategoryType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TextAxis | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DateAxis
  ] = js.undefined
  /**
               *
               * Represents the custom axis display unit value. Read-only. To set this property, please use the SetCustomDisplayUnit(double) method.
               *
               * [Api set: ExcelApi 1.7]
               */
  var customDisplayUnit: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the axis display unit. See Excel.ChartAxisDisplayUnit for details.
               *
               * [Api set: ExcelApi 1.7]
               */
  var displayUnit: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartAxisDisplayUnit | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Hundreds | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Thousands | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TenThousands | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.HundredThousands | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Millions | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TenMillions | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.HundredMillions | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Billions | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Trillions | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Custom
  ] = js.undefined
  /**
              *
              * Represents the formatting of a chart object, which includes line and font formatting. Read-only.
              *
              * [Api set: ExcelApi 1.1]
              */
  var format: js.UndefOr[ChartAxisFormatData] = js.undefined
  /**
               *
               * Represents the height, in points, of the chart axis. Null if the axis is not visible. Read-only.
               *
               * [Api set: ExcelApi 1.7]
               */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents whether value axis crosses the category axis between categories.
               *
               * [Api set: ExcelApi 1.8]
               */
  var isBetweenCategories: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the distance, in points, from the left edge of the axis to the left of chart area. Null if the axis is not visible. Read-only.
               *
               * [Api set: ExcelApi 1.7]
               */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents whether the number format is linked to the cells (so that the number format changes in the labels when it changes in the cells).
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var linkNumberFormat: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the base of the logarithm when using logarithmic scales.
               *
               * [Api set: ExcelApi 1.7]
               */
  var logBase: js.UndefOr[scala.Double] = js.undefined
  /**
              *
              * Returns a Gridlines object that represents the major gridlines for the specified axis. Read-only.
              *
              * [Api set: ExcelApi 1.1]
              */
  var majorGridlines: js.UndefOr[ChartGridlinesData] = js.undefined
  /**
               *
               * Represents the type of major tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
               *
               * [Api set: ExcelApi 1.7]
               */
  var majorTickMark: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartAxisTickMark | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Cross | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Inside | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Outside
  ] = js.undefined
  /**
               *
               * Returns or sets the major unit scale value for the category axis when the CategoryType property is set to TimeScale.
               *
               * [Api set: ExcelApi 1.7]
               */
  var majorTimeUnitScale: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartAxisTimeUnit | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Days | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Months | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Years
  ] = js.undefined
  /**
               *
               * Represents the interval between two major tick marks. Can be set to a numeric value or an empty string.  The returned value is always a number.
               *
               * [Api set: ExcelApi 1.1]
               */
  var majorUnit: js.UndefOr[js.Any] = js.undefined
  /**
               *
               * Represents the maximum value on the value axis.  Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
               *
               * [Api set: ExcelApi 1.1]
               */
  var maximum: js.UndefOr[js.Any] = js.undefined
  /**
               *
               * Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
               *
               * [Api set: ExcelApi 1.1]
               */
  var minimum: js.UndefOr[js.Any] = js.undefined
  /**
              *
              * Returns a Gridlines object that represents the minor gridlines for the specified axis. Read-only.
              *
              * [Api set: ExcelApi 1.1]
              */
  var minorGridlines: js.UndefOr[ChartGridlinesData] = js.undefined
  /**
               *
               * Represents the type of minor tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
               *
               * [Api set: ExcelApi 1.7]
               */
  var minorTickMark: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartAxisTickMark | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Cross | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Inside | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Outside
  ] = js.undefined
  /**
               *
               * Returns or sets the minor unit scale value for the category axis when the CategoryType property is set to TimeScale.
               *
               * [Api set: ExcelApi 1.7]
               */
  var minorTimeUnitScale: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartAxisTimeUnit | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Days | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Months | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Years
  ] = js.undefined
  /**
               *
               * Represents the interval between two minor tick marks. Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
               *
               * [Api set: ExcelApi 1.1]
               */
  var minorUnit: js.UndefOr[js.Any] = js.undefined
  /**
               *
               * Represents whether an axis is multilevel or not.
               *
               * [Api set: ExcelApi 1.8]
               */
  var multiLevel: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the format code for the axis tick label.
               *
               * [Api set: ExcelApi 1.8]
               */
  var numberFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Represents the distance between the levels of labels, and the distance between the first level and the axis line. The value should be an integer from 0 to 1000.
               *
               * [Api set: ExcelApi 1.8]
               */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the specified axis position where the other axis crosses. See Excel.ChartAxisPosition for details.
               *
               * [Api set: ExcelApi 1.8]
               */
  var position: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartAxisPosition | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Maximum | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Minimum | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Custom
  ] = js.undefined
  /**
               *
               * Represents the specified axis position where the other axis crosses at. Read Only. Set to this property should use SetPositionAt(double) method.
               *
               * [Api set: ExcelApi 1.8]
               */
  var positionAt: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents whether Microsoft Excel plots data points from last to first.
               *
               * [Api set: ExcelApi 1.7]
               */
  var reversePlotOrder: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the value axis scale type. See Excel.ChartAxisScaleType for details.
               *
               * [Api set: ExcelApi 1.7]
               */
  var scaleType: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartAxisScaleType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Linear | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Logarithmic
  ] = js.undefined
  /**
               *
               * Represents whether the axis display unit label is visible.
               *
               * [Api set: ExcelApi 1.7]
               */
  var showDisplayUnitLabel: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the text orientation of the axis tick label. The value should be an integer either from -90 to 90, or 180 for vertically-oriented text.
               *
               * [Api set: ExcelApi 1.8]
               */
  var textOrientation: js.UndefOr[js.Any] = js.undefined
  /**
               *
               * Represents the position of tick-mark labels on the specified axis. See Excel.ChartAxisTickLabelPosition for details.
               *
               * [Api set: ExcelApi 1.7]
               */
  var tickLabelPosition: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartAxisTickLabelPosition | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NextToAxis | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.High | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Low | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None
  ] = js.undefined
  /**
               *
               * Represents the number of categories or series between tick-mark labels. Can be a value from 1 through 31999 or an empty string for automatic setting. The returned value is always a number.
               *
               * [Api set: ExcelApi 1.7]
               */
  var tickLabelSpacing: js.UndefOr[js.Any] = js.undefined
  /**
               *
               * Represents the number of categories or series between tick marks.
               *
               * [Api set: ExcelApi 1.7]
               */
  var tickMarkSpacing: js.UndefOr[scala.Double] = js.undefined
  /**
              *
              * Represents the axis title. Read-only.
              *
              * [Api set: ExcelApi 1.1]
              */
  var title: js.UndefOr[ChartAxisTitleData] = js.undefined
  /**
               *
               * Represents the distance, in points, from the top edge of the axis to the top of chart area. Null if the axis is not visible. Read-only.
               *
               * [Api set: ExcelApi 1.7]
               */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the axis type. See Excel.ChartAxisType for details.
               *
               * [Api set: ExcelApi 1.7]
               */
  var `type`: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartAxisType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Invalid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Category | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Value | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Series
  ] = js.undefined
  /**
               *
               * A boolean value represents the visibility of the axis.
               *
               * [Api set: ExcelApi 1.7]
               */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the width, in points, of the chart axis. Null if the axis is not visible. Read-only.
               *
               * [Api set: ExcelApi 1.7]
               */
  var width: js.UndefOr[scala.Double] = js.undefined
}

