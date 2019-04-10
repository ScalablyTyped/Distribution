package typings
package pixiDotJsLib.PIXINs.tickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.ticker.Ticker")
@js.native
class Ticker () extends js.Object {
  val FPS: scala.Double = js.native
  var _head: TickerListener = js.native
  var _maxElapsedMS: scala.Double = js.native
  var _requestId: scala.Double | scala.Null = js.native
  var autoStart: scala.Boolean = js.native
  var deltaTime: scala.Double = js.native
  var elapsedMS: scala.Double = js.native
  var lastTime: scala.Double = js.native
  var minFPS: scala.Double = js.native
  var speed: scala.Double = js.native
  var started: scala.Boolean = js.native
  /* protected */ def _addListener(listener: TickerListener): Ticker = js.native
  /* protected */ def _cancelIfNeeded(): scala.Unit = js.native
  /* protected */ def _requestIfNeeded(): scala.Unit = js.native
  /* protected */ def _startIfPossible(): scala.Unit = js.native
  /* protected */ def _tick(time: scala.Double): scala.Unit = js.native
  def add(fn: js.Function1[/* deltaTime */ scala.Double, scala.Unit]): Ticker = js.native
  def add(fn: js.Function1[/* deltaTime */ scala.Double, scala.Unit], context: js.Any): Ticker = js.native
  def add(
    fn: js.Function1[/* deltaTime */ scala.Double, scala.Unit],
    context: js.Any,
    priority: scala.Double
  ): Ticker = js.native
  def addOnce(fn: js.Function1[/* deltaTime */ scala.Double, scala.Unit]): Ticker = js.native
  def addOnce(fn: js.Function1[/* deltaTime */ scala.Double, scala.Unit], context: js.Any): Ticker = js.native
  def addOnce(
    fn: js.Function1[/* deltaTime */ scala.Double, scala.Unit],
    context: js.Any,
    priority: scala.Double
  ): Ticker = js.native
  def destroy(): scala.Unit = js.native
  def remove(fn: js.Function1[/* repeated */ js.Any, _]): Ticker = js.native
  def remove(fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): Ticker = js.native
  def remove(fn: js.Function1[/* repeated */ js.Any, _], context: js.Any, priority: scala.Double): Ticker = js.native
  def start(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def update(): scala.Unit = js.native
  def update(currentTime: scala.Double): scala.Unit = js.native
}

