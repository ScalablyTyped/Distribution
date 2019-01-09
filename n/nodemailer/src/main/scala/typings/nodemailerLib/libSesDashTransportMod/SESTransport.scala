package typings
package nodemailerLib.libSesDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SESTransport
  extends nodeLib.eventsMod.EventEmitter
     with nodemailerLib.nodemailerMod.Transport {
  var connections: scala.Double = js.native
  var idling: scala.Boolean = js.native
  var logger: nodemailerLib.libSharedMod.Logger = js.native
  @JSName("mailer")
  var mailer_SESTransport: nodemailerLib.libMailerMod.namespaced = js.native
  var maxConnections: scala.Double = js.native
  var options: nodemailerLib.libSesDashTransportMod.SESTransportNs.Options = js.native
  var pending: js.Array[nodemailerLib.Anon_Callback] = js.native
  var rateInterval: scala.Double = js.native
  var rateMessages: js.Array[nodemailerLib.Anon_Pending] = js.native
  var sendingRate: scala.Double = js.native
  var sendingRateTTL: scala.Double | scala.Null = js.native
  var ses: js.Any = js.native
  @JSName("addListener")
  def addListener_idle(event: nodemailerLib.nodemailerLibStrings.idle, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("emit")
  def emit_idle(event: nodemailerLib.nodemailerLibStrings.idle): scala.Boolean = js.native
  /** Returns true if there are free slots in the queue */
  def isIdle(): scala.Boolean = js.native
  @JSName("listeners")
  def listeners_idle(event: nodemailerLib.nodemailerLibStrings.idle): js.Array[js.Function0[scala.Unit]] = js.native
  @JSName("on")
  def on_idle(event: nodemailerLib.nodemailerLibStrings.idle, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_idle(event: nodemailerLib.nodemailerLibStrings.idle, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_idle(event: nodemailerLib.nodemailerLibStrings.idle, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_idle(event: nodemailerLib.nodemailerLibStrings.idle, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("verify")
  def verify_MSESTransport(): js.Promise[nodemailerLib.nodemailerLibNumbers.`true`] = js.native
  /** Verifies SES configuration */
  @JSName("verify")
  def verify_MSESTransport(
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      nodemailerLib.nodemailerLibNumbers.`true`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

