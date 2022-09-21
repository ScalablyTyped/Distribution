package typings.modesl

import typings.modesl.anon.HIGH
import typings.modesl.modeslStrings.json
import typings.modesl.modeslStrings.plain
import typings.modesl.modeslStrings.xml
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("modesl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("modesl", "Connection")
  @js.native
  open class Connection protected () extends EventEmitter {
    def this(args: Any*) = this()
    
    def api(command: Any, args: js.Array[String]): Unit = js.native
    def api(command: Any, args: js.Array[String], cb: js.Function0[Unit]): Unit = js.native
    
    def auth(cb: js.Function0[Unit]): Unit = js.native
    
    def bgapi(command: Any, args: js.Array[String]): Unit = js.native
    def bgapi(command: Any, args: js.Array[String], jobid: Any): Unit = js.native
    def bgapi(command: Any, args: js.Array[String], jobid: Any, cb: js.Function0[Unit]): Unit = js.native
    def bgapi(command: Any, args: js.Array[String], jobid: Unit, cb: js.Function0[Unit]): Unit = js.native
    
    def connected(): Any = js.native
    
    def disconnect(): Unit = js.native
    
    def events(`type`: json | plain | xml, events: String): Unit = js.native
    def events(`type`: json | plain | xml, events: String, cb: js.Function0[Unit]): Unit = js.native
    
    def execute(app: Any): Any = js.native
    def execute(app: Any, arg: String): Any = js.native
    def execute(app: Any, arg: String, uuid: String): Any = js.native
    def execute(app: Any, arg: String, uuid: String, cb: js.Function0[Unit]): Any = js.native
    def execute(app: Any, arg: String, uuid: Unit, cb: js.Function0[Unit]): Any = js.native
    def execute(app: Any, arg: Unit, uuid: String): Any = js.native
    def execute(app: Any, arg: Unit, uuid: String, cb: js.Function0[Unit]): Any = js.native
    def execute(app: Any, arg: Unit, uuid: Unit, cb: js.Function0[Unit]): Any = js.native
    
    def executeAsync(app: Any): Any = js.native
    def executeAsync(app: Any, arg: String): Any = js.native
    def executeAsync(app: Any, arg: String, uuid: String): Any = js.native
    def executeAsync(app: Any, arg: String, uuid: String, cb: js.Function0[Unit]): Any = js.native
    def executeAsync(app: Any, arg: String, uuid: Unit, cb: js.Function0[Unit]): Any = js.native
    def executeAsync(app: Any, arg: Unit, uuid: String): Any = js.native
    def executeAsync(app: Any, arg: Unit, uuid: String, cb: js.Function0[Unit]): Any = js.native
    def executeAsync(app: Any, arg: Unit, uuid: Unit, cb: js.Function0[Unit]): Any = js.native
    
    def filter(header: Any, value: Any): Unit = js.native
    def filter(header: Any, value: Any, cb: js.Function0[Unit]): Unit = js.native
    
    def filterDelete(header: Any, value: Any): Unit = js.native
    def filterDelete(header: Any, value: Any, cb: js.Function0[Unit]): Unit = js.native
    
    def getInfo(): Any = js.native
    
    def message(options: Any): Unit = js.native
    def message(options: Any, cb: js.Function0[Unit]): Unit = js.native
    
    def originate(options: Any): Unit = js.native
    def originate(options: Any, cb: js.Function0[Unit]): Unit = js.native
    
    def recvEvent(): Unit = js.native
    def recvEvent(cb: js.Function0[Unit]): Unit = js.native
    
    def recvEventTimed(ms: Any): Unit = js.native
    def recvEventTimed(ms: Any, cb: js.Function0[Unit]): Unit = js.native
    
    def send(command: Any, args: Any): Unit = js.native
    
    def sendEvent(event: Any): Unit = js.native
    def sendEvent(event: Any, cb: js.Function0[Unit]): Unit = js.native
    
    def sendRecv(command: Any, args: Any): Unit = js.native
    def sendRecv(command: Any, args: Any, cb: js.Function0[Unit]): Unit = js.native
    
    def setAsyncExecute(value: Any): Unit = js.native
    
    def setEventLock(value: Any): Unit = js.native
    
    def show(item: Any, format: Any): Unit = js.native
    def show(item: Any, format: Any, cb: js.Function0[Unit]): Unit = js.native
    
    def socketDescriptor(): Any = js.native
    
    def subscribe(events: Any): Unit = js.native
    def subscribe(events: Any, cb: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("modesl", "Event")
  @js.native
  open class Event protected () extends StObject {
    def this(`type`: Any, subclass: Any) = this()
    
    def addBody(value: Any): Any = js.native
    
    def addHeader(name: Any, value: Any): Any = js.native
    
    def delHeader(name: Any): Any = js.native
    
    def firstHeader(): Any = js.native
    
    def getBody(): Any = js.native
    
    def getHeader(name: Any): String = js.native
    
    def getType(): Any = js.native
    
    var headers: js.Array[Header] = js.native
    
    def nextHeader(): Any = js.native
    
    def serialize(format: Any): Any = js.native
    
    def setPriority(priority: Any): Unit = js.native
  }
  /* static members */
  object Event {
    
    @JSImport("modesl", "Event.PRIORITY")
    @js.native
    val PRIORITY: HIGH = js.native
  }
  
  @JSImport("modesl", "Parser")
  @js.native
  open class Parser protected () extends StObject {
    def this(socket: Any) = this()
  }
  
  @JSImport("modesl", "Server")
  @js.native
  open class Server protected () extends EventEmitter {
    def this(opts: Any) = this()
    def this(opts: Any, readycb: js.Function0[Unit]) = this()
    
    def close(callback: Any): Unit = js.native
  }
  
  inline def eslSetLogLevel(level: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eslSetLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setLogLevel(level: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Header extends StObject {
    
    var name: String
    
    var value: String
  }
  object Header {
    
    inline def apply(name: String, value: String): Header = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    extension [Self <: Header](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
