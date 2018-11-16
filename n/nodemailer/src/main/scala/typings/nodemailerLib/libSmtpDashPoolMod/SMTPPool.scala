package typings
package nodemailerLib.libSmtpDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMTPPool
  extends nodeLib.eventsMod.EventEmitter
     with nodemailerLib.nodemailerMod.Transport {
  var idling: scala.Boolean = js.native
  var logger: nodemailerLib.libSharedMod.Logger = js.native
  @JSName("mailer")
  var mailer_SMTPPool: nodemailerLib.libMailerMod.namespaced = js.native
  var options: nodemailerLib.libSmtpDashPoolMod.SMTPPoolNs.Options = js.native
  @JSName("addListener")
  def addListener_idle(event: nodemailerLib.nodemailerLibStrings.idle, listener: js.Function0[scala.Unit]): this.type = js.native
  /** Closes all connections in the pool. If there is a message being sent, the connection is closed later */
  @JSName("close")
  def close_MSMTPPool(): scala.Unit = js.native
  @JSName("emit")
  def emit_idle(event: nodemailerLib.nodemailerLibStrings.idle): scala.Boolean = js.native
  /** Placeholder function for creating proxy sockets. This method immediatelly returns without a socket */
  def getSocket(
    options: nodemailerLib.libSmtpDashPoolMod.SMTPPoolNs.Options,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* socketOptions */ js.Any, scala.Unit]
  ): scala.Unit = js.native
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
  def verify_MSMTPPool(): stdLib.Promise[nodemailerLib.nodemailerLibNumbers.`true`] = js.native
  /** Verifies SMTP configuration */
  @JSName("verify")
  def verify_MSMTPPool(
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      nodemailerLib.nodemailerLibNumbers.`true`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

