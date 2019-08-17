package typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod

import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFontIconProps extends HTMLAttributes[HTMLElement] {
  /**
    * The name of the icon to use from the icon font.
    * If string is empty, a placeholder icon will be rendered the same width as an icon.
    */
  var iconName: js.UndefOr[String] = js.undefined
}

object IFontIconProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    className: String = null,
    iconName: String = null
  ): IFontIconProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (className != null) __obj.updateDynamic("className")(className)
    if (iconName != null) __obj.updateDynamic("iconName")(iconName)
    __obj.asInstanceOf[IFontIconProps]
  }
}

