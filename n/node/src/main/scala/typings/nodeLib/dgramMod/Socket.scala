package typings
package nodeLib.dgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dgram", "Socket")
@js.native
class Socket ()
  extends nodeLib.eventsMod.EventEmitter {
  @JSName("addListener")
  def addListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_listening(event: nodeLib.nodeLibStrings.listening, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function2[/* msg */ nodeLib.Buffer, /* rinfo */ nodeLib.netMod.AddressInfo, scala.Unit]
  ): this.type = js.native
  def addMembership(multicastAddress: java.lang.String): scala.Unit = js.native
  def addMembership(multicastAddress: java.lang.String, multicastInterface: java.lang.String): scala.Unit = js.native
  def address(): nodeLib.netMod.AddressInfo | java.lang.String = js.native
  def bind(): scala.Unit = js.native
  def bind(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def bind(options: BindOptions): scala.Unit = js.native
  def bind(options: BindOptions, callback: js.Function): scala.Unit = js.native
  def bind(port: scala.Double): scala.Unit = js.native
  def bind(port: scala.Double, address: java.lang.String): scala.Unit = js.native
  def bind(port: scala.Double, address: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def bind(port: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def dropMembership(multicastAddress: java.lang.String): scala.Unit = js.native
  def dropMembership(multicastAddress: java.lang.String, multicastInterface: java.lang.String): scala.Unit = js.native
  @JSName("emit")
  def emit_close(event: nodeLib.nodeLibStrings.close): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(event: nodeLib.nodeLibStrings.error, err: nodeLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_listening(event: nodeLib.nodeLibStrings.listening): scala.Boolean = js.native
  @JSName("emit")
  def emit_message(event: nodeLib.nodeLibStrings.message, msg: nodeLib.Buffer, rinfo: nodeLib.netMod.AddressInfo): scala.Boolean = js.native
  def getRecvBufferSize(): scala.Double = js.native
  def getSendBufferSize(): scala.Double = js.native
  @JSName("on")
  def on_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_listening(event: nodeLib.nodeLibStrings.listening, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function2[/* msg */ nodeLib.Buffer, /* rinfo */ nodeLib.netMod.AddressInfo, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_listening(event: nodeLib.nodeLibStrings.listening, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function2[/* msg */ nodeLib.Buffer, /* rinfo */ nodeLib.netMod.AddressInfo, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_listening(event: nodeLib.nodeLibStrings.listening, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function2[/* msg */ nodeLib.Buffer, /* rinfo */ nodeLib.netMod.AddressInfo, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_listening(event: nodeLib.nodeLibStrings.listening, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function2[/* msg */ nodeLib.Buffer, /* rinfo */ nodeLib.netMod.AddressInfo, scala.Unit]
  ): this.type = js.native
  def ref(): this.type = js.native
  def send(msg: java.lang.String, offset: scala.Double, length: scala.Double, port: scala.Double): scala.Unit = js.native
  def send(
    msg: java.lang.String,
    offset: scala.Double,
    length: scala.Double,
    port: scala.Double,
    address: java.lang.String
  ): scala.Unit = js.native
  def send(
    msg: java.lang.String,
    offset: scala.Double,
    length: scala.Double,
    port: scala.Double,
    address: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* bytes */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def send(msg: java.lang.String, port: scala.Double): scala.Unit = js.native
  def send(msg: java.lang.String, port: scala.Double, address: java.lang.String): scala.Unit = js.native
  def send(
    msg: java.lang.String,
    port: scala.Double,
    address: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* bytes */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def send(msg: js.Array[_], port: scala.Double): scala.Unit = js.native
  def send(msg: js.Array[_], port: scala.Double, address: java.lang.String): scala.Unit = js.native
  def send(
    msg: js.Array[_],
    port: scala.Double,
    address: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* bytes */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def send(msg: nodeLib.Buffer, offset: scala.Double, length: scala.Double, port: scala.Double): scala.Unit = js.native
  def send(
    msg: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    port: scala.Double,
    address: java.lang.String
  ): scala.Unit = js.native
  def send(
    msg: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    port: scala.Double,
    address: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* bytes */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def send(msg: nodeLib.Buffer, port: scala.Double): scala.Unit = js.native
  def send(msg: nodeLib.Buffer, port: scala.Double, address: java.lang.String): scala.Unit = js.native
  def send(
    msg: nodeLib.Buffer,
    port: scala.Double,
    address: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* bytes */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def send(msg: stdLib.Uint8Array, offset: scala.Double, length: scala.Double, port: scala.Double): scala.Unit = js.native
  def send(
    msg: stdLib.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    port: scala.Double,
    address: java.lang.String
  ): scala.Unit = js.native
  def send(
    msg: stdLib.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    port: scala.Double,
    address: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* bytes */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def send(msg: stdLib.Uint8Array, port: scala.Double): scala.Unit = js.native
  def send(msg: stdLib.Uint8Array, port: scala.Double, address: java.lang.String): scala.Unit = js.native
  def send(
    msg: stdLib.Uint8Array,
    port: scala.Double,
    address: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* bytes */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def setBroadcast(flag: scala.Boolean): scala.Unit = js.native
  def setMulticastInterface(multicastInterface: java.lang.String): scala.Unit = js.native
  def setMulticastLoopback(flag: scala.Boolean): scala.Unit = js.native
  def setMulticastTTL(ttl: scala.Double): scala.Unit = js.native
  def setRecvBufferSize(size: scala.Double): scala.Unit = js.native
  def setSendBufferSize(size: scala.Double): scala.Unit = js.native
  def setTTL(ttl: scala.Double): scala.Unit = js.native
  def unref(): this.type = js.native
}

