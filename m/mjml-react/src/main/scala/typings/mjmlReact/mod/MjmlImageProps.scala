package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.BorderProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlImageProps extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var alt: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[BorderProperty[String | Double]] = js.undefined
  var borderRadius: js.UndefOr[String | Double] = js.undefined
  var containerBackgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  var fluidOnMobile: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[String | Double] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var srcset: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object MjmlImageProps {
  @scala.inline
  def apply(
    align: String = null,
    alt: String = null,
    border: BorderProperty[String | Double] = null,
    borderRadius: String | Double = null,
    containerBackgroundColor: BackgroundColorProperty = null,
    fluidOnMobile: String = null,
    height: String | Double = null,
    src: String = null,
    srcset: String = null,
    title: String = null,
    width: String | Double = null
  ): MjmlImageProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (fluidOnMobile != null) __obj.updateDynamic("fluidOnMobile")(fluidOnMobile.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (srcset != null) __obj.updateDynamic("srcset")(srcset.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlImageProps]
  }
}

