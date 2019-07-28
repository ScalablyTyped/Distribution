package typings.mjmlDashReact.mjmlDashReactMod

import typings.csstype.csstypeMod.BackgroundColorProperty
import typings.csstype.csstypeMod.ColorProperty
import typings.mjmlDashReact.mjmlDashReactStrings.`facebook-noshare`
import typings.mjmlDashReact.mjmlDashReactStrings.`google-noshare`
import typings.mjmlDashReact.mjmlDashReactStrings.`linkedin-noshare`
import typings.mjmlDashReact.mjmlDashReactStrings.`pinterest-noshare`
import typings.mjmlDashReact.mjmlDashReactStrings.`tumblr-noshare`
import typings.mjmlDashReact.mjmlDashReactStrings.`twitter-noshare`
import typings.mjmlDashReact.mjmlDashReactStrings.`xing-noshare`
import typings.mjmlDashReact.mjmlDashReactStrings.dribbble
import typings.mjmlDashReact.mjmlDashReactStrings.facebook
import typings.mjmlDashReact.mjmlDashReactStrings.github
import typings.mjmlDashReact.mjmlDashReactStrings.google
import typings.mjmlDashReact.mjmlDashReactStrings.horizontal
import typings.mjmlDashReact.mjmlDashReactStrings.instagram
import typings.mjmlDashReact.mjmlDashReactStrings.linkedin
import typings.mjmlDashReact.mjmlDashReactStrings.medium
import typings.mjmlDashReact.mjmlDashReactStrings.pinterest
import typings.mjmlDashReact.mjmlDashReactStrings.snapchat
import typings.mjmlDashReact.mjmlDashReactStrings.soundcloud
import typings.mjmlDashReact.mjmlDashReactStrings.tumblr
import typings.mjmlDashReact.mjmlDashReactStrings.twitter
import typings.mjmlDashReact.mjmlDashReactStrings.vertical
import typings.mjmlDashReact.mjmlDashReactStrings.vimeo
import typings.mjmlDashReact.mjmlDashReactStrings.web
import typings.mjmlDashReact.mjmlDashReactStrings.xing
import typings.mjmlDashReact.mjmlDashReactStrings.youtube
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlSocialElementProps extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var alt: js.UndefOr[String] = js.undefined
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  var borderRadius: js.UndefOr[String | Double] = js.undefined
  var color: js.UndefOr[ColorProperty] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[String | Double] = js.undefined
  var iconHeight: js.UndefOr[String] = js.undefined
  var iconSize: js.UndefOr[String] = js.undefined
  var lineHeight: js.UndefOr[String | Double] = js.undefined
  var mode: js.UndefOr[vertical | horizontal] = js.undefined
  var name: js.UndefOr[
    facebook | `facebook-noshare` | twitter | `twitter-noshare` | google | `google-noshare` | pinterest | `pinterest-noshare` | linkedin | `linkedin-noshare` | tumblr | `tumblr-noshare` | xing | `xing-noshare` | github | instagram | web | snapchat | youtube | vimeo | medium | soundcloud | dribbble
  ] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var textDecoration: js.UndefOr[String] = js.undefined
}

object MjmlSocialElementProps {
  @scala.inline
  def apply(
    align: String = null,
    alt: String = null,
    backgroundColor: BackgroundColorProperty = null,
    borderRadius: String | Double = null,
    color: ColorProperty = null,
    fontFamily: String = null,
    fontSize: String | Double = null,
    iconHeight: String = null,
    iconSize: String = null,
    lineHeight: String | Double = null,
    mode: vertical | horizontal = null,
    name: facebook | `facebook-noshare` | twitter | `twitter-noshare` | google | `google-noshare` | pinterest | `pinterest-noshare` | linkedin | `linkedin-noshare` | tumblr | `tumblr-noshare` | xing | `xing-noshare` | github | instagram | web | snapchat | youtube | vimeo | medium | soundcloud | dribbble = null,
    src: String = null,
    textDecoration: String = null
  ): MjmlSocialElementProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (iconHeight != null) __obj.updateDynamic("iconHeight")(iconHeight)
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize)
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src)
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration)
    __obj.asInstanceOf[MjmlSocialElementProps]
  }
}

