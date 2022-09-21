package typings.powerbiVisualsTools.mod.extensibility

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualTooltipDataItem extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var displayName: String
  
  var header: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[String] = js.undefined
  
  var value: String
}
object VisualTooltipDataItem {
  
  inline def apply(displayName: String, value: String): VisualTooltipDataItem = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualTooltipDataItem]
  }
  
  extension [Self <: VisualTooltipDataItem](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
