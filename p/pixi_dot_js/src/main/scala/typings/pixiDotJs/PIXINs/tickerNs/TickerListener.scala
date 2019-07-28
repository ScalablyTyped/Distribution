package typings.pixiDotJs.PIXINs.tickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.ticker.TickerListener")
@js.native
class TickerListener protected () extends js.Object {
  def this(fn: js.Function1[/* deltaTime */ Double, Unit]) = this()
  def this(fn: js.Function1[/* deltaTime */ Double, Unit], context: js.Any) = this()
  def this(fn: js.Function1[/* deltaTime */ Double, Unit], context: js.Any, priority: Double) = this()
  def this(fn: js.Function1[/* deltaTime */ Double, Unit], context: js.Any, priority: Double, once: Boolean) = this()
  var _destroyed: Boolean = js.native
  var context: js.Any = js.native
  var next: TickerListener = js.native
  var once: Boolean = js.native
  var previous: TickerListener = js.native
  var priority: Double = js.native
  def connect(previous: TickerListener): Unit = js.native
  def destroy(): Unit = js.native
  def destroy(hard: Boolean): Unit = js.native
  def emit(deltaTime: Double): TickerListener = js.native
  def fn(deltaTime: Double): Unit = js.native
  def `match`(fn: js.Function1[/* deltaTime */ Double, Unit]): Boolean = js.native
  def `match`(fn: js.Function1[/* deltaTime */ Double, Unit], context: js.Any): Boolean = js.native
}

