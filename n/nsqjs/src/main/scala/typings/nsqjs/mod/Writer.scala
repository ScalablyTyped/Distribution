package typings.nsqjs.mod

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.nsqjs.nsqjsStrings.closed
import typings.nsqjs.nsqjsStrings.error
import typings.nsqjs.nsqjsStrings.ready
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nsqjs", "Writer")
@js.native
class Writer protected () extends EventEmitter {
  def this(nsqdHost: String, nsqdPort: Double) = this()
  def this(nsqdHost: String, nsqdPort: Double, options: ConnectionConfigOptions) = this()
  
  def close(): Unit = js.native
  
  def connect(): Unit = js.native
  
  def deferPublish(topic: String, msgs: String, timeMs: Double): Unit = js.native
  def deferPublish(
    topic: String,
    msgs: String,
    timeMs: Double,
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def deferPublish(topic: String, msgs: js.Array[Buffer | js.Object | String], timeMs: Double): Unit = js.native
  def deferPublish(
    topic: String,
    msgs: js.Array[Buffer | js.Object | String],
    timeMs: Double,
    callback: js.Function1[js.UndefOr[Error], Unit]
  ): Unit = js.native
  def deferPublish(topic: String, msgs: js.Object, timeMs: Double): Unit = js.native
  def deferPublish(
    topic: String,
    msgs: js.Object,
    timeMs: Double,
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def deferPublish(topic: String, msgs: Buffer, timeMs: Double): Unit = js.native
  def deferPublish(
    topic: String,
    msgs: Buffer,
    timeMs: Double,
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  
  val nsqdHost: String = js.native
  
  val nsqdPort: Double = js.native
  
  @JSName("on")
  def on_closed(event: closed, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  
  def publish(topic: String, msgs: String): Unit = js.native
  def publish(topic: String, msgs: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def publish(topic: String, msgs: js.Array[Buffer | js.Object | String]): Unit = js.native
  def publish(
    topic: String,
    msgs: js.Array[Buffer | js.Object | String],
    callback: js.Function1[js.UndefOr[Error], Unit]
  ): Unit = js.native
  def publish(topic: String, msgs: js.Object): Unit = js.native
  def publish(topic: String, msgs: js.Object, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def publish(topic: String, msgs: Buffer): Unit = js.native
  def publish(topic: String, msgs: Buffer, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
}
/* static members */
@JSImport("nsqjs", "Writer")
@js.native
object Writer extends js.Object {
  
  var CLOSED: String = js.native
  
  var ERROR: String = js.native
  
  var READY: String = js.native
}
