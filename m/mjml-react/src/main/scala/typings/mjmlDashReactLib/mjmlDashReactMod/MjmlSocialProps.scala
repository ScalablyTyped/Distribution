package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlSocialProps extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var borderRadius: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var color: js.UndefOr[csstypeLib.csstypeMod.ColorProperty] = js.undefined
  var containerBackgroundColor: js.UndefOr[csstypeLib.csstypeMod.BackgroundColorProperty] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var iconHeight: js.UndefOr[java.lang.String] = js.undefined
  var iconSize: js.UndefOr[java.lang.String] = js.undefined
  var innerPadding: js.UndefOr[java.lang.String] = js.undefined
  var lineHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var mode: js.UndefOr[
    mjmlDashReactLib.mjmlDashReactLibStrings.vertical | mjmlDashReactLib.mjmlDashReactLibStrings.horizontal
  ] = js.undefined
  var textDecoration: js.UndefOr[java.lang.String] = js.undefined
}

object MjmlSocialProps {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    borderRadius: java.lang.String | scala.Double = null,
    color: csstypeLib.csstypeMod.ColorProperty = null,
    containerBackgroundColor: csstypeLib.csstypeMod.BackgroundColorProperty = null,
    fontFamily: java.lang.String = null,
    fontSize: java.lang.String | scala.Double = null,
    iconHeight: java.lang.String = null,
    iconSize: java.lang.String = null,
    innerPadding: java.lang.String = null,
    lineHeight: java.lang.String | scala.Double = null,
    mode: mjmlDashReactLib.mjmlDashReactLibStrings.vertical | mjmlDashReactLib.mjmlDashReactLibStrings.horizontal = null,
    textDecoration: java.lang.String = null
  ): MjmlSocialProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (iconHeight != null) __obj.updateDynamic("iconHeight")(iconHeight)
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize)
    if (innerPadding != null) __obj.updateDynamic("innerPadding")(innerPadding)
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration)
    __obj.asInstanceOf[MjmlSocialProps]
  }
}

