package typings.nivoLegends.distTypesTypesMod

import typings.nivoLegends.anon.PartialRecordtoprightbott
import typings.nivoLegends.distTypesSvgSymbolsTypesMod.SymbolProps
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.SVGRectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  containerWidth :number,   containerHeight :number} & std.Omit<@nivo/legends.@nivo/legends/dist/types/types.LegendProps, 'toggleSerie'> & std.Required<std.Pick<@nivo/legends.@nivo/legends/dist/types/types.LegendProps, 'data'>> & std.Omit<@nivo/legends.@nivo/legends/dist/types/types.InteractivityProps, 'toggleSerie'> & std.Partial<{  toggleSerie :boolean | @nivo/legends.@nivo/legends/dist/types/types.InteractivityProps['toggleSerie']}> */
trait BoxLegendSvgProps extends StObject {
  
  var anchor: LegendAnchor
  
  var containerHeight: Double
  
  var containerWidth: Double
  
  var data: js.UndefOr[js.Array[Datum]] & js.Array[Datum]
  
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
  
  var onClick: js.UndefOr[
    js.Function2[/* datum */ Datum, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], Unit]
  ] = js.undefined
  
  var onMouseEnter: js.UndefOr[
    js.Function2[/* datum */ Datum, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], Unit]
  ] = js.undefined
  
  var onMouseLeave: js.UndefOr[
    js.Function2[/* datum */ Datum, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], Unit]
  ] = js.undefined
  
  var padding: js.UndefOr[Double | PartialRecordtoprightbott] = js.undefined
  
  var symbolBorderColor: js.UndefOr[String] = js.undefined
  
  var symbolBorderWidth: js.UndefOr[Double] = js.undefined
  
  var symbolShape: js.UndefOr[SymbolShape | FC[SymbolProps]] = js.undefined
  
  var symbolSize: js.UndefOr[Double] = js.undefined
  
  var symbolSpacing: js.UndefOr[Double] = js.undefined
  
  var toggleSerie: js.UndefOr[Boolean | (js.Function1[/* id */ String | Double, Unit])] = js.undefined
  
  var translateX: js.UndefOr[Double] = js.undefined
  
  var translateY: js.UndefOr[Double] = js.undefined
}
object BoxLegendSvgProps {
  
  inline def apply(
    anchor: LegendAnchor,
    containerHeight: Double,
    containerWidth: Double,
    data: js.UndefOr[js.Array[Datum]] & js.Array[Datum],
    direction: LegendDirection,
    itemHeight: Double,
    itemWidth: Double
  ): BoxLegendSvgProps = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], itemWidth = itemWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxLegendSvgProps]
  }
  
  extension [Self <: BoxLegendSvgProps](x: Self) {
    
    inline def setAnchor(value: LegendAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setContainerHeight(value: Double): Self = StObject.set(x, "containerHeight", value.asInstanceOf[js.Any])
    
    inline def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.UndefOr[js.Array[Datum]] & js.Array[Datum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
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
    
    inline def setOnClick(value: (/* datum */ Datum, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(value: (/* datum */ Datum, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: (/* datum */ Datum, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setPadding(value: Double | PartialRecordtoprightbott): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setSymbolBorderColor(value: String): Self = StObject.set(x, "symbolBorderColor", value.asInstanceOf[js.Any])
    
    inline def setSymbolBorderColorUndefined: Self = StObject.set(x, "symbolBorderColor", js.undefined)
    
    inline def setSymbolBorderWidth(value: Double): Self = StObject.set(x, "symbolBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setSymbolBorderWidthUndefined: Self = StObject.set(x, "symbolBorderWidth", js.undefined)
    
    inline def setSymbolShape(value: SymbolShape | FC[SymbolProps]): Self = StObject.set(x, "symbolShape", value.asInstanceOf[js.Any])
    
    inline def setSymbolShapeUndefined: Self = StObject.set(x, "symbolShape", js.undefined)
    
    inline def setSymbolSize(value: Double): Self = StObject.set(x, "symbolSize", value.asInstanceOf[js.Any])
    
    inline def setSymbolSizeUndefined: Self = StObject.set(x, "symbolSize", js.undefined)
    
    inline def setSymbolSpacing(value: Double): Self = StObject.set(x, "symbolSpacing", value.asInstanceOf[js.Any])
    
    inline def setSymbolSpacingUndefined: Self = StObject.set(x, "symbolSpacing", js.undefined)
    
    inline def setToggleSerie(value: Boolean | (js.Function1[/* id */ String | Double, Unit])): Self = StObject.set(x, "toggleSerie", value.asInstanceOf[js.Any])
    
    inline def setToggleSerieFunction1(value: /* id */ String | Double => Unit): Self = StObject.set(x, "toggleSerie", js.Any.fromFunction1(value))
    
    inline def setToggleSerieUndefined: Self = StObject.set(x, "toggleSerie", js.undefined)
    
    inline def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    inline def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
    
    inline def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
    
    inline def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
  }
}
