package typings.nivoLegends.anon

import typings.nivoLegends.distTypesTypesMod.LegendAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  anchor :@nivo/legends.@nivo/legends/dist/types/types.LegendAnchor} & std.Record<'translateX' | 'translateY' | 'containerWidth' | 'containerHeight' | 'width' | 'height', number> */
trait anchorLegendAnchorRecordt extends StObject {
  
  var anchor: LegendAnchor
  
  var containerHeight: Double
  
  var containerWidth: Double
  
  var height: Double
  
  var translateX: Double
  
  var translateY: Double
  
  var width: Double
}
object anchorLegendAnchorRecordt {
  
  inline def apply(
    anchor: LegendAnchor,
    containerHeight: Double,
    containerWidth: Double,
    height: Double,
    translateX: Double,
    translateY: Double,
    width: Double
  ): anchorLegendAnchorRecordt = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], translateX = translateX.asInstanceOf[js.Any], translateY = translateY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[anchorLegendAnchorRecordt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: anchorLegendAnchorRecordt] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: LegendAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setContainerHeight(value: Double): Self = StObject.set(x, "containerHeight", value.asInstanceOf[js.Any])
    
    inline def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    inline def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
