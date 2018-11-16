package typings
package nodemailerLib.libSmtpDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/smtp-pool", JSImport.Namespace)
@js.native
class namespaced protected () extends SMTPPool {
  def this(options: java.lang.String) = this()
  def this(options: nodemailerLib.libSmtpDashPoolMod.SMTPPoolNs.Options) = this()
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

