package typings.officeUiFabricReact.themeGeneratorDocMod

import typings.officeUiFabricReact.ithemerulesMod.IThemeRules
import typings.officeUiFabricReact.ithemeslotruleMod.IThemeSlotRule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemeGeneratorPageState extends js.Object {
  var colorPickerElement: HTMLElement | Null
  var colorPickerSlotRule: IThemeSlotRule | Null
  var colorPickerVisible: Boolean
  var themeRules: IThemeRules
}

object IThemeGeneratorPageState {
  @scala.inline
  def apply(
    colorPickerVisible: Boolean,
    themeRules: IThemeRules,
    colorPickerElement: HTMLElement = null,
    colorPickerSlotRule: IThemeSlotRule = null
  ): IThemeGeneratorPageState = {
    val __obj = js.Dynamic.literal(colorPickerVisible = colorPickerVisible.asInstanceOf[js.Any], themeRules = themeRules.asInstanceOf[js.Any], colorPickerElement = colorPickerElement.asInstanceOf[js.Any], colorPickerSlotRule = colorPickerSlotRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeGeneratorPageState]
  }
}

