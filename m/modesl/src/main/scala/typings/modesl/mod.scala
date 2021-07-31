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
  class Connection protected () extends EventEmitter {
    def this(args: js.Any*) = this()
    
    def api(command: js.Any, args: js.Array[String]): Unit = js.native
    def api(command: js.Any, args: js.Array[String], cb: js.Function0[Unit]): Unit = js.native
    
    def auth(cb: js.Function0[Unit]): Unit = js.native
    
    def bgapi(command: js.Any, args: js.Array[String]): Unit = js.native
    def bgapi(command: js.Any, args: js.Array[String], jobid: js.Any): Unit = js.native
    def bgapi(command: js.Any, args: js.Array[String], jobid: js.Any, cb: js.Function0[Unit]): Unit = js.native
    def bgapi(command: js.Any, args: js.Array[String], jobid: Unit, cb: js.Function0[Unit]): Unit = js.native
    
    def connected(): js.Any = js.native
    
    def disconnect(): Unit = js.native
    
    @JSName("events")
    def events_json(`type`: json, events: String): Unit = js.native
    @JSName("events")
    def events_json(`type`: json, events: String, cb: js.Function0[Unit]): Unit = js.native
    @JSName("events")
    def events_plain(`type`: plain, events: String): Unit = js.native
    @JSName("events")
    def events_plain(`type`: plain, events: String, cb: js.Function0[Unit]): Unit = js.native
    @JSName("events")
    def events_xml(`type`: xml, events: String): Unit = js.native
    @JSName("events")
    def events_xml(`type`: xml, events: String, cb: js.Function0[Unit]): Unit = js.native
    
    def execute(app: js.Any): js.Any = js.native
    def execute(app: js.Any, arg: String): js.Any = js.native
    def execute(app: js.Any, arg: String, uuid: String): js.Any = js.native
    def execute(app: js.Any, arg: String, uuid: String, cb: js.Function0[Unit]): js.Any = js.native
    def execute(app: js.Any, arg: String, uuid: Unit, cb: js.Function0[Unit]): js.Any = js.native
    def execute(app: js.Any, arg: Unit, uuid: String): js.Any = js.native
    def execute(app: js.Any, arg: Unit, uuid: String, cb: js.Function0[Unit]): js.Any = js.native
    def execute(app: js.Any, arg: Unit, uuid: Unit, cb: js.Function0[Unit]): js.Any = js.native
    
    def executeAsync(app: js.Any): js.Any = js.native
    def executeAsync(app: js.Any, arg: String): js.Any = js.native
    def executeAsync(app: js.Any, arg: String, uuid: String): js.Any = js.native
    def executeAsync(app: js.Any, arg: String, uuid: String, cb: js.Function0[Unit]): js.Any = js.native
    def executeAsync(app: js.Any, arg: String, uuid: Unit, cb: js.Function0[Unit]): js.Any = js.native
    def executeAsync(app: js.Any, arg: Unit, uuid: String): js.Any = js.native
    def executeAsync(app: js.Any, arg: Unit, uuid: String, cb: js.Function0[Unit]): js.Any = js.native
    def executeAsync(app: js.Any, arg: Unit, uuid: Unit, cb: js.Function0[Unit]): js.Any = js.native
    
    def filter(header: js.Any, value: js.Any): Unit = js.native
    def filter(header: js.Any, value: js.Any, cb: js.Function0[Unit]): Unit = js.native
    
    def filterDelete(header: js.Any, value: js.Any): Unit = js.native
    def filterDelete(header: js.Any, value: js.Any, cb: js.Function0[Unit]): Unit = js.native
    
    def getInfo(): js.Any = js.native
    
    def message(options: js.Any): Unit = js.native
    def message(options: js.Any, cb: js.Function0[Unit]): Unit = js.native
    
    def originate(options: js.Any): Unit = js.native
    def originate(options: js.Any, cb: js.Function0[Unit]): Unit = js.native
    
    def recvEvent(): Unit = js.native
    def recvEvent(cb: js.Function0[Unit]): Unit = js.native
    
    def recvEventTimed(ms: js.Any): Unit = js.native
    def recvEventTimed(ms: js.Any, cb: js.Function0[Unit]): Unit = js.native
    
    def send(command: js.Any, args: js.Any): Unit = js.native
    
    def sendEvent(event: js.Any): Unit = js.native
    def sendEvent(event: js.Any, cb: js.Function0[Unit]): Unit = js.native
    
    def sendRecv(command: js.Any, args: js.Any): Unit = js.native
    def sendRecv(command: js.Any, args: js.Any, cb: js.Function0[Unit]): Unit = js.native
    
    def setAsyncExecute(value: js.Any): Unit = js.native
    
    def setEventLock(value: js.Any): Unit = js.native
    
    def show(item: js.Any, format: js.Any): Unit = js.native
    def show(item: js.Any, format: js.Any, cb: js.Function0[Unit]): Unit = js.native
    
    def socketDescriptor(): js.Any = js.native
    
    def subscribe(events: js.Any): Unit = js.native
    def subscribe(events: js.Any, cb: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("modesl", "Event")
  @js.native
  class Event protected () extends StObject {
    def this(`type`: js.Any, subclass: js.Any) = this()
    
    def addBody(value: js.Any): js.Any = js.native
    
    def addHeader(name: js.Any, value: js.Any): js.Any = js.native
    
    def delHeader(name: js.Any): js.Any = js.native
    
    def firstHeader(): js.Any = js.native
    
    def getBody(): js.Any = js.native
    
    def getHeader(name: js.Any): String = js.native
    
    def getType(): js.Any = js.native
    
    var headers: js.Array[Header] = js.native
    
    def nextHeader(): js.Any = js.native
    
    def serialize(format: js.Any): js.Any = js.native
    
    def setPriority(priority: js.Any): Unit = js.native
  }
  /* static members */
  object Event {
    
    @JSImport("modesl", "Event.PRIORITY")
    @js.native
    val PRIORITY: HIGH = js.native
  }
  
  @JSImport("modesl", "Parser")
  @js.native
  class Parser protected () extends StObject {
    def this(socket: js.Any) = this()
  }
  
  @JSImport("modesl", "Server")
  @js.native
  class Server protected () extends EventEmitter {
    def this(opts: js.Any) = this()
    def this(opts: js.Any, readycb: js.Function0[Unit]) = this()
    
    def close(callback: js.Any): Unit = js.native
  }
  
  @scala.inline
  def eslSetLogLevel(level: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eslSetLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setLogLevel(level: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Header extends StObject {
    
    var name: String
    
    var value: String
  }
  object Header {
    
    @scala.inline
    def apply(name: String, value: String): Header = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    @scala.inline
    implicit class HeaderMutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
