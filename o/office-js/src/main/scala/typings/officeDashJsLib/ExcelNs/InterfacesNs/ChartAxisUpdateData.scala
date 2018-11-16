package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartAxis object, for use in "chartAxis.set({ ... })". */

trait ChartAxisUpdateData extends js.Object {
  /**
               *
               * Represents the alignment for the specified axis tick label. See Excel.ChartTextHorizontalAlignment for detail.
               *
               * [Api set: ExcelApi 1.8]
               */
  var alignment: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartTickLabelAlignment | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Right
  ] = js.undefined
  /**
               *
               * Returns or sets the base unit for the specified category axis.
               *
               * [Api set: ExcelApi 1.7]
               */
  var baseTimeUnit: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisTimeUnit | officeDashJsLib.officeDashJsLibStrings.Days | officeDashJsLib.officeDashJsLibStrings.Months | officeDashJsLib.officeDashJsLibStrings.Years
  ] = js.undefined
  /**
               *
               * Returns or sets the category axis type.
               *
               * [Api set: ExcelApi 1.7]
               */
  var categoryType: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisCategoryType | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.TextAxis | officeDashJsLib.officeDashJsLibStrings.DateAxis
  ] = js.undefined
  /**
               * [DEPRECATED; kept for back-compat with existing first-party solutions]. Please use `Position` instead.
               * Represents the specified axis where the other axis crosses. See Excel.ChartAxisPosition for details.
               *
               * [Api set: ExcelApi 1.7]
               */
  var crosses: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisPosition | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.Maximum | officeDashJsLib.officeDashJsLibStrings.Minimum | officeDashJsLib.officeDashJsLibStrings.Custom
  ] = js.undefined
  /**
               *
               * Represents the axis display unit. See Excel.ChartAxisDisplayUnit for details.
               *
               * [Api set: ExcelApi 1.7]
               */
  var displayUnit: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisDisplayUnit | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Hundreds | officeDashJsLib.officeDashJsLibStrings.Thousands | officeDashJsLib.officeDashJsLibStrings.TenThousands | officeDashJsLib.officeDashJsLibStrings.HundredThousands | officeDashJsLib.officeDashJsLibStrings.Millions | officeDashJsLib.officeDashJsLibStrings.TenMillions | officeDashJsLib.officeDashJsLibStrings.HundredMillions | officeDashJsLib.officeDashJsLibStrings.Billions | officeDashJsLib.officeDashJsLibStrings.Trillions | officeDashJsLib.officeDashJsLibStrings.Custom
  ] = js.undefined
  /**
              *
              * Represents the formatting of a chart object, which includes line and font formatting.
              *
              * [Api set: ExcelApi 1.1]
              */
  var format: js.UndefOr[ChartAxisFormatUpdateData] = js.undefined
  /**
               *
               * Represents whether value axis crosses the category axis between categories.
               *
               * [Api set: ExcelApi 1.8]
               */
  var isBetweenCategories: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the base of the logarithm when using logarithmic scales.
               *
               * [Api set: ExcelApi 1.7]
               */
  var logBase: js.UndefOr[scala.Double] = js.undefined
  /**
              *
              * Returns a Gridlines object that represents the major gridlines for the specified axis.
              *
              * [Api set: ExcelApi 1.1]
              */
  var majorGridlines: js.UndefOr[ChartGridlinesUpdateData] = js.undefined
  /**
               *
               * Represents the type of major tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
               *
               * [Api set: ExcelApi 1.7]
               */
  var majorTickMark: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisTickMark | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Cross | officeDashJsLib.officeDashJsLibStrings.Inside | officeDashJsLib.officeDashJsLibStrings.Outside
  ] = js.undefined
  /**
               *
               * Returns or sets the major unit scale value for the category axis when the CategoryType property is set to TimeScale.
               *
               * [Api set: ExcelApi 1.7]
               */
  var majorTimeUnitScale: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisTimeUnit | officeDashJsLib.officeDashJsLibStrings.Days | officeDashJsLib.officeDashJsLibStrings.Months | officeDashJsLib.officeDashJsLibStrings.Years
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
              * Returns a Gridlines object that represents the minor gridlines for the specified axis.
              *
              * [Api set: ExcelApi 1.1]
              */
  var minorGridlines: js.UndefOr[ChartGridlinesUpdateData] = js.undefined
  /**
               *
               * Represents the type of minor tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
               *
               * [Api set: ExcelApi 1.7]
               */
  var minorTickMark: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisTickMark | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Cross | officeDashJsLib.officeDashJsLibStrings.Inside | officeDashJsLib.officeDashJsLibStrings.Outside
  ] = js.undefined
  /**
               *
               * Returns or sets the minor unit scale value for the category axis when the CategoryType property is set to TimeScale.
               *
               * [Api set: ExcelApi 1.7]
               */
  var minorTimeUnitScale: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisTimeUnit | officeDashJsLib.officeDashJsLibStrings.Days | officeDashJsLib.officeDashJsLibStrings.Months | officeDashJsLib.officeDashJsLibStrings.Years
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
    officeDashJsLib.ExcelNs.ChartAxisPosition | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.Maximum | officeDashJsLib.officeDashJsLibStrings.Minimum | officeDashJsLib.officeDashJsLibStrings.Custom
  ] = js.undefined
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
    officeDashJsLib.ExcelNs.ChartAxisScaleType | officeDashJsLib.officeDashJsLibStrings.Linear | officeDashJsLib.officeDashJsLibStrings.Logarithmic
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
    officeDashJsLib.ExcelNs.ChartAxisTickLabelPosition | officeDashJsLib.officeDashJsLibStrings.NextToAxis | officeDashJsLib.officeDashJsLibStrings.High | officeDashJsLib.officeDashJsLibStrings.Low | officeDashJsLib.officeDashJsLibStrings.None
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
              * Represents the axis title.
              *
              * [Api set: ExcelApi 1.1]
              */
  var title: js.UndefOr[ChartAxisTitleUpdateData] = js.undefined
  /**
               *
               * A boolean value represents the visibility of the axis.
               *
               * [Api set: ExcelApi 1.7]
               */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

