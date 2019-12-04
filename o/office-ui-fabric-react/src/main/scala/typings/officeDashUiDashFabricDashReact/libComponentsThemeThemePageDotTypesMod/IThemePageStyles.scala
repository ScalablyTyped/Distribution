package typings.officeDashUiDashFabricDashReact.libComponentsThemeThemePageDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
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
  def apply(colorSwatch: IStyle = null, colorValue: IStyle = null, swatch: IStyle = null): IThemePageStyles = {
    val __obj = js.Dynamic.literal()
    if (colorSwatch != null) __obj.updateDynamic("colorSwatch")(colorSwatch.asInstanceOf[js.Any])
    if (colorValue != null) __obj.updateDynamic("colorValue")(colorValue.asInstanceOf[js.Any])
    if (swatch != null) __obj.updateDynamic("swatch")(swatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemePageStyles]
  }
}

