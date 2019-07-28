package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ticker
@JSImport("pixi.js", "ticker")
@js.native
object tickerNs extends js.Object {
  @js.native
  class Ticker ()
    extends typings.pixiDotJs.PIXINs.tickerNs.Ticker
  
  @js.native
  class TickerListener protected ()
    extends typings.pixiDotJs.PIXINs.tickerNs.TickerListener {
    def this(fn: js.Function1[/* deltaTime */ Double, Unit]) = this()
    def this(fn: js.Function1[/* deltaTime */ Double, Unit], context: js.Any) = this()
    def this(fn: js.Function1[/* deltaTime */ Double, Unit], context: js.Any, priority: Double) = this()
    def this(fn: js.Function1[/* deltaTime */ Double, Unit], context: js.Any, priority: Double, once: Boolean) = this()
  }
  
  val shared: typings.pixiDotJs.PIXINs.tickerNs.Ticker = js.native
}

