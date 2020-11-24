package typings.nodemailer.smtpPoolMod

import typings.node.eventsMod.EventEmitter
import typings.nodemailer.mod.Transport
import typings.nodemailer.nodemailerBooleans.`true`
import typings.nodemailer.nodemailerStrings.idle
import typings.nodemailer.sharedMod.Logger
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a SMTP pool transport object for Nodemailer
  */
@js.native
trait SMTPPool
  extends EventEmitter
     with Transport {
  
  @JSName("addListener")
  def addListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  
  /** Closes all connections in the pool. If there is a message being sent, the connection is closed later */
  @JSName("close")
  def close_MSMTPPool(): Unit = js.native
  
  @JSName("emit")
  def emit_idle(event: idle): Boolean = js.native
  
  /** Placeholder function for creating proxy sockets. This method immediatelly returns without a socket */
  def getSocket(options: Options, callback: js.Function2[/* err */ Error | Null, /* socketOptions */ js.Any, Unit]): Unit = js.native
  
  var idling: Boolean = js.native
  
  /** Returns true if there are free slots in the queue */
  def isIdle(): Boolean = js.native
  
  @JSName("listeners")
  def listeners_idle(event: idle): js.Array[js.Function0[Unit]] = js.native
  
  var logger: Logger = js.native
  
  @JSName("mailer")
  var mailer_SMTPPool: typings.nodemailer.mailerMod.^ = js.native
  
  @JSName("on")
  def on_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("once")
  def once_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  
  var options: Options = js.native
  
  @JSName("prependListener")
  def prependListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("verify")
  def verify_MSMTPPool(): js.Promise[`true`] = js.native
  /** Verifies SMTP configuration */
  @JSName("verify")
  def verify_true(callback: js.Function2[/* err */ Error | Null, `true`, Unit]): Unit = js.native
}
