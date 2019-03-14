package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlTextProps extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[csstypeLib.csstypeMod.ColorProperty] = js.undefined
  var containerBackgroundColor: js.UndefOr[csstypeLib.csstypeMod.BackgroundColorProperty] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  var fontWeight: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var letterSpacing: js.UndefOr[java.lang.String] = js.undefined
  var lineHeight: js.UndefOr[java.lang.String] = js.undefined
  var textDecoration: js.UndefOr[java.lang.String] = js.undefined
  var textTransform: js.UndefOr[java.lang.String] = js.undefined
}

object MjmlTextProps {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    color: csstypeLib.csstypeMod.ColorProperty = null,
    containerBackgroundColor: csstypeLib.csstypeMod.BackgroundColorProperty = null,
    fontFamily: java.lang.String = null,
    fontSize: java.lang.String | scala.Double = null,
    fontStyle: java.lang.String = null,
    fontWeight: scala.Int | scala.Double = null,
    height: java.lang.String | scala.Double = null,
    letterSpacing: java.lang.String = null,
    lineHeight: java.lang.String = null,
    textDecoration: java.lang.String = null,
    textTransform: java.lang.String = null
  ): MjmlTextProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing)
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight)
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration)
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform)
    __obj.asInstanceOf[MjmlTextProps]
  }
}

