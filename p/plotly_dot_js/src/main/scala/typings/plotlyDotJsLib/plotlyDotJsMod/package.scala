package typings
package plotlyDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object plotlyDotJsMod {
  type AxisName = plotlyDotJsLib.plotlyDotJsLibStrings.x | plotlyDotJsLib.plotlyDotJsLibStrings.x2 | plotlyDotJsLib.plotlyDotJsLibStrings.x3 | plotlyDotJsLib.plotlyDotJsLibStrings.x4 | plotlyDotJsLib.plotlyDotJsLibStrings.x5 | plotlyDotJsLib.plotlyDotJsLibStrings.x6 | plotlyDotJsLib.plotlyDotJsLibStrings.x7 | plotlyDotJsLib.plotlyDotJsLibStrings.x8 | plotlyDotJsLib.plotlyDotJsLibStrings.x9 | plotlyDotJsLib.plotlyDotJsLibStrings.y | plotlyDotJsLib.plotlyDotJsLibStrings.y2 | plotlyDotJsLib.plotlyDotJsLibStrings.y3 | plotlyDotJsLib.plotlyDotJsLibStrings.y4 | plotlyDotJsLib.plotlyDotJsLibStrings.y5 | plotlyDotJsLib.plotlyDotJsLibStrings.y6 | plotlyDotJsLib.plotlyDotJsLibStrings.y7 | plotlyDotJsLib.plotlyDotJsLibStrings.y8 | plotlyDotJsLib.plotlyDotJsLibStrings.y9
  type AxisType = plotlyDotJsLib.plotlyDotJsLibStrings.`-` | plotlyDotJsLib.plotlyDotJsLibStrings.linear | plotlyDotJsLib.plotlyDotJsLibStrings.log | plotlyDotJsLib.plotlyDotJsLibStrings.date | plotlyDotJsLib.plotlyDotJsLibStrings.category
  type ButtonClickEvent = js.Function2[/* gd */ PlotlyHTMLElement, /* ev */ stdLib.MouseEvent, scala.Unit]
  type Calendar = plotlyDotJsLib.plotlyDotJsLibStrings.gregorian | plotlyDotJsLib.plotlyDotJsLibStrings.chinese | plotlyDotJsLib.plotlyDotJsLibStrings.coptic | plotlyDotJsLib.plotlyDotJsLibStrings.discworld | plotlyDotJsLib.plotlyDotJsLibStrings.ethiopian | plotlyDotJsLib.plotlyDotJsLibStrings.hebrew | plotlyDotJsLib.plotlyDotJsLibStrings.islamic | plotlyDotJsLib.plotlyDotJsLibStrings.julian | plotlyDotJsLib.plotlyDotJsLibStrings.mayan | plotlyDotJsLib.plotlyDotJsLibStrings.nanakshahi | plotlyDotJsLib.plotlyDotJsLibStrings.nepali | plotlyDotJsLib.plotlyDotJsLibStrings.persian | plotlyDotJsLib.plotlyDotJsLibStrings.jalali | plotlyDotJsLib.plotlyDotJsLibStrings.taiwan | plotlyDotJsLib.plotlyDotJsLibStrings.thai | plotlyDotJsLib.plotlyDotJsLibStrings.ummalqura
  type Color = java.lang.String | (js.Array[js.UndefOr[java.lang.String | scala.Null]]) | (js.Array[js.Array[js.UndefOr[java.lang.String | scala.Null]]])
  type Dash = plotlyDotJsLib.plotlyDotJsLibStrings.solid | plotlyDotJsLib.plotlyDotJsLibStrings.dot | plotlyDotJsLib.plotlyDotJsLibStrings.dash | plotlyDotJsLib.plotlyDotJsLibStrings.longdash | plotlyDotJsLib.plotlyDotJsLibStrings.dashdot | plotlyDotJsLib.plotlyDotJsLibStrings.longdashdot
  type Data = stdLib.Partial[PlotData]
  type DataTransform = stdLib.Partial[Transform]
  type Datum = java.lang.String | scala.Double | stdLib.Date | scala.Null
  type ErrorBar = stdLib.Partial[ErrorOptions] with (plotlyDotJsLib.Anon_Constant | plotlyDotJsLib.Anon_Array)
  type ModeBarDefaultButtons = plotlyDotJsLib.plotlyDotJsLibStrings.lasso2d | plotlyDotJsLib.plotlyDotJsLibStrings.select2d | plotlyDotJsLib.plotlyDotJsLibStrings.sendDataToCloud | plotlyDotJsLib.plotlyDotJsLibStrings.autoScale2d | plotlyDotJsLib.plotlyDotJsLibStrings.zoom2d | plotlyDotJsLib.plotlyDotJsLibStrings.pan2d | plotlyDotJsLib.plotlyDotJsLibStrings.zoomIn2d | plotlyDotJsLib.plotlyDotJsLibStrings.zoomOut2d | plotlyDotJsLib.plotlyDotJsLibStrings.resetScale2d | plotlyDotJsLib.plotlyDotJsLibStrings.hoverClosestCartesian | plotlyDotJsLib.plotlyDotJsLibStrings.hoverCompareCartesian | plotlyDotJsLib.plotlyDotJsLibStrings.zoom3d | plotlyDotJsLib.plotlyDotJsLibStrings.pan3d | plotlyDotJsLib.plotlyDotJsLibStrings.orbitRotation | plotlyDotJsLib.plotlyDotJsLibStrings.tableRotation | plotlyDotJsLib.plotlyDotJsLibStrings.resetCameraDefault3d | plotlyDotJsLib.plotlyDotJsLibStrings.resetCameraLastSave3d | plotlyDotJsLib.plotlyDotJsLibStrings.hoverClosest3d | plotlyDotJsLib.plotlyDotJsLibStrings.zoomInGeo | plotlyDotJsLib.plotlyDotJsLibStrings.zoomOutGeo | plotlyDotJsLib.plotlyDotJsLibStrings.resetGeo | plotlyDotJsLib.plotlyDotJsLibStrings.hoverClosestGeo | plotlyDotJsLib.plotlyDotJsLibStrings.hoverClosestGl2d | plotlyDotJsLib.plotlyDotJsLibStrings.hoverClosestPie | plotlyDotJsLib.plotlyDotJsLibStrings.toggleHover | plotlyDotJsLib.plotlyDotJsLibStrings.toImage | plotlyDotJsLib.plotlyDotJsLibStrings.resetViews | plotlyDotJsLib.plotlyDotJsLibStrings.toggleSpikelines
  type PlotRestyleEvent = js.Tuple2[js.Any, js.Array[scala.Double]]
  type PlotSelectedData = stdLib.Partial[PlotDatum]
  type Root = java.lang.String | stdLib.HTMLElement
  type ScatterData = PlotData
  type ScatterMarker = PlotMarker
  type TypedArray = stdLib.Int8Array | stdLib.Uint8Array | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Int32Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array
}
