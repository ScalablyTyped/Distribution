package typings
package mediumDashEditorLib.MediumEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasteHTMLOptions extends js.Object {
  var cleanAttrs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var cleanTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var unwrapTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object PasteHTMLOptions {
  @scala.inline
  def apply(
    cleanAttrs: js.Array[java.lang.String] = null,
    cleanTags: js.Array[java.lang.String] = null,
    unwrapTags: js.Array[java.lang.String] = null
  ): PasteHTMLOptions = {
    val __obj = js.Dynamic.literal()
    if (cleanAttrs != null) __obj.updateDynamic("cleanAttrs")(cleanAttrs)
    if (cleanTags != null) __obj.updateDynamic("cleanTags")(cleanTags)
    if (unwrapTags != null) __obj.updateDynamic("unwrapTags")(unwrapTags)
    __obj.asInstanceOf[PasteHTMLOptions]
  }
}

