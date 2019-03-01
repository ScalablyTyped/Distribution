package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEmailComposerOptions extends js.Object {
  var attachments: js.UndefOr[js.Array[_]] = js.undefined
  var bcc: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var body: js.UndefOr[java.lang.String] = js.undefined
  var cc: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var isHtml: js.UndefOr[scala.Boolean] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
  var to: java.lang.String | js.Array[java.lang.String]
}

object IEmailComposerOptions {
  @scala.inline
  def apply(
    to: java.lang.String | js.Array[java.lang.String],
    attachments: js.Array[_] = null,
    bcc: java.lang.String | js.Array[java.lang.String] = null,
    body: java.lang.String = null,
    cc: java.lang.String | js.Array[java.lang.String] = null,
    isHtml: js.UndefOr[scala.Boolean] = js.undefined,
    subject: java.lang.String = null
  ): IEmailComposerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body)
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (!js.isUndefined(isHtml)) __obj.updateDynamic("isHtml")(isHtml)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[IEmailComposerOptions]
  }
}

