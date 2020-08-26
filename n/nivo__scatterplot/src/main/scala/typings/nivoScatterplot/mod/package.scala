package typings.nivoScatterplot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomCanvasLayer = js.Function2[
    /* ctx */ typings.std.CanvasRenderingContext2D, 
    /* props */ typings.nivoScatterplot.mod.CustomCanvasLayerProps, 
    scala.Unit
  ]
  type CustomSvgLayer = js.Function1[
    /* props */ typings.nivoScatterplot.mod.CustomSvgLayerProps, 
    typings.react.mod.ReactNode
  ]
  type CustomTooltip = js.Function1[/* props */ typings.nivoScatterplot.mod.TooltipProps, typings.react.mod.ReactNode]
  type DerivedDatumProp[T] = js.Function1[/* node */ typings.nivoScatterplot.mod.Datum, T]
  type DerivedNodeProp[T] = js.Function1[/* node */ typings.nivoScatterplot.mod.Node, T]
  type MouseHandler = js.Function2[
    /* node */ typings.nivoScatterplot.mod.Node, 
    /* event */ typings.react.mod.MouseEvent[js.Any, typings.react.mod.NativeMouseEvent], 
    scala.Unit
  ]
  type NodeCanvasComponent = js.Function2[
    /* ctx */ typings.std.CanvasRenderingContext2D, 
    /* props */ typings.nivoScatterplot.mod.NodeProps, 
    scala.Unit
  ]
  type NodeComponent = js.Function1[/* props */ typings.nivoScatterplot.mod.NodeProps, typings.react.mod.ReactNode]
  type Value = scala.Double | java.lang.String | typings.std.Date
  type ValueFormatter = js.Function1[/* value */ typings.nivoScatterplot.mod.Value, java.lang.String | scala.Double]
}
