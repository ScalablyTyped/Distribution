package typings.nsqjs.nsqjsMod

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.nsqjs.nsqjsStrings.backoff
import typings.nsqjs.nsqjsStrings.respond
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nsqjs", "Message")
@js.native
class Message protected () extends EventEmitter {
  def this(
    id: String,
    timestamp: Double,
    attempts: Double,
    body: js.Any,
    requeueDelay: Double,
    msgTimeout: Double,
    maxMsgTimeout: Double
  ) = this()
  var body: js.Any = js.native
  var hasResponded: Boolean = js.native
  val id: String = js.native
  var timestamp: Double = js.native
  def finish(): js.Any = js.native
  def json(): js.Any = js.native
  @JSName("on")
  def on_backoff(event: backoff, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_respond(event: respond, listener: js.Function2[/* responseType */ Double, /* wireData */ Buffer, Unit]): this.type = js.native
  def requeue(): js.Any = js.native
  def requeue(delay: Double): js.Any = js.native
  def requeue(delay: Double, backoff: Boolean): js.Any = js.native
  def respond(responseType: Double, wireData: Buffer): js.Any = js.native
  def timeUntilTimeout(): Double = js.native
  def timeUntilTimeout(hard: Boolean): Double = js.native
  def touch(): js.Any = js.native
}

/* static members */
@JSImport("nsqjs", "Message")
@js.native
object Message extends js.Object {
  var BACKOFF: String = js.native
  var FINISH: Double = js.native
  var REQUEUE: Double = js.native
  var RESPOND: String = js.native
  var TOUCH: Double = js.native
}

