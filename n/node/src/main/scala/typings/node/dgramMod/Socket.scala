package typings.node.dgramMod

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.netMod.AddressInfo
import typings.node.nodeStrings.close
import typings.node.nodeStrings.connect
import typings.node.nodeStrings.error
import typings.node.nodeStrings.listening
import typings.node.nodeStrings.message
import typings.std.Error
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dgram", "Socket")
@js.native
class Socket () extends EventEmitter {
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_listening(event: listening, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(event: message, listener: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
  def addMembership(multicastAddress: String): Unit = js.native
  def addMembership(multicastAddress: String, multicastInterface: String): Unit = js.native
  /**
    * Tells the kernel to join a source-specific multicast channel at the given
    * `sourceAddress` and `groupAddress`, using the `multicastInterface` with the
    * `IP_ADD_SOURCE_MEMBERSHIP` socket option.
    * If the `multicastInterface` argument
    * is not specified, the operating system will choose one interface and will add
    * membership to it.
    * To add membership to every available interface, call
    * `socket.addSourceSpecificMembership()` multiple times, once per interface.
    */
  def addSourceSpecificMembership(sourceAddress: String, groupAddress: String): Unit = js.native
  def addSourceSpecificMembership(sourceAddress: String, groupAddress: String, multicastInterface: String): Unit = js.native
  def address(): AddressInfo = js.native
  def bind(): Unit = js.native
  def bind(callback: js.Function0[Unit]): Unit = js.native
  def bind(options: BindOptions): Unit = js.native
  def bind(options: BindOptions, callback: js.Function0[Unit]): Unit = js.native
  def bind(port: Double): Unit = js.native
  def bind(port: Double, address: String): Unit = js.native
  def bind(port: Double, address: String, callback: js.Function0[Unit]): Unit = js.native
  def bind(port: Double, callback: js.Function0[Unit]): Unit = js.native
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  def connect(port: Double): Unit = js.native
  def connect(port: Double, address: String): Unit = js.native
  def connect(port: Double, address: String, callback: js.Function0[Unit]): Unit = js.native
  def connect(port: Double, callback: js.Function0[Unit]): Unit = js.native
  def disconnect(): Unit = js.native
  def dropMembership(multicastAddress: String): Unit = js.native
  def dropMembership(multicastAddress: String, multicastInterface: String): Unit = js.native
  /**
    * Instructs the kernel to leave a source-specific multicast channel at the given
    * `sourceAddress` and `groupAddress` using the `IP_DROP_SOURCE_MEMBERSHIP`
    * socket option. This method is automatically called by the kernel when the
    * socket is closed or the process terminates, so most apps will never have
    * reason to call this.
    *
    * If `multicastInterface` is not specified, the operating system will attempt to
    * drop membership on all valid interfaces.
    */
  def dropSourceSpecificMembership(sourceAddress: String, groupAddress: String): Unit = js.native
  def dropSourceSpecificMembership(sourceAddress: String, groupAddress: String, multicastInterface: String): Unit = js.native
  @JSName("emit")
  def emit_close(event: close): Boolean = js.native
  @JSName("emit")
  def emit_connect(event: connect): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, err: Error): Boolean = js.native
  @JSName("emit")
  def emit_listening(event: listening): Boolean = js.native
  @JSName("emit")
  def emit_message(event: message, msg: Buffer, rinfo: RemoteInfo): Boolean = js.native
  def getRecvBufferSize(): Double = js.native
  def getSendBufferSize(): Double = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_listening(event: listening, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: message, listener: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_listening(event: listening, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_message(event: message, listener: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_listening(event: listening, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(event: message, listener: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_listening(event: listening, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(event: message, listener: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
  def ref(): this.type = js.native
  def remoteAddress(): AddressInfo = js.native
  def send(msg: String): Unit = js.native
  def send(msg: String, callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]): Unit = js.native
  def send(msg: String, offset: Double, length: Double): Unit = js.native
  def send(
    msg: String,
    offset: Double,
    length: Double,
    callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
  ): Unit = js.native
  def send(msg: String, offset: Double, length: Double, port: Double): Unit = js.native
  def send(msg: String, offset: Double, length: Double, port: Double, address: String): Unit = js.native
  def send(
    msg: String,
    offset: Double,
    length: Double,
    port: Double,
    address: String,
    callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
  ): Unit = js.native
  def send(
    msg: String,
    offset: Double,
    length: Double,
    port: Double,
    callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
  ): Unit = js.native
  def send(msg: String, port: Double): Unit = js.native
  def send(msg: String, port: Double, address: String): Unit = js.native
  def send(
    msg: String,
    port: Double,
    address: String,
    callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
  ): Unit = js.native
  def send(
    msg: String,
    port: Double,
    callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
  ): Unit = js.native
  def send(msg: js.Array[_]): Unit = js.native
  def send(msg: js.Array[_], callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]): Unit = js.native
  def send(msg: js.Array[_], port: Double): Unit = js.native
  def send(msg: js.Array[_], port: Double, address: String): Unit = js.native
  def send(
    msg: js.Array[_],
    port: Double,
    address: String,
    callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
  ): Unit = js.native
  def send(
    msg: js.Array[_],
    port: Double,
    callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
  ): Unit = js.native
  def send(msg: Uint8Array): Unit = js.native
  def send(msg: Uint8Array, callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]): Unit = js.native
  def send(msg: Uint8Array, offset: Double, length: Double): Unit = js.native
  def send(
    msg: Uint8Array,
    offset: Double,
    length: Double,
    callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
  ): Unit = js.native
  def send(msg: Uint8Array, offset: Double, length: Double, port: Double): Unit = js.native
  def send(msg: Uint8Array, offset: Double, length: Double, port: Double, address: String): Unit = js.native
  def send(
    msg: Uint8Array,
    offset: Double,
    length: Double,
    port: Double,
    address: String,
    callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
  ): Unit = js.native
  def send(
    msg: Uint8Array,
    offset: Double,
    length: Double,
    port: Double,
    callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
  ): Unit = js.native
  def send(msg: Uint8Array, port: Double): Unit = js.native
  def send(msg: Uint8Array, port: Double, address: String): Unit = js.native
  def send(
    msg: Uint8Array,
    port: Double,
    address: String,
    callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
  ): Unit = js.native
  def send(
    msg: Uint8Array,
    port: Double,
    callback: js.Function2[/* error */ Error | Null, /* bytes */ Double, Unit]
  ): Unit = js.native
  def setBroadcast(flag: Boolean): Unit = js.native
  def setMulticastInterface(multicastInterface: String): Unit = js.native
  def setMulticastLoopback(flag: Boolean): Unit = js.native
  def setMulticastTTL(ttl: Double): Unit = js.native
  def setRecvBufferSize(size: Double): Unit = js.native
  def setSendBufferSize(size: Double): Unit = js.native
  def setTTL(ttl: Double): Unit = js.native
  def unref(): this.type = js.native
}

