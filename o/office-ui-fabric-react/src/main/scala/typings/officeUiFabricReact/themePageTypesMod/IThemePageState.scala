package typings.officeUiFabricReact.themePageTypesMod

import typings.officeUiFabricReact.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThemePageState extends js.Object {
  var activeList: js.UndefOr[String] = js.native
  var colorPickerProps: js.UndefOr[Index] = js.native
  var palette: js.Array[IThemePagePalette] = js.native
  var semanticColors: js.Array[IThemePagePalette] = js.native
}

object IThemePageState {
  @scala.inline
  def apply(palette: js.Array[IThemePagePalette], semanticColors: js.Array[IThemePagePalette]): IThemePageState = {
    val __obj = js.Dynamic.literal(palette = palette.asInstanceOf[js.Any], semanticColors = semanticColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemePageState]
  }
  @scala.inline
  implicit class IThemePageStateOps[Self <: IThemePageState] (val x: Self) extends AnyVal {
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
    def setPaletteVarargs(value: IThemePagePalette*): Self = this.set("palette", js.Array(value :_*))
    @scala.inline
    def setPalette(value: js.Array[IThemePagePalette]): Self = this.set("palette", value.asInstanceOf[js.Any])
    @scala.inline
    def setSemanticColorsVarargs(value: IThemePagePalette*): Self = this.set("semanticColors", js.Array(value :_*))
    @scala.inline
    def setSemanticColors(value: js.Array[IThemePagePalette]): Self = this.set("semanticColors", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveList(value: String): Self = this.set("activeList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveList: Self = this.set("activeList", js.undefined)
    @scala.inline
    def setColorPickerProps(value: Index): Self = this.set("colorPickerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorPickerProps: Self = this.set("colorPickerProps", js.undefined)
  }
  
}

