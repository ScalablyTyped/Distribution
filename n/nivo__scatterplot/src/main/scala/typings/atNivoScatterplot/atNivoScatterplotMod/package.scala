package typings.atNivoScatterplot

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.std.CanvasRenderingContext2D
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoScatterplotMod {
  type CustomCanvasLayer = js.Function2[/* ctx */ CanvasRenderingContext2D, /* props */ CustomCanvasLayerProps, Unit]
  type CustomSvgLayer = js.Function1[/* props */ CustomSvgLayerProps, ReactNode]
  type CustomTooltip = js.Function1[/* hasNode */ js.Any, ReactNode]
  type DerivedDatumProp[T] = js.Function1[/* node */ Datum, T]
  type DerivedNodeProp[T] = js.Function1[/* node */ Node, T]
  type MouseHandler = js.Function2[/* node */ Node, /* event */ MouseEvent[js.Any, NativeMouseEvent], Unit]
  type NodeCanvasComponent = js.Function2[/* ctx */ CanvasRenderingContext2D, /* props */ NodeProps, Unit]
  type NodeComponent = js.Function1[/* props */ NodeProps, ReactNode]
  type Scale = js.Function1[/* value */ Value, Double]
  type Value = Double | String | Date
  type ValueFormatter = js.Function1[/* value */ Value, String | Double]
}
