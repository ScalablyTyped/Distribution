package typings.nodemailerDashMailgunDashTransport.nodemailerDashMailgunDashTransportMod

import typings.nodemailer.nodemailerMod.SentMessageInfo
import typings.nodemailer.nodemailerMod.Transport
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
    mail: typings.nodemailer.libMailerMailDashMessageMod.^,
    callback: js.Function2[/* err */ Error | Null, /* info */ SentMessageInfo, Unit]
  ): Unit = js.native
}

