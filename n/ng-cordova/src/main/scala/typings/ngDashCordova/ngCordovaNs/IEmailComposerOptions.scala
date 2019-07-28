package typings.ngDashCordova.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEmailComposerOptions extends js.Object {
  var attachments: js.UndefOr[js.Array[_]] = js.undefined
  var bcc: js.UndefOr[String | js.Array[String]] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  var cc: js.UndefOr[String | js.Array[String]] = js.undefined
  var isHtml: js.UndefOr[Boolean] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var to: String | js.Array[String]
}

object IEmailComposerOptions {
  @scala.inline
  def apply(
    to: String | js.Array[String],
    attachments: js.Array[_] = null,
    bcc: String | js.Array[String] = null,
    body: String = null,
    cc: String | js.Array[String] = null,
    isHtml: js.UndefOr[Boolean] = js.undefined,
    subject: String = null
  ): IEmailComposerOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body)
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (!js.isUndefined(isHtml)) __obj.updateDynamic("isHtml")(isHtml)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[IEmailComposerOptions]
  }
}

