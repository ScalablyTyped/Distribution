package typings
package nodeLib.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "Worker")
@js.native
class Worker ()
  extends nodeLib.eventsMod.EventEmitter {
  var exitedAfterDisconnect: scala.Boolean = js.native
  var id: scala.Double = js.native
  var process: nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  @JSName("addListener")
  def addListener_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_listening(event: nodeLib.nodeLibStrings.listening, listener: js.Function1[/* address */ Address, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* handle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("addListener")
  def addListener_online(event: nodeLib.nodeLibStrings.online, listener: js.Function0[scala.Unit]): this.type = js.native
  def destroy(): scala.Unit = js.native
  def destroy(signal: java.lang.String): scala.Unit = js.native
  def disconnect(): scala.Unit = js.native
  @JSName("emit")
  def emit_disconnect(event: nodeLib.nodeLibStrings.disconnect): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(event: nodeLib.nodeLibStrings.error, error: nodeLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_exit(event: nodeLib.nodeLibStrings.exit, code: scala.Double, signal: java.lang.String): scala.Boolean = js.native
  @JSName("emit")
  def emit_listening(event: nodeLib.nodeLibStrings.listening, address: Address): scala.Boolean = js.native
  @JSName("emit")
  def emit_message(event: nodeLib.nodeLibStrings.message, message: js.Any, handle: nodeLib.netMod.Server): scala.Boolean = js.native
  @JSName("emit")
  def emit_message(event: nodeLib.nodeLibStrings.message, message: js.Any, handle: nodeLib.netMod.Socket): scala.Boolean = js.native
  @JSName("emit")
  def emit_online(event: nodeLib.nodeLibStrings.online): scala.Boolean = js.native
  def isConnected(): scala.Boolean = js.native
  def isDead(): scala.Boolean = js.native
  def kill(): scala.Unit = js.native
  def kill(signal: java.lang.String): scala.Unit = js.native
  @JSName("on")
  def on_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_listening(event: nodeLib.nodeLibStrings.listening, listener: js.Function1[/* address */ Address, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* handle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("on")
  def on_online(event: nodeLib.nodeLibStrings.online, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_listening(event: nodeLib.nodeLibStrings.listening, listener: js.Function1[/* address */ Address, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* handle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("once")
  def once_online(event: nodeLib.nodeLibStrings.online, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_listening(event: nodeLib.nodeLibStrings.listening, listener: js.Function1[/* address */ Address, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* handle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("prependListener")
  def prependListener_online(event: nodeLib.nodeLibStrings.online, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_listening(event: nodeLib.nodeLibStrings.listening, listener: js.Function1[/* address */ Address, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* handle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("prependOnceListener")
  def prependOnceListener_online(event: nodeLib.nodeLibStrings.online, listener: js.Function0[scala.Unit]): this.type = js.native
  def send(message: js.Any): scala.Boolean = js.native
  def send(message: js.Any, sendHandle: js.Any): scala.Boolean = js.native
  def send(message: js.Any, sendHandle: js.Any, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Boolean = js.native
}

