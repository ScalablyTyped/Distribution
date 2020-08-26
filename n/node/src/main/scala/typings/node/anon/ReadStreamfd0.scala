package typings.node.anon

import typings.node.BufferEncoding
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.eventsMod.EventEmitterOptions
import typings.node.netMod.AddressInfo
import typings.node.netMod.SocketConnectOpts
import typings.node.netMod.SocketConstructorOpts
import typings.node.nodeStrings.close
import typings.node.nodeStrings.connect
import typings.node.nodeStrings.data
import typings.node.nodeStrings.drain
import typings.node.nodeStrings.end
import typings.node.nodeStrings.error
import typings.node.nodeStrings.finish
import typings.node.nodeStrings.lookup
import typings.node.nodeStrings.pause
import typings.node.nodeStrings.pipe
import typings.node.nodeStrings.readable
import typings.node.nodeStrings.resume
import typings.node.nodeStrings.timeout
import typings.node.nodeStrings.unpipe
import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.WritableOptions
import typings.std.Error
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined node.process.<global>.NodeJS.ReadStream & {  fd :0} */
@js.native
trait ReadStreamfd0 extends js.Object {
  var _writev: js.UndefOr[
    js.Function2[
      /* chunks */ js.Array[Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  val bufferSize: Double = js.native
  val bytesRead: Double = js.native
  val bytesWritten: Double = js.native
  val connecting: Boolean = js.native
  val destroyed: Boolean = js.native
  var fd: typings.node.nodeNumbers.`0` = js.native
  var isRaw: Boolean = js.native
  var isTTY: Boolean = js.native
  val localAddress: String = js.native
  val localPort: Double = js.native
  var readable: Boolean = js.native
  val readableEncoding: BufferEncoding | Null = js.native
  val readableEnded: Boolean = js.native
  val readableFlowing: Boolean | Null = js.native
  val readableHighWaterMark: Double = js.native
  val readableLength: Double = js.native
  val readableObjectMode: Boolean = js.native
  val remoteAddress: js.UndefOr[String] = js.native
  val remoteFamily: js.UndefOr[String] = js.native
  val remotePort: js.UndefOr[Double] = js.native
  val writable: Boolean = js.native
  val writableCorked: Double = js.native
  val writableEnded: Boolean = js.native
  val writableFinished: Boolean = js.native
  val writableHighWaterMark: Double = js.native
  val writableLength: Double = js.native
  val writableObjectMode: Boolean = js.native
  def _destroy(error: Null, callback: js.Function1[js.UndefOr[Error | Null], Unit]): Unit = js.native
  def _destroy(error: Error, callback: js.Function1[js.UndefOr[Error | Null], Unit]): Unit = js.native
  def _final(callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  def _read(size: Double): Unit = js.native
  def _write(
    chunk: js.Any,
    encoding: BufferEncoding,
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  /**
    * events.EventEmitter
    *   1. close
    *   2. connect
    *   3. data
    *   4. drain
    *   5. end
    *   6. error
    *   7. lookup
    *   8. timeout
    */
  def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /**
    * Event emitter
    * The defined events on documents including:
    * 1. close
    * 2. drain
    * 3. error
    * 4. finish
    * 5. pipe
    * 6. unpipe
    */
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function1[/* had_error */ Boolean, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* data */ typings.node.Buffer), Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_lookup(
    event: lookup,
    listener: js.Function4[
      /* err */ Error, 
      /* address */ String, 
      /* family */ String | Double, 
      /* host */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  def address(): AddressInfo | String = js.native
  def connect(options: SocketConnectOpts): this.type = js.native
  def connect(options: SocketConnectOpts, connectionListener: js.Function0[Unit]): this.type = js.native
  def connect(path: String): this.type = js.native
  def connect(path: String, connectionListener: js.Function0[Unit]): this.type = js.native
  def connect(port: Double): this.type = js.native
  def connect(port: Double, connectionListener: js.Function0[Unit]): this.type = js.native
  def connect(port: Double, host: String): this.type = js.native
  def connect(port: Double, host: String, connectionListener: js.Function0[Unit]): this.type = js.native
  def cork(): Unit = js.native
  def destroy(): Unit = js.native
  def destroy(error: Error): Unit = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  @JSName("emit")
  def emit_close(event: close): Boolean = js.native
  @JSName("emit")
  def emit_close(event: close, had_error: Boolean): Boolean = js.native
  @JSName("emit")
  def emit_connect(event: connect): Boolean = js.native
  @JSName("emit")
  def emit_data(event: data, chunk: js.Any): Boolean = js.native
  @JSName("emit")
  def emit_data(event: data, data: typings.node.Buffer): Boolean = js.native
  @JSName("emit")
  def emit_drain(event: drain): Boolean = js.native
  @JSName("emit")
  def emit_end(event: end): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, err: Error): Boolean = js.native
  @JSName("emit")
  def emit_finish(event: finish): Boolean = js.native
  @JSName("emit")
  def emit_lookup(event: lookup, err: Error, address: String, family: String, host: String): Boolean = js.native
  @JSName("emit")
  def emit_lookup(event: lookup, err: Error, address: String, family: Double, host: String): Boolean = js.native
  @JSName("emit")
  def emit_pause(event: pause): Boolean = js.native
  @JSName("emit")
  def emit_pipe(event: pipe, src: Readable): Boolean = js.native
  @JSName("emit")
  def emit_readable(event: readable): Boolean = js.native
  @JSName("emit")
  def emit_resume(event: resume): Boolean = js.native
  @JSName("emit")
  def emit_timeout(event: timeout): Boolean = js.native
  @JSName("emit")
  def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
  // Extended base methods
  def end(): Unit = js.native
  def end(buffer: String): Unit = js.native
  def end(buffer: String, cb: js.Function0[Unit]): Unit = js.native
  def end(buffer: Uint8Array): Unit = js.native
  def end(buffer: Uint8Array, cb: js.Function0[Unit]): Unit = js.native
  def end(cb: js.Function0[Unit]): Unit = js.native
  def end(chunk: js.Any): Unit = js.native
  def end(chunk: js.Any, cb: js.Function0[Unit]): Unit = js.native
  def end(chunk: js.Any, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
  def end(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
  def end(chunk: js.Any, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
  def end(str: String, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
  def end(str: String, encoding: BufferEncoding): Unit = js.native
  def end(str: String, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
  def end(str: Uint8Array, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
  def end(str: Uint8Array, encoding: BufferEncoding): Unit = js.native
  def end(str: Uint8Array, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
  def eventNames(): js.Array[String | js.Symbol] = js.native
  def getMaxListeners(): Double = js.native
  def isPaused(): Boolean = js.native
  def listenerCount(`type`: String): Double = js.native
  def listenerCount(`type`: js.Symbol): Double = js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function1[/* had_error */ Boolean, Unit]): this.type = js.native
  @JSName("on")
  def on_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* data */ typings.node.Buffer), Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_lookup(
    event: lookup,
    listener: js.Function4[
      /* err */ Error, 
      /* address */ String, 
      /* family */ String | Double, 
      /* host */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function1[/* had_error */ Boolean, Unit]): this.type = js.native
  @JSName("once")
  def once_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* data */ typings.node.Buffer), Unit]): this.type = js.native
  @JSName("once")
  def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_lookup(
    event: lookup,
    listener: js.Function4[
      /* err */ Error, 
      /* address */ String, 
      /* family */ String | Double, 
      /* host */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("once")
  def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  def pause(): this.type = js.native
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function1[/* had_error */ Boolean, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* data */ typings.node.Buffer), Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_lookup(
    event: lookup,
    listener: js.Function4[
      /* err */ Error, 
      /* address */ String, 
      /* family */ String | Double, 
      /* host */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function1[/* had_error */ Boolean, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_data(event: data, listener: js.Function1[(/* chunk */ js.Any) | (/* data */ typings.node.Buffer), Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_lookup(
    event: lookup,
    listener: js.Function4[
      /* err */ Error, 
      /* address */ String, 
      /* family */ String | Double, 
      /* host */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  def push(chunk: js.Any): Boolean = js.native
  def push(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
  def rawListeners(event: String): js.Array[js.Function] = js.native
  def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  def read(): js.Any = js.native
  def read(size: Double): js.Any = js.native
  @JSName("read")
  def read_Union(): String | typings.node.Buffer = js.native
  @JSName("read")
  def read_Union(size: Double): String | typings.node.Buffer = js.native
  def ref(): this.type = js.native
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: String): this.type = js.native
  def removeAllListeners(event: js.Symbol): this.type = js.native
  def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  def resume(): this.type = js.native
  def setDefaultEncoding(encoding: BufferEncoding): this.type = js.native
  def setEncoding(): this.type = js.native
  def setEncoding(encoding: BufferEncoding): this.type = js.native
  def setKeepAlive(): this.type = js.native
  def setKeepAlive(enable: js.UndefOr[scala.Nothing], initialDelay: Double): this.type = js.native
  def setKeepAlive(enable: Boolean): this.type = js.native
  def setKeepAlive(enable: Boolean, initialDelay: Double): this.type = js.native
  def setMaxListeners(n: Double): this.type = js.native
  def setNoDelay(): this.type = js.native
  def setNoDelay(noDelay: Boolean): this.type = js.native
  def setRawMode(mode: Boolean): this.type = js.native
  def setTimeout(timeout: Double): this.type = js.native
  def setTimeout(timeout: Double, callback: js.Function0[Unit]): this.type = js.native
  def uncork(): Unit = js.native
  def unpipe(): this.type = js.native
  def unpipe(destination: WritableStream): this.type = js.native
  def unref(): this.type = js.native
  def unshift(chunk: String): Unit = js.native
  def unshift(chunk: String, encoding: BufferEncoding): Unit = js.native
  def unshift(chunk: js.Any): Unit = js.native
  def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
  def unshift(chunk: Uint8Array): Unit = js.native
  def unshift(chunk: Uint8Array, encoding: BufferEncoding): Unit = js.native
  def wrap(oldStream: ReadableStream): this.type = js.native
  def write(buffer: String): Boolean = js.native
  def write(buffer: String, cb: js.Function1[js.UndefOr[Error | Null], Unit]): Boolean = js.native
  // Extended base methods
  def write(buffer: Uint8Array): Boolean = js.native
  def write(buffer: Uint8Array, cb: js.Function1[js.UndefOr[Error | Null], Unit]): Boolean = js.native
  def write(chunk: js.Any): Boolean = js.native
  def write(chunk: js.Any, cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
  def write(
    chunk: js.Any,
    encoding: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Boolean = js.native
  def write(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
  def write(
    chunk: js.Any,
    encoding: BufferEncoding,
    cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Boolean = js.native
  def write(str: String, encoding: js.UndefOr[scala.Nothing], cb: js.Function1[js.UndefOr[Error | Null], Unit]): Boolean = js.native
  def write(str: String, encoding: BufferEncoding): Boolean = js.native
  def write(str: String, encoding: BufferEncoding, cb: js.Function1[js.UndefOr[Error | Null], Unit]): Boolean = js.native
  def write(
    str: Uint8Array,
    encoding: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Boolean = js.native
  def write(str: Uint8Array, encoding: BufferEncoding): Boolean = js.native
  def write(str: Uint8Array, encoding: BufferEncoding, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Boolean = js.native
}

