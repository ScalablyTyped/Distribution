package typings.officeUiFabricReact.themePageTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThemePageStyles extends js.Object {
  var colorSwatch: IStyle = js.native
  var colorValue: IStyle = js.native
  var swatch: IStyle = js.native
}

object IThemePageStyles {
  @scala.inline
  def apply(): IThemePageStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IThemePageStyles]
  }
  @scala.inline
  implicit class IThemePageStylesOps[Self <: IThemePageStyles] (val x: Self) extends AnyVal {
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
    def setColorSwatch(value: IStyle): Self = this.set("colorSwatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorSwatch: Self = this.set("colorSwatch", js.undefined)
    @scala.inline
    def setColorSwatchNull: Self = this.set("colorSwatch", null)
    @scala.inline
    def setColorValue(value: IStyle): Self = this.set("colorValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorValue: Self = this.set("colorValue", js.undefined)
    @scala.inline
    def setColorValueNull: Self = this.set("colorValue", null)
    @scala.inline
    def setSwatch(value: IStyle): Self = this.set("swatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwatch: Self = this.set("swatch", js.undefined)
    @scala.inline
    def setSwatchNull: Self = this.set("swatch", null)
  }
  
}

