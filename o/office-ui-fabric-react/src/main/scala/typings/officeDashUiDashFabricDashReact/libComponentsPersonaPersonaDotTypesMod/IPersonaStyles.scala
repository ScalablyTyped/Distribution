package typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPersonaStyles extends js.Object {
  var details: IStyle
  var optionalText: IStyle
  var primaryText: IStyle
  var root: IStyle
  var secondaryText: IStyle
  var tertiaryText: IStyle
  var textContent: IStyle
}

object IPersonaStyles {
  @scala.inline
  def apply(
    details: IStyle = null,
    optionalText: IStyle = null,
    primaryText: IStyle = null,
    root: IStyle = null,
    secondaryText: IStyle = null,
    tertiaryText: IStyle = null,
    textContent: IStyle = null
  ): IPersonaStyles = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (optionalText != null) __obj.updateDynamic("optionalText")(optionalText.asInstanceOf[js.Any])
    if (primaryText != null) __obj.updateDynamic("primaryText")(primaryText.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText.asInstanceOf[js.Any])
    if (tertiaryText != null) __obj.updateDynamic("tertiaryText")(tertiaryText.asInstanceOf[js.Any])
    if (textContent != null) __obj.updateDynamic("textContent")(textContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaStyles]
  }
}

