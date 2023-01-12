package typings.nivoLegends.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemBackground extends StObject {
  
  var itemBackground: Requireable[String]
  
  var itemOpacity: Requireable[Double]
  
  var itemTextColor: Requireable[String]
  
  var symbolBorderColor: Requireable[String]
  
  var symbolBorderWidth: Requireable[Double]
  
  var symbolSize: Requireable[Double]
}
object ItemBackground {
  
  inline def apply(
    itemBackground: Requireable[String],
    itemOpacity: Requireable[Double],
    itemTextColor: Requireable[String],
    symbolBorderColor: Requireable[String],
    symbolBorderWidth: Requireable[Double],
    symbolSize: Requireable[Double]
  ): ItemBackground = {
    val __obj = js.Dynamic.literal(itemBackground = itemBackground.asInstanceOf[js.Any], itemOpacity = itemOpacity.asInstanceOf[js.Any], itemTextColor = itemTextColor.asInstanceOf[js.Any], symbolBorderColor = symbolBorderColor.asInstanceOf[js.Any], symbolBorderWidth = symbolBorderWidth.asInstanceOf[js.Any], symbolSize = symbolSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemBackground]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemBackground] (val x: Self) extends AnyVal {
    
    inline def setItemBackground(value: Requireable[String]): Self = StObject.set(x, "itemBackground", value.asInstanceOf[js.Any])
    
    inline def setItemOpacity(value: Requireable[Double]): Self = StObject.set(x, "itemOpacity", value.asInstanceOf[js.Any])
    
    inline def setItemTextColor(value: Requireable[String]): Self = StObject.set(x, "itemTextColor", value.asInstanceOf[js.Any])
    
    inline def setSymbolBorderColor(value: Requireable[String]): Self = StObject.set(x, "symbolBorderColor", value.asInstanceOf[js.Any])
    
    inline def setSymbolBorderWidth(value: Requireable[Double]): Self = StObject.set(x, "symbolBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setSymbolSize(value: Requireable[Double]): Self = StObject.set(x, "symbolSize", value.asInstanceOf[js.Any])
  }
}
