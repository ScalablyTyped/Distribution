package typings.officeDashUiDashFabricDashReact.libComponentsChoiceGroupChoiceGroupDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChoiceGroupStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var optionsContainIconOrImage: js.UndefOr[Boolean] = js.undefined
  var theme: ITheme
}

object IChoiceGroupStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    optionsContainIconOrImage: js.UndefOr[Boolean] = js.undefined
  ): IChoiceGroupStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(optionsContainIconOrImage)) __obj.updateDynamic("optionsContainIconOrImage")(optionsContainIconOrImage)
    __obj.asInstanceOf[IChoiceGroupStyleProps]
  }
}

