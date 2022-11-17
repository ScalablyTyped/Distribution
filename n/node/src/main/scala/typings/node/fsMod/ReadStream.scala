package typings.node.fsMod

import typings.node.NodeJS.ErrnoException
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.ReadableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "ReadStream")
@js.native
open class ReadStream () extends StObject {
  def this(opts: ReadableOptions) = this()
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_readable")
  def addListener(event: "readable", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_resume")
  def addListener(event: "resume", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_ready")
  def addListener(event: "ready", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_pause")
  def addListener(event: "pause", listener: js.Function0[Unit]): this.type = js.native
  /**
    * events.EventEmitter
    *   1. open
    *   2. close
    *   3. ready
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_close")
  def addListener(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_end")
  def addListener(event: "end", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_error")
  def addListener(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_data")
  def addListener(event: "data", listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_open")
  def addListener(event: "open", listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * The number of bytes that have been read so far.
    * @since v6.4.0
    */
  var bytesRead: Double = js.native
  
  def close(): Unit = js.native
  def close(callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): Unit = js.native
  
  @JSName("on")
  @scala.annotation.targetName("on_resume")
  def on(event: "resume", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_pause")
  def on(event: "pause", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_close")
  def on(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_readable")
  def on(event: "readable", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_end")
  def on(event: "end", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_ready")
  def on(event: "ready", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_error")
  def on(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_open")
  def on(event: "open", listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_data")
  def on(event: "data", listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_pause")
  def once(event: "pause", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_end")
  def once(event: "end", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_ready")
  def once(event: "ready", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_readable")
  def once(event: "readable", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_resume")
  def once(event: "resume", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_close")
  def once(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_open")
  def once(event: "open", listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_error")
  def once(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_data")
  def once(event: "data", listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * The path to the file the stream is reading from as specified in the first
    * argument to `fs.createReadStream()`. If `path` is passed as a string, then`readStream.path` will be a string. If `path` is passed as a `Buffer`, then`readStream.path` will be a
    * `Buffer`. If `fd` is specified, then`readStream.path` will be `undefined`.
    * @since v0.1.93
    */
  var path: String | Buffer = js.native
  
  /**
    * This property is `true` if the underlying file has not been opened yet,
    * i.e. before the `'ready'` event is emitted.
    * @since v11.2.0, v10.16.0
    */
  var pending: Boolean = js.native
  
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_ready")
  def prependListener(event: "ready", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_close")
  def prependListener(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_pause")
  def prependListener(event: "pause", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_readable")
  def prependListener(event: "readable", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_resume")
  def prependListener(event: "resume", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_end")
  def prependListener(event: "end", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_open")
  def prependListener(event: "open", listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_data")
  def prependListener(event: "data", listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_error")
  def prependListener(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_resume")
  def prependOnceListener(event: "resume", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_readable")
  def prependOnceListener(event: "readable", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_end")
  def prependOnceListener(event: "end", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_ready")
  def prependOnceListener(event: "ready", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_close")
  def prependOnceListener(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_pause")
  def prependOnceListener(event: "pause", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_data")
  def prependOnceListener(event: "data", listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_open")
  def prependOnceListener(event: "open", listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_error")
  def prependOnceListener(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
}
