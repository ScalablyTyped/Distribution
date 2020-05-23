package typings.officeUiFabricReact.iconTypesMod

import typings.officeUiFabricReact.anon.PartialIIconStyles
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var iconClassName: js.UndefOr[String] = js.undefined
  var isImage: Boolean
  var isPlaceholder: Boolean
  var styles: js.UndefOr[PartialIIconStyles] = js.undefined
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IIconStyleProps {
  @scala.inline
  def apply(
    isImage: Boolean,
    isPlaceholder: Boolean,
    className: String = null,
    iconClassName: String = null,
    styles: PartialIIconStyles = null,
    theme: ITheme = null
  ): IIconStyleProps = {
    val __obj = js.Dynamic.literal(isImage = isImage.asInstanceOf[js.Any], isPlaceholder = isPlaceholder.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconStyleProps]
  }
}

