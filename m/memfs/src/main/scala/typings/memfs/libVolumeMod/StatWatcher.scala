package typings.memfs.libVolumeMod

import typings.memfs.libSetTimeoutUnrefMod.TSetTimeout
import typings.memfs.libStatsMod.TStatNumber
import typings.memfs.libStatsMod.default
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("memfs/lib/volume", "StatWatcher")
@js.native
open class StatWatcher protected () extends EventEmitter {
  def this(vol: Volume) = this()
  
  var filename: String = js.native
  
  /* private */ var hasChanged: Any = js.native
  
  var interval: Double = js.native
  
  /* private */ var loop: Any = js.native
  
  /* private */ var onInterval: Any = js.native
  
  var prev: default[TStatNumber] = js.native
  
  def setTimeout(callback: js.Function1[/* repeated */ Any, Unit]): Any = js.native
  def setTimeout(callback: js.Function1[/* repeated */ Any, Unit], time: Double): Any = js.native
  def setTimeout(callback: js.Function1[/* repeated */ Any, Unit], time: Double, args: js.Array[Any]): Any = js.native
  def setTimeout(callback: js.Function1[/* repeated */ Any, Unit], time: Unit, args: js.Array[Any]): Any = js.native
  @JSName("setTimeout")
  var setTimeout_Original: TSetTimeout = js.native
  
  def start(path: String): Unit = js.native
  def start(path: String, persistent: Boolean): Unit = js.native
  def start(path: String, persistent: Boolean, interval: Double): Unit = js.native
  def start(path: String, persistent: Unit, interval: Double): Unit = js.native
  
  def stop(): Unit = js.native
  
  var timeoutRef: js.UndefOr[Any] = js.native
  
  var vol: Volume = js.native
}
