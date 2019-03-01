package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlHeroProps extends js.Object {
  var backgroundColor: js.UndefOr[csstypeLib.csstypeMod.BackgroundColorProperty] = js.undefined
  var backgroundHeight: js.UndefOr[java.lang.String] = js.undefined
  var backgroundPosition: js.UndefOr[
    csstypeLib.csstypeMod.BackgroundPositionProperty[java.lang.String | scala.Double]
  ] = js.undefined
  var backgroundUrl: js.UndefOr[java.lang.String] = js.undefined
  var backgroundWidth: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var mode: js.UndefOr[
    mjmlDashReactLib.mjmlDashReactLibStrings.`fluid-height` | mjmlDashReactLib.mjmlDashReactLibStrings.`fixed-height`
  ] = js.undefined
  var verticalAlign: js.UndefOr[csstypeLib.csstypeMod.VerticalAlignProperty[java.lang.String | scala.Double]] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object MjmlHeroProps {
  @scala.inline
  def apply(
    backgroundColor: csstypeLib.csstypeMod.BackgroundColorProperty = null,
    backgroundHeight: java.lang.String = null,
    backgroundPosition: csstypeLib.csstypeMod.BackgroundPositionProperty[java.lang.String | scala.Double] = null,
    backgroundUrl: java.lang.String = null,
    backgroundWidth: java.lang.String = null,
    height: java.lang.String | scala.Double = null,
    mode: mjmlDashReactLib.mjmlDashReactLibStrings.`fluid-height` | mjmlDashReactLib.mjmlDashReactLibStrings.`fixed-height` = null,
    verticalAlign: csstypeLib.csstypeMod.VerticalAlignProperty[java.lang.String | scala.Double] = null,
    width: java.lang.String | scala.Double = null
  ): MjmlHeroProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (backgroundHeight != null) __obj.updateDynamic("backgroundHeight")(backgroundHeight)
    if (backgroundPosition != null) __obj.updateDynamic("backgroundPosition")(backgroundPosition.asInstanceOf[js.Any])
    if (backgroundUrl != null) __obj.updateDynamic("backgroundUrl")(backgroundUrl)
    if (backgroundWidth != null) __obj.updateDynamic("backgroundWidth")(backgroundWidth)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlHeroProps]
  }
}

