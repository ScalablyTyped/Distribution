package typings.nivoLine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AccessorFunc = js.Function1[/* datum */ typings.nivoLine.anon.XFormatted, java.lang.String]
  type CustomLayer = js.Function1[/* props */ typings.nivoLine.mod.CustomLayerProps, typings.react.mod.ReactNode]
  type DatumValue = typings.nivoCore.mod.DatumValue
  type Layer = typings.nivoLine.mod.LineLayerType | typings.nivoLine.mod.CustomLayer
  type PointMouseHandler = js.Function2[
    /* point */ typings.nivoLine.mod.Point, 
    /* event */ typings.react.mod.MouseEvent[typings.std.Element, typings.react.mod.NativeMouseEvent], 
    scala.Unit
  ]
  type PointTooltip = typings.react.mod.FunctionComponent[typings.nivoLine.mod.PointTooltipProps]
  type SliceTooltip = typings.react.mod.FunctionComponent[typings.nivoLine.mod.SliceTooltipProps]
}
