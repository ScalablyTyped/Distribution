package typings.nodemailer.libSmtpDashPoolMod

import typings.node.eventsMod.EventEmitter
import typings.nodemailer.libSharedMod.Logger
import typings.nodemailer.nodemailerMod.Transport
import typings.nodemailer.nodemailerNumbers.`true`
import typings.nodemailer.nodemailerStrings.idle
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a SMTP pool transport object for Nodemailer
  */
@js.native
trait SMTPPool
  extends EventEmitter
     with Transport {
  var idling: Boolean = js.native
  var logger: Logger = js.native
  @JSName("mailer")
  var mailer_SMTPPool: typings.nodemailer.libMailerMod.^ = js.native
  var options: Options = js.native
  /* InferMemberOverrides */
  override def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  /** Closes all connections in the pool. If there is a message being sent, the connection is closed later */
  @JSName("close")
  def close_MSMTPPool(): Unit = js.native
  /* InferMemberOverrides */
  override def emit(event: String, args: js.Any*): Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  @JSName("emit")
  def emit_idle(event: idle): Boolean = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[String | js.Symbol] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): Double = js.native
  /** Placeholder function for creating proxy sockets. This method immediatelly returns without a socket */
  def getSocket(options: Options, callback: js.Function2[/* err */ Error | Null, /* socketOptions */ js.Any, Unit]): Unit = js.native
  /** Returns true if there are free slots in the queue */
  def isIdle(): Boolean = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: String): Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  @JSName("listeners")
  def listeners_idle(event: idle): js.Array[js.Function0[Unit]] = js.native
  /* InferMemberOverrides */
  override def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: Double): this.type = js.native
  @JSName("verify")
  def verify_MSMTPPool(): js.Promise[`true`] = js.native
  /** Verifies SMTP configuration */
  @JSName("verify")
  def verify_true(callback: js.Function2[/* err */ Error | Null, `true`, Unit]): Unit = js.native
}

