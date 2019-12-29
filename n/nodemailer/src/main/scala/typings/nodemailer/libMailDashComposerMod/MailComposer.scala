package typings.nodemailer.libMailDashComposerMod

import typings.nodemailer.libMailerMod.Attachment
import typings.nodemailer.libMailerMod.Options
import typings.nodemailer.nodemailerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates the object for composing a MimeNode instance out from the mail options */
trait MailComposer extends js.Object {
  var mail: Options
  var message: typings.nodemailer.libMimeDashNodeMod.^  | `false`
  /** Builds MimeNode instance */
  def compile(): typings.nodemailer.libMimeDashNodeMod.^
  /** List alternatives. Resulting objects can be used as input for MimeNode nodes */
  def getAlternatives(): js.Array[Attachment]
  /** List all attachments. Resulting attachment objects can be used as input for MimeNode nodes */
  def getAttachments(findRelated: Boolean): js.Array[Attachment]
}

object MailComposer {
  @scala.inline
  def apply(
    compile: () => typings.nodemailer.libMimeDashNodeMod.^,
    getAlternatives: () => js.Array[Attachment],
    getAttachments: Boolean => js.Array[Attachment],
    mail: Options,
    message: typings.nodemailer.libMimeDashNodeMod.^  | `false`
  ): MailComposer = {
    val __obj = js.Dynamic.literal(compile = js.Any.fromFunction0(compile), getAlternatives = js.Any.fromFunction0(getAlternatives), getAttachments = js.Any.fromFunction1(getAttachments), mail = mail.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MailComposer]
  }
}

