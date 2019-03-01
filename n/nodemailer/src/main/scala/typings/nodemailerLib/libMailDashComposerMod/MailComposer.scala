package typings
package nodemailerLib.libMailDashComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates the object for composing a MimeNode instance out from the mail options */
trait MailComposer extends js.Object {
  var mail: nodemailerLib.libMailerMod.MailNs.Options
  var message: nodemailerLib.libMimeDashNodeMod.namespaced | nodemailerLib.nodemailerLibNumbers.`false`
  /** Builds MimeNode instance */
  def compile(): nodemailerLib.libMimeDashNodeMod.namespaced
  /** List alternatives. Resulting objects can be used as input for MimeNode nodes */
  def getAlternatives(): js.Array[nodemailerLib.libMailerMod.MailNs.Attachment]
  /** List all attachments. Resulting attachment objects can be used as input for MimeNode nodes */
  def getAttachments(findRelated: scala.Boolean): js.Array[nodemailerLib.libMailerMod.MailNs.Attachment]
}

object MailComposer {
  @scala.inline
  def apply(
    compile: js.Function0[nodemailerLib.libMimeDashNodeMod.namespaced],
    getAlternatives: js.Function0[js.Array[nodemailerLib.libMailerMod.MailNs.Attachment]],
    getAttachments: js.Function1[scala.Boolean, js.Array[nodemailerLib.libMailerMod.MailNs.Attachment]],
    mail: nodemailerLib.libMailerMod.MailNs.Options,
    message: nodemailerLib.libMimeDashNodeMod.namespaced | nodemailerLib.nodemailerLibNumbers.`false`
  ): MailComposer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compile")(compile)
    __obj.updateDynamic("getAlternatives")(getAlternatives)
    __obj.updateDynamic("getAttachments")(getAttachments)
    __obj.updateDynamic("mail")(mail)
    __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailComposer]
  }
}

