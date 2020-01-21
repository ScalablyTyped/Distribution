package typings.nivoLegends

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type LegendMouseHandler = js.Function2[
    /* data */ typings.nivoLegends.mod.LegendMouseHandlerData, 
    /* event */ typings.react.mod.MouseEvent[js.Any, typings.react.mod.NativeMouseEvent], 
    scala.Unit
  ]
  type QuantileLegendSvg = typings.react.mod.FunctionComponent[typings.nivoLegends.mod.QuantileLegendProps]
}
