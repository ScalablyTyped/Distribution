package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaterfallChartColumnStyle extends js.Object {
  
  /** The color of the column. */
  var color: js.UndefOr[Color] = js.native
  
  /** The color of the column. If color is also set, this field takes precedence. */
  var colorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** The label of the column's legend. */
  var label: js.UndefOr[String] = js.native
}
object WaterfallChartColumnStyle {
  
  @scala.inline
  def apply(): WaterfallChartColumnStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallChartColumnStyle]
  }
  
  @scala.inline
  implicit class WaterfallChartColumnStyleOps[Self <: WaterfallChartColumnStyle] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorStyle(value: ColorStyle): Self = this.set("colorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorStyle: Self = this.set("colorStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
