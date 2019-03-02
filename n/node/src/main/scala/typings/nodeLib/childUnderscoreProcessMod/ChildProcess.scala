package typings
package nodeLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildProcess
  extends nodeLib.eventsMod.EventEmitter {
  val channel: js.UndefOr[nodeLib.streamMod.internalNs.Pipe | scala.Null] = js.native
  val connected: scala.Boolean = js.native
  val killed: scala.Boolean = js.native
  val pid: scala.Double = js.native
  var stderr: nodeLib.streamMod.Readable | scala.Null = js.native
  var stdin: nodeLib.streamMod.Writable | scala.Null = js.native
  val stdio: js.Tuple5[
    nodeLib.streamMod.Writable | scala.Null, 
    nodeLib.streamMod.Readable | scala.Null, 
    nodeLib.streamMod.Readable | scala.Null, 
    js.UndefOr[nodeLib.streamMod.Readable | nodeLib.streamMod.Writable | scala.Null], 
    js.UndefOr[nodeLib.streamMod.Readable | nodeLib.streamMod.Writable | scala.Null]
  ] = js.native
  var stdout: nodeLib.streamMod.Readable | scala.Null = js.native
  @JSName("addListener")
  def addListener_close(
    event: nodeLib.nodeLibStrings.close,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function2[
      /* code */ scala.Double | scala.Null, 
      /* signal */ java.lang.String | scala.Null, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* sendHandle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
  def disconnect(): scala.Unit = js.native
  @JSName("emit")
  def emit_close(event: nodeLib.nodeLibStrings.close, code: scala.Double, signal: java.lang.String): scala.Boolean = js.native
  @JSName("emit")
  def emit_disconnect(event: nodeLib.nodeLibStrings.disconnect): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(event: nodeLib.nodeLibStrings.error, err: nodeLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_exit(event: nodeLib.nodeLibStrings.exit): scala.Boolean = js.native
  @JSName("emit")
  def emit_exit(event: nodeLib.nodeLibStrings.exit, code: scala.Double): scala.Boolean = js.native
  @JSName("emit")
  def emit_exit(event: nodeLib.nodeLibStrings.exit, code: scala.Double, signal: java.lang.String): scala.Boolean = js.native
  @JSName("emit")
  def emit_exit(event: nodeLib.nodeLibStrings.exit, code: scala.Null, signal: java.lang.String): scala.Boolean = js.native
  @JSName("emit")
  def emit_message(event: nodeLib.nodeLibStrings.message, message: js.Any, sendHandle: nodeLib.netMod.Server): scala.Boolean = js.native
  @JSName("emit")
  def emit_message(event: nodeLib.nodeLibStrings.message, message: js.Any, sendHandle: nodeLib.netMod.Socket): scala.Boolean = js.native
  def kill(): scala.Unit = js.native
  def kill(signal: java.lang.String): scala.Unit = js.native
  @JSName("on")
  def on_close(
    event: nodeLib.nodeLibStrings.close,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function2[
      /* code */ scala.Double | scala.Null, 
      /* signal */ java.lang.String | scala.Null, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* sendHandle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_close(
    event: nodeLib.nodeLibStrings.close,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function2[
      /* code */ scala.Double | scala.Null, 
      /* signal */ java.lang.String | scala.Null, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* sendHandle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(
    event: nodeLib.nodeLibStrings.close,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function2[
      /* code */ scala.Double | scala.Null, 
      /* signal */ java.lang.String | scala.Null, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* sendHandle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(
    event: nodeLib.nodeLibStrings.close,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function2[
      /* code */ scala.Double | scala.Null, 
      /* signal */ java.lang.String | scala.Null, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* sendHandle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
  def ref(): scala.Unit = js.native
  def send(message: js.Any): scala.Boolean = js.native
  def send(message: js.Any, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Boolean = js.native
  def send(message: js.Any, sendHandle: nodeLib.netMod.Server): scala.Boolean = js.native
  def send(
    message: js.Any,
    sendHandle: nodeLib.netMod.Server,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Boolean = js.native
  def send(message: js.Any, sendHandle: nodeLib.netMod.Server, options: MessageOptions): scala.Boolean = js.native
  def send(
    message: js.Any,
    sendHandle: nodeLib.netMod.Server,
    options: MessageOptions,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Boolean = js.native
  def send(message: js.Any, sendHandle: nodeLib.netMod.Socket): scala.Boolean = js.native
  def send(
    message: js.Any,
    sendHandle: nodeLib.netMod.Socket,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Boolean = js.native
  def send(message: js.Any, sendHandle: nodeLib.netMod.Socket, options: MessageOptions): scala.Boolean = js.native
  def send(
    message: js.Any,
    sendHandle: nodeLib.netMod.Socket,
    options: MessageOptions,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Boolean = js.native
  def unref(): scala.Unit = js.native
}

