package typings.nivoBar.typesMod

import typings.nivoCore.mod.Margin
import typings.nivoScales.typesMod.AnyScale
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<@nivo/bar.@nivo/bar/dist/types/types.BarCommonProps<RawDatum>, 'borderRadius' | 'borderWidth' | 'enableLabel' | 'isInteractive' | 'labelSkipHeight' | 'labelSkipWidth' | 'tooltip'> */
/* Inlined parent @nivo/core.@nivo/core.Dimensions */
trait BarCustomLayerBaseProps[RawDatum] extends StObject {
  
  var bars: js.Array[ComputedBarDatum[RawDatum]]
  
  var borderRadius: Double
  
  var borderWidth: Double
  
  var enableLabel: Boolean
  
  def getTooltipLabel(datum: ComputedDatum[RawDatum]): String | Double
  
  var height: Double
  
  var innerHeight: Double
  
  var innerWidth: Double
  
  var isFocusable: Boolean
  
  var isInteractive: Boolean
  
  var labelSkipHeight: Double
  
  var labelSkipWidth: Double
  
  var legendData: js.Array[js.Tuple2[BarLegendProps, js.Array[LegendData]]]
  
  var margin: Margin
  
  var tooltip: FC[BarTooltipProps[RawDatum]]
  
  var width: Double
  
  var xScale: AnyScale
  
  var yScale: AnyScale
}
object BarCustomLayerBaseProps {
  
  inline def apply[RawDatum](
    bars: js.Array[ComputedBarDatum[RawDatum]],
    borderRadius: Double,
    borderWidth: Double,
    enableLabel: Boolean,
    getTooltipLabel: ComputedDatum[RawDatum] => String | Double,
    height: Double,
    innerHeight: Double,
    innerWidth: Double,
    isFocusable: Boolean,
    isInteractive: Boolean,
    labelSkipHeight: Double,
    labelSkipWidth: Double,
    legendData: js.Array[js.Tuple2[BarLegendProps, js.Array[LegendData]]],
    margin: Margin,
    tooltip: FC[BarTooltipProps[RawDatum]],
    width: Double,
    xScale: AnyScale,
    yScale: AnyScale
  ): BarCustomLayerBaseProps[RawDatum] = {
    val __obj = js.Dynamic.literal(bars = bars.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], enableLabel = enableLabel.asInstanceOf[js.Any], getTooltipLabel = js.Any.fromFunction1(getTooltipLabel), height = height.asInstanceOf[js.Any], innerHeight = innerHeight.asInstanceOf[js.Any], innerWidth = innerWidth.asInstanceOf[js.Any], isFocusable = isFocusable.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], labelSkipHeight = labelSkipHeight.asInstanceOf[js.Any], labelSkipWidth = labelSkipWidth.asInstanceOf[js.Any], legendData = legendData.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarCustomLayerBaseProps[RawDatum]]
  }
  
  extension [Self <: BarCustomLayerBaseProps[?], RawDatum](x: Self & BarCustomLayerBaseProps[RawDatum]) {
    
    inline def setBars(value: js.Array[ComputedBarDatum[RawDatum]]): Self = StObject.set(x, "bars", value.asInstanceOf[js.Any])
    
    inline def setBarsVarargs(value: ComputedBarDatum[RawDatum]*): Self = StObject.set(x, "bars", js.Array(value*))
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setEnableLabel(value: Boolean): Self = StObject.set(x, "enableLabel", value.asInstanceOf[js.Any])
    
    inline def setGetTooltipLabel(value: ComputedDatum[RawDatum] => String | Double): Self = StObject.set(x, "getTooltipLabel", js.Any.fromFunction1(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setInnerHeight(value: Double): Self = StObject.set(x, "innerHeight", value.asInstanceOf[js.Any])
    
    inline def setInnerWidth(value: Double): Self = StObject.set(x, "innerWidth", value.asInstanceOf[js.Any])
    
    inline def setIsFocusable(value: Boolean): Self = StObject.set(x, "isFocusable", value.asInstanceOf[js.Any])
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setLabelSkipHeight(value: Double): Self = StObject.set(x, "labelSkipHeight", value.asInstanceOf[js.Any])
    
    inline def setLabelSkipWidth(value: Double): Self = StObject.set(x, "labelSkipWidth", value.asInstanceOf[js.Any])
    
    inline def setLegendData(value: js.Array[js.Tuple2[BarLegendProps, js.Array[LegendData]]]): Self = StObject.set(x, "legendData", value.asInstanceOf[js.Any])
    
    inline def setLegendDataVarargs(value: (js.Tuple2[BarLegendProps, js.Array[LegendData]])*): Self = StObject.set(x, "legendData", js.Array(value*))
    
    inline def setMargin(value: Margin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: FC[BarTooltipProps[RawDatum]]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setXScale(value: AnyScale): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
    
    inline def setYScale(value: AnyScale): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
  }
}
