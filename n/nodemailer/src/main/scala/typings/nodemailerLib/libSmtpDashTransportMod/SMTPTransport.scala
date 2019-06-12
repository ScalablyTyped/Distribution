package typings
package nodemailerLib.libSmtpDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMTPTransport
  extends nodeLib.eventsMod.EventEmitter
     with nodemailerLib.nodemailerMod.Transport {
  var auth: AuthenticationType = js.native
  var logger: nodemailerLib.libSharedMod.Logger = js.native
  @JSName("mailer")
  var mailer_SMTPTransport: nodemailerLib.libMailerMod.^ = js.native
  var options: Options = js.native
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: nodemailerLib.nodemailerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  /** Releases resources */
  @JSName("close")
  def close_MSMTPTransport(): scala.Unit = js.native
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  @JSName("emit")
  def emit_close(event: nodemailerLib.nodemailerLibStrings.close): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(event: nodemailerLib.nodemailerLibStrings.error, error: stdLib.Error): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  def getAuth(authOpts: nodemailerLib.libSmtpDashConnectionMod.AuthenticationTypeLogin): AuthenticationType = js.native
  def getAuth(authOpts: nodemailerLib.libSmtpDashConnectionMod.AuthenticationTypeOAuth2): AuthenticationType = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  /** Placeholder function for creating proxy sockets. This method immediatelly returns without a socket */
  def getSocket(
    options: Options,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* socketOptions */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  @JSName("listeners")
  def listeners_close(event: nodemailerLib.nodemailerLibStrings.close): js.Array[js.Function0[scala.Unit]] = js.native
  @JSName("listeners")
  def listeners_error(event: nodemailerLib.nodemailerLibStrings.error): js.Array[js.Function1[/* err */ stdLib.Error, scala.Unit]] = js.native
  /* InferMemberOverrides */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: nodemailerLib.nodemailerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: nodemailerLib.nodemailerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: nodemailerLib.nodemailerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: nodemailerLib.nodemailerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: java.lang.String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
  @JSName("verify")
  def verify_MSMTPTransport(): js.Promise[nodemailerLib.nodemailerLibNumbers.`true`] = js.native
  /** Verifies SMTP configuration */
  @JSName("verify")
  def verify_true(
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      nodemailerLib.nodemailerLibNumbers.`true`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

