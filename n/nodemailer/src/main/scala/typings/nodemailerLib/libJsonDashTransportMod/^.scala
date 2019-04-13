package typings
package nodemailerLib.libJsonDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/json-transport", JSImport.Namespace)
@js.native
class ^ protected () extends JSONTransport {
  def this(options: Options) = this()
  /* CompleteClass */
  override var logger: nodemailerLib.libSharedMod.Logger = js.native
  /* CompleteClass */
  @JSName("mailer")
  override var mailer_JSONTransport: nodemailerLib.libMailerMod.^ = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var options: Options = js.native
  /* CompleteClass */
  override var version: java.lang.String = js.native
  /* CompleteClass */
  override def send(
    mail: nodemailerLib.libMailerMailDashMessageMod.^,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* info */ nodemailerLib.nodemailerMod.SentMessageInfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

