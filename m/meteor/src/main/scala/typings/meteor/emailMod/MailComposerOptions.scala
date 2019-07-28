package typings.meteor.emailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailComposerOptions extends js.Object {
  var charset: String
  var encoding: String
  var escapeSMTP: Boolean
  var forceEmbeddedImages: Boolean
  var keepBcc: Boolean
}

object MailComposerOptions {
  @scala.inline
  def apply(
    charset: String,
    encoding: String,
    escapeSMTP: Boolean,
    forceEmbeddedImages: Boolean,
    keepBcc: Boolean
  ): MailComposerOptions = {
    val __obj = js.Dynamic.literal(charset = charset, encoding = encoding, escapeSMTP = escapeSMTP, forceEmbeddedImages = forceEmbeddedImages, keepBcc = keepBcc)
  
    __obj.asInstanceOf[MailComposerOptions]
  }
}

