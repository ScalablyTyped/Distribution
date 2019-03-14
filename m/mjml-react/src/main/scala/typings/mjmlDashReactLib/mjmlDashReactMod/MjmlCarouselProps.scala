package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlCarouselProps extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var backgroundColor: js.UndefOr[csstypeLib.csstypeMod.BackgroundColorProperty] = js.undefined
  var borderRadius: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var iconWidth: js.UndefOr[java.lang.String] = js.undefined
  var leftIcon: js.UndefOr[java.lang.String] = js.undefined
  var rightIcon: js.UndefOr[java.lang.String] = js.undefined
  var tbBorder: js.UndefOr[csstypeLib.csstypeMod.BorderProperty[java.lang.String | scala.Double]] = js.undefined
  var tbBorderRadius: js.UndefOr[csstypeLib.csstypeMod.BorderRadiusProperty[java.lang.String | scala.Double]] = js.undefined
  var tbHoverBorderColor: js.UndefOr[java.lang.String] = js.undefined
  var tbSelectedBorderColor: js.UndefOr[java.lang.String] = js.undefined
  var tbWidth: js.UndefOr[java.lang.String] = js.undefined
  var thumbnails: js.UndefOr[
    mjmlDashReactLib.mjmlDashReactLibStrings.hidden | mjmlDashReactLib.mjmlDashReactLibStrings.visible
  ] = js.undefined
}

object MjmlCarouselProps {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    backgroundColor: csstypeLib.csstypeMod.BackgroundColorProperty = null,
    borderRadius: java.lang.String | scala.Double = null,
    iconWidth: java.lang.String = null,
    leftIcon: java.lang.String = null,
    rightIcon: java.lang.String = null,
    tbBorder: csstypeLib.csstypeMod.BorderProperty[java.lang.String | scala.Double] = null,
    tbBorderRadius: csstypeLib.csstypeMod.BorderRadiusProperty[java.lang.String | scala.Double] = null,
    tbHoverBorderColor: java.lang.String = null,
    tbSelectedBorderColor: java.lang.String = null,
    tbWidth: java.lang.String = null,
    thumbnails: mjmlDashReactLib.mjmlDashReactLibStrings.hidden | mjmlDashReactLib.mjmlDashReactLibStrings.visible = null
  ): MjmlCarouselProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (iconWidth != null) __obj.updateDynamic("iconWidth")(iconWidth)
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon)
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon)
    if (tbBorder != null) __obj.updateDynamic("tbBorder")(tbBorder.asInstanceOf[js.Any])
    if (tbBorderRadius != null) __obj.updateDynamic("tbBorderRadius")(tbBorderRadius.asInstanceOf[js.Any])
    if (tbHoverBorderColor != null) __obj.updateDynamic("tbHoverBorderColor")(tbHoverBorderColor)
    if (tbSelectedBorderColor != null) __obj.updateDynamic("tbSelectedBorderColor")(tbSelectedBorderColor)
    if (tbWidth != null) __obj.updateDynamic("tbWidth")(tbWidth)
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlCarouselProps]
  }
}

