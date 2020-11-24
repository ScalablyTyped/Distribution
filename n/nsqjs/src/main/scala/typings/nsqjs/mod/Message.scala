package typings.nsqjs.mod

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.nsqjs.nsqjsStrings.backoff
import typings.nsqjs.nsqjsStrings.respond
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nsqjs", "Message")
@js.native
class Message protected () extends EventEmitter {
  def this(rawMessage: Buffer, requeueDelay: Double, msgTimeout: Double, maxMsgTimeout: Double) = this()
  
  var attempts: Double = js.native
  
  var body: Buffer = js.native
  
  def finish(): Unit = js.native
  
  var hasResponded: Boolean = js.native
  
  val id: String = js.native
  
  def json(): js.Any = js.native
  
  @JSName("on")
  def on_backoff(event: backoff, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_respond(event: respond, listener: js.Function2[/* responseType */ Double, /* wireData */ Buffer, Unit]): this.type = js.native
  
  def requeue(): Unit = js.native
  def requeue(delay: js.UndefOr[scala.Nothing], backoff: Boolean): Unit = js.native
  def requeue(delay: Double): Unit = js.native
  def requeue(delay: Double, backoff: Boolean): Unit = js.native
  
  def respond(responseType: Double, wireData: Buffer): Unit = js.native
  
  def timeUntilTimeout(): Double | Null = js.native
  def timeUntilTimeout(hard: Boolean): Double | Null = js.native
  
  var timestamp: Double = js.native
  
  def touch(): Unit = js.native
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
