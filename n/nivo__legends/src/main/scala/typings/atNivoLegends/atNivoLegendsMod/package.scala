package typings.atNivoLegends

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoLegendsMod {
  import typings.atNivoLegends.Anon_Bottom
  import typings.react.NativeMouseEvent
  import typings.react.reactMod.FunctionComponent
  import typings.react.reactMod.MouseEvent
  import typings.std.Partial

  type Box = Partial[Anon_Bottom]
  type LegendMouseHandler = js.Function2[
    /* data */ LegendMouseHandlerData, 
    /* event */ MouseEvent[js.Any, NativeMouseEvent], 
    Unit
  ]
  type QuantileLegendSvg = FunctionComponent[QuantileLegendProps]
}
