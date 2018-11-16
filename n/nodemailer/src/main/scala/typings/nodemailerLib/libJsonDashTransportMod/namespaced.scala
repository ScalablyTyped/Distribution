package typings
package nodemailerLib.libJsonDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/json-transport", JSImport.Namespace)
@js.native
class namespaced protected () extends JSONTransport {
  def this(options: nodemailerLib.libJsonDashTransportMod.JSONTransportNs.Options) = this()
  /* CompleteClass */
  override var logger: nodemailerLib.libSharedMod.Logger = js.native
  /* CompleteClass */
  @JSName("mailer")
  override var mailer_JSONTransport: nodemailerLib.libMailerMod.namespaced = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var options: nodemailerLib.libJsonDashTransportMod.JSONTransportNs.Options = js.native
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

