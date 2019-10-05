package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelDecorationOverviewRulerOptions extends IDecorationOptions {
  /**
    * The position in the overview ruler.
    */
  var position: OverviewRulerLane
}

object IModelDecorationOverviewRulerOptions {
  @scala.inline
  def apply(
    position: OverviewRulerLane,
    color: String | ThemeColor = null,
    darkColor: String | ThemeColor = null
  ): IModelDecorationOverviewRulerOptions = {
    val __obj = js.Dynamic.literal(position = position)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (darkColor != null) __obj.updateDynamic("darkColor")(darkColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelDecorationOverviewRulerOptions]
  }
}

