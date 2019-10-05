package typings.pixiDotJs.PIXI

import typings.pixiDotJs.PIXI.ticker.Ticker
import typings.pixiDotJs.PIXI.ticker.TickerListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ticker
@JSGlobal("PIXI.ticker")
@js.native
object ticker extends js.Object {
  @js.native
  class Ticker () extends js.Object {
    val FPS: Double = js.native
    var _head: TickerListener = js.native
    var _maxElapsedMS: Double = js.native
    var _requestId: Double | Null = js.native
    var autoStart: Boolean = js.native
    var deltaTime: Double = js.native
    var elapsedMS: Double = js.native
    var lastTime: Double = js.native
    var minFPS: Double = js.native
    var speed: Double = js.native
    var started: Boolean = js.native
    /* protected */ def _addListener(listener: TickerListener): Ticker = js.native
    /* protected */ def _cancelIfNeeded(): Unit = js.native
    /* protected */ def _requestIfNeeded(): Unit = js.native
    /* protected */ def _startIfPossible(): Unit = js.native
    /* protected */ def _tick(time: Double): Unit = js.native
    def add(fn: js.Function1[/* deltaTime */ Double, Unit]): Ticker = js.native
    def add(fn: js.Function1[/* deltaTime */ Double, Unit], context: js.Any): Ticker = js.native
    def add(fn: js.Function1[/* deltaTime */ Double, Unit], context: js.Any, priority: Double): Ticker = js.native
    def addOnce(fn: js.Function1[/* deltaTime */ Double, Unit]): Ticker = js.native
    def addOnce(fn: js.Function1[/* deltaTime */ Double, Unit], context: js.Any): Ticker = js.native
    def addOnce(fn: js.Function1[/* deltaTime */ Double, Unit], context: js.Any, priority: Double): Ticker = js.native
    def destroy(): Unit = js.native
    def remove(fn: js.Function1[/* repeated */ js.Any, _]): Ticker = js.native
    def remove(fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): Ticker = js.native
    def remove(fn: js.Function1[/* repeated */ js.Any, _], context: js.Any, priority: Double): Ticker = js.native
    def start(): Unit = js.native
    def stop(): Unit = js.native
    def update(): Unit = js.native
    def update(currentTime: Double): Unit = js.native
  }
  
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
  
  val shared: Ticker = js.native
}

