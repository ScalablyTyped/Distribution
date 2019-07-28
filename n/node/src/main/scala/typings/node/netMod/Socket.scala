package typings.node.netMod

import typings.node.Buffer
import typings.node.Error
import typings.node.nodeStrings.close
import typings.node.nodeStrings.connect
import typings.node.nodeStrings.data
import typings.node.nodeStrings.lookup
import typings.node.nodeStrings.timeout
import typings.node.streamMod.Duplex
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("net", "Socket")
@js.native
class Socket () extends Duplex {
  def this(options: SocketConstructorOpts) = this()
  val bufferSize: Double = js.native
  val bytesRead: Double = js.native
  val bytesWritten: Double = js.native
  val connecting: Boolean = js.native
  val destroyed: Boolean = js.native
  val localAddress: java.lang.String = js.native
  val localPort: Double = js.native
  val remoteAddress: js.UndefOr[java.lang.String] = js.native
  val remoteFamily: js.UndefOr[java.lang.String] = js.native
  val remotePort: js.UndefOr[Double] = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function1[/* had_error */ Boolean, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_lookup(
    event: lookup,
    listener: js.Function4[
      /* err */ Error, 
      /* address */ java.lang.String, 
      /* family */ java.lang.String | Double, 
      /* host */ java.lang.String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  def address(): AddressInfo | java.lang.String = js.native
  def connect(options: SocketConnectOpts): this.type = js.native
  def connect(options: SocketConnectOpts, connectionListener: js.Function0[Unit]): this.type = js.native
  def connect(path: java.lang.String): this.type = js.native
  def connect(path: java.lang.String, connectionListener: js.Function0[Unit]): this.type = js.native
  def connect(port: Double): this.type = js.native
  def connect(port: Double, connectionListener: js.Function0[Unit]): this.type = js.native
  def connect(port: Double, host: java.lang.String): this.type = js.native
  def connect(port: Double, host: java.lang.String, connectionListener: js.Function0[Unit]): this.type = js.native
  @JSName("emit")
  def emit_close(event: close, had_error: Boolean): Boolean = js.native
  @JSName("emit")
  def emit_connect(event: connect): Boolean = js.native
  @JSName("emit")
  def emit_data(event: data, data: Buffer): Boolean = js.native
  @JSName("emit")
  def emit_lookup(
    event: lookup,
    err: Error,
    address: java.lang.String,
    family: java.lang.String,
    host: java.lang.String
  ): Boolean = js.native
  @JSName("emit")
  def emit_lookup(event: lookup, err: Error, address: java.lang.String, family: Double, host: java.lang.String): Boolean = js.native
  @JSName("emit")
  def emit_timeout(event: timeout): Boolean = js.native
  def end(buffer: java.lang.String): Unit = js.native
  def end(buffer: java.lang.String, cb: js.Function0[Unit]): Unit = js.native
  def end(buffer: Uint8Array): Unit = js.native
  def end(buffer: Uint8Array, cb: js.Function0[Unit]): Unit = js.native
  def end(str: java.lang.String, encoding: java.lang.String): Unit = js.native
  def end(str: java.lang.String, encoding: java.lang.String, cb: js.Function0[Unit]): Unit = js.native
  def end(str: Uint8Array, encoding: java.lang.String): Unit = js.native
  def end(str: Uint8Array, encoding: java.lang.String, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function1[/* had_error */ Boolean, Unit]): this.type = js.native
  @JSName("on")
  def on_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_lookup(
    event: lookup,
    listener: js.Function4[
      /* err */ Error, 
      /* address */ java.lang.String, 
      /* family */ java.lang.String | Double, 
      /* host */ java.lang.String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function1[/* had_error */ Boolean, Unit]): this.type = js.native
  @JSName("once")
  def once_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_lookup(
    event: lookup,
    listener: js.Function4[
      /* err */ Error, 
      /* address */ java.lang.String, 
      /* family */ java.lang.String | Double, 
      /* host */ java.lang.String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function1[/* had_error */ Boolean, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_lookup(
    event: lookup,
    listener: js.Function4[
      /* err */ Error, 
      /* address */ java.lang.String, 
      /* family */ java.lang.String | Double, 
      /* host */ java.lang.String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function1[/* had_error */ Boolean, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_lookup(
    event: lookup,
    listener: js.Function4[
      /* err */ Error, 
      /* address */ java.lang.String, 
      /* family */ java.lang.String | Double, 
      /* host */ java.lang.String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  def ref(): Unit = js.native
  def setEncoding(): this.type = js.native
  def setKeepAlive(): this.type = js.native
  def setKeepAlive(enable: Boolean): this.type = js.native
  def setKeepAlive(enable: Boolean, initialDelay: Double): this.type = js.native
  def setNoDelay(): this.type = js.native
  def setNoDelay(noDelay: Boolean): this.type = js.native
  def setTimeout(timeout: Double): this.type = js.native
  def setTimeout(timeout: Double, callback: js.Function0[Unit]): this.type = js.native
  def unref(): Unit = js.native
  def write(buffer: java.lang.String): Boolean = js.native
  def write(buffer: java.lang.String, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Boolean = js.native
  // Extended base methods
  def write(buffer: Uint8Array): Boolean = js.native
  def write(buffer: Uint8Array, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Boolean = js.native
  def write(str: java.lang.String, encoding: java.lang.String): Boolean = js.native
  def write(
    str: java.lang.String,
    encoding: java.lang.String,
    cb: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Boolean = js.native
  def write(str: Uint8Array, encoding: java.lang.String): Boolean = js.native
  def write(str: Uint8Array, encoding: java.lang.String, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Boolean = js.native
}

