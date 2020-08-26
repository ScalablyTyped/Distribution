package typings.nodemailer.mailComposerMod

import typings.nodemailer.mailerMod.Attachment
import typings.nodemailer.mailerMod.Options
import typings.nodemailer.nodemailerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates the object for composing a MimeNode instance out from the mail options */
@js.native
trait MailComposer extends js.Object {
  var mail: Options = js.native
  var message: typings.nodemailer.mimeNodeMod.^  | `false` = js.native
  /** Builds MimeNode instance */
  def compile(): typings.nodemailer.mimeNodeMod.^ = js.native
  /** List alternatives. Resulting objects can be used as input for MimeNode nodes */
  def getAlternatives(): js.Array[Attachment] = js.native
  /** List all attachments. Resulting attachment objects can be used as input for MimeNode nodes */
  def getAttachments(findRelated: Boolean): js.Array[Attachment] = js.native
}

object MailComposer {
  @scala.inline
  def apply(
    compile: () => typings.nodemailer.mimeNodeMod.^,
    getAlternatives: () => js.Array[Attachment],
    getAttachments: Boolean => js.Array[Attachment],
    mail: Options,
    message: typings.nodemailer.mimeNodeMod.^  | `false`
  ): MailComposer = {
    val __obj = js.Dynamic.literal(compile = js.Any.fromFunction0(compile), getAlternatives = js.Any.fromFunction0(getAlternatives), getAttachments = js.Any.fromFunction1(getAttachments), mail = mail.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailComposer]
  }
  @scala.inline
  implicit class MailComposerOps[Self <: MailComposer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompile(value: () => typings.nodemailer.mimeNodeMod.^): Self = this.set("compile", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAlternatives(value: () => js.Array[Attachment]): Self = this.set("getAlternatives", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAttachments(value: Boolean => js.Array[Attachment]): Self = this.set("getAttachments", js.Any.fromFunction1(value))
    @scala.inline
    def setMail(value: Options): Self = this.set("mail", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: typings.nodemailer.mimeNodeMod.^  | `false`): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

