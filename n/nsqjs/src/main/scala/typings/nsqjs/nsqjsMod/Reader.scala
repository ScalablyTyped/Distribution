package typings.nsqjs.nsqjsMod

import typings.node.eventsMod.EventEmitter
import typings.nsqjs.nsqjsStrings.discard
import typings.nsqjs.nsqjsStrings.error
import typings.nsqjs.nsqjsStrings.message
import typings.nsqjs.nsqjsStrings.nsqd_closed
import typings.nsqjs.nsqjsStrings.nsqd_connected
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nsqjs", "Reader")
@js.native
class Reader protected () extends EventEmitter {
  def this(topic: String, channel: js.Any) = this()
  def this(topic: String, channel: js.Any, options: ReaderConnectionConfigOptions) = this()
  def close(): js.Any = js.native
  def connect(): js.Any = js.native
  def connectToNSQD(host: String, port: Double): js.Any = js.native
  def handleMessage(message: js.Any): js.Any = js.native
  def isPaused(): Boolean = js.native
  @JSName("on")
  def on_discard(event: discard, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: message, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("on")
  def on_nsqdclosed(event: nsqd_closed, listener: js.Function2[/* host */ String, /* port */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_nsqdconnected(event: nsqd_connected, listener: js.Function2[/* host */ String, /* port */ Double, Unit]): this.type = js.native
  def pause(): js.Any = js.native
  def queryLookupd(): js.Any = js.native
  def unpause(): js.Any = js.native
}

/* static members */
@JSImport("nsqjs", "Reader")
@js.native
object Reader extends js.Object {
  var DISCARD: String = js.native
  var ERROR: String = js.native
  var MESSAGE: String = js.native
  var NSQD_CLOSED: String = js.native
  var NSQD_CONNECTED: String = js.native
}

