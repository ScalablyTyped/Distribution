package typings.mediumDashEditor.MediumEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasteHTMLOptions extends js.Object {
  var cleanAttrs: js.UndefOr[js.Array[String]] = js.undefined
  var cleanTags: js.UndefOr[js.Array[String]] = js.undefined
  var unwrapTags: js.UndefOr[js.Array[String]] = js.undefined
}

object PasteHTMLOptions {
  @scala.inline
  def apply(
    cleanAttrs: js.Array[String] = null,
    cleanTags: js.Array[String] = null,
    unwrapTags: js.Array[String] = null
  ): PasteHTMLOptions = {
    val __obj = js.Dynamic.literal()
    if (cleanAttrs != null) __obj.updateDynamic("cleanAttrs")(cleanAttrs.asInstanceOf[js.Any])
    if (cleanTags != null) __obj.updateDynamic("cleanTags")(cleanTags.asInstanceOf[js.Any])
    if (unwrapTags != null) __obj.updateDynamic("unwrapTags")(unwrapTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasteHTMLOptions]
  }
}

