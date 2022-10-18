package typings.nivoBar.distTypesTypesMod

import typings.nivoCore.mod.Margin
import typings.nivoScales.distTypesTypesMod.AnyScale
import typings.react.mod.FC
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarCanvasCustomLayerProps[RawDatum]
  extends StObject
     with BarCustomLayerBaseProps[RawDatum]
     with BarHandlers[RawDatum, HTMLCanvasElement]
object BarCanvasCustomLayerProps {
  
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
  ): BarCanvasCustomLayerProps[RawDatum] = {
    val __obj = js.Dynamic.literal(bars = bars.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], enableLabel = enableLabel.asInstanceOf[js.Any], getTooltipLabel = js.Any.fromFunction1(getTooltipLabel), height = height.asInstanceOf[js.Any], innerHeight = innerHeight.asInstanceOf[js.Any], innerWidth = innerWidth.asInstanceOf[js.Any], isFocusable = isFocusable.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], labelSkipHeight = labelSkipHeight.asInstanceOf[js.Any], labelSkipWidth = labelSkipWidth.asInstanceOf[js.Any], legendData = legendData.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarCanvasCustomLayerProps[RawDatum]]
  }
}
