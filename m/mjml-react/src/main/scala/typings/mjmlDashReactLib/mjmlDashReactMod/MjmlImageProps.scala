package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlImageProps extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var alt: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[csstypeLib.csstypeMod.BorderProperty[java.lang.String | scala.Double]] = js.undefined
  var borderRadius: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var containerBackgroundColor: js.UndefOr[csstypeLib.csstypeMod.BackgroundColorProperty] = js.undefined
  var fluidOnMobile: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var srcset: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object MjmlImageProps {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    alt: java.lang.String = null,
    border: csstypeLib.csstypeMod.BorderProperty[java.lang.String | scala.Double] = null,
    borderRadius: java.lang.String | scala.Double = null,
    containerBackgroundColor: csstypeLib.csstypeMod.BackgroundColorProperty = null,
    fluidOnMobile: java.lang.String = null,
    height: java.lang.String | scala.Double = null,
    src: java.lang.String = null,
    srcset: java.lang.String = null,
    title: java.lang.String = null,
    width: java.lang.String | scala.Double = null
  ): MjmlImageProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor)
    if (fluidOnMobile != null) __obj.updateDynamic("fluidOnMobile")(fluidOnMobile)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src)
    if (srcset != null) __obj.updateDynamic("srcset")(srcset)
    if (title != null) __obj.updateDynamic("title")(title)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlImageProps]
  }
}

