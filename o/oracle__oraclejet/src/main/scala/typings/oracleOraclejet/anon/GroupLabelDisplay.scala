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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupLabelDisplay extends StObject {
  
  var groupLabelDisplay: node | off | header
  
  var header: HoverBackgroundColor
  
  var hoverColor: String
  
  var labelDisplay: off | node
  
  var labelHalign: start | end | center
  
  var labelMinLength: Double
  
  var labelStyle: js.Object
  
  var labelValign: top | bottom | center
  
  var selectedInnerColor: String
  
  var selectedOuterColor: String
}
object GroupLabelDisplay {
  
  inline def apply(
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
  
  extension [Self <: GroupLabelDisplay](x: Self) {
    
    inline def setGroupLabelDisplay(value: node | off | header): Self = StObject.set(x, "groupLabelDisplay", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: HoverBackgroundColor): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHoverColor(value: String): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
    
    inline def setLabelDisplay(value: off | node): Self = StObject.set(x, "labelDisplay", value.asInstanceOf[js.Any])
    
    inline def setLabelHalign(value: start | end | center): Self = StObject.set(x, "labelHalign", value.asInstanceOf[js.Any])
    
    inline def setLabelMinLength(value: Double): Self = StObject.set(x, "labelMinLength", value.asInstanceOf[js.Any])
    
    inline def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelValign(value: top | bottom | center): Self = StObject.set(x, "labelValign", value.asInstanceOf[js.Any])
    
    inline def setSelectedInnerColor(value: String): Self = StObject.set(x, "selectedInnerColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedOuterColor(value: String): Self = StObject.set(x, "selectedOuterColor", value.asInstanceOf[js.Any])
  }
}
