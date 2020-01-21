package typings.nodemailer.sendmailTransportMod

import typings.nodemailer.nodemailerBooleans.`false`
import typings.nodemailer.sharedMod.Logger
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/sendmail-transport", JSImport.Namespace)
@js.native
class ^ protected () extends SendmailTransport {
  def this(options: Options) = this()
  /* CompleteClass */
  override var args: js.Array[String] | `false` = js.native
  /* CompleteClass */
  override var logger: Logger = js.native
  /* CompleteClass */
  @JSName("mailer")
  override var mailer_SendmailTransport: typings.nodemailer.mailerMod.^ = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var options: Options = js.native
  /* CompleteClass */
  override var path: String = js.native
  /* CompleteClass */
  override var version: String = js.native
  /* CompleteClass */
  override var winbreak: Boolean = js.native
  /* CompleteClass */
  override def send(
    mail: typings.nodemailer.mailMessageMod.^,
    callback: js.Function2[/* err */ Error | Null, /* info */ typings.nodemailer.mod.SentMessageInfo, Unit]
  ): Unit = js.native
}

