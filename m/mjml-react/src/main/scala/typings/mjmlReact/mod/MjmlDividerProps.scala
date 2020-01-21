package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.BorderColorProperty
import typings.csstype.mod.BorderStyleProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlDividerProps extends js.Object {
  var borderColor: js.UndefOr[BorderColorProperty] = js.undefined
  var borderStyle: js.UndefOr[BorderStyleProperty] = js.undefined
  var borderWidth: js.UndefOr[String | Double] = js.undefined
  var containerBackgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object MjmlDividerProps {
  @scala.inline
  def apply(
    borderColor: BorderColorProperty = null,
    borderStyle: BorderStyleProperty = null,
    borderWidth: String | Double = null,
    containerBackgroundColor: BackgroundColorProperty = null,
    width: String | Double = null
  ): MjmlDividerProps = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlDividerProps]
  }
}

