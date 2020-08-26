package typings.officeUiFabricReact.themeGeneratorDocMod

import typings.officeUiFabricReact.ithemerulesMod.IThemeRules
import typings.officeUiFabricReact.ithemeslotruleMod.IThemeSlotRule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThemeGeneratorPageState extends js.Object {
  var colorPickerElement: HTMLElement | Null = js.native
  var colorPickerSlotRule: IThemeSlotRule | Null = js.native
  var colorPickerVisible: Boolean = js.native
  var themeRules: IThemeRules = js.native
}

object IThemeGeneratorPageState {
  @scala.inline
  def apply(colorPickerVisible: Boolean, themeRules: IThemeRules): IThemeGeneratorPageState = {
    val __obj = js.Dynamic.literal(colorPickerVisible = colorPickerVisible.asInstanceOf[js.Any], themeRules = themeRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeGeneratorPageState]
  }
  @scala.inline
  implicit class IThemeGeneratorPageStateOps[Self <: IThemeGeneratorPageState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColorPickerVisible(value: Boolean): Self = this.set("colorPickerVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setThemeRules(value: IThemeRules): Self = this.set("themeRules", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorPickerElement(value: HTMLElement): Self = this.set("colorPickerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorPickerElementNull: Self = this.set("colorPickerElement", null)
    @scala.inline
    def setColorPickerSlotRule(value: IThemeSlotRule): Self = this.set("colorPickerSlotRule", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorPickerSlotRuleNull: Self = this.set("colorPickerSlotRule", null)
  }
  
}

