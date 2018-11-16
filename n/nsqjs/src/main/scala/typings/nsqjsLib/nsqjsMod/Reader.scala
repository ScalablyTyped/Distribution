package typings
package nsqjsLib.nsqjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nsqjs", "Reader")
@js.native
class Reader protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(topic: java.lang.String, channel: js.Any) = this()
  def this(topic: java.lang.String, channel: js.Any, options: ReaderConnectionConfigOptions) = this()
  def close(): js.Any = js.native
  def connect(): js.Any = js.native
  def connectToNSQD(host: java.lang.String, port: scala.Double): js.Any = js.native
  def handleMessage(message: js.Any): js.Any = js.native
  def isPaused(): scala.Boolean = js.native
  @JSName("on")
  def on_discard(event: nsqjsLib.nsqjsLibStrings.discard, listener: js.Function1[/* message */ Message, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: nsqjsLib.nsqjsLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: nsqjsLib.nsqjsLibStrings.message, listener: js.Function1[/* message */ Message, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_nsqd_closed(
    event: nsqjsLib.nsqjsLibStrings.nsqd_closed,
    listener: js.Function2[/* host */ java.lang.String, /* port */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_nsqd_connected(
    event: nsqjsLib.nsqjsLibStrings.nsqd_connected,
    listener: js.Function2[/* host */ java.lang.String, /* port */ scala.Double, scala.Unit]
  ): this.type = js.native
  def pause(): js.Any = js.native
  def queryLookupd(): js.Any = js.native
  def unpause(): js.Any = js.native
}

@JSImport("nsqjs", "Reader")
@js.native
object Reader extends js.Object {
  var DISCARD: java.lang.String = js.native
  var ERROR: java.lang.String = js.native
  var MESSAGE: java.lang.String = js.native
  var NSQD_CLOSED: java.lang.String = js.native
  var NSQD_CONNECTED: java.lang.String = js.native
}

