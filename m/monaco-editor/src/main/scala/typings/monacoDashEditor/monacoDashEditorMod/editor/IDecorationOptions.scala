package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDecorationOptions extends js.Object {
  /**
    * CSS color to render.
    * e.g.: rgba(100, 100, 100, 0.5) or a color from the color registry
    */
  var color: js.UndefOr[String | ThemeColor] = js.undefined
  /**
    * CSS color to render.
    * e.g.: rgba(100, 100, 100, 0.5) or a color from the color registry
    */
  var darkColor: js.UndefOr[String | ThemeColor] = js.undefined
}

object IDecorationOptions {
  @scala.inline
  def apply(color: String | ThemeColor = null, darkColor: String | ThemeColor = null): IDecorationOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (darkColor != null) __obj.updateDynamic("darkColor")(darkColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDecorationOptions]
  }
}

