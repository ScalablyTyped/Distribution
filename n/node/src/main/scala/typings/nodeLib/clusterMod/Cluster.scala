package typings
package nodeLib.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster
  extends nodeLib.eventsMod.EventEmitter {
  var Worker: Worker = js.native
  var isMaster: scala.Boolean = js.native
  var isWorker: scala.Boolean = js.native
  // TODO: cluster.schedulingPolicy
  var settings: ClusterSettings = js.native
  var worker: js.UndefOr[Worker] = js.native
  var workers: /* import warning: ImportType.apply Failed type conversion: {[index: string] : node.cluster.Worker | undefined, [index: string] : node.cluster.Worker | undefined} */ js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: {[index: string] : node.cluster.Worker | undefined, [index: string] : node.cluster.Worker | undefined} */ js.Any
  ] = js.native
  @JSName("addListener")
  def addListener_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: js.Function1[/* worker */ Worker, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function3[
      /* worker */ Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_fork(event: nodeLib.nodeLibStrings.fork, listener: js.Function1[/* worker */ Worker, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_listening(
    event: nodeLib.nodeLibStrings.listening,
    listener: js.Function2[/* worker */ Worker, /* address */ Address, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function3[
      /* worker */ Worker, 
      /* message */ js.Any, 
      /* handle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("addListener")
  def addListener_online(event: nodeLib.nodeLibStrings.online, listener: js.Function1[/* worker */ Worker, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_setup(event: nodeLib.nodeLibStrings.setup, listener: js.Function1[/* settings */ js.Any, scala.Unit]): this.type = js.native
  def disconnect(): scala.Unit = js.native
  def disconnect(callback: js.Function): scala.Unit = js.native
  @JSName("emit")
  def emit_disconnect(event: nodeLib.nodeLibStrings.disconnect, worker: Worker): scala.Boolean = js.native
  @JSName("emit")
  def emit_exit(event: nodeLib.nodeLibStrings.exit, worker: Worker, code: scala.Double, signal: java.lang.String): scala.Boolean = js.native
  @JSName("emit")
  def emit_fork(event: nodeLib.nodeLibStrings.fork, worker: Worker): scala.Boolean = js.native
  @JSName("emit")
  def emit_listening(event: nodeLib.nodeLibStrings.listening, worker: Worker, address: Address): scala.Boolean = js.native
  @JSName("emit")
  def emit_message(
    event: nodeLib.nodeLibStrings.message,
    worker: Worker,
    message: js.Any,
    handle: nodeLib.netMod.Server
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_message(
    event: nodeLib.nodeLibStrings.message,
    worker: Worker,
    message: js.Any,
    handle: nodeLib.netMod.Socket
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_online(event: nodeLib.nodeLibStrings.online, worker: Worker): scala.Boolean = js.native
  @JSName("emit")
  def emit_setup(event: nodeLib.nodeLibStrings.setup, settings: js.Any): scala.Boolean = js.native
  def fork(): Worker = js.native
  def fork(env: js.Any): Worker = js.native
  @JSName("on")
  def on_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: js.Function1[/* worker */ Worker, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function3[
      /* worker */ Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_fork(event: nodeLib.nodeLibStrings.fork, listener: js.Function1[/* worker */ Worker, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_listening(
    event: nodeLib.nodeLibStrings.listening,
    listener: js.Function2[/* worker */ Worker, /* address */ Address, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function3[
      /* worker */ Worker, 
      /* message */ js.Any, 
      /* handle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("on")
  def on_online(event: nodeLib.nodeLibStrings.online, listener: js.Function1[/* worker */ Worker, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_setup(event: nodeLib.nodeLibStrings.setup, listener: js.Function1[/* settings */ js.Any, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: js.Function1[/* worker */ Worker, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function3[
      /* worker */ Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_fork(event: nodeLib.nodeLibStrings.fork, listener: js.Function1[/* worker */ Worker, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_listening(
    event: nodeLib.nodeLibStrings.listening,
    listener: js.Function2[/* worker */ Worker, /* address */ Address, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function3[
      /* worker */ Worker, 
      /* message */ js.Any, 
      /* handle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("once")
  def once_online(event: nodeLib.nodeLibStrings.online, listener: js.Function1[/* worker */ Worker, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_setup(event: nodeLib.nodeLibStrings.setup, listener: js.Function1[/* settings */ js.Any, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: js.Function1[/* worker */ Worker, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function3[
      /* worker */ Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_fork(event: nodeLib.nodeLibStrings.fork, listener: js.Function1[/* worker */ Worker, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_listening(
    event: nodeLib.nodeLibStrings.listening,
    listener: js.Function2[/* worker */ Worker, /* address */ Address, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function3[
      /* worker */ Worker, 
      /* message */ js.Any, 
      /* handle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("prependListener")
  def prependListener_online(event: nodeLib.nodeLibStrings.online, listener: js.Function1[/* worker */ Worker, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_setup(event: nodeLib.nodeLibStrings.setup, listener: js.Function1[/* settings */ js.Any, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: js.Function1[/* worker */ Worker, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function3[
      /* worker */ Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_fork(event: nodeLib.nodeLibStrings.fork, listener: js.Function1[/* worker */ Worker, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_listening(
    event: nodeLib.nodeLibStrings.listening,
    listener: js.Function2[/* worker */ Worker, /* address */ Address, scala.Unit]
  ): this.type = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("prependOnceListener")
  def prependOnceListener_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function3[
      /* worker */ Worker, 
      /* message */ js.Any, 
      /* handle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_online(event: nodeLib.nodeLibStrings.online, listener: js.Function1[/* worker */ Worker, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_setup(event: nodeLib.nodeLibStrings.setup, listener: js.Function1[/* settings */ js.Any, scala.Unit]): this.type = js.native
  def setupMaster(): scala.Unit = js.native
  def setupMaster(settings: ClusterSettings): scala.Unit = js.native
}

