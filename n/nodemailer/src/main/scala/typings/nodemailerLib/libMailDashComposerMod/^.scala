package typings
package nodemailerLib.libMailDashComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates the object for composing a MimeNode instance out from the mail options */
@JSImport("nodemailer/lib/mail-composer", JSImport.Namespace)
@js.native
class ^ protected () extends MailComposer {
  def this(mail: nodemailerLib.libMailerMod.Options) = this()
  /* CompleteClass */
  override var mail: nodemailerLib.libMailerMod.Options = js.native
  /* CompleteClass */
  override var message: nodemailerLib.libMimeDashNodeMod.^  | nodemailerLib.nodemailerLibNumbers.`false` = js.native
  /** Builds MimeNode instance */
  /* CompleteClass */
  override def compile(): nodemailerLib.libMimeDashNodeMod.^ = js.native
  /** List alternatives. Resulting objects can be used as input for MimeNode nodes */
  /* CompleteClass */
  override def getAlternatives(): js.Array[nodemailerLib.libMailerMod.Attachment] = js.native
  /** List all attachments. Resulting attachment objects can be used as input for MimeNode nodes */
  /* CompleteClass */
  override def getAttachments(findRelated: scala.Boolean): js.Array[nodemailerLib.libMailerMod.Attachment] = js.native
}

