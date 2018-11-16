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

