package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorizerElementOptions extends IColorizerOptions {
  var mimeType: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object IColorizerElementOptions {
  @scala.inline
  def apply(mimeType: String = null, tabSize: Int | Double = null, theme: String = null): IColorizerElementOptions = {
    val __obj = js.Dynamic.literal()
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IColorizerElementOptions]
  }
}

