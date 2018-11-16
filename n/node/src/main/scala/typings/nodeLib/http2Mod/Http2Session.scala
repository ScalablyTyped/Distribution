package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Http2Session
  extends nodeLib.eventsMod.EventEmitter {
  val alpnProtocol: js.UndefOr[java.lang.String] = js.native
  val closed: scala.Boolean = js.native
  val connecting: scala.Boolean = js.native
  val destroyed: scala.Boolean = js.native
  val encrypted: js.UndefOr[scala.Boolean] = js.native
  val localSettings: Settings = js.native
  val originSet: js.UndefOr[js.Array[java.lang.String]] = js.native
  val pendingSettingsAck: scala.Boolean = js.native
  val remoteSettings: Settings = js.native
  val socket: nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket = js.native
  val state: SessionState = js.native
  val `type`: scala.Double = js.native
  @JSName("addListener")
  def addListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_frameError(
    event: nodeLib.nodeLibStrings.frameError,
    listener: js.Function3[
      /* frameType */ scala.Double, 
      /* errorCode */ scala.Double, 
      /* streamID */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_goaway(
    event: nodeLib.nodeLibStrings.goaway,
    listener: js.Function3[
      /* errorCode */ scala.Double, 
      /* lastStreamID */ scala.Double, 
      /* opaqueData */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_localSettings(
    event: nodeLib.nodeLibStrings.localSettings,
    listener: js.Function1[/* settings */ Settings, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_ping(event: nodeLib.nodeLibStrings.ping, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_remoteSettings(
    event: nodeLib.nodeLibStrings.remoteSettings,
    listener: js.Function1[/* settings */ Settings, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_timeout(event: nodeLib.nodeLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def destroy(error: nodeLib.Error): scala.Unit = js.native
  def destroy(error: nodeLib.Error, code: scala.Double): scala.Unit = js.native
  @JSName("emit")
  def emit_close(event: nodeLib.nodeLibStrings.close): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(event: nodeLib.nodeLibStrings.error, err: nodeLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_frameError(
    event: nodeLib.nodeLibStrings.frameError,
    frameType: scala.Double,
    errorCode: scala.Double,
    streamID: scala.Double
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_goaway(
    event: nodeLib.nodeLibStrings.goaway,
    errorCode: scala.Double,
    lastStreamID: scala.Double,
    opaqueData: nodeLib.Buffer
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_localSettings(event: nodeLib.nodeLibStrings.localSettings, settings: Settings): scala.Boolean = js.native
  @JSName("emit")
  def emit_ping(event: nodeLib.nodeLibStrings.ping): scala.Boolean = js.native
  @JSName("emit")
  def emit_remoteSettings(event: nodeLib.nodeLibStrings.remoteSettings, settings: Settings): scala.Boolean = js.native
  @JSName("emit")
  def emit_timeout(event: nodeLib.nodeLibStrings.timeout): scala.Boolean = js.native
  def goaway(): scala.Unit = js.native
  def goaway(code: scala.Double): scala.Unit = js.native
  def goaway(code: scala.Double, lastStreamID: scala.Double): scala.Unit = js.native
  def goaway(code: scala.Double, lastStreamID: scala.Double, opaqueData: nodeLib.Buffer): scala.Unit = js.native
  def goaway(code: scala.Double, lastStreamID: scala.Double, opaqueData: nodeLib.NodeJSNs.TypedArray): scala.Unit = js.native
  def goaway(code: scala.Double, lastStreamID: scala.Double, opaqueData: stdLib.DataView): scala.Unit = js.native
  @JSName("on")
  def on_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_frameError(
    event: nodeLib.nodeLibStrings.frameError,
    listener: js.Function3[
      /* frameType */ scala.Double, 
      /* errorCode */ scala.Double, 
      /* streamID */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_goaway(
    event: nodeLib.nodeLibStrings.goaway,
    listener: js.Function3[
      /* errorCode */ scala.Double, 
      /* lastStreamID */ scala.Double, 
      /* opaqueData */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_localSettings(
    event: nodeLib.nodeLibStrings.localSettings,
    listener: js.Function1[/* settings */ Settings, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_ping(event: nodeLib.nodeLibStrings.ping, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_remoteSettings(
    event: nodeLib.nodeLibStrings.remoteSettings,
    listener: js.Function1[/* settings */ Settings, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_timeout(event: nodeLib.nodeLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_frameError(
    event: nodeLib.nodeLibStrings.frameError,
    listener: js.Function3[
      /* frameType */ scala.Double, 
      /* errorCode */ scala.Double, 
      /* streamID */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_goaway(
    event: nodeLib.nodeLibStrings.goaway,
    listener: js.Function3[
      /* errorCode */ scala.Double, 
      /* lastStreamID */ scala.Double, 
      /* opaqueData */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_localSettings(
    event: nodeLib.nodeLibStrings.localSettings,
    listener: js.Function1[/* settings */ Settings, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_ping(event: nodeLib.nodeLibStrings.ping, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_remoteSettings(
    event: nodeLib.nodeLibStrings.remoteSettings,
    listener: js.Function1[/* settings */ Settings, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_timeout(event: nodeLib.nodeLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  def ping(
    callback: js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      /* duration */ scala.Double, 
      /* payload */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def ping(
    payload: nodeLib.Buffer,
    callback: js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      /* duration */ scala.Double, 
      /* payload */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def ping(
    payload: nodeLib.NodeJSNs.TypedArray,
    callback: js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      /* duration */ scala.Double, 
      /* payload */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def ping(
    payload: stdLib.DataView,
    callback: js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      /* duration */ scala.Double, 
      /* payload */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  @JSName("prependListener")
  def prependListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_frameError(
    event: nodeLib.nodeLibStrings.frameError,
    listener: js.Function3[
      /* frameType */ scala.Double, 
      /* errorCode */ scala.Double, 
      /* streamID */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_goaway(
    event: nodeLib.nodeLibStrings.goaway,
    listener: js.Function3[
      /* errorCode */ scala.Double, 
      /* lastStreamID */ scala.Double, 
      /* opaqueData */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_localSettings(
    event: nodeLib.nodeLibStrings.localSettings,
    listener: js.Function1[/* settings */ Settings, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_ping(event: nodeLib.nodeLibStrings.ping, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_remoteSettings(
    event: nodeLib.nodeLibStrings.remoteSettings,
    listener: js.Function1[/* settings */ Settings, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_timeout(event: nodeLib.nodeLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_frameError(
    event: nodeLib.nodeLibStrings.frameError,
    listener: js.Function3[
      /* frameType */ scala.Double, 
      /* errorCode */ scala.Double, 
      /* streamID */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_goaway(
    event: nodeLib.nodeLibStrings.goaway,
    listener: js.Function3[
      /* errorCode */ scala.Double, 
      /* lastStreamID */ scala.Double, 
      /* opaqueData */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_localSettings(
    event: nodeLib.nodeLibStrings.localSettings,
    listener: js.Function1[/* settings */ Settings, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_ping(event: nodeLib.nodeLibStrings.ping, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_remoteSettings(
    event: nodeLib.nodeLibStrings.remoteSettings,
    listener: js.Function1[/* settings */ Settings, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_timeout(event: nodeLib.nodeLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  def priority(stream: Http2Stream, options: StreamPriorityOptions): scala.Unit = js.native
  def ref(): scala.Unit = js.native
  def rstStream(stream: Http2Stream): scala.Unit = js.native
  def rstStream(stream: Http2Stream, code: scala.Double): scala.Unit = js.native
  def setTimeout(msecs: scala.Double): scala.Unit = js.native
  def setTimeout(msecs: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def settings(settings: Settings): scala.Unit = js.native
  def unref(): scala.Unit = js.native
}

