package typings
package nodemailerLib.libMailDashComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates the object for composing a MimeNode instance out from the mail options */
trait MailComposer extends js.Object {
  var mail: nodemailerLib.libMailerMod.Options
  var message: nodemailerLib.libMimeDashNodeMod.^  | nodemailerLib.nodemailerLibNumbers.`false`
  /** Builds MimeNode instance */
  def compile(): nodemailerLib.libMimeDashNodeMod.^
  /** List alternatives. Resulting objects can be used as input for MimeNode nodes */
  def getAlternatives(): js.Array[nodemailerLib.libMailerMod.Attachment]
  /** List all attachments. Resulting attachment objects can be used as input for MimeNode nodes */
  def getAttachments(findRelated: scala.Boolean): js.Array[nodemailerLib.libMailerMod.Attachment]
}

object MailComposer {
  @scala.inline
  def apply(
    compile: () => nodemailerLib.libMimeDashNodeMod.^,
    getAlternatives: () => js.Array[nodemailerLib.libMailerMod.Attachment],
    getAttachments: scala.Boolean => js.Array[nodemailerLib.libMailerMod.Attachment],
    mail: nodemailerLib.libMailerMod.Options,
    message: nodemailerLib.libMimeDashNodeMod.^  | nodemailerLib.nodemailerLibNumbers.`false`
  ): MailComposer = {
    val __obj = js.Dynamic.literal(compile = js.Any.fromFunction0(compile), getAlternatives = js.Any.fromFunction0(getAlternatives), getAttachments = js.Any.fromFunction1(getAttachments), mail = mail, message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MailComposer]
  }
}

