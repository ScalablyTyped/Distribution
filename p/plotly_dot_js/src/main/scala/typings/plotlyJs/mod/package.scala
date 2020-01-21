package typings.plotlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ButtonClickEvent = js.Function2[
    /* gd */ typings.plotlyJs.mod.PlotlyHTMLElement, 
    /* ev */ typings.std.MouseEvent, 
    scala.Unit
  ]
  type Color = java.lang.String | scala.Double | (js.Array[
    js.UndefOr[
      (js.Array[js.UndefOr[java.lang.String | scala.Double | scala.Null]]) | scala.Double | scala.Null | java.lang.String
    ]
  ])
  type ColorScale = java.lang.String | (js.Array[java.lang.String | (js.Tuple2[scala.Double, java.lang.String])])
  type Data = typings.std.Partial[typings.plotlyJs.mod.PlotData]
  type DataTransform = typings.std.Partial[typings.plotlyJs.mod.Transform]
  type Datum = java.lang.String | scala.Double | typings.std.Date | scala.Null
  type ErrorBar = typings.std.Partial[typings.plotlyJs.mod.ErrorOptions] with (typings.plotlyJs.AnonConstant | typings.plotlyJs.AnonArray)
  type MarkerSymbol = java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double])
  type PlotRestyleEvent = js.Tuple2[js.Any, js.Array[scala.Double]]
  type PlotSelectedData = typings.std.Partial[typings.plotlyJs.mod.PlotDatum]
  type Root = java.lang.String | typings.std.HTMLElement
  type ScatterData = typings.plotlyJs.mod.PlotData
  type ScatterMarker = typings.plotlyJs.mod.PlotMarker
  type TypedArray = typings.std.Int8Array | typings.std.Uint8Array | typings.std.Int16Array | typings.std.Uint16Array | typings.std.Int32Array | typings.std.Uint32Array | typings.std.Uint8ClampedArray | typings.std.Float32Array | typings.std.Float64Array
}
