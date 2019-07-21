package typings
package nodeLib.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("net", "Socket")
@js.native
class Socket ()
  extends nodeLib.streamMod.Duplex {
  def this(options: SocketConstructorOpts) = this()
  val bufferSize: scala.Double = js.native
  val bytesRead: scala.Double = js.native
  val bytesWritten: scala.Double = js.native
  val connecting: scala.Boolean = js.native
  val destroyed: scala.Boolean = js.native
  val localAddress: java.lang.String = js.native
  val localPort: scala.Double = js.native
  val remoteAddress: js.UndefOr[java.lang.String] = js.native
  val remoteFamily: js.UndefOr[java.lang.String] = js.native
  val remotePort: js.UndefOr[scala.Double] = js.native
  @JSName("addListener")
  def addListener_close(
    event: nodeLib.nodeLibStrings.close,
    listener: js.Function1[/* had_error */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_connect(event: nodeLib.nodeLibStrings.connect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_lookup(
    event: nodeLib.nodeLibStrings.lookup,
    listener: js.Function4[
      /* err */ nodeLib.Error, 
      /* address */ java.lang.String, 
      /* family */ java.lang.String | scala.Double, 
      /* host */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_timeout(event: nodeLib.nodeLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  def address(): AddressInfo | java.lang.String = js.native
  def connect(options: SocketConnectOpts): this.type = js.native
  def connect(options: SocketConnectOpts, connectionListener: js.Function0[scala.Unit]): this.type = js.native
  def connect(path: java.lang.String): this.type = js.native
  def connect(path: java.lang.String, connectionListener: js.Function0[scala.Unit]): this.type = js.native
  def connect(port: scala.Double): this.type = js.native
  def connect(port: scala.Double, connectionListener: js.Function0[scala.Unit]): this.type = js.native
  def connect(port: scala.Double, host: java.lang.String): this.type = js.native
  def connect(port: scala.Double, host: java.lang.String, connectionListener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("emit")
  def emit_close(event: nodeLib.nodeLibStrings.close, had_error: scala.Boolean): scala.Boolean = js.native
  @JSName("emit")
  def emit_connect(event: nodeLib.nodeLibStrings.connect): scala.Boolean = js.native
  @JSName("emit")
  def emit_data(event: nodeLib.nodeLibStrings.data, data: nodeLib.Buffer): scala.Boolean = js.native
  @JSName("emit")
  def emit_lookup(
    event: nodeLib.nodeLibStrings.lookup,
    err: nodeLib.Error,
    address: java.lang.String,
    family: java.lang.String,
    host: java.lang.String
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_lookup(
    event: nodeLib.nodeLibStrings.lookup,
    err: nodeLib.Error,
    address: java.lang.String,
    family: scala.Double,
    host: java.lang.String
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_timeout(event: nodeLib.nodeLibStrings.timeout): scala.Boolean = js.native
  def end(buffer: java.lang.String): scala.Unit = js.native
  def end(buffer: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def end(buffer: stdLib.Uint8Array): scala.Unit = js.native
  def end(buffer: stdLib.Uint8Array, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def end(str: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def end(str: java.lang.String, encoding: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def end(str: stdLib.Uint8Array, encoding: java.lang.String): scala.Unit = js.native
  def end(str: stdLib.Uint8Array, encoding: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_close(
    event: nodeLib.nodeLibStrings.close,
    listener: js.Function1[/* had_error */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_connect(event: nodeLib.nodeLibStrings.connect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_lookup(
    event: nodeLib.nodeLibStrings.lookup,
    listener: js.Function4[
      /* err */ nodeLib.Error, 
      /* address */ java.lang.String, 
      /* family */ java.lang.String | scala.Double, 
      /* host */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_timeout(event: nodeLib.nodeLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_close(
    event: nodeLib.nodeLibStrings.close,
    listener: js.Function1[/* had_error */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_connect(event: nodeLib.nodeLibStrings.connect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_lookup(
    event: nodeLib.nodeLibStrings.lookup,
    listener: js.Function4[
      /* err */ nodeLib.Error, 
      /* address */ java.lang.String, 
      /* family */ java.lang.String | scala.Double, 
      /* host */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_timeout(event: nodeLib.nodeLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(
    event: nodeLib.nodeLibStrings.close,
    listener: js.Function1[/* had_error */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_connect(event: nodeLib.nodeLibStrings.connect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_lookup(
    event: nodeLib.nodeLibStrings.lookup,
    listener: js.Function4[
      /* err */ nodeLib.Error, 
      /* address */ java.lang.String, 
      /* family */ java.lang.String | scala.Double, 
      /* host */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_timeout(event: nodeLib.nodeLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(
    event: nodeLib.nodeLibStrings.close,
    listener: js.Function1[/* had_error */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connect(event: nodeLib.nodeLibStrings.connect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_lookup(
    event: nodeLib.nodeLibStrings.lookup,
    listener: js.Function4[
      /* err */ nodeLib.Error, 
      /* address */ java.lang.String, 
      /* family */ java.lang.String | scala.Double, 
      /* host */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_timeout(event: nodeLib.nodeLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  def ref(): scala.Unit = js.native
  def setEncoding(): this.type = js.native
  def setKeepAlive(): this.type = js.native
  def setKeepAlive(enable: scala.Boolean): this.type = js.native
  def setKeepAlive(enable: scala.Boolean, initialDelay: scala.Double): this.type = js.native
  def setNoDelay(): this.type = js.native
  def setNoDelay(noDelay: scala.Boolean): this.type = js.native
  def setTimeout(timeout: scala.Double): this.type = js.native
  def setTimeout(timeout: scala.Double, callback: js.Function0[scala.Unit]): this.type = js.native
  def unref(): scala.Unit = js.native
  def write(buffer: java.lang.String): scala.Boolean = js.native
  def write(buffer: java.lang.String, cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]): scala.Boolean = js.native
  // Extended base methods
  def write(buffer: stdLib.Uint8Array): scala.Boolean = js.native
  def write(buffer: stdLib.Uint8Array, cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]): scala.Boolean = js.native
  def write(str: java.lang.String, encoding: java.lang.String): scala.Boolean = js.native
  def write(
    str: java.lang.String,
    encoding: java.lang.String,
    cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Boolean = js.native
  def write(str: stdLib.Uint8Array, encoding: java.lang.String): scala.Boolean = js.native
  def write(
    str: stdLib.Uint8Array,
    encoding: java.lang.String,
    cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Boolean = js.native
}

