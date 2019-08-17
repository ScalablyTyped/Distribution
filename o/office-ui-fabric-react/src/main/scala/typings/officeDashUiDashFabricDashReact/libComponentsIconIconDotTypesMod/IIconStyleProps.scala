package typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var iconClassName: js.UndefOr[String] = js.undefined
  var isImage: Boolean
  var isPlaceholder: Boolean
  var styles: js.UndefOr[Partial[IIconStyles]] = js.undefined
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IIconStyleProps {
  @scala.inline
  def apply(
    isImage: Boolean,
    isPlaceholder: Boolean,
    className: String = null,
    iconClassName: String = null,
    styles: Partial[IIconStyles] = null,
    theme: ITheme = null
  ): IIconStyleProps = {
    val __obj = js.Dynamic.literal(isImage = isImage, isPlaceholder = isPlaceholder)
    if (className != null) __obj.updateDynamic("className")(className)
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IIconStyleProps]
  }
}

