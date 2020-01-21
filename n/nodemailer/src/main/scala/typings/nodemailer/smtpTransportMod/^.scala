package typings.nodemailer.smtpTransportMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/smtp-transport", JSImport.Namespace)
@js.native
class ^ protected () extends SMTPTransport {
  def this(options: String) = this()
  def this(options: Options) = this()
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var version: String = js.native
  /* CompleteClass */
  override def send(
    mail: typings.nodemailer.mailMessageMod.^,
    callback: js.Function2[/* err */ Error | Null, /* info */ typings.nodemailer.mod.SentMessageInfo, Unit]
  ): Unit = js.native
}

