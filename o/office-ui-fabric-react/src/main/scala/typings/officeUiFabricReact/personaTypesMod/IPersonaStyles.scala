package typings.officeUiFabricReact.personaTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
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
    details: js.UndefOr[Null | IStyle] = js.undefined,
    optionalText: js.UndefOr[Null | IStyle] = js.undefined,
    primaryText: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    secondaryText: js.UndefOr[Null | IStyle] = js.undefined,
    tertiaryText: js.UndefOr[Null | IStyle] = js.undefined,
    textContent: js.UndefOr[Null | IStyle] = js.undefined
  ): IPersonaStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(details)) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (!js.isUndefined(optionalText)) __obj.updateDynamic("optionalText")(optionalText.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryText)) __obj.updateDynamic("primaryText")(primaryText.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(secondaryText)) __obj.updateDynamic("secondaryText")(secondaryText.asInstanceOf[js.Any])
    if (!js.isUndefined(tertiaryText)) __obj.updateDynamic("tertiaryText")(tertiaryText.asInstanceOf[js.Any])
    if (!js.isUndefined(textContent)) __obj.updateDynamic("textContent")(textContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaStyles]
  }
}

