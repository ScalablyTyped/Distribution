package typings.nodemailer.libMailDashComposerMod

import typings.nodemailer.libMailerMod.Attachment
import typings.nodemailer.libMailerMod.Options
import typings.nodemailer.nodemailerNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates the object for composing a MimeNode instance out from the mail options */
@JSImport("nodemailer/lib/mail-composer", JSImport.Namespace)
@js.native
class ^ protected () extends MailComposer {
  def this(mail: Options) = this()
  /* CompleteClass */
  override var mail: Options = js.native
  /* CompleteClass */
  override var message: typings.nodemailer.libMimeDashNodeMod.^  | `false` = js.native
  /** Builds MimeNode instance */
  /* CompleteClass */
  override def compile(): typings.nodemailer.libMimeDashNodeMod.^ = js.native
  /** List alternatives. Resulting objects can be used as input for MimeNode nodes */
  /* CompleteClass */
  override def getAlternatives(): js.Array[Attachment] = js.native
  /** List all attachments. Resulting attachment objects can be used as input for MimeNode nodes */
  /* CompleteClass */
  override def getAttachments(findRelated: Boolean): js.Array[Attachment] = js.native
}

