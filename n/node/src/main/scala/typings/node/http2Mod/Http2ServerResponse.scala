package typings.node.http2Mod

import typings.node.Error
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.netMod.Socket
import typings.node.nodeStrings.Empty
import typings.node.nodeStrings.close
import typings.node.nodeStrings.drain
import typings.node.nodeStrings.error
import typings.node.nodeStrings.finish
import typings.node.nodeStrings.pipe
import typings.node.nodeStrings.unpipe
import typings.node.streamMod.Readable
import typings.node.streamMod.Stream
import typings.node.tlsMod.TLSSocket
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http2", "Http2ServerResponse")
@js.native
class Http2ServerResponse protected () extends Stream {
  def this(stream: ServerHttp2Stream) = this()
  val connection: Socket | TLSSocket = js.native
  val finished: Boolean = js.native
  val headersSent: Boolean = js.native
  var sendDate: Boolean = js.native
  val socket: Socket | TLSSocket = js.native
  var statusCode: Double = js.native
  var statusMessage: Empty = js.native
  val stream: ServerHttp2Stream = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  def addTrailers(trailers: OutgoingHttpHeaders): Unit = js.native
  def createPushResponse(
    headers: OutgoingHttpHeaders,
    callback: js.Function2[/* err */ Error | Null, /* res */ this.type, Unit]
  ): Unit = js.native
  @JSName("emit")
  def emit_close(event: close): Boolean = js.native
  @JSName("emit")
  def emit_drain(event: drain): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, error: Error): Boolean = js.native
  @JSName("emit")
  def emit_finish(event: finish): Boolean = js.native
  @JSName("emit")
  def emit_pipe(event: pipe, src: Readable): Boolean = js.native
  @JSName("emit")
  def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
  def end(): Unit = js.native
  def end(callback: js.Function0[Unit]): Unit = js.native
  def end(data: java.lang.String): Unit = js.native
  def end(data: java.lang.String, callback: js.Function0[Unit]): Unit = js.native
  def end(data: java.lang.String, encoding: java.lang.String): Unit = js.native
  def end(data: java.lang.String, encoding: java.lang.String, callback: js.Function0[Unit]): Unit = js.native
  def end(data: Uint8Array): Unit = js.native
  def end(data: Uint8Array, callback: js.Function0[Unit]): Unit = js.native
  def end(data: Uint8Array, encoding: java.lang.String): Unit = js.native
  def end(data: Uint8Array, encoding: java.lang.String, callback: js.Function0[Unit]): Unit = js.native
  def getHeader(name: java.lang.String): java.lang.String = js.native
  def getHeaderNames(): js.Array[java.lang.String] = js.native
  def getHeaders(): OutgoingHttpHeaders = js.native
  def hasHeader(name: java.lang.String): Boolean = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("once")
  def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  def removeHeader(name: java.lang.String): Unit = js.native
  def setHeader(name: java.lang.String, value: java.lang.String): Unit = js.native
  def setHeader(name: java.lang.String, value: js.Array[java.lang.String]): Unit = js.native
  def setHeader(name: java.lang.String, value: Double): Unit = js.native
  def setTimeout(msecs: Double): Unit = js.native
  def setTimeout(msecs: Double, callback: js.Function0[Unit]): Unit = js.native
  def write(chunk: java.lang.String): Boolean = js.native
  def write(chunk: java.lang.String, callback: js.Function1[/* err */ Error, Unit]): Boolean = js.native
  def write(chunk: java.lang.String, encoding: java.lang.String): Boolean = js.native
  def write(chunk: java.lang.String, encoding: java.lang.String, callback: js.Function1[/* err */ Error, Unit]): Boolean = js.native
  def write(chunk: Uint8Array): Boolean = js.native
  def write(chunk: Uint8Array, callback: js.Function1[/* err */ Error, Unit]): Boolean = js.native
  def write(chunk: Uint8Array, encoding: java.lang.String): Boolean = js.native
  def write(chunk: Uint8Array, encoding: java.lang.String, callback: js.Function1[/* err */ Error, Unit]): Boolean = js.native
  def writeContinue(): Unit = js.native
  def writeHead(statusCode: Double): this.type = js.native
  def writeHead(statusCode: Double, headers: OutgoingHttpHeaders): this.type = js.native
  def writeHead(statusCode: Double, statusMessage: java.lang.String): this.type = js.native
  def writeHead(statusCode: Double, statusMessage: java.lang.String, headers: OutgoingHttpHeaders): this.type = js.native
}

