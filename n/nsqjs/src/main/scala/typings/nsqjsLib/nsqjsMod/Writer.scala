package typings
package nsqjsLib.nsqjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nsqjs", "Writer")
@js.native
class Writer protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(nsqdHost: java.lang.String, nsqdPort: scala.Double) = this()
  def this(nsqdHost: java.lang.String, nsqdPort: scala.Double, options: ConnectionConfigOptions) = this()
  val nsqdHost: java.lang.String = js.native
  val nsqdPort: scala.Double = js.native
  def close(): js.Any = js.native
  def connect(): js.Any = js.native
  @JSName("on")
  def on_closed(event: nsqjsLib.nsqjsLibStrings.closed, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: nsqjsLib.nsqjsLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: nsqjsLib.nsqjsLibStrings.ready, listener: js.Function0[scala.Unit]): this.type = js.native
  def publish(topic: java.lang.String, msgs: js.Any): js.Any = js.native
  def publish(topic: java.lang.String, msgs: js.Any, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): js.Any = js.native
}

@JSImport("nsqjs", "Writer")
@js.native
object Writer extends js.Object {
  var CLOSED: java.lang.String = js.native
  var ERROR: java.lang.String = js.native
  var READY: java.lang.String = js.native
}

