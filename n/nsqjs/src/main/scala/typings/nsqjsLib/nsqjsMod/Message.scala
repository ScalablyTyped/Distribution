package typings
package nsqjsLib.nsqjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nsqjs", "Message")
@js.native
class Message protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(id: java.lang.String, timestamp: scala.Double, attempts: scala.Double, body: js.Any, requeueDelay: scala.Double, msgTimeout: scala.Double, maxMsgTimeout: scala.Double) = this()
  var body: js.Any = js.native
  var hasResponded: scala.Boolean = js.native
  val id: java.lang.String = js.native
  var timestamp: scala.Double = js.native
  def finish(): js.Any = js.native
  def json(): js.Any = js.native
  @JSName("on")
  def on_backoff(event: nsqjsLib.nsqjsLibStrings.backoff, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_respond(
    event: nsqjsLib.nsqjsLibStrings.respond,
    listener: js.Function2[/* responseType */ scala.Double, /* wireData */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  def requeue(): js.Any = js.native
  def requeue(delay: scala.Double): js.Any = js.native
  def requeue(delay: scala.Double, backoff: scala.Boolean): js.Any = js.native
  def respond(responseType: scala.Double, wireData: nodeLib.Buffer): js.Any = js.native
  def timeUntilTimeout(): scala.Double = js.native
  def timeUntilTimeout(hard: scala.Boolean): scala.Double = js.native
  def touch(): js.Any = js.native
}

@JSImport("nsqjs", "Message")
@js.native
object Message extends js.Object {
  var BACKOFF: java.lang.String = js.native
  var FINISH: scala.Double = js.native
  var REQUEUE: scala.Double = js.native
  var RESPOND: java.lang.String = js.native
  var TOUCH: scala.Double = js.native
}

