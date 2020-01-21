package typings.nsqjs.mod

import typings.node.eventsMod.EventEmitter
import typings.nsqjs.nsqjsStrings.closed
import typings.nsqjs.nsqjsStrings.error
import typings.nsqjs.nsqjsStrings.ready
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nsqjs", "Writer")
@js.native
class Writer protected () extends EventEmitter {
  def this(nsqdHost: String, nsqdPort: Double) = this()
  def this(nsqdHost: String, nsqdPort: Double, options: ConnectionConfigOptions) = this()
  val nsqdHost: String = js.native
  val nsqdPort: Double = js.native
  def close(): js.Any = js.native
  def connect(): js.Any = js.native
  @JSName("on")
  def on_closed(event: closed, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  def publish(topic: String, msgs: js.Any): js.Any = js.native
  def publish(topic: String, msgs: js.Any, listener: js.Function1[/* err */ Error, Unit]): js.Any = js.native
}

/* static members */
@JSImport("nsqjs", "Writer")
@js.native
object Writer extends js.Object {
  var CLOSED: String = js.native
  var ERROR: String = js.native
  var READY: String = js.native
}

