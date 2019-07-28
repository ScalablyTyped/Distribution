package typings.node.clusterMod

import typings.node.netMod.Server
import typings.node.netMod.Socket
import typings.node.nodeStrings.disconnect
import typings.node.nodeStrings.exit
import typings.node.nodeStrings.fork
import typings.node.nodeStrings.listening
import typings.node.nodeStrings.message
import typings.node.nodeStrings.online
import typings.node.nodeStrings.setup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val isMaster: Boolean = js.native
  val isWorker: Boolean = js.native
  // TODO: cluster.schedulingPolicy
  val settings: ClusterSettings = js.native
  val worker: Worker = js.native
  /**
    * events.EventEmitter
    *   1. disconnect
    *   2. exit
    *   3. fork
    *   4. listening
    *   5. message
    *   6. online
    *   7. setup
    */
  def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  @JSName("addListener")
  def addListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
  @JSName("addListener")
  def addListener_exit(
    event: exit,
    listener: js.Function3[/* worker */ Worker, /* code */ Double, /* signal */ java.lang.String, Unit]
  ): Cluster = js.native
  @JSName("addListener")
  def addListener_fork(event: fork, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
  @JSName("addListener")
  def addListener_listening(event: listening, listener: js.Function2[/* worker */ Worker, /* address */ Address, Unit]): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("addListener")
  def addListener_message(
    event: message,
    listener: js.Function3[/* worker */ Worker, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): Cluster = js.native
  @JSName("addListener")
  def addListener_online(event: online, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
  @JSName("addListener")
  def addListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
  def disconnect(): Unit = js.native
  def disconnect(callback: js.Function0[Unit]): Unit = js.native
  def emit(event: java.lang.String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  @JSName("emit")
  def emit_disconnect(event: disconnect, worker: Worker): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit, worker: Worker, code: Double, signal: java.lang.String): Boolean = js.native
  @JSName("emit")
  def emit_fork(event: fork, worker: Worker): Boolean = js.native
  @JSName("emit")
  def emit_listening(event: listening, worker: Worker, address: Address): Boolean = js.native
  @JSName("emit")
  def emit_message(event: message, worker: Worker, message: js.Any, handle: Server): Boolean = js.native
  @JSName("emit")
  def emit_message(event: message, worker: Worker, message: js.Any, handle: Socket): Boolean = js.native
  @JSName("emit")
  def emit_online(event: online, worker: Worker): Boolean = js.native
  @JSName("emit")
  def emit_setup(event: setup, settings: ClusterSettings): Boolean = js.native
  def eventNames(): js.Array[java.lang.String] = js.native
  def fork(): Worker = js.native
  def fork(env: js.Any): Worker = js.native
  def getMaxListeners(): Double = js.native
  def listenerCount(`type`: java.lang.String): Double = js.native
  def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  @JSName("on")
  def on_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
  @JSName("on")
  def on_exit(
    event: exit,
    listener: js.Function3[/* worker */ Worker, /* code */ Double, /* signal */ java.lang.String, Unit]
  ): Cluster = js.native
  @JSName("on")
  def on_fork(event: fork, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
  @JSName("on")
  def on_listening(event: listening, listener: js.Function2[/* worker */ Worker, /* address */ Address, Unit]): Cluster = js.native
  @JSName("on")
  def on_message(
    event: message,
    listener: js.Function3[/* worker */ Worker, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): Cluster = js.native
  @JSName("on")
  def on_online(event: online, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
  @JSName("on")
  def on_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
  def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  @JSName("once")
  def once_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
  @JSName("once")
  def once_exit(
    event: exit,
    listener: js.Function3[/* worker */ Worker, /* code */ Double, /* signal */ java.lang.String, Unit]
  ): Cluster = js.native
  @JSName("once")
  def once_fork(event: fork, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
  @JSName("once")
  def once_listening(event: listening, listener: js.Function2[/* worker */ Worker, /* address */ Address, Unit]): Cluster = js.native
  @JSName("once")
  def once_message(
    event: message,
    listener: js.Function3[/* worker */ Worker, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): Cluster = js.native
  @JSName("once")
  def once_online(event: online, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
  @JSName("once")
  def once_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
  def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  @JSName("prependListener")
  def prependListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
  @JSName("prependListener")
  def prependListener_exit(
    event: exit,
    listener: js.Function3[/* worker */ Worker, /* code */ Double, /* signal */ java.lang.String, Unit]
  ): Cluster = js.native
  @JSName("prependListener")
  def prependListener_fork(event: fork, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
  @JSName("prependListener")
  def prependListener_listening(event: listening, listener: js.Function2[/* worker */ Worker, /* address */ Address, Unit]): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("prependListener")
  def prependListener_message(
    event: message,
    listener: js.Function3[/* worker */ Worker, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): Cluster = js.native
  @JSName("prependListener")
  def prependListener_online(event: online, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
  @JSName("prependListener")
  def prependListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
  def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(
    event: exit,
    listener: js.Function3[/* worker */ Worker, /* code */ Double, /* signal */ java.lang.String, Unit]
  ): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_fork(event: fork, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_listening(event: listening, listener: js.Function2[/* worker */ Worker, /* address */ Address, Unit]): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("prependOnceListener")
  def prependOnceListener_message(
    event: message,
    listener: js.Function3[/* worker */ Worker, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_online(event: online, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
  def removeAllListeners(): Cluster = js.native
  def removeAllListeners(event: java.lang.String): Cluster = js.native
  def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  def setMaxListeners(n: Double): Cluster = js.native
  def setupMaster(): Unit = js.native
  def setupMaster(settings: ClusterSettings): Unit = js.native
}

