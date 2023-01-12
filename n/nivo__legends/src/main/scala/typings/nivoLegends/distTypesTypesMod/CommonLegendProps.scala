package typings.nivoLegends.distTypesTypesMod

import typings.nivoLegends.anon.PartialRecordtoprightbott
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonLegendProps extends StObject {
  
  var data: js.UndefOr[js.Array[Datum]] = js.undefined
  
  var direction: LegendDirection
  
  var effects: js.UndefOr[js.Array[EffectProps]] = js.undefined
  
  var itemBackground: js.UndefOr[String] = js.undefined
  
  var itemDirection: js.UndefOr[LegendItemDirection] = js.undefined
  
  var itemHeight: Double
  
  var itemOpacity: js.UndefOr[Double] = js.undefined
  
  var itemTextColor: js.UndefOr[String] = js.undefined
  
  var itemWidth: Double
  
  var itemsSpacing: js.UndefOr[Double] = js.undefined
  
  var justify: js.UndefOr[Boolean] = js.undefined
  
  var padding: js.UndefOr[Double | PartialRecordtoprightbott] = js.undefined
}
object CommonLegendProps {
  
  inline def apply(direction: LegendDirection, itemHeight: Double, itemWidth: Double): CommonLegendProps = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], itemWidth = itemWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonLegendProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommonLegendProps] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[Datum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDirection(value: LegendDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setEffects(value: js.Array[EffectProps]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
    
    inline def setEffectsVarargs(value: EffectProps*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setItemBackground(value: String): Self = StObject.set(x, "itemBackground", value.asInstanceOf[js.Any])
    
    inline def setItemBackgroundUndefined: Self = StObject.set(x, "itemBackground", js.undefined)
    
    inline def setItemDirection(value: LegendItemDirection): Self = StObject.set(x, "itemDirection", value.asInstanceOf[js.Any])
    
    inline def setItemDirectionUndefined: Self = StObject.set(x, "itemDirection", js.undefined)
    
    inline def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
    
    inline def setItemOpacity(value: Double): Self = StObject.set(x, "itemOpacity", value.asInstanceOf[js.Any])
    
    inline def setItemOpacityUndefined: Self = StObject.set(x, "itemOpacity", js.undefined)
    
    inline def setItemTextColor(value: String): Self = StObject.set(x, "itemTextColor", value.asInstanceOf[js.Any])
    
    inline def setItemTextColorUndefined: Self = StObject.set(x, "itemTextColor", js.undefined)
    
    inline def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
    
    inline def setItemsSpacing(value: Double): Self = StObject.set(x, "itemsSpacing", value.asInstanceOf[js.Any])
    
    inline def setItemsSpacingUndefined: Self = StObject.set(x, "itemsSpacing", js.undefined)
    
    inline def setJustify(value: Boolean): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
    
    inline def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
    
    inline def setPadding(value: Double | PartialRecordtoprightbott): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
