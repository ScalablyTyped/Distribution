package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.BorderProperty
import typings.csstype.mod.BorderRadiusProperty
import typings.mjmlReact.mjmlReactStrings.hidden
import typings.mjmlReact.mjmlReactStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlCarouselProps extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  var borderRadius: js.UndefOr[String | Double] = js.undefined
  var iconWidth: js.UndefOr[String] = js.undefined
  var leftIcon: js.UndefOr[String] = js.undefined
  var rightIcon: js.UndefOr[String] = js.undefined
  var tbBorder: js.UndefOr[BorderProperty[String | Double]] = js.undefined
  var tbBorderRadius: js.UndefOr[BorderRadiusProperty[String | Double]] = js.undefined
  var tbHoverBorderColor: js.UndefOr[String] = js.undefined
  var tbSelectedBorderColor: js.UndefOr[String] = js.undefined
  var tbWidth: js.UndefOr[String] = js.undefined
  var thumbnails: js.UndefOr[hidden | visible] = js.undefined
}

object MjmlCarouselProps {
  @scala.inline
  def apply(
    align: String = null,
    backgroundColor: BackgroundColorProperty = null,
    borderRadius: String | Double = null,
    iconWidth: String = null,
    leftIcon: String = null,
    rightIcon: String = null,
    tbBorder: BorderProperty[String | Double] = null,
    tbBorderRadius: BorderRadiusProperty[String | Double] = null,
    tbHoverBorderColor: String = null,
    tbSelectedBorderColor: String = null,
    tbWidth: String = null,
    thumbnails: hidden | visible = null
  ): MjmlCarouselProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (iconWidth != null) __obj.updateDynamic("iconWidth")(iconWidth.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon.asInstanceOf[js.Any])
    if (tbBorder != null) __obj.updateDynamic("tbBorder")(tbBorder.asInstanceOf[js.Any])
    if (tbBorderRadius != null) __obj.updateDynamic("tbBorderRadius")(tbBorderRadius.asInstanceOf[js.Any])
    if (tbHoverBorderColor != null) __obj.updateDynamic("tbHoverBorderColor")(tbHoverBorderColor.asInstanceOf[js.Any])
    if (tbSelectedBorderColor != null) __obj.updateDynamic("tbSelectedBorderColor")(tbSelectedBorderColor.asInstanceOf[js.Any])
    if (tbWidth != null) __obj.updateDynamic("tbWidth")(tbWidth.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlCarouselProps]
  }
}

