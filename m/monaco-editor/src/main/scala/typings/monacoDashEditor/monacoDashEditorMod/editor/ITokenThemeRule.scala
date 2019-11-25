package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITokenThemeRule extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var foreground: js.UndefOr[String] = js.undefined
  var token: String
}

object ITokenThemeRule {
  @scala.inline
  def apply(token: String, background: String = null, fontStyle: String = null, foreground: String = null): ITokenThemeRule = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (foreground != null) __obj.updateDynamic("foreground")(foreground.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITokenThemeRule]
  }
}

