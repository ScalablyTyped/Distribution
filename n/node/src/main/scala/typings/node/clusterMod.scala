package typings.node

import typings.node.NodeJS.Dict
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.SendHandle
import typings.node.childProcessMod.Serializable
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.node.netMod.Server
import typings.node.netMod.Socket
import typings.node.nodeStrings.disconnect
import typings.node.nodeStrings.error
import typings.node.nodeStrings.exit
import typings.node.nodeStrings.fork
import typings.node.nodeStrings.listening
import typings.node.nodeStrings.message
import typings.node.nodeStrings.online
import typings.node.nodeStrings.setup
import typings.node.nodeStrings.udp4
import typings.node.nodeStrings.udp6
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clusterMod {
  
  @JSImport("cluster", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cluster", "SCHED_NONE")
  @js.native
  val SCHED_NONE: Double = js.native
  
  @JSImport("cluster", "SCHED_RR")
  @js.native
  val SCHED_RR: Double = js.native
  
  @JSImport("cluster", "Worker")
  @js.native
  class Worker_ () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    @JSName("addListener")
    def addListener_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_exit(event: exit, listener: js.Function2[/* code */ Double, /* signal */ java.lang.String, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_listening(event: listening, listener: js.Function1[/* address */ Address, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_message(event: message, listener: js.Function2[/* message */ js.Any, /* handle */ Socket | Server, Unit]): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
    @JSName("addListener")
    def addListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    def destroy(): Unit = js.native
    def destroy(signal: java.lang.String): Unit = js.native
    
    def disconnect(): Unit = js.native
    
    @JSName("emit")
    def emit_disconnect(event: disconnect): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, error: Error): Boolean = js.native
    @JSName("emit")
    def emit_exit(event: exit, code: Double, signal: java.lang.String): Boolean = js.native
    @JSName("emit")
    def emit_listening(event: listening, address: Address): Boolean = js.native
    @JSName("emit")
    def emit_message(event: message, message: js.Any, handle: Server): Boolean = js.native
    @JSName("emit")
    def emit_message(event: message, message: js.Any, handle: Socket): Boolean = js.native
    @JSName("emit")
    def emit_online(event: online): Boolean = js.native
    
    var exitedAfterDisconnect: Boolean = js.native
    
    var id: Double = js.native
    
    def isConnected(): Boolean = js.native
    
    def isDead(): Boolean = js.native
    
    def kill(): Unit = js.native
    def kill(signal: java.lang.String): Unit = js.native
    
    @JSName("on")
    def on_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_exit(event: exit, listener: js.Function2[/* code */ Double, /* signal */ java.lang.String, Unit]): this.type = js.native
    @JSName("on")
    def on_listening(event: listening, listener: js.Function1[/* address */ Address, Unit]): this.type = js.native
    @JSName("on")
    def on_message(event: message, listener: js.Function2[/* message */ js.Any, /* handle */ Socket | Server, Unit]): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
    @JSName("on")
    def on_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("once")
    def once_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_exit(event: exit, listener: js.Function2[/* code */ Double, /* signal */ java.lang.String, Unit]): this.type = js.native
    @JSName("once")
    def once_listening(event: listening, listener: js.Function1[/* address */ Address, Unit]): this.type = js.native
    @JSName("once")
    def once_message(event: message, listener: js.Function2[/* message */ js.Any, /* handle */ Socket | Server, Unit]): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
    @JSName("once")
    def once_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_exit(event: exit, listener: js.Function2[/* code */ Double, /* signal */ java.lang.String, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_listening(event: listening, listener: js.Function1[/* address */ Address, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_message(event: message, listener: js.Function2[/* message */ js.Any, /* handle */ Socket | Server, Unit]): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
    @JSName("prependListener")
    def prependListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_exit(event: exit, listener: js.Function2[/* code */ Double, /* signal */ java.lang.String, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_listening(event: listening, listener: js.Function1[/* address */ Address, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_message(event: message, listener: js.Function2[/* message */ js.Any, /* handle */ Socket | Server, Unit]): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
    @JSName("prependOnceListener")
    def prependOnceListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    var process: ChildProcess = js.native
    
    def send(message: Serializable): Boolean = js.native
    def send(
      message: Serializable,
      sendHandle: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* error */ Error | Null, Unit]
    ): Boolean = js.native
    def send(message: Serializable, sendHandle: SendHandle): Boolean = js.native
    def send(
      message: Serializable,
      sendHandle: SendHandle,
      callback: js.Function1[/* error */ Error | Null, Unit]
    ): Boolean = js.native
  }
  
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
  @JSImport("cluster", "addListener")
  @js.native
  def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  @JSImport("cluster", "addListener")
  @js.native
  def addListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = js.native
  @JSImport("cluster", "addListener")
  @js.native
  def addListener_exit(
    event: exit,
    listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ java.lang.String, Unit]
  ): Cluster = js.native
  @JSImport("cluster", "addListener")
  @js.native
  def addListener_fork(event: fork, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = js.native
  @JSImport("cluster", "addListener")
  @js.native
  def addListener_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSImport("cluster", "addListener")
  @js.native
  def addListener_message(
    event: message,
    listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): Cluster = js.native
  @JSImport("cluster", "addListener")
  @js.native
  def addListener_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = js.native
  @JSImport("cluster", "addListener")
  @js.native
  def addListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
  
  @JSImport("cluster", "disconnect")
  @js.native
  def disconnect(): Unit = js.native
  @JSImport("cluster", "disconnect")
  @js.native
  def disconnect(callback: js.Function0[Unit]): Unit = js.native
  
  @JSImport("cluster", "emit")
  @js.native
  def emit(event: java.lang.String, args: js.Any*): Boolean = js.native
  @JSImport("cluster", "emit")
  @js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  @JSImport("cluster", "emit")
  @js.native
  def emit_disconnect(event: disconnect, worker: Worker_): Boolean = js.native
  @JSImport("cluster", "emit")
  @js.native
  def emit_exit(event: exit, worker: Worker_, code: Double, signal: java.lang.String): Boolean = js.native
  @JSImport("cluster", "emit")
  @js.native
  def emit_fork(event: fork, worker: Worker_): Boolean = js.native
  @JSImport("cluster", "emit")
  @js.native
  def emit_listening(event: listening, worker: Worker_, address: Address): Boolean = js.native
  @JSImport("cluster", "emit")
  @js.native
  def emit_message(event: message, worker: Worker_, message: js.Any, handle: Server): Boolean = js.native
  @JSImport("cluster", "emit")
  @js.native
  def emit_message(event: message, worker: Worker_, message: js.Any, handle: Socket): Boolean = js.native
  @JSImport("cluster", "emit")
  @js.native
  def emit_online(event: online, worker: Worker_): Boolean = js.native
  @JSImport("cluster", "emit")
  @js.native
  def emit_setup(event: setup, settings: ClusterSettings): Boolean = js.native
  
  @JSImport("cluster", "eventNames")
  @js.native
  def eventNames(): js.Array[java.lang.String] = js.native
  
  @JSImport("cluster", "fork")
  @js.native
  def fork(): Worker_ = js.native
  @JSImport("cluster", "fork")
  @js.native
  def fork(env: js.Any): Worker_ = js.native
  
  @JSImport("cluster", "getMaxListeners")
  @js.native
  def getMaxListeners(): Double = js.native
  
  @JSImport("cluster", "isMaster")
  @js.native
  val isMaster: Boolean = js.native
  
  @JSImport("cluster", "isWorker")
  @js.native
  val isWorker: Boolean = js.native
  
  @JSImport("cluster", "listenerCount")
  @js.native
  def listenerCount(`type`: java.lang.String): Double = js.native
  
  @JSImport("cluster", "listeners")
  @js.native
  def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  
  @JSImport("cluster", "on")
  @js.native
  def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  @JSImport("cluster", "on")
  @js.native
  def on_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = js.native
  @JSImport("cluster", "on")
  @js.native
  def on_exit(
    event: exit,
    listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ java.lang.String, Unit]
  ): Cluster = js.native
  @JSImport("cluster", "on")
  @js.native
  def on_fork(event: fork, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = js.native
  @JSImport("cluster", "on")
  @js.native
  def on_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): Cluster = js.native
  @JSImport("cluster", "on")
  @js.native
  def on_message(
    event: message,
    listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSImport("cluster", "on")
  @js.native
  def on_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = js.native
  @JSImport("cluster", "on")
  @js.native
  def on_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
  
  @JSImport("cluster", "once")
  @js.native
  def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  @JSImport("cluster", "once")
  @js.native
  def once_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = js.native
  @JSImport("cluster", "once")
  @js.native
  def once_exit(
    event: exit,
    listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ java.lang.String, Unit]
  ): Cluster = js.native
  @JSImport("cluster", "once")
  @js.native
  def once_fork(event: fork, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = js.native
  @JSImport("cluster", "once")
  @js.native
  def once_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): Cluster = js.native
  @JSImport("cluster", "once")
  @js.native
  def once_message(
    event: message,
    listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSImport("cluster", "once")
  @js.native
  def once_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = js.native
  @JSImport("cluster", "once")
  @js.native
  def once_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
  
  @JSImport("cluster", "prependListener")
  @js.native
  def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  @JSImport("cluster", "prependListener")
  @js.native
  def prependListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = js.native
  @JSImport("cluster", "prependListener")
  @js.native
  def prependListener_exit(
    event: exit,
    listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ java.lang.String, Unit]
  ): Cluster = js.native
  @JSImport("cluster", "prependListener")
  @js.native
  def prependListener_fork(event: fork, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = js.native
  @JSImport("cluster", "prependListener")
  @js.native
  def prependListener_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSImport("cluster", "prependListener")
  @js.native
  def prependListener_message(
    event: message,
    listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): Cluster = js.native
  @JSImport("cluster", "prependListener")
  @js.native
  def prependListener_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = js.native
  @JSImport("cluster", "prependListener")
  @js.native
  def prependListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
  
  @JSImport("cluster", "prependOnceListener")
  @js.native
  def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  @JSImport("cluster", "prependOnceListener")
  @js.native
  def prependOnceListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = js.native
  @JSImport("cluster", "prependOnceListener")
  @js.native
  def prependOnceListener_exit(
    event: exit,
    listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ java.lang.String, Unit]
  ): Cluster = js.native
  @JSImport("cluster", "prependOnceListener")
  @js.native
  def prependOnceListener_fork(event: fork, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = js.native
  @JSImport("cluster", "prependOnceListener")
  @js.native
  def prependOnceListener_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSImport("cluster", "prependOnceListener")
  @js.native
  def prependOnceListener_message(
    event: message,
    listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): Cluster = js.native
  @JSImport("cluster", "prependOnceListener")
  @js.native
  def prependOnceListener_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = js.native
  @JSImport("cluster", "prependOnceListener")
  @js.native
  def prependOnceListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
  
  @JSImport("cluster", "removeAllListeners")
  @js.native
  def removeAllListeners(): Cluster = js.native
  @JSImport("cluster", "removeAllListeners")
  @js.native
  def removeAllListeners(event: java.lang.String): Cluster = js.native
  
  @JSImport("cluster", "removeListener")
  @js.native
  def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  
  @JSImport("cluster", "schedulingPolicy")
  @js.native
  def schedulingPolicy: Double = js.native
  @scala.inline
  def schedulingPolicy_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("schedulingPolicy")(x.asInstanceOf[js.Any])
  
  @JSImport("cluster", "setMaxListeners")
  @js.native
  def setMaxListeners(n: Double): Cluster = js.native
  
  @JSImport("cluster", "settings")
  @js.native
  val settings: ClusterSettings = js.native
  
  @JSImport("cluster", "setupMaster")
  @js.native
  def setupMaster(): Unit = js.native
  @JSImport("cluster", "setupMaster")
  @js.native
  def setupMaster(settings: ClusterSettings): Unit = js.native
  
  @JSImport("cluster", "worker")
  @js.native
  val worker: Worker_ = js.native
  
  @JSImport("cluster", "workers")
  @js.native
  val workers: Dict[Worker_] = js.native
  
  @js.native
  trait Address extends StObject {
    
    var address: java.lang.String = js.native
    
    var addressType: Double | udp4 | udp6 = js.native
    
    var port: Double = js.native
  }
  object Address {
    
    @scala.inline
    def apply(address: java.lang.String, addressType: Double | udp4 | udp6, port: Double): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], addressType = addressType.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: java.lang.String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressType(value: Double | udp4 | udp6): Self = StObject.set(x, "addressType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Cluster extends EventEmitter {
    
    val SCHED_NONE: Double = js.native
    
    val SCHED_RR: Double = js.native
    
    var Worker: Worker_ = js.native
    
    @JSName("addListener")
    def addListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_exit(
      event: exit,
      listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ java.lang.String, Unit]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_fork(event: fork, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_message(
      event: message,
      listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
    ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
    @JSName("addListener")
    def addListener_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): this.type = js.native
    
    def disconnect(): Unit = js.native
    def disconnect(callback: js.Function0[Unit]): Unit = js.native
    
    @JSName("emit")
    def emit_disconnect(event: disconnect, worker: Worker_): Boolean = js.native
    @JSName("emit")
    def emit_exit(event: exit, worker: Worker_, code: Double, signal: java.lang.String): Boolean = js.native
    @JSName("emit")
    def emit_fork(event: fork, worker: Worker_): Boolean = js.native
    @JSName("emit")
    def emit_listening(event: listening, worker: Worker_, address: Address): Boolean = js.native
    @JSName("emit")
    def emit_message(event: message, worker: Worker_, message: js.Any, handle: Server): Boolean = js.native
    @JSName("emit")
    def emit_message(event: message, worker: Worker_, message: js.Any, handle: Socket): Boolean = js.native
    @JSName("emit")
    def emit_online(event: online, worker: Worker_): Boolean = js.native
    @JSName("emit")
    def emit_setup(event: setup, settings: ClusterSettings): Boolean = js.native
    
    def fork(): Worker_ = js.native
    def fork(env: js.Any): Worker_ = js.native
    
    var isMaster: Boolean = js.native
    
    var isWorker: Boolean = js.native
    
    @JSName("on")
    def on_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("on")
    def on_exit(
      event: exit,
      listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ java.lang.String, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fork(event: fork, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("on")
    def on_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): this.type = js.native
    @JSName("on")
    def on_message(
      event: message,
      listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
    ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
    @JSName("on")
    def on_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("on")
    def on_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): this.type = js.native
    
    @JSName("once")
    def once_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("once")
    def once_exit(
      event: exit,
      listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ java.lang.String, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_fork(event: fork, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("once")
    def once_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): this.type = js.native
    @JSName("once")
    def once_message(
      event: message,
      listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
    ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
    @JSName("once")
    def once_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("once")
    def once_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_exit(
      event: exit,
      listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ java.lang.String, Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_fork(event: fork, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_message(
      event: message,
      listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
    ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
    @JSName("prependListener")
    def prependListener_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_exit(
      event: exit,
      listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ java.lang.String, Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_fork(event: fork, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
    @JSName("prependOnceListener")
    def prependOnceListener_message(
      event: message,
      listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): this.type = js.native
    
    var schedulingPolicy: Double = js.native
    
    var settings: ClusterSettings = js.native
    
    def setupMaster(): Unit = js.native
    def setupMaster(settings: ClusterSettings): Unit = js.native
    
    var worker: js.UndefOr[Worker_] = js.native
    
    var workers: js.UndefOr[Dict[Worker_]] = js.native
  }
  
  // interfaces
  @js.native
  trait ClusterSettings extends StObject {
    
    var args: js.UndefOr[js.Array[java.lang.String]] = js.native
    
    // default: process.execArgv
    var exec: js.UndefOr[java.lang.String] = js.native
    
    var execArgv: js.UndefOr[js.Array[java.lang.String]] = js.native
    
    var gid: js.UndefOr[Double] = js.native
    
    var inspectPort: js.UndefOr[Double | js.Function0[Double]] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
    
    var stdio: js.UndefOr[js.Array[_]] = js.native
    
    var uid: js.UndefOr[Double] = js.native
  }
  object ClusterSettings {
    
    @scala.inline
    def apply(): ClusterSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterSettings]
    }
    
    @scala.inline
    implicit class ClusterSettingsMutableBuilder[Self <: ClusterSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[java.lang.String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: java.lang.String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setExec(value: java.lang.String): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecArgv(value: js.Array[java.lang.String]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecArgvUndefined: Self = StObject.set(x, "execArgv", js.undefined)
      
      @scala.inline
      def setExecArgvVarargs(value: java.lang.String*): Self = StObject.set(x, "execArgv", js.Array(value :_*))
      
      @scala.inline
      def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setInspectPort(value: Double | js.Function0[Double]): Self = StObject.set(x, "inspectPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInspectPortFunction0(value: () => Double): Self = StObject.set(x, "inspectPort", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInspectPortUndefined: Self = StObject.set(x, "inspectPort", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setStdio(value: js.Array[_]): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
      
      @scala.inline
      def setStdioVarargs(value: js.Any*): Self = StObject.set(x, "stdio", js.Array(value :_*))
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
}
