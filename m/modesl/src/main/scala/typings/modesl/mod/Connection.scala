package typings.modesl.mod

import typings.modesl.modeslStrings.json
import typings.modesl.modeslStrings.plain
import typings.modesl.modeslStrings.xml
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("modesl", "Connection")
@js.native
class Connection protected () extends EventEmitter {
  def this(args: js.Any*) = this()
  
  def api(command: js.Any, args: js.Array[String]): Unit = js.native
  def api(command: js.Any, args: js.Array[String], cb: js.Function0[Unit]): Unit = js.native
  
  def auth(cb: js.Function0[Unit]): Unit = js.native
  
  def bgapi(command: js.Any, args: js.Array[String]): Unit = js.native
  def bgapi(command: js.Any, args: js.Array[String], jobid: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
  def bgapi(command: js.Any, args: js.Array[String], jobid: js.Any): Unit = js.native
  def bgapi(command: js.Any, args: js.Array[String], jobid: js.Any, cb: js.Function0[Unit]): Unit = js.native
  
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
  def execute(
    app: js.Any,
    arg: js.UndefOr[scala.Nothing],
    uuid: js.UndefOr[scala.Nothing],
    cb: js.Function0[Unit]
  ): js.Any = js.native
  def execute(app: js.Any, arg: js.UndefOr[scala.Nothing], uuid: String): js.Any = js.native
  def execute(app: js.Any, arg: js.UndefOr[scala.Nothing], uuid: String, cb: js.Function0[Unit]): js.Any = js.native
  def execute(app: js.Any, arg: String): js.Any = js.native
  def execute(app: js.Any, arg: String, uuid: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): js.Any = js.native
  def execute(app: js.Any, arg: String, uuid: String): js.Any = js.native
  def execute(app: js.Any, arg: String, uuid: String, cb: js.Function0[Unit]): js.Any = js.native
  
  def executeAsync(app: js.Any): js.Any = js.native
  def executeAsync(
    app: js.Any,
    arg: js.UndefOr[scala.Nothing],
    uuid: js.UndefOr[scala.Nothing],
    cb: js.Function0[Unit]
  ): js.Any = js.native
  def executeAsync(app: js.Any, arg: js.UndefOr[scala.Nothing], uuid: String): js.Any = js.native
  def executeAsync(app: js.Any, arg: js.UndefOr[scala.Nothing], uuid: String, cb: js.Function0[Unit]): js.Any = js.native
  def executeAsync(app: js.Any, arg: String): js.Any = js.native
  def executeAsync(app: js.Any, arg: String, uuid: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): js.Any = js.native
  def executeAsync(app: js.Any, arg: String, uuid: String): js.Any = js.native
  def executeAsync(app: js.Any, arg: String, uuid: String, cb: js.Function0[Unit]): js.Any = js.native
  
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
