package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.header
import typings.oracleOraclejet.oracleOraclejetStrings.node
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupLabelDisplay extends StObject {
  
  var groupLabelDisplay: node | off | header = js.native
  
  var header: HoverBackgroundColor = js.native
  
  var hoverColor: String = js.native
  
  var labelDisplay: off | node = js.native
  
  var labelHalign: start | end | center = js.native
  
  var labelMinLength: Double = js.native
  
  var labelStyle: js.Object = js.native
  
  var labelValign: top | bottom | center = js.native
  
  var selectedInnerColor: String = js.native
  
  var selectedOuterColor: String = js.native
}
object GroupLabelDisplay {
  
  @scala.inline
  def apply(
    groupLabelDisplay: node | off | header,
    header: HoverBackgroundColor,
    hoverColor: String,
    labelDisplay: off | node,
    labelHalign: start | end | center,
    labelMinLength: Double,
    labelStyle: js.Object,
    labelValign: top | bottom | center,
    selectedInnerColor: String,
    selectedOuterColor: String
  ): GroupLabelDisplay = {
    val __obj = js.Dynamic.literal(groupLabelDisplay = groupLabelDisplay.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], hoverColor = hoverColor.asInstanceOf[js.Any], labelDisplay = labelDisplay.asInstanceOf[js.Any], labelHalign = labelHalign.asInstanceOf[js.Any], labelMinLength = labelMinLength.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], labelValign = labelValign.asInstanceOf[js.Any], selectedInnerColor = selectedInnerColor.asInstanceOf[js.Any], selectedOuterColor = selectedOuterColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupLabelDisplay]
  }
  
  @scala.inline
  implicit class GroupLabelDisplayMutableBuilder[Self <: GroupLabelDisplay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupLabelDisplay(value: node | off | header): Self = StObject.set(x, "groupLabelDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: HoverBackgroundColor): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverColor(value: String): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelDisplay(value: off | node): Self = StObject.set(x, "labelDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelHalign(value: start | end | center): Self = StObject.set(x, "labelHalign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelMinLength(value: Double): Self = StObject.set(x, "labelMinLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelValign(value: top | bottom | center): Self = StObject.set(x, "labelValign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedInnerColor(value: String): Self = StObject.set(x, "selectedInnerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedOuterColor(value: String): Self = StObject.set(x, "selectedOuterColor", value.asInstanceOf[js.Any])
  }
}
