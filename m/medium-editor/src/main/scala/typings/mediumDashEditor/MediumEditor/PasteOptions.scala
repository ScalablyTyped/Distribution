package typings.mediumDashEditor.MediumEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasteOptions extends js.Object {
  var cleanAttrs: js.UndefOr[js.Array[String]] = js.undefined
  var cleanPastedHTML: js.UndefOr[Boolean] = js.undefined
  var cleanReplacements: js.UndefOr[js.Array[_]] = js.undefined
  var cleanTags: js.UndefOr[js.Array[String]] = js.undefined
  var forcePlainText: js.UndefOr[Boolean] = js.undefined
  var preCleanReplacements: js.UndefOr[js.Array[_]] = js.undefined
  var unwrapTags: js.UndefOr[js.Array[String]] = js.undefined
}

object PasteOptions {
  @scala.inline
  def apply(
    cleanAttrs: js.Array[String] = null,
    cleanPastedHTML: js.UndefOr[Boolean] = js.undefined,
    cleanReplacements: js.Array[_] = null,
    cleanTags: js.Array[String] = null,
    forcePlainText: js.UndefOr[Boolean] = js.undefined,
    preCleanReplacements: js.Array[_] = null,
    unwrapTags: js.Array[String] = null
  ): PasteOptions = {
    val __obj = js.Dynamic.literal()
    if (cleanAttrs != null) __obj.updateDynamic("cleanAttrs")(cleanAttrs)
    if (!js.isUndefined(cleanPastedHTML)) __obj.updateDynamic("cleanPastedHTML")(cleanPastedHTML)
    if (cleanReplacements != null) __obj.updateDynamic("cleanReplacements")(cleanReplacements)
    if (cleanTags != null) __obj.updateDynamic("cleanTags")(cleanTags)
    if (!js.isUndefined(forcePlainText)) __obj.updateDynamic("forcePlainText")(forcePlainText)
    if (preCleanReplacements != null) __obj.updateDynamic("preCleanReplacements")(preCleanReplacements)
    if (unwrapTags != null) __obj.updateDynamic("unwrapTags")(unwrapTags)
    __obj.asInstanceOf[PasteOptions]
  }
}

