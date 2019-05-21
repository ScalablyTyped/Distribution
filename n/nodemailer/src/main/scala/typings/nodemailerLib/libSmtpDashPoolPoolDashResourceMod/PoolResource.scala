package typings
package nodemailerLib.libSmtpDashPoolPoolDashResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates an element for the pool
  */
@js.native
trait PoolResource
  extends nodeLib.eventsMod.EventEmitter {
  var available: scala.Boolean = js.native
  var logger: nodemailerLib.libSharedMod.Logger = js.native
  var messages: scala.Double = js.native
  var options: nodemailerLib.libSmtpDashPoolMod.Options = js.native
  var pool: nodemailerLib.libSmtpDashPoolMod.^ = js.native
  @JSName("addListener")
  def addListener_available(event: nodemailerLib.nodemailerLibStrings.available, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: nodemailerLib.nodemailerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  /** Closes the connection */
  def close(): scala.Unit = js.native
  /** Initiates a connection to the SMTP server */
  def connect(
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* established */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  @JSName("emit")
  def emit_available(event: nodemailerLib.nodemailerLibStrings.available): scala.Boolean = js.native
  @JSName("emit")
  def emit_close(event: nodemailerLib.nodemailerLibStrings.close): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(event: nodemailerLib.nodemailerLibStrings.error, err: stdLib.Error): scala.Boolean = js.native
  @JSName("on")
  def on_available(event: nodemailerLib.nodemailerLibStrings.available, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: nodemailerLib.nodemailerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_available(event: nodemailerLib.nodemailerLibStrings.available, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: nodemailerLib.nodemailerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_available(event: nodemailerLib.nodemailerLibStrings.available, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: nodemailerLib.nodemailerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_available(event: nodemailerLib.nodemailerLibStrings.available, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: nodemailerLib.nodemailerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_available(event: nodemailerLib.nodemailerLibStrings.available, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: nodemailerLib.nodemailerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  /** Sends an e-mail to be sent using the selected settings */
  def send(
    mail: nodemailerLib.libMailerMailDashMessageMod.^,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* info */ nodemailerLib.libSmtpDashPoolMod.SentMessageInfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

