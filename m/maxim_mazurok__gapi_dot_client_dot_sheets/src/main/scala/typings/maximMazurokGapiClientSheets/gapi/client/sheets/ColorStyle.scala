package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorStyle extends js.Object {
  
  /** RGB color. */
  var rgbColor: js.UndefOr[Color] = js.native
  
  /** Theme color. */
  var themeColor: js.UndefOr[String] = js.native
}
object ColorStyle {
  
  @scala.inline
  def apply(): ColorStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorStyle]
  }
  
  @scala.inline
  implicit class ColorStyleOps[Self <: ColorStyle] (val x: Self) extends AnyVal {
    
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
    def setRgbColor(value: Color): Self = this.set("rgbColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRgbColor: Self = this.set("rgbColor", js.undefined)
    
    @scala.inline
    def setThemeColor(value: String): Self = this.set("themeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeColor: Self = this.set("themeColor", js.undefined)
  }
}
