package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoverBackgroundColor extends js.Object {
  
  var backgroundColor: String = js.native
  
  var borderColor: String = js.native
  
  var hoverBackgroundColor: String = js.native
  
  var hoverInnerColor: String = js.native
  
  var hoverOuterColor: String = js.native
  
  var isolate: off | on = js.native
  
  var labelHalign: center | end | start = js.native
  
  var labelStyle: js.Object = js.native
  
  var selectedBackgroundColor: String = js.native
  
  var selectedInnerColor: String = js.native
  
  var selectedOuterColor: String = js.native
  
  var useNodeColor: on | off = js.native
}
object HoverBackgroundColor {
  
  @scala.inline
  def apply(
    backgroundColor: String,
    borderColor: String,
    hoverBackgroundColor: String,
    hoverInnerColor: String,
    hoverOuterColor: String,
    isolate: off | on,
    labelHalign: center | end | start,
    labelStyle: js.Object,
    selectedBackgroundColor: String,
    selectedInnerColor: String,
    selectedOuterColor: String,
    useNodeColor: on | off
  ): HoverBackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], hoverBackgroundColor = hoverBackgroundColor.asInstanceOf[js.Any], hoverInnerColor = hoverInnerColor.asInstanceOf[js.Any], hoverOuterColor = hoverOuterColor.asInstanceOf[js.Any], isolate = isolate.asInstanceOf[js.Any], labelHalign = labelHalign.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], selectedBackgroundColor = selectedBackgroundColor.asInstanceOf[js.Any], selectedInnerColor = selectedInnerColor.asInstanceOf[js.Any], selectedOuterColor = selectedOuterColor.asInstanceOf[js.Any], useNodeColor = useNodeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverBackgroundColor]
  }
  
  @scala.inline
  implicit class HoverBackgroundColorOps[Self <: HoverBackgroundColor] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverBackgroundColor(value: String): Self = this.set("hoverBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverInnerColor(value: String): Self = this.set("hoverInnerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverOuterColor(value: String): Self = this.set("hoverOuterColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsolate(value: off | on): Self = this.set("isolate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelHalign(value: center | end | start): Self = this.set("labelHalign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedBackgroundColor(value: String): Self = this.set("selectedBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedInnerColor(value: String): Self = this.set("selectedInnerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedOuterColor(value: String): Self = this.set("selectedOuterColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNodeColor(value: on | off): Self = this.set("useNodeColor", value.asInstanceOf[js.Any])
  }
}
