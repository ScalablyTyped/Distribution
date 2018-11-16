package typings
package nodemailerLib.libSmtpDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/smtp-transport", JSImport.Namespace)
@js.native
class namespaced protected () extends SMTPTransport {
  def this(options: java.lang.String) = this()
  def this(options: nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.Options) = this()
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var version: java.lang.String = js.native
  /* CompleteClass */
  override def send(
    mail: nodemailerLib.libMailerMailDashMessageMod.namespaced,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* info */ nodemailerLib.nodemailerMod.SentMessageInfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

