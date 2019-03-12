package typings
package nodemailerLib.libSendmailDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/sendmail-transport", JSImport.Namespace)
@js.native
class namespaced protected () extends SendmailTransport {
  def this(options: nodemailerLib.libSendmailDashTransportMod.SendmailTransportNs.Options) = this()
  /* CompleteClass */
  override var args: js.Array[java.lang.String] | nodemailerLib.nodemailerLibNumbers.`false` = js.native
  /* CompleteClass */
  override var logger: nodemailerLib.libSharedMod.Logger = js.native
  /* CompleteClass */
  @JSName("mailer")
  override var mailer_SendmailTransport: nodemailerLib.libMailerMod.namespaced = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var options: nodemailerLib.libSendmailDashTransportMod.SendmailTransportNs.Options = js.native
  /* CompleteClass */
  override var path: java.lang.String = js.native
  /* CompleteClass */
  override var version: java.lang.String = js.native
  /* CompleteClass */
  override var winbreak: scala.Boolean = js.native
  /* CompleteClass */
  override def send(
    mail: nodemailerLib.libMailerMailDashMessageMod.namespaced,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* info */ nodemailerLib.nodemailerMod.SentMessageInfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

