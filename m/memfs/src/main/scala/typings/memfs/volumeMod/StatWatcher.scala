package typings.memfs.volumeMod

import typings.memfs.setTimeoutUnrefMod.TSetTimeout
import typings.memfs.statsMod.TStatNumber
import typings.memfs.statsMod.default
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("memfs/lib/volume", "StatWatcher")
@js.native
class StatWatcher protected () extends EventEmitter {
  def this(vol: Volume) = this()
  
  var filename: String = js.native
  
  /* private */ var hasChanged: js.Any = js.native
  
  var interval: Double = js.native
  
  /* private */ var loop: js.Any = js.native
  
  /* private */ var onInterval: js.Any = js.native
  
  var prev: default[TStatNumber] = js.native
  
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], time: Double): js.Any = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], time: Double, args: js.Array[js.Any]): js.Any = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], time: Unit, args: js.Array[js.Any]): js.Any = js.native
  @JSName("setTimeout")
  var setTimeout_Original: TSetTimeout = js.native
  
  def start(path: String): Unit = js.native
  def start(path: String, persistent: Boolean): Unit = js.native
  def start(path: String, persistent: Boolean, interval: Double): Unit = js.native
  def start(path: String, persistent: Unit, interval: Double): Unit = js.native
  
  def stop(): Unit = js.native
  
  var timeoutRef: js.UndefOr[js.Any] = js.native
  
  var vol: Volume = js.native
}
