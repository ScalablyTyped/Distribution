package typings.nodemailer.libSmtpConnectionMod

import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.netMod.Socket
import typings.node.streamMod.Readable
import typings.nodemailer.libSharedMod.Logger
import typings.nodemailer.nodemailerBooleans.`false`
import typings.nodemailer.nodemailerStrings.connect
import typings.nodemailer.nodemailerStrings.connected
import typings.nodemailer.nodemailerStrings.end
import typings.nodemailer.nodemailerStrings.error
import typings.nodemailer.nodemailerStrings.init
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SMTPConnection extends EventEmitter {
  
  /** The socket connecting to the server */
  var _socket: Socket = js.native
  
  def addListener(event: connect | end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ SMTPError, Unit]): this.type = js.native
  
  var alreadySecured: Boolean = js.native
  
  /** If true, then the user is authenticated */
  var authenticated: Boolean = js.native
  
  /** Closes the connection to the server */
  def close(): Unit = js.native
  
  /** Creates a connection to a SMTP server and sets up connection listener */
  def connect(callback: js.Function1[/* err */ js.UndefOr[SMTPError], Unit]): Unit = js.native
  
  /** If set to true, this instance is no longer active */
  var destroyed: Boolean = js.native
  
  def emit(event: connect | end): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, error: js.Error): Boolean = js.native
  
  var host: String = js.native
  
  var id: String = js.native
  
  var lastServerResponse: String | `false` = js.native
  
  def listenerCount(event: connect | end | error): Double = js.native
  
  def listeners(event: connect | end): js.Array[js.Function0[Unit]] = js.native
  @JSName("listeners")
  def listeners_error(event: error): js.Array[js.Function1[/* err */ SMTPError, Unit]] = js.native
  
  var logger: Logger = js.native
  
  /** Authenticate user */
  def login(auth: AuthenticationCredentials, callback: js.Function1[/* err */ js.UndefOr[SMTPError], Unit]): Unit = js.native
  def login(auth: AuthenticationOAuth2, callback: js.Function1[/* err */ js.UndefOr[SMTPError], Unit]): Unit = js.native
  def login(auth: Credentials, callback: js.Function1[/* err */ js.UndefOr[SMTPError], Unit]): Unit = js.native
  
  var name: String = js.native
  
  def off(event: connect | end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_error(event: error, listener: js.Function1[/* err */ SMTPError, Unit]): this.type = js.native
  
  def on(event: connect | end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ SMTPError, Unit]): this.type = js.native
  
  def once(event: connect | end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ SMTPError, Unit]): this.type = js.native
  
  var options: Options = js.native
  
  var port: Double = js.native
  
  def prependListener(event: connect | end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ SMTPError, Unit]): this.type = js.native
  
  def prependOnceListener(event: connect | end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ SMTPError, Unit]): this.type = js.native
  
  /** Sends QUIT */
  def quit(): Unit = js.native
  
  def rawListeners(event: connect | end): js.Array[js.Function0[Unit]] = js.native
  @JSName("rawListeners")
  def rawListeners_error(event: error): js.Array[js.Function1[/* err */ SMTPError, Unit]] = js.native
  
  def removeAllListener(event: connect | end | error): this.type = js.native
  
  def removeListener(event: connect | end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* err */ SMTPError, Unit]): this.type = js.native
  
  /** Resets connection state */
  def reset(callback: js.Function1[/* err */ js.UndefOr[SMTPError], Unit]): Unit = js.native
  
  /** Defines if the current connection is secure or not. If not, STARTTLS can be used if available */
  var secure: Boolean = js.native
  
  var secureConnection: Boolean = js.native
  
  /** Sends a message */
  def send(
    envelope: Envelope,
    message: String,
    callback: js.Function2[/* err */ SMTPError | Null, /* info */ SentMessageInfo, Unit]
  ): Unit = js.native
  def send(
    envelope: Envelope,
    message: Buffer,
    callback: js.Function2[/* err */ SMTPError | Null, /* info */ SentMessageInfo, Unit]
  ): Unit = js.native
  def send(
    envelope: Envelope,
    message: Readable,
    callback: js.Function2[/* err */ SMTPError | Null, /* info */ SentMessageInfo, Unit]
  ): Unit = js.native
  
  var stage: init | connected = js.native
  
  /** Expose version nr, just for the reference */
  var version: String = js.native
}
