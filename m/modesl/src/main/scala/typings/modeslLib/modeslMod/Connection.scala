package typings
package modeslLib.modeslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("modesl", "Connection")
@js.native
class Connection protected ()
  extends nodeLib.NodeJSNs.EventEmitter {
  def this(args: js.Any*) = this()
  def api(command: js.Any, args: js.Array[java.lang.String]): scala.Unit = js.native
  def api(command: js.Any, args: js.Array[java.lang.String], cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def auth(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def bgapi(command: js.Any, args: js.Array[java.lang.String]): scala.Unit = js.native
  def bgapi(command: js.Any, args: js.Array[java.lang.String], jobid: js.Any): scala.Unit = js.native
  def bgapi(command: js.Any, args: js.Array[java.lang.String], jobid: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def connected(): js.Any = js.native
  def disconnect(): scala.Unit = js.native
  @JSName("events")
  def events_json(`type`: modeslLib.modeslLibStrings.json, events: java.lang.String): scala.Unit = js.native
  @JSName("events")
  def events_json(`type`: modeslLib.modeslLibStrings.json, events: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("events")
  def events_plain(`type`: modeslLib.modeslLibStrings.plain, events: java.lang.String): scala.Unit = js.native
  @JSName("events")
  def events_plain(`type`: modeslLib.modeslLibStrings.plain, events: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("events")
  def events_xml(`type`: modeslLib.modeslLibStrings.xml, events: java.lang.String): scala.Unit = js.native
  @JSName("events")
  def events_xml(`type`: modeslLib.modeslLibStrings.xml, events: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def execute(app: js.Any): js.Any = js.native
  def execute(app: js.Any, arg: java.lang.String): js.Any = js.native
  def execute(app: js.Any, arg: java.lang.String, uuid: java.lang.String): js.Any = js.native
  def execute(app: js.Any, arg: java.lang.String, uuid: java.lang.String, cb: js.Function0[scala.Unit]): js.Any = js.native
  def executeAsync(app: js.Any): js.Any = js.native
  def executeAsync(app: js.Any, arg: java.lang.String): js.Any = js.native
  def executeAsync(app: js.Any, arg: java.lang.String, uuid: java.lang.String): js.Any = js.native
  def executeAsync(app: js.Any, arg: java.lang.String, uuid: java.lang.String, cb: js.Function0[scala.Unit]): js.Any = js.native
  def filter(header: js.Any, value: js.Any): scala.Unit = js.native
  def filter(header: js.Any, value: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def filterDelete(header: js.Any, value: js.Any): scala.Unit = js.native
  def filterDelete(header: js.Any, value: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def getInfo(): js.Any = js.native
  def message(options: js.Any): scala.Unit = js.native
  def message(options: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def originate(options: js.Any): scala.Unit = js.native
  def originate(options: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def recvEvent(): scala.Unit = js.native
  def recvEvent(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def recvEventTimed(ms: js.Any): scala.Unit = js.native
  def recvEventTimed(ms: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def send(command: js.Any, args: js.Any): scala.Unit = js.native
  def sendEvent(event: js.Any): scala.Unit = js.native
  def sendEvent(event: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def sendRecv(command: js.Any, args: js.Any): scala.Unit = js.native
  def sendRecv(command: js.Any, args: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def setAsyncExecute(value: js.Any): scala.Unit = js.native
  def setEventLock(value: js.Any): scala.Unit = js.native
  def show(item: js.Any, format: js.Any): scala.Unit = js.native
  def show(item: js.Any, format: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def socketDescriptor(): js.Any = js.native
  def subscribe(events: js.Any): scala.Unit = js.native
  def subscribe(events: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
}

