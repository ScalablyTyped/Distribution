package typings
package nodemailerLib.libSmtpDashConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMTPConnection
  extends nodeLib.eventsMod.EventEmitter {
  /** The socket connecting to the server */
  var _socket: nodeLib.netMod.Socket = js.native
  var alreadySecured: scala.Boolean = js.native
  /** If true, then the user is authenticated */
  var authenticated: scala.Boolean = js.native
  /** If set to true, this instance is no longer active */
  var destroyed: scala.Boolean = js.native
  var host: java.lang.String = js.native
  var id: java.lang.String = js.native
  var lastServerResponse: java.lang.String | nodemailerLib.nodemailerLibNumbers.`false` = js.native
  var logger: nodemailerLib.libSharedMod.Logger = js.native
  var name: java.lang.String = js.native
  var options: nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.Options = js.native
  var port: scala.Double = js.native
  /** Defines if the current connection is secure or not. If not, STARTTLS can be used if available */
  var secure: scala.Boolean = js.native
  var secureConnection: scala.Boolean = js.native
  var stage: nodemailerLib.nodemailerLibStrings.init | nodemailerLib.nodemailerLibStrings.connected = js.native
  /** Expose version nr, just for the reference */
  var version: java.lang.String = js.native
  @JSName("addListener")
  def addListener_connect(event: nodemailerLib.nodemailerLibStrings.connect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_end(event: nodemailerLib.nodemailerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[
      /* err */ nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SMTPError, 
      scala.Unit
    ]
  ): this.type = js.native
  /** Closes the connection to the server */
  def close(): scala.Unit = js.native
  /** Creates a connection to a SMTP server and sets up connection listener */
  def connect(
    callback: js.Function1[
      /* err */ js.UndefOr[nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SMTPError], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("emit")
  def emit_connect(event: nodemailerLib.nodemailerLibStrings.connect): scala.Boolean = js.native
  @JSName("emit")
  def emit_end(event: nodemailerLib.nodemailerLibStrings.end): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(event: nodemailerLib.nodemailerLibStrings.error, error: nodeLib.Error): scala.Boolean = js.native
  @JSName("listenerCount")
  def listenerCount_connect(event: nodemailerLib.nodemailerLibStrings.connect): scala.Double = js.native
  @JSName("listenerCount")
  def listenerCount_end(event: nodemailerLib.nodemailerLibStrings.end): scala.Double = js.native
  @JSName("listenerCount")
  def listenerCount_error(event: nodemailerLib.nodemailerLibStrings.error): scala.Double = js.native
  @JSName("listeners")
  def listeners_connect(event: nodemailerLib.nodemailerLibStrings.connect): js.Array[js.Function0[scala.Unit]] = js.native
  @JSName("listeners")
  def listeners_end(event: nodemailerLib.nodemailerLibStrings.end): js.Array[js.Function0[scala.Unit]] = js.native
  @JSName("listeners")
  def listeners_error(event: nodemailerLib.nodemailerLibStrings.error): js.Array[
    js.Function1[
      /* err */ nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SMTPError, 
      scala.Unit
    ]
  ] = js.native
  /** Authenticate user */
  def login(
    auth: nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.AuthenticationCredentials,
    callback: js.Function1[
      /* err */ js.UndefOr[nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SMTPError], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** Authenticate user */
  def login(
    auth: nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.AuthenticationOAuth2,
    callback: js.Function1[
      /* err */ js.UndefOr[nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SMTPError], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** Authenticate user */
  def login(
    auth: nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.Credentials,
    callback: js.Function1[
      /* err */ js.UndefOr[nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SMTPError], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("off")
  def off_connect(event: nodemailerLib.nodemailerLibStrings.connect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("off")
  def off_end(event: nodemailerLib.nodemailerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("off")
  def off_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[
      /* err */ nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SMTPError, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_connect(event: nodemailerLib.nodemailerLibStrings.connect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: nodemailerLib.nodemailerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[
      /* err */ nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SMTPError, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_connect(event: nodemailerLib.nodemailerLibStrings.connect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: nodemailerLib.nodemailerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[
      /* err */ nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SMTPError, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_connect(event: nodemailerLib.nodemailerLibStrings.connect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(event: nodemailerLib.nodemailerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[
      /* err */ nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SMTPError, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connect(event: nodemailerLib.nodemailerLibStrings.connect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: nodemailerLib.nodemailerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[
      /* err */ nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SMTPError, 
      scala.Unit
    ]
  ): this.type = js.native
  /** Sends QUIT */
  def quit(): scala.Unit = js.native
  @JSName("rawListeners")
  def rawListeners_connect(event: nodemailerLib.nodemailerLibStrings.connect): js.Array[js.Function0[scala.Unit]] = js.native
  @JSName("rawListeners")
  def rawListeners_end(event: nodemailerLib.nodemailerLibStrings.end): js.Array[js.Function0[scala.Unit]] = js.native
  @JSName("rawListeners")
  def rawListeners_error(event: nodemailerLib.nodemailerLibStrings.error): js.Array[
    js.Function1[
      /* err */ nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SMTPError, 
      scala.Unit
    ]
  ] = js.native
  @JSName("removeAllListener")
  def removeAllListener_connect(event: nodemailerLib.nodemailerLibStrings.connect): this.type = js.native
  @JSName("removeAllListener")
  def removeAllListener_end(event: nodemailerLib.nodemailerLibStrings.end): this.type = js.native
  @JSName("removeAllListener")
  def removeAllListener_error(event: nodemailerLib.nodemailerLibStrings.error): this.type = js.native
  @JSName("removeListener")
  def removeListener_connect(event: nodemailerLib.nodemailerLibStrings.connect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_end(event: nodemailerLib.nodemailerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[
      /* err */ nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SMTPError, 
      scala.Unit
    ]
  ): this.type = js.native
  /** Resets connection state */
  def reset(
    callback: js.Function1[
      /* err */ js.UndefOr[nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SMTPError], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** Sends a message */
  def send(
    envelope: nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.Envelope,
    message: java.lang.String,
    callback: js.Function2[
      /* err */ nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SMTPError | scala.Null, 
      /* info */ nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SentMessageInfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** Sends a message */
  def send(
    envelope: nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.Envelope,
    message: nodeLib.Buffer,
    callback: js.Function2[
      /* err */ nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SMTPError | scala.Null, 
      /* info */ nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SentMessageInfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** Sends a message */
  def send(
    envelope: nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.Envelope,
    message: nodeLib.streamMod.Readable,
    callback: js.Function2[
      /* err */ nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SMTPError | scala.Null, 
      /* info */ nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.SentMessageInfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

