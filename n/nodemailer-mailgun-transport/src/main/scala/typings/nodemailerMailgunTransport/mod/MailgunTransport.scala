package typings.nodemailerMailgunTransport.mod

import typings.nodemailer.mod.SentMessageInfo
import typings.nodemailer.mod.Transport
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer-mailgun-transport", "MailgunTransport")
@js.native
class MailgunTransport () extends Transport {
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var version: String = js.native
  /* CompleteClass */
  override def send(
    mail: typings.nodemailer.mailMessageMod.^,
    callback: js.Function2[/* err */ Error | Null, /* info */ SentMessageInfo, Unit]
  ): Unit = js.native
}

