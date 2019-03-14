package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlWrapperProps extends js.Object {
  var backgroundColor: js.UndefOr[csstypeLib.csstypeMod.BackgroundColorProperty] = js.undefined
  var backgroundRepeat: js.UndefOr[csstypeLib.csstypeMod.BackgroundRepeatProperty] = js.undefined
  var backgroundSize: js.UndefOr[csstypeLib.csstypeMod.BackgroundSizeProperty[java.lang.String | scala.Double]] = js.undefined
  var backgroundUrl: js.UndefOr[java.lang.String] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var textAlign: js.UndefOr[csstypeLib.csstypeMod.TextAlignProperty] = js.undefined
  var verticalAlign: js.UndefOr[csstypeLib.csstypeMod.VerticalAlignProperty[java.lang.String | scala.Double]] = js.undefined
}

object MjmlWrapperProps {
  @scala.inline
  def apply(
    backgroundColor: csstypeLib.csstypeMod.BackgroundColorProperty = null,
    backgroundRepeat: csstypeLib.csstypeMod.BackgroundRepeatProperty = null,
    backgroundSize: csstypeLib.csstypeMod.BackgroundSizeProperty[java.lang.String | scala.Double] = null,
    backgroundUrl: java.lang.String = null,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    textAlign: csstypeLib.csstypeMod.TextAlignProperty = null,
    verticalAlign: csstypeLib.csstypeMod.VerticalAlignProperty[java.lang.String | scala.Double] = null
  ): MjmlWrapperProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundRepeat != null) __obj.updateDynamic("backgroundRepeat")(backgroundRepeat.asInstanceOf[js.Any])
    if (backgroundSize != null) __obj.updateDynamic("backgroundSize")(backgroundSize.asInstanceOf[js.Any])
    if (backgroundUrl != null) __obj.updateDynamic("backgroundUrl")(backgroundUrl)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlWrapperProps]
  }
}

