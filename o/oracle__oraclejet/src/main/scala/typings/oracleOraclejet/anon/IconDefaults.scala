package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconDefaults extends StObject {
  
  var borderColor: String
  
  var borderWidth: Double
  
  var color: String
  
  var iconDefaults: Pattern
  
  var indicatorColor: String
  
  var indicatorIconDefaults: Pattern
  
  var labelStyle: js.Object
  
  var secondaryLabelStyle: js.Object
}
object IconDefaults {
  
  inline def apply(
    borderColor: String,
    borderWidth: Double,
    color: String,
    iconDefaults: Pattern,
    indicatorColor: String,
    indicatorIconDefaults: Pattern,
    labelStyle: js.Object,
    secondaryLabelStyle: js.Object
  ): IconDefaults = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], iconDefaults = iconDefaults.asInstanceOf[js.Any], indicatorColor = indicatorColor.asInstanceOf[js.Any], indicatorIconDefaults = indicatorIconDefaults.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], secondaryLabelStyle = secondaryLabelStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconDefaults]
  }
  
  extension [Self <: IconDefaults](x: Self) {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setIconDefaults(value: Pattern): Self = StObject.set(x, "iconDefaults", value.asInstanceOf[js.Any])
    
    inline def setIndicatorColor(value: String): Self = StObject.set(x, "indicatorColor", value.asInstanceOf[js.Any])
    
    inline def setIndicatorIconDefaults(value: Pattern): Self = StObject.set(x, "indicatorIconDefaults", value.asInstanceOf[js.Any])
    
    inline def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setSecondaryLabelStyle(value: js.Object): Self = StObject.set(x, "secondaryLabelStyle", value.asInstanceOf[js.Any])
  }
}
