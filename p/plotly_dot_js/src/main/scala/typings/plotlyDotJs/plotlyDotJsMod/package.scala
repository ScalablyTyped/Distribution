package typings.plotlyDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object plotlyDotJsMod {
  import typings.plotlyDotJs.Anon_Array
  import typings.plotlyDotJs.Anon_Constant
  import typings.std.Date
  import typings.std.Float32Array
  import typings.std.Float64Array
  import typings.std.HTMLElement
  import typings.std.Int16Array
  import typings.std.Int32Array
  import typings.std.Int8Array
  import typings.std.MouseEvent
  import typings.std.Partial
  import typings.std.Uint16Array
  import typings.std.Uint32Array
  import typings.std.Uint8Array
  import typings.std.Uint8ClampedArray

  type ButtonClickEvent = js.Function2[/* gd */ PlotlyHTMLElement, /* ev */ MouseEvent, Unit]
  type Color = String | (js.Array[js.UndefOr[(js.Array[js.UndefOr[String | Null]]) | Null | String]])
  type Data = Partial[PlotData]
  type DataTransform = Partial[Transform]
  type Datum = String | Double | Date | Null
  type ErrorBar = Partial[ErrorOptions] with (Anon_Constant | Anon_Array)
  type PlotRestyleEvent = js.Tuple2[js.Any, js.Array[Double]]
  type PlotSelectedData = Partial[PlotDatum]
  type Root = String | HTMLElement
  type ScatterData = PlotData
  type ScatterMarker = PlotMarker
  type TypedArray = Int8Array | Uint8Array | Int16Array | Uint16Array | Int32Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array
}
