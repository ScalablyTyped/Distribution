package typings.mjmlDashReact.mjmlDashReactMod

import typings.csstype.csstypeMod.BackgroundColorProperty
import typings.csstype.csstypeMod.ColorProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlTextProps extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[ColorProperty] = js.undefined
  var containerBackgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[String | Double] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var fontWeight: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[String | Double] = js.undefined
  var letterSpacing: js.UndefOr[String] = js.undefined
  var lineHeight: js.UndefOr[String] = js.undefined
  var textDecoration: js.UndefOr[String] = js.undefined
  var textTransform: js.UndefOr[String] = js.undefined
}

object MjmlTextProps {
  @scala.inline
  def apply(
    align: String = null,
    color: ColorProperty = null,
    containerBackgroundColor: BackgroundColorProperty = null,
    fontFamily: String = null,
    fontSize: String | Double = null,
    fontStyle: String = null,
    fontWeight: Int | Double = null,
    height: String | Double = null,
    letterSpacing: String = null,
    lineHeight: String = null,
    textDecoration: String = null,
    textTransform: String = null
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

