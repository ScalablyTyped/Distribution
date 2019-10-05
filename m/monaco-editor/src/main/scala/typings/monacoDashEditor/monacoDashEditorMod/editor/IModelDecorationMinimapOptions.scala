package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelDecorationMinimapOptions extends IDecorationOptions {
  /**
    * The position in the overview ruler.
    */
  var position: MinimapPosition
}

object IModelDecorationMinimapOptions {
  @scala.inline
  def apply(
    position: MinimapPosition,
    color: String | ThemeColor = null,
    darkColor: String | ThemeColor = null
  ): IModelDecorationMinimapOptions = {
    val __obj = js.Dynamic.literal(position = position)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (darkColor != null) __obj.updateDynamic("darkColor")(darkColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelDecorationMinimapOptions]
  }
}

