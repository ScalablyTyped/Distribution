package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlButtonProps extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var backgroundColor: js.UndefOr[csstypeLib.csstypeMod.BackgroundColorProperty] = js.undefined
  var color: js.UndefOr[csstypeLib.csstypeMod.ColorProperty] = js.undefined
  var containerBackgroundColor: js.UndefOr[csstypeLib.csstypeMod.BackgroundColorProperty] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  var fontWeight: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var innerPadding: js.UndefOr[java.lang.String] = js.undefined
  var lineHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var textAlign: js.UndefOr[csstypeLib.csstypeMod.TextAlignProperty] = js.undefined
  var textDecoration: js.UndefOr[java.lang.String] = js.undefined
  var textTransform: js.UndefOr[java.lang.String] = js.undefined
  var verticalAlign: js.UndefOr[csstypeLib.csstypeMod.VerticalAlignProperty[java.lang.String | scala.Double]] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object MjmlButtonProps {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    backgroundColor: csstypeLib.csstypeMod.BackgroundColorProperty = null,
    color: csstypeLib.csstypeMod.ColorProperty = null,
    containerBackgroundColor: csstypeLib.csstypeMod.BackgroundColorProperty = null,
    fontFamily: java.lang.String = null,
    fontSize: java.lang.String | scala.Double = null,
    fontStyle: java.lang.String = null,
    fontWeight: scala.Int | scala.Double = null,
    height: java.lang.String | scala.Double = null,
    innerPadding: java.lang.String = null,
    lineHeight: java.lang.String | scala.Double = null,
    textAlign: csstypeLib.csstypeMod.TextAlignProperty = null,
    textDecoration: java.lang.String = null,
    textTransform: java.lang.String = null,
    verticalAlign: csstypeLib.csstypeMod.VerticalAlignProperty[java.lang.String | scala.Double] = null,
    width: java.lang.String | scala.Double = null
  ): MjmlButtonProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (innerPadding != null) __obj.updateDynamic("innerPadding")(innerPadding)
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration)
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlButtonProps]
  }
}

