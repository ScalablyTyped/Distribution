package typings.nivoLegends.anon

import typings.nivoLegends.distTypesTypesMod.LegendItemDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  direction :@nivo/legends.@nivo/legends/dist/types/types.LegendItemDirection,   justify :boolean} & std.Record<'symbolSize' | 'symbolSpacing' | 'width' | 'height', number> */
trait directionLegendItemDirect extends StObject {
  
  var direction: LegendItemDirection
  
  var height: Double
  
  var justify: Boolean
  
  var symbolSize: Double
  
  var symbolSpacing: Double
  
  var width: Double
}
object directionLegendItemDirect {
  
  inline def apply(
    direction: LegendItemDirection,
    height: Double,
    justify: Boolean,
    symbolSize: Double,
    symbolSpacing: Double,
    width: Double
  ): directionLegendItemDirect = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], justify = justify.asInstanceOf[js.Any], symbolSize = symbolSize.asInstanceOf[js.Any], symbolSpacing = symbolSpacing.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[directionLegendItemDirect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: directionLegendItemDirect] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: LegendItemDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setJustify(value: Boolean): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
    
    inline def setSymbolSize(value: Double): Self = StObject.set(x, "symbolSize", value.asInstanceOf[js.Any])
    
    inline def setSymbolSpacing(value: Double): Self = StObject.set(x, "symbolSpacing", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
