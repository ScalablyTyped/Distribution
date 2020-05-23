package typings.officeUiFabricReact.choiceGroupTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
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
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(optionsContainIconOrImage)) __obj.updateDynamic("optionsContainIconOrImage")(optionsContainIconOrImage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChoiceGroupStyleProps]
  }
}

