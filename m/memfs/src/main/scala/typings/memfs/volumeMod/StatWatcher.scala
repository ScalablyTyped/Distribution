package typings.memfs.volumeMod

import typings.memfs.setTimeoutUnrefMod.TSetTimeout
import typings.memfs.statsMod.TStatNumber
import typings.memfs.statsMod.default
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("memfs/lib/volume", "StatWatcher")
@js.native
class StatWatcher protected () extends EventEmitter {
  def this(vol: Volume) = this()
  var filename: String = js.native
  var hasChanged: js.Any = js.native
  var interval: Double = js.native
  var loop: js.Any = js.native
  var onInterval: js.Any = js.native
  var prev: default[TStatNumber] = js.native
  @JSName("setTimeout")
  var setTimeout_Original: TSetTimeout = js.native
  var timeoutRef: js.UndefOr[js.Any] = js.native
  var vol: Volume = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  def setTimeout(
    callback: js.Function1[/* repeated */ js.Any, Unit],
    time: js.UndefOr[scala.Nothing],
    args: js.Array[_]
  ): js.Any = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], time: Double): js.Any = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], time: Double, args: js.Array[_]): js.Any = js.native
  def start(path: String): Unit = js.native
  def start(path: String, persistent: js.UndefOr[scala.Nothing], interval: Double): Unit = js.native
  def start(path: String, persistent: Boolean): Unit = js.native
  def start(path: String, persistent: Boolean, interval: Double): Unit = js.native
  def stop(): Unit = js.native
}

