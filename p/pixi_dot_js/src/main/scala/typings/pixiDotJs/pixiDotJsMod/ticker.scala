package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ticker
@JSImport("pixi.js", "ticker")
@js.native
object ticker extends js.Object {
  @js.native
  class Ticker ()
    extends typings.pixiDotJs.PIXI.ticker.Ticker
  
  @js.native
  class TickerListener protected ()
    extends typings.pixiDotJs.PIXI.ticker.TickerListener {
    def this(fn: js.Function1[/* deltaTime */ Double, Unit]) = this()
    def this(fn: js.Function1[/* deltaTime */ Double, Unit], context: js.Any) = this()
    def this(fn: js.Function1[/* deltaTime */ Double, Unit], context: js.Any, priority: Double) = this()
    def this(fn: js.Function1[/* deltaTime */ Double, Unit], context: js.Any, priority: Double, once: Boolean) = this()
  }
  
  val shared: typings.pixiDotJs.PIXI.ticker.Ticker = js.native
}

