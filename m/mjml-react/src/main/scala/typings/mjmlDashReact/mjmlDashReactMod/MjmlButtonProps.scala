package typings.mjmlDashReact.mjmlDashReactMod

import typings.csstype.csstypeMod.BackgroundColorProperty
import typings.csstype.csstypeMod.ColorProperty
import typings.csstype.csstypeMod.TextAlignProperty
import typings.csstype.csstypeMod.VerticalAlignProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlButtonProps extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  var color: js.UndefOr[ColorProperty] = js.undefined
  var containerBackgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[String | Double] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var fontWeight: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[String | Double] = js.undefined
  var innerPadding: js.UndefOr[String] = js.undefined
  var lineHeight: js.UndefOr[String | Double] = js.undefined
  var textAlign: js.UndefOr[TextAlignProperty] = js.undefined
  var textDecoration: js.UndefOr[String] = js.undefined
  var textTransform: js.UndefOr[String] = js.undefined
  var verticalAlign: js.UndefOr[VerticalAlignProperty[String | Double]] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object MjmlButtonProps {
  @scala.inline
  def apply(
    align: String = null,
    backgroundColor: BackgroundColorProperty = null,
    color: ColorProperty = null,
    containerBackgroundColor: BackgroundColorProperty = null,
    fontFamily: String = null,
    fontSize: String | Double = null,
    fontStyle: String = null,
    fontWeight: Int | Double = null,
    height: String | Double = null,
    innerPadding: String = null,
    lineHeight: String | Double = null,
    textAlign: TextAlignProperty = null,
    textDecoration: String = null,
    textTransform: String = null,
    verticalAlign: VerticalAlignProperty[String | Double] = null,
    width: String | Double = null
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

