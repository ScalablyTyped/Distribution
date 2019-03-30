package typings
package atNivoLegendsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoLegendsMod {
  type Box = stdLib.Partial[atNivoLegendsLib.Anon_Bottom]
  type LegendMouseHandler = js.Function2[
    /* data */ LegendMouseHandlerData, 
    /* event */ reactLib.reactMod.ReactNs.MouseEvent[js.Any, reactLib.NativeMouseEvent], 
    scala.Unit
  ]
}
