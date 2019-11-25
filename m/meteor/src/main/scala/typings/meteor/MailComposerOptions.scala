package typings.meteor

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
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], escapeSMTP = escapeSMTP.asInstanceOf[js.Any], forceEmbeddedImages = forceEmbeddedImages.asInstanceOf[js.Any], keepBcc = keepBcc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MailComposerOptions]
  }
}

