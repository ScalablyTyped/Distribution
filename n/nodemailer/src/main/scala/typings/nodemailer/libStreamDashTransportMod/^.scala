package typings.nodemailer.libStreamDashTransportMod

import typings.nodemailer.libSharedMod.Logger
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/stream-transport", JSImport.Namespace)
@js.native
class ^ protected () extends StreamTransport {
  def this(options: Options) = this()
  /* CompleteClass */
  override var logger: Logger = js.native
  /* CompleteClass */
  @JSName("mailer")
  override var mailer_StreamTransport: typings.nodemailer.libMailerMod.^ = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var options: Options = js.native
  /* CompleteClass */
  override var version: String = js.native
  /* CompleteClass */
  override var winbreak: Boolean = js.native
  /* CompleteClass */
  override def send(
    mail: typings.nodemailer.libMailerMailDashMessageMod.^,
    callback: js.Function2[
      /* err */ Error | Null, 
      /* info */ typings.nodemailer.nodemailerMod.SentMessageInfo, 
      Unit
    ]
  ): Unit = js.native
}

