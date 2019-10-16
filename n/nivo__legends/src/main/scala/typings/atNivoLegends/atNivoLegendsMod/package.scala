package typings.atNivoLegends

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoLegendsMod {
  import typings.react.NativeMouseEvent
  import typings.react.reactMod.FunctionComponent
  import typings.react.reactMod.MouseEvent

  type LegendMouseHandler = js.Function2[
    /* data */ LegendMouseHandlerData, 
    /* event */ MouseEvent[js.Any, NativeMouseEvent], 
    Unit
  ]
  type QuantileLegendSvg = FunctionComponent[QuantileLegendProps]
}
