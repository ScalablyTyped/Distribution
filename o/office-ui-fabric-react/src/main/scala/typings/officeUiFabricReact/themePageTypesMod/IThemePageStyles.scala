package typings.officeUiFabricReact.themePageTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemePageStyles extends js.Object {
  var colorSwatch: IStyle
  var colorValue: IStyle
  var swatch: IStyle
}

object IThemePageStyles {
  @scala.inline
  def apply(
    colorSwatch: js.UndefOr[Null | IStyle] = js.undefined,
    colorValue: js.UndefOr[Null | IStyle] = js.undefined,
    swatch: js.UndefOr[Null | IStyle] = js.undefined
  ): IThemePageStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colorSwatch)) __obj.updateDynamic("colorSwatch")(colorSwatch.asInstanceOf[js.Any])
    if (!js.isUndefined(colorValue)) __obj.updateDynamic("colorValue")(colorValue.asInstanceOf[js.Any])
    if (!js.isUndefined(swatch)) __obj.updateDynamic("swatch")(swatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemePageStyles]
  }
}

