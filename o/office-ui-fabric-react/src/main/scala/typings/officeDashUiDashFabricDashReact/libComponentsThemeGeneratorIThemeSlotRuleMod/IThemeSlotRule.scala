package typings.officeDashUiDashFabricDashReact.libComponentsThemeGeneratorIThemeSlotRuleMod

import typings.officeDashUiDashFabricDashReact.libUtilitiesColorInterfacesMod.IColor
import typings.officeDashUiDashFabricDashReact.libUtilitiesColorShadesMod.Shade
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemeSlotRule extends js.Object {
  var asShade: js.UndefOr[Shade] = js.undefined
  var color: js.UndefOr[IColor] = js.undefined
  var dependentRules: js.Array[IThemeSlotRule]
  var inherits: js.UndefOr[IThemeSlotRule] = js.undefined
  var isBackgroundShade: js.UndefOr[Boolean] = js.undefined
  var isCustomized: js.UndefOr[Boolean] = js.undefined
  var name: String
  var value: js.UndefOr[String] = js.undefined
}

object IThemeSlotRule {
  @scala.inline
  def apply(
    dependentRules: js.Array[IThemeSlotRule],
    name: String,
    asShade: Shade = null,
    color: IColor = null,
    inherits: IThemeSlotRule = null,
    isBackgroundShade: js.UndefOr[Boolean] = js.undefined,
    isCustomized: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): IThemeSlotRule = {
    val __obj = js.Dynamic.literal(dependentRules = dependentRules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (asShade != null) __obj.updateDynamic("asShade")(asShade.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (inherits != null) __obj.updateDynamic("inherits")(inherits.asInstanceOf[js.Any])
    if (!js.isUndefined(isBackgroundShade)) __obj.updateDynamic("isBackgroundShade")(isBackgroundShade.asInstanceOf[js.Any])
    if (!js.isUndefined(isCustomized)) __obj.updateDynamic("isCustomized")(isCustomized.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeSlotRule]
  }
}

