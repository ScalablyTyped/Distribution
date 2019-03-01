package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlDividerProps extends js.Object {
  var borderColor: js.UndefOr[csstypeLib.csstypeMod.BorderColorProperty] = js.undefined
  var borderStyle: js.UndefOr[csstypeLib.csstypeMod.BorderStyleProperty] = js.undefined
  var borderWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var containerBackgroundColor: js.UndefOr[csstypeLib.csstypeMod.BackgroundColorProperty] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object MjmlDividerProps {
  @scala.inline
  def apply(
    borderColor: csstypeLib.csstypeMod.BorderColorProperty = null,
    borderStyle: csstypeLib.csstypeMod.BorderStyleProperty = null,
    borderWidth: java.lang.String | scala.Double = null,
    containerBackgroundColor: csstypeLib.csstypeMod.BackgroundColorProperty = null,
    width: java.lang.String | scala.Double = null
  ): MjmlDividerProps = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlDividerProps]
  }
}

