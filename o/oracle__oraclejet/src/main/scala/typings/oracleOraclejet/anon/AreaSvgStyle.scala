package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaSvgStyle extends js.Object {
  
  var areaSvgStyle: js.UndefOr[js.Object] = js.native
  
  var dataAreaDefaults: js.UndefOr[SelectedInnerColor] = js.native
  
  var dataMarkerDefaults: js.UndefOr[BorderStyle] = js.native
  
  var hoverBehaviorDelay: js.UndefOr[Double] = js.native
  
  var labelStyle: js.UndefOr[js.Object] = js.native
  
  var linkDefaults: js.UndefOr[ColorWidth] = js.native
}
object AreaSvgStyle {
  
  @scala.inline
  def apply(): AreaSvgStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaSvgStyle]
  }
  
  @scala.inline
  implicit class AreaSvgStyleOps[Self <: AreaSvgStyle] (val x: Self) extends AnyVal {
    
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
    def setAreaSvgStyle(value: js.Object): Self = this.set("areaSvgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreaSvgStyle: Self = this.set("areaSvgStyle", js.undefined)
    
    @scala.inline
    def setDataAreaDefaults(value: SelectedInnerColor): Self = this.set("dataAreaDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataAreaDefaults: Self = this.set("dataAreaDefaults", js.undefined)
    
    @scala.inline
    def setDataMarkerDefaults(value: BorderStyle): Self = this.set("dataMarkerDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataMarkerDefaults: Self = this.set("dataMarkerDefaults", js.undefined)
    
    @scala.inline
    def setHoverBehaviorDelay(value: Double): Self = this.set("hoverBehaviorDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverBehaviorDelay: Self = this.set("hoverBehaviorDelay", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    
    @scala.inline
    def setLinkDefaults(value: ColorWidth): Self = this.set("linkDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkDefaults: Self = this.set("linkDefaults", js.undefined)
  }
}
