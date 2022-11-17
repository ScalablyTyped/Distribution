package typings.node.fsMod

import typings.node.NodeJS.ErrnoException
import typings.node.bufferMod.global.Buffer
import typings.node.nodeColonstreamMod.Readable
import typings.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "WriteStream")
@js.native
open class WriteStream () extends StObject {
  def this(opts: WritableOptions) = this()
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_drain")
  def addListener(event: "drain", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_finish")
  def addListener(event: "finish", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_ready")
  def addListener(event: "ready", listener: js.Function0[Unit]): this.type = js.native
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
  @scala.annotation.targetName("addListener_unpipe")
  def addListener(event: "unpipe", listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_error")
  def addListener(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_open")
  def addListener(event: "open", listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_pipe")
  def addListener(event: "pipe", listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * The number of bytes written so far. Does not include data that is still queued
    * for writing.
    * @since v0.4.7
    */
  var bytesWritten: Double = js.native
  
  /**
    * Closes `writeStream`. Optionally accepts a
    * callback that will be executed once the `writeStream`is closed.
    * @since v0.9.4
    */
  def close(): Unit = js.native
  def close(callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): Unit = js.native
  
  @JSName("on")
  @scala.annotation.targetName("on_close")
  def on(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_finish")
  def on(event: "finish", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_ready")
  def on(event: "ready", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_drain")
  def on(event: "drain", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_unpipe")
  def on(event: "unpipe", listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_error")
  def on(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_open")
  def on(event: "open", listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_pipe")
  def on(event: "pipe", listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_drain")
  def once(event: "drain", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_ready")
  def once(event: "ready", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_finish")
  def once(event: "finish", listener: js.Function0[Unit]): this.type = js.native
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
  @scala.annotation.targetName("once_pipe")
  def once(event: "pipe", listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_unpipe")
  def once(event: "unpipe", listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * The path to the file the stream is writing to as specified in the first
    * argument to {@link createWriteStream}. If `path` is passed as a string, then`writeStream.path` will be a string. If `path` is passed as a `Buffer`, then`writeStream.path` will be a
    * `Buffer`.
    * @since v0.1.93
    */
  var path: String | Buffer = js.native
  
  /**
    * This property is `true` if the underlying file has not been opened yet,
    * i.e. before the `'ready'` event is emitted.
    * @since v11.2.0
    */
  var pending: Boolean = js.native
  
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_finish")
  def prependListener(event: "finish", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_ready")
  def prependListener(event: "ready", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_close")
  def prependListener(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_drain")
  def prependListener(event: "drain", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_pipe")
  def prependListener(event: "pipe", listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_open")
  def prependListener(event: "open", listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_unpipe")
  def prependListener(event: "unpipe", listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_error")
  def prependListener(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_drain")
  def prependOnceListener(event: "drain", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_ready")
  def prependOnceListener(event: "ready", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_close")
  def prependOnceListener(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_finish")
  def prependOnceListener(event: "finish", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_open")
  def prependOnceListener(event: "open", listener: js.Function1[/* fd */ Double, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_pipe")
  def prependOnceListener(event: "pipe", listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_error")
  def prependOnceListener(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_unpipe")
  def prependOnceListener(event: "unpipe", listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
}
