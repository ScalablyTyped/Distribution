package typings
package morrisDotJsLib.morrisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ILineOptions extends IGridChartOptions {
  /** Define how null and undefined values are handled (see documentation). */
  var continuousLine: js.UndefOr[scala.Boolean] = js.undefined
  /** A function that accepts millisecond timestamps and formats them for display as chart labels. */
  var dateFormat: js.UndefOr[js.Function1[/* timestamp */ scala.Double, java.lang.String]] = js.undefined
  /** Array of color values to use for the event line colors. If you list fewer colors here than you have lines in events, then the values will be cycled. */
  var eventLineColors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Width, in pixels, of the event lines. */
  var eventStrokeWidth: js.UndefOr[scala.Double] = js.undefined
  /** A list of x-values to draw as vertical 'event' lines on the chart. */
  var events: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Change the opacity of the area fill colour. Accepts values between 0.0 (for completely transparent) and 1.0 (for completely opaque). */
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  /** Array of color values to use for the goal line colors. If you list fewer colors here than you have lines in goals, then the values will be cycled. */
  var goalLineColors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Width, in pixels, of the goal lines. */
  var goalStrokeWidth: js.UndefOr[scala.Double] = js.undefined
  /** A list of y-values to draw as horizontal 'goal' lines on the chart. */
  var goals: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** Provide a function on this option to generate custom hover legends. */
  var hoverCallback: js.UndefOr[
    js.Function4[
      /* index */ scala.Double, 
      /* options */ ILineOptions, 
      /* content */ java.lang.String, 
      /* row */ js.Any, 
      java.lang.String
    ]
  ] = js.undefined
  /** Array containing colors for the series lines/points. */
  var lineColors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Width of the series lines, in pixels. */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /** Set to false to skip time/date parsing for X values, instead treating them as an equally-spaced series. */
  var parseTime: js.UndefOr[scala.Boolean] = js.undefined
  /** Colors for the series points. By default uses the same values as lineColors */
  var pointFillColors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Diameter of the series points, in pixels. */
  var pointSize: js.UndefOr[scala.Double] = js.undefined
  /** Colors for the outlines of the series points. (#ffffff by default). */
  var pointStrokeColors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Set to a string value (eg: '%') to add a label suffix all y-labels. */
  var postUnits: js.UndefOr[java.lang.String] = js.undefined
  /** Set to a string value (eg: '$') to add a label prefix all y-labels. */
  var preUnits: js.UndefOr[java.lang.String] = js.undefined
  /** Set to false to disable line smoothing. */
  var smooth: js.UndefOr[scala.Boolean] = js.undefined
  /** The angle in degrees from horizontal to draw x-axis labels. */
  var xLabelAngle: js.UndefOr[scala.Double] = js.undefined
  /** A function that accepts Date objects and formats them for display as x-axis labels. Overrides the default formatter chosen by the automatic labeller or the xLabels option. */
  var xLabelFormat: js.UndefOr[js.Function1[/* date */ stdLib.Date, java.lang.String]] = js.undefined
  /** Sets the x axis labelling interval. By default the interval will be automatically computed. */
  var xLabels: js.UndefOr[Interval] = js.undefined
  /** A function that accepts y-values and formats them for display as y-axis labels. */
  var yLabelFormat: js.UndefOr[js.Function1[/* val */ js.Any, java.lang.String]] = js.undefined
  /** Max. bound for Y-values. Alternatively, set this to 'auto' to compute automatically, or 'auto [num]' to automatically compute and ensure that the max y-value is at least [num]. */
  var ymax: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Min. bound for Y-values. Alternatively, set this to 'auto' to compute automatically, or 'auto [num]' to automatically compute and ensure that the min y-value is at most [num]. */
  var ymin: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

