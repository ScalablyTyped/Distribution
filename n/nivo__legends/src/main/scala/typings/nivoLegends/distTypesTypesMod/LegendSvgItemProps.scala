package typings.nivoLegends.distTypesTypesMod

import typings.nivoLegends.distTypesSvgSymbolsTypesMod.SymbolProps
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.SVGRectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  data :@nivo/legends.@nivo/legends/dist/types/types.Datum,   x :number,   y :number,   width :number,   height :number,   textColor :string | undefined,   background :string | undefined,   opacity :number | undefined,   direction :@nivo/legends.@nivo/legends/dist/types/types.LegendItemDirection | undefined} & std.Pick<@nivo/legends.@nivo/legends/dist/types/types.CommonLegendProps, 'justify' | 'effects'> & @nivo/legends.@nivo/legends/dist/types/types.BoxLegendSymbolProps & @nivo/legends.@nivo/legends/dist/types/types.InteractivityProps */
trait LegendSvgItemProps extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var data: Datum
  
  var direction: js.UndefOr[LegendItemDirection] = js.undefined
  
  var effects: js.UndefOr[js.Array[EffectProps]] = js.undefined
  
  var height: Double
  
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
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var symbolBorderColor: js.UndefOr[String] = js.undefined
  
  var symbolBorderWidth: js.UndefOr[Double] = js.undefined
  
  var symbolShape: js.UndefOr[SymbolShape | FC[SymbolProps]] = js.undefined
  
  var symbolSize: js.UndefOr[Double] = js.undefined
  
  var symbolSpacing: js.UndefOr[Double] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
  
  var toggleSerie: js.UndefOr[js.Function1[/* id */ String | Double, Unit]] = js.undefined
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object LegendSvgItemProps {
  
  inline def apply(data: Datum, height: Double, width: Double, x: Double, y: Double): LegendSvgItemProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendSvgItemProps]
  }
  
  extension [Self <: LegendSvgItemProps](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setData(value: Datum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: LegendItemDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setEffects(value: js.Array[EffectProps]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
    
    inline def setEffectsVarargs(value: EffectProps*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setJustify(value: Boolean): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
    
    inline def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
    
    inline def setOnClick(value: (/* datum */ Datum, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(value: (/* datum */ Datum, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: (/* datum */ Datum, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
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
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setToggleSerie(value: /* id */ String | Double => Unit): Self = StObject.set(x, "toggleSerie", js.Any.fromFunction1(value))
    
    inline def setToggleSerieUndefined: Self = StObject.set(x, "toggleSerie", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
