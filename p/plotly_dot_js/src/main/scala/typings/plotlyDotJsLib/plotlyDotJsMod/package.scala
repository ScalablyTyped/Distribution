package typings
package plotlyDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object plotlyDotJsMod {
  type ButtonClickEvent = js.Function2[/* gd */ PlotlyHTMLElement, /* ev */ stdLib.MouseEvent, scala.Unit]
  type Color = java.lang.String | (js.Array[js.UndefOr[java.lang.String | scala.Null]]) | (js.Array[js.Array[js.UndefOr[java.lang.String | scala.Null]]])
  type Data = stdLib.Partial[PlotData]
  type DataTransform = stdLib.Partial[Transform]
  type Datum = java.lang.String | scala.Double | stdLib.Date | scala.Null
  type ErrorBar = stdLib.Partial[ErrorOptions] with (plotlyDotJsLib.Anon_Constant | plotlyDotJsLib.Anon_Array)
  type PlotRestyleEvent = js.Tuple2[js.Any, js.Array[scala.Double]]
  type PlotSelectedData = stdLib.Partial[PlotDatum]
  type Root = java.lang.String | stdLib.HTMLElement
  type ScatterData = PlotData
  type ScatterMarker = PlotMarker
  type TypedArray = stdLib.Int8Array | stdLib.Uint8Array | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Int32Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array
}
