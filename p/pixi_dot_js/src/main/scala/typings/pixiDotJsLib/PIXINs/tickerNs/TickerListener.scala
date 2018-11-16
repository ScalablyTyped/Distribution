package typings
package pixiDotJsLib.PIXINs.tickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.ticker.TickerListener")
@js.native
class TickerListener protected () extends js.Object {
  def this(fn: js.Function1[/* deltaTime */ scala.Double, scala.Unit]) = this()
  def this(fn: js.Function1[/* deltaTime */ scala.Double, scala.Unit], context: js.Any) = this()
  def this(fn: js.Function1[/* deltaTime */ scala.Double, scala.Unit], context: js.Any, priority: scala.Double) = this()
  def this(fn: js.Function1[/* deltaTime */ scala.Double, scala.Unit], context: js.Any, priority: scala.Double, once: scala.Boolean) = this()
  var _destroyed: scala.Boolean = js.native
  var context: js.Any = js.native
  var next: TickerListener = js.native
  var once: scala.Boolean = js.native
  var previous: TickerListener = js.native
  var priority: scala.Double = js.native
  def connect(previous: TickerListener): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def destroy(hard: scala.Boolean): scala.Unit = js.native
  def emit(deltaTime: scala.Double): TickerListener = js.native
  def fn(deltaTime: scala.Double): scala.Unit = js.native
  def `match`(fn: js.Function1[/* deltaTime */ scala.Double, scala.Unit]): scala.Boolean = js.native
  def `match`(fn: js.Function1[/* deltaTime */ scala.Double, scala.Unit], context: js.Any): scala.Boolean = js.native
}

