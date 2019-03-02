package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http2", "Http2ServerResponse")
@js.native
class Http2ServerResponse protected ()
  extends nodeLib.eventsMod.EventEmitter {
  var connection: nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket = js.native
  val finished: scala.Boolean = js.native
  val headersSent: scala.Boolean = js.native
  var sendDate: scala.Boolean = js.native
  var socket: nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket = js.native
  var statusCode: scala.Double = js.native
  var statusMessage: nodeLib.nodeLibStrings.Empty = js.native
  var stream: ServerHttp2Stream = js.native
  @JSName("addListener")
  def addListener_aborted(
    event: nodeLib.nodeLibStrings.aborted,
    listener: js.Function2[/* hadError */ scala.Boolean, /* code */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_drain(event: nodeLib.nodeLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_finish(event: nodeLib.nodeLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  def addTrailers(trailers: nodeLib.httpMod.OutgoingHttpHeaders): scala.Unit = js.native
  def createPushResponse(
    headers: nodeLib.httpMod.OutgoingHttpHeaders,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* res */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("emit")
  def emit_aborted(event: nodeLib.nodeLibStrings.aborted, hadError: scala.Boolean, code: scala.Double): scala.Boolean = js.native
  @JSName("emit")
  def emit_close(event: nodeLib.nodeLibStrings.close): scala.Boolean = js.native
  @JSName("emit")
  def emit_drain(event: nodeLib.nodeLibStrings.drain): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(event: nodeLib.nodeLibStrings.error, error: nodeLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_finish(event: nodeLib.nodeLibStrings.finish): scala.Boolean = js.native
  def end(): scala.Unit = js.native
  def end(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def end(data: java.lang.String): scala.Unit = js.native
  def end(data: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def end(data: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def end(data: java.lang.String, encoding: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def end(data: nodeLib.Buffer): scala.Unit = js.native
  def end(data: nodeLib.Buffer, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def end(data: nodeLib.Buffer, encoding: java.lang.String): scala.Unit = js.native
  def end(data: nodeLib.Buffer, encoding: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def getHeader(name: java.lang.String): java.lang.String = js.native
  def getHeaderNames(): js.Array[java.lang.String] = js.native
  def getHeaders(): nodeLib.httpMod.OutgoingHttpHeaders = js.native
  def hasHeader(name: java.lang.String): scala.Boolean = js.native
  @JSName("on")
  def on_aborted(
    event: nodeLib.nodeLibStrings.aborted,
    listener: js.Function2[/* hadError */ scala.Boolean, /* code */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: nodeLib.nodeLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: nodeLib.nodeLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_aborted(
    event: nodeLib.nodeLibStrings.aborted,
    listener: js.Function2[/* hadError */ scala.Boolean, /* code */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_drain(event: nodeLib.nodeLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_finish(event: nodeLib.nodeLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_aborted(
    event: nodeLib.nodeLibStrings.aborted,
    listener: js.Function2[/* hadError */ scala.Boolean, /* code */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_drain(event: nodeLib.nodeLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_finish(event: nodeLib.nodeLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_aborted(
    event: nodeLib.nodeLibStrings.aborted,
    listener: js.Function2[/* hadError */ scala.Boolean, /* code */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_drain(event: nodeLib.nodeLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_finish(event: nodeLib.nodeLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  def removeHeader(name: java.lang.String): scala.Unit = js.native
  def setHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setHeader(name: java.lang.String, value: js.Array[java.lang.String]): scala.Unit = js.native
  def setHeader(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  def setTimeout(msecs: scala.Double): scala.Unit = js.native
  def setTimeout(msecs: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def write(chunk: java.lang.String): scala.Boolean = js.native
  def write(chunk: java.lang.String, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Boolean = js.native
  def write(chunk: java.lang.String, encoding: java.lang.String): scala.Boolean = js.native
  def write(
    chunk: java.lang.String,
    encoding: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Boolean = js.native
  def write(chunk: nodeLib.Buffer): scala.Boolean = js.native
  def write(chunk: nodeLib.Buffer, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Boolean = js.native
  def write(chunk: nodeLib.Buffer, encoding: java.lang.String): scala.Boolean = js.native
  def write(
    chunk: nodeLib.Buffer,
    encoding: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Boolean = js.native
  def writeContinue(): scala.Unit = js.native
  def writeHead(statusCode: scala.Double): this.type = js.native
  def writeHead(statusCode: scala.Double, headers: nodeLib.httpMod.OutgoingHttpHeaders): this.type = js.native
  def writeHead(statusCode: scala.Double, statusMessage: java.lang.String): this.type = js.native
  def writeHead(
    statusCode: scala.Double,
    statusMessage: java.lang.String,
    headers: nodeLib.httpMod.OutgoingHttpHeaders
  ): this.type = js.native
}

