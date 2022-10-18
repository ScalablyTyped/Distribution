package typings.nivoLegends.distTypesTypesMod

import typings.nivoCore.mod.CompleteTheme
import typings.nivoLegends.anon.PartialRecordtoprightbott
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  containerWidth :number,   containerHeight :number,   translateX :number | undefined,   translateY :number | undefined,   anchor :@nivo/legends.@nivo/legends/dist/types/types.LegendAnchor,   symbolSize :number | undefined,   symbolSpacing :number | undefined,   theme :@nivo/core.@nivo/core.CompleteTheme} & std.Required<std.Pick<@nivo/legends.@nivo/legends/dist/types/types.CommonLegendProps, 'data'>> & std.Pick<@nivo/legends.@nivo/legends/dist/types/types.CommonLegendProps, 'direction' | 'padding' | 'justify' | 'itemsSpacing' | 'itemWidth' | 'itemHeight' | 'itemDirection' | 'itemTextColor'> */
trait LegendCanvasProps extends StObject {
  
  var anchor: LegendAnchor
  
  var containerHeight: Double
  
  var containerWidth: Double
  
  var data: js.Array[Datum]
  
  var direction: LegendDirection
  
  var itemDirection: js.UndefOr[LegendItemDirection] = js.undefined
  
  var itemHeight: Double
  
  var itemTextColor: js.UndefOr[String] = js.undefined
  
  var itemWidth: Double
  
  var itemsSpacing: js.UndefOr[Double] = js.undefined
  
  var justify: js.UndefOr[Boolean] = js.undefined
  
  var padding: js.UndefOr[Double | PartialRecordtoprightbott] = js.undefined
  
  var symbolSize: js.UndefOr[Double] = js.undefined
  
  var symbolSpacing: js.UndefOr[Double] = js.undefined
  
  var theme: CompleteTheme
  
  var translateX: js.UndefOr[Double] = js.undefined
  
  var translateY: js.UndefOr[Double] = js.undefined
}
object LegendCanvasProps {
  
  inline def apply(
    anchor: LegendAnchor,
    containerHeight: Double,
    containerWidth: Double,
    data: js.Array[Datum],
    direction: LegendDirection,
    itemHeight: Double,
    itemWidth: Double,
    theme: CompleteTheme
  ): LegendCanvasProps = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], itemWidth = itemWidth.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendCanvasProps]
  }
  
  extension [Self <: LegendCanvasProps](x: Self) {
    
    inline def setAnchor(value: LegendAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setContainerHeight(value: Double): Self = StObject.set(x, "containerHeight", value.asInstanceOf[js.Any])
    
    inline def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[Datum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDirection(value: LegendDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setItemDirection(value: LegendItemDirection): Self = StObject.set(x, "itemDirection", value.asInstanceOf[js.Any])
    
    inline def setItemDirectionUndefined: Self = StObject.set(x, "itemDirection", js.undefined)
    
    inline def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
    
    inline def setItemTextColor(value: String): Self = StObject.set(x, "itemTextColor", value.asInstanceOf[js.Any])
    
    inline def setItemTextColorUndefined: Self = StObject.set(x, "itemTextColor", js.undefined)
    
    inline def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
    
    inline def setItemsSpacing(value: Double): Self = StObject.set(x, "itemsSpacing", value.asInstanceOf[js.Any])
    
    inline def setItemsSpacingUndefined: Self = StObject.set(x, "itemsSpacing", js.undefined)
    
    inline def setJustify(value: Boolean): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
    
    inline def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
    
    inline def setPadding(value: Double | PartialRecordtoprightbott): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setSymbolSize(value: Double): Self = StObject.set(x, "symbolSize", value.asInstanceOf[js.Any])
    
    inline def setSymbolSizeUndefined: Self = StObject.set(x, "symbolSize", js.undefined)
    
    inline def setSymbolSpacing(value: Double): Self = StObject.set(x, "symbolSpacing", value.asInstanceOf[js.Any])
    
    inline def setSymbolSpacingUndefined: Self = StObject.set(x, "symbolSpacing", js.undefined)
    
    inline def setTheme(value: CompleteTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    inline def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
    
    inline def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
    
    inline def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
  }
}
