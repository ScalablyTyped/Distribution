package typings.muibox.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogButtonOptions extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var endIcon: js.UndefOr[ReactNode] = js.undefined
  var startIcon: js.UndefOr[ReactNode] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var variant: js.UndefOr[String] = js.undefined
}

object DialogButtonOptions {
  @scala.inline
  def apply(
    color: String = null,
    endIcon: ReactNode = null,
    startIcon: ReactNode = null,
    text: String = null,
    variant: String = null
  ): DialogButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (endIcon != null) __obj.updateDynamic("endIcon")(endIcon.asInstanceOf[js.Any])
    if (startIcon != null) __obj.updateDynamic("startIcon")(startIcon.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogButtonOptions]
  }
}

