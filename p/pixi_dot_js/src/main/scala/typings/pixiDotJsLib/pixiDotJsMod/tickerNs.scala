package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ticker
@JSImport("pixi.js", "ticker")
@js.native
object tickerNs extends js.Object {
  @js.native
  class Ticker ()
    extends pixiDotJsLib.PIXINs.tickerNs.Ticker
  
  @js.native
  class TickerListener protected ()
    extends pixiDotJsLib.PIXINs.tickerNs.TickerListener {
    def this(fn: js.Function1[/* deltaTime */ scala.Double, scala.Unit]) = this()
    def this(fn: js.Function1[/* deltaTime */ scala.Double, scala.Unit], context: js.Any) = this()
    def this(fn: js.Function1[/* deltaTime */ scala.Double, scala.Unit], context: js.Any, priority: scala.Double) = this()
    def this(fn: js.Function1[/* deltaTime */ scala.Double, scala.Unit], context: js.Any, priority: scala.Double, once: scala.Boolean) = this()
  }
  
  val shared: pixiDotJsLib.PIXINs.tickerNs.Ticker = js.native
}

