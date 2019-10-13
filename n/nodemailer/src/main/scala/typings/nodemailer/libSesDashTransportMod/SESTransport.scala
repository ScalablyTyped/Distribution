package typings.nodemailer.libSesDashTransportMod

import typings.node.eventsMod.EventEmitter
import typings.nodemailer.Anon_Callback
import typings.nodemailer.Anon_Pending
import typings.nodemailer.libSharedMod.Logger
import typings.nodemailer.nodemailerMod.Transport
import typings.nodemailer.nodemailerNumbers.`true`
import typings.nodemailer.nodemailerStrings.idle
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SESTransport
  extends EventEmitter
     with Transport {
  var connections: Double = js.native
  var idling: Boolean = js.native
  var logger: Logger = js.native
  @JSName("mailer")
  var mailer_SESTransport: typings.nodemailer.libMailerMod.^ = js.native
  var maxConnections: Double = js.native
  var options: Options = js.native
  var pending: js.Array[Anon_Callback] = js.native
  var rateInterval: Double = js.native
  var rateMessages: js.Array[Anon_Pending] = js.native
  var sendingRate: Double = js.native
  var sendingRateTTL: Double | Null = js.native
  var ses: js.Any = js.native
  @JSName("addListener")
  def addListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  @JSName("emit")
  def emit_idle(event: idle): Boolean = js.native
  /** Returns true if there are free slots in the queue */
  def isIdle(): Boolean = js.native
  @JSName("listeners")
  def listeners_idle(event: idle): js.Array[js.Function0[Unit]] = js.native
  @JSName("on")
  def on_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  @JSName("verify")
  def verify_MSESTransport(): js.Promise[`true`] = js.native
  /** Verifies SES configuration */
  @JSName("verify")
  def verify_true(callback: js.Function2[/* err */ Error | Null, `true`, Unit]): Unit = js.native
}

