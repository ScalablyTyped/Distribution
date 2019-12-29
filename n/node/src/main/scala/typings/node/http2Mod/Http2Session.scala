package typings.node.http2Mod

import typings.node.Buffer
import typings.node.NodeJS.ArrayBufferView
import typings.node.eventsMod.EventEmitter
import typings.node.netMod.Socket
import typings.node.nodeStrings.close
import typings.node.nodeStrings.error
import typings.node.nodeStrings.frameError
import typings.node.nodeStrings.goaway
import typings.node.nodeStrings.ping
import typings.node.nodeStrings.timeout
import typings.node.tlsMod.TLSSocket
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Http2Session extends EventEmitter {
  val alpnProtocol: js.UndefOr[String] = js.native
  val closed: Boolean = js.native
  val connecting: Boolean = js.native
  val destroyed: Boolean = js.native
  val encrypted: js.UndefOr[Boolean] = js.native
  val localSettings: Settings = js.native
  val originSet: js.UndefOr[js.Array[String]] = js.native
  val pendingSettingsAck: Boolean = js.native
  val remoteSettings: Settings = js.native
  val socket: Socket | TLSSocket = js.native
  val state: SessionState = js.native
  val `type`: Double = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_frameError(
    event: frameError,
    listener: js.Function3[/* frameType */ Double, /* errorCode */ Double, /* streamID */ Double, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_goaway(
    event: goaway,
    listener: js.Function3[/* errorCode */ Double, /* lastStreamID */ Double, /* opaqueData */ Buffer, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_localSettings(
    event: typings.node.nodeStrings.localSettings,
    listener: js.Function1[/* settings */ Settings, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_ping(event: ping, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_remoteSettings(
    event: typings.node.nodeStrings.remoteSettings,
    listener: js.Function1[/* settings */ Settings, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  def destroy(): Unit = js.native
  def destroy(error: Error): Unit = js.native
  def destroy(error: Error, code: Double): Unit = js.native
  @JSName("emit")
  def emit_close(event: close): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, err: Error): Boolean = js.native
  @JSName("emit")
  def emit_frameError(event: frameError, frameType: Double, errorCode: Double, streamID: Double): Boolean = js.native
  @JSName("emit")
  def emit_goaway(event: goaway, errorCode: Double, lastStreamID: Double, opaqueData: Buffer): Boolean = js.native
  @JSName("emit")
  def emit_localSettings(event: typings.node.nodeStrings.localSettings, settings: Settings): Boolean = js.native
  @JSName("emit")
  def emit_ping(event: ping): Boolean = js.native
  @JSName("emit")
  def emit_remoteSettings(event: typings.node.nodeStrings.remoteSettings, settings: Settings): Boolean = js.native
  @JSName("emit")
  def emit_timeout(event: timeout): Boolean = js.native
  def goaway(): Unit = js.native
  def goaway(code: Double): Unit = js.native
  def goaway(code: Double, lastStreamID: Double): Unit = js.native
  def goaway(code: Double, lastStreamID: Double, opaqueData: ArrayBufferView): Unit = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_frameError(
    event: frameError,
    listener: js.Function3[/* frameType */ Double, /* errorCode */ Double, /* streamID */ Double, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_goaway(
    event: goaway,
    listener: js.Function3[/* errorCode */ Double, /* lastStreamID */ Double, /* opaqueData */ Buffer, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_localSettings(
    event: typings.node.nodeStrings.localSettings,
    listener: js.Function1[/* settings */ Settings, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_ping(event: ping, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_remoteSettings(
    event: typings.node.nodeStrings.remoteSettings,
    listener: js.Function1[/* settings */ Settings, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_frameError(
    event: frameError,
    listener: js.Function3[/* frameType */ Double, /* errorCode */ Double, /* streamID */ Double, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_goaway(
    event: goaway,
    listener: js.Function3[/* errorCode */ Double, /* lastStreamID */ Double, /* opaqueData */ Buffer, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_localSettings(
    event: typings.node.nodeStrings.localSettings,
    listener: js.Function1[/* settings */ Settings, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_ping(event: ping, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_remoteSettings(
    event: typings.node.nodeStrings.remoteSettings,
    listener: js.Function1[/* settings */ Settings, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  def ping(callback: js.Function3[/* err */ Error | Null, /* duration */ Double, /* payload */ Buffer, Unit]): Boolean = js.native
  def ping(
    payload: ArrayBufferView,
    callback: js.Function3[/* err */ Error | Null, /* duration */ Double, /* payload */ Buffer, Unit]
  ): Boolean = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_frameError(
    event: frameError,
    listener: js.Function3[/* frameType */ Double, /* errorCode */ Double, /* streamID */ Double, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_goaway(
    event: goaway,
    listener: js.Function3[/* errorCode */ Double, /* lastStreamID */ Double, /* opaqueData */ Buffer, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_localSettings(
    event: typings.node.nodeStrings.localSettings,
    listener: js.Function1[/* settings */ Settings, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_ping(event: ping, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_remoteSettings(
    event: typings.node.nodeStrings.remoteSettings,
    listener: js.Function1[/* settings */ Settings, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_frameError(
    event: frameError,
    listener: js.Function3[/* frameType */ Double, /* errorCode */ Double, /* streamID */ Double, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_goaway(
    event: goaway,
    listener: js.Function3[/* errorCode */ Double, /* lastStreamID */ Double, /* opaqueData */ Buffer, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_localSettings(
    event: typings.node.nodeStrings.localSettings,
    listener: js.Function1[/* settings */ Settings, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_ping(event: ping, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_remoteSettings(
    event: typings.node.nodeStrings.remoteSettings,
    listener: js.Function1[/* settings */ Settings, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  def ref(): Unit = js.native
  def setTimeout(msecs: Double): Unit = js.native
  def setTimeout(msecs: Double, callback: js.Function0[Unit]): Unit = js.native
  def settings(settings: Settings): Unit = js.native
  def unref(): Unit = js.native
}

