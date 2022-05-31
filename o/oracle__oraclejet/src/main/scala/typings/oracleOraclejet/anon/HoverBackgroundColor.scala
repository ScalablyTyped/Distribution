package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoverBackgroundColor extends StObject {
  
  var backgroundColor: String
  
  var borderColor: String
  
  var hoverBackgroundColor: String
  
  var hoverInnerColor: String
  
  var hoverOuterColor: String
  
  var isolate: off | on
  
  var labelHalign: center | end | start
  
  var labelStyle: js.Object
  
  var selectedBackgroundColor: String
  
  var selectedInnerColor: String
  
  var selectedOuterColor: String
  
  var useNodeColor: on | off
}
object HoverBackgroundColor {
  
  inline def apply(
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
  
  extension [Self <: HoverBackgroundColor](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setHoverBackgroundColor(value: String): Self = StObject.set(x, "hoverBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setHoverInnerColor(value: String): Self = StObject.set(x, "hoverInnerColor", value.asInstanceOf[js.Any])
    
    inline def setHoverOuterColor(value: String): Self = StObject.set(x, "hoverOuterColor", value.asInstanceOf[js.Any])
    
    inline def setIsolate(value: off | on): Self = StObject.set(x, "isolate", value.asInstanceOf[js.Any])
    
    inline def setLabelHalign(value: center | end | start): Self = StObject.set(x, "labelHalign", value.asInstanceOf[js.Any])
    
    inline def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectedBackgroundColor(value: String): Self = StObject.set(x, "selectedBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedInnerColor(value: String): Self = StObject.set(x, "selectedInnerColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedOuterColor(value: String): Self = StObject.set(x, "selectedOuterColor", value.asInstanceOf[js.Any])
    
    inline def setUseNodeColor(value: on | off): Self = StObject.set(x, "useNodeColor", value.asInstanceOf[js.Any])
  }
}
