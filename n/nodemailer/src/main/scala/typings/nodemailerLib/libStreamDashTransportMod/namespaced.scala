package typings
package nodemailerLib.libStreamDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/stream-transport", JSImport.Namespace)
@js.native
class namespaced protected () extends StreamTransport {
  def this(options: nodemailerLib.libStreamDashTransportMod.StreamTransportNs.Options) = this()
  /* CompleteClass */
  override var logger: nodemailerLib.libSharedMod.Logger = js.native
  /* CompleteClass */
  @JSName("mailer")
  override var mailer_StreamTransport: nodemailerLib.libMailerMod.namespaced = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var options: nodemailerLib.libStreamDashTransportMod.StreamTransportNs.Options = js.native
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

