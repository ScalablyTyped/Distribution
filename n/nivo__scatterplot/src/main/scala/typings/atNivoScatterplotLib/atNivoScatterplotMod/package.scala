package typings
package atNivoScatterplotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoScatterplotMod {
  type CustomCanvasLayer = js.Function2[
    /* ctx */ stdLib.CanvasRenderingContext2D, 
    /* props */ CustomCanvasLayerProps, 
    scala.Unit
  ]
  type CustomSvgLayer = js.Function1[/* props */ CustomSvgLayerProps, reactLib.reactMod.ReactNode]
  type CustomTooltip = js.Function1[/* hasNode */ js.Any, reactLib.reactMod.ReactNode]
  type DerivedDatumProp[T] = js.Function1[/* node */ Datum, T]
  type DerivedNodeProp[T] = js.Function1[/* node */ Node, T]
  type MouseHandler = js.Function2[
    /* node */ Node, 
    /* event */ reactLib.reactMod.MouseEvent[js.Any, reactLib.NativeMouseEvent], 
    scala.Unit
  ]
  type NodeCanvasComponent = js.Function2[/* ctx */ stdLib.CanvasRenderingContext2D, /* props */ NodeProps, scala.Unit]
  type NodeComponent = js.Function1[/* props */ NodeProps, reactLib.reactMod.ReactNode]
  type Scale = js.Function1[/* value */ Value, scala.Double]
  type Value = scala.Double | java.lang.String | stdLib.Date
  type ValueFormatter = js.Function1[/* value */ Value, java.lang.String | scala.Double]
}
