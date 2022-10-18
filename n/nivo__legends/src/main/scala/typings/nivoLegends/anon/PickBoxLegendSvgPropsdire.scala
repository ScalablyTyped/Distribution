package typings.nivoLegends.anon

import typings.nivoLegends.distTypesTypesMod.LegendDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@nivo/legends.@nivo/legends/dist/types/types.BoxLegendSvgProps, 'direction' | 'padding'> & std.Record<'itemsSpacing' | 'itemCount' | 'itemWidth' | 'itemHeight', number> */
trait PickBoxLegendSvgPropsdire extends StObject {
  
  var direction: LegendDirection
  
  var itemCount: Double
  
  var itemHeight: Double
  
  var itemWidth: Double
  
  var itemsSpacing: Double
  
  var padding: js.UndefOr[Double | PartialRecordtoprightbott] = js.undefined
}
object PickBoxLegendSvgPropsdire {
  
  inline def apply(
    direction: LegendDirection,
    itemCount: Double,
    itemHeight: Double,
    itemWidth: Double,
    itemsSpacing: Double
  ): PickBoxLegendSvgPropsdire = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], itemCount = itemCount.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], itemWidth = itemWidth.asInstanceOf[js.Any], itemsSpacing = itemsSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickBoxLegendSvgPropsdire]
  }
  
  extension [Self <: PickBoxLegendSvgPropsdire](x: Self) {
    
    inline def setDirection(value: LegendDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    inline def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
    
    inline def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
    
    inline def setItemsSpacing(value: Double): Self = StObject.set(x, "itemsSpacing", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Double | PartialRecordtoprightbott): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
