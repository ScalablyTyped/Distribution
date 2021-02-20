package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconDefaults extends StObject {
  
  var borderColor: String = js.native
  
  var borderWidth: Double = js.native
  
  var color: String = js.native
  
  var iconDefaults: Pattern = js.native
  
  var indicatorColor: String = js.native
  
  var indicatorIconDefaults: Pattern = js.native
  
  var labelStyle: js.Object = js.native
  
  var secondaryLabelStyle: js.Object = js.native
}
object IconDefaults {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IconDefaultsMutableBuilder[Self <: IconDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconDefaults(value: Pattern): Self = StObject.set(x, "iconDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorColor(value: String): Self = StObject.set(x, "indicatorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorIconDefaults(value: Pattern): Self = StObject.set(x, "indicatorIconDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryLabelStyle(value: js.Object): Self = StObject.set(x, "secondaryLabelStyle", value.asInstanceOf[js.Any])
  }
}
