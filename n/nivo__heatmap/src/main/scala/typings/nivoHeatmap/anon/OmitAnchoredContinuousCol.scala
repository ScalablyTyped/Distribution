package typings.nivoHeatmap.anon

import typings.nivoCore.mod.ValueFormat
import typings.nivoHeatmap.nivoHeatmapStrings.after
import typings.nivoHeatmap.nivoHeatmapStrings.before
import typings.nivoHeatmap.nivoHeatmapStrings.end
import typings.nivoHeatmap.nivoHeatmapStrings.middle
import typings.nivoHeatmap.nivoHeatmapStrings.start
import typings.nivoLegends.typesTypesMod.LegendAnchor
import typings.nivoLegends.typesTypesMod.LegendDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@nivo/legends.@nivo/legends.AnchoredContinuousColorsLegendProps, 'scale' | 'containerWidth' | 'containerHeight'> */
trait OmitAnchoredContinuousCol extends StObject {
  
  var anchor: LegendAnchor
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var direction: js.UndefOr[LegendDirection] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var thickness: js.UndefOr[Double] = js.undefined
  
  var tickFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
  
  var tickOverlap: js.UndefOr[Boolean] = js.undefined
  
  var tickPosition: js.UndefOr[before | after] = js.undefined
  
  var tickSize: js.UndefOr[Double] = js.undefined
  
  var tickSpacing: js.UndefOr[Double] = js.undefined
  
  var ticks: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var titleAlign: js.UndefOr[start | middle | end] = js.undefined
  
  var titleOffset: js.UndefOr[Double] = js.undefined
  
  var translateX: js.UndefOr[Double] = js.undefined
  
  var translateY: js.UndefOr[Double] = js.undefined
}
object OmitAnchoredContinuousCol {
  
  inline def apply(anchor: LegendAnchor): OmitAnchoredContinuousCol = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitAnchoredContinuousCol]
  }
  
  extension [Self <: OmitAnchoredContinuousCol](x: Self) {
    
    inline def setAnchor(value: LegendAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setDirection(value: LegendDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    inline def setTickFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "tickFormat", value.asInstanceOf[js.Any])
    
    inline def setTickFormatFunction1(value: Double => String): Self = StObject.set(x, "tickFormat", js.Any.fromFunction1(value))
    
    inline def setTickFormatFunction2(value: (Double, Unit) => String): Self = StObject.set(x, "tickFormat", js.Any.fromFunction2(value))
    
    inline def setTickFormatUndefined: Self = StObject.set(x, "tickFormat", js.undefined)
    
    inline def setTickOverlap(value: Boolean): Self = StObject.set(x, "tickOverlap", value.asInstanceOf[js.Any])
    
    inline def setTickOverlapUndefined: Self = StObject.set(x, "tickOverlap", js.undefined)
    
    inline def setTickPosition(value: before | after): Self = StObject.set(x, "tickPosition", value.asInstanceOf[js.Any])
    
    inline def setTickPositionUndefined: Self = StObject.set(x, "tickPosition", js.undefined)
    
    inline def setTickSize(value: Double): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
    
    inline def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
    
    inline def setTickSpacing(value: Double): Self = StObject.set(x, "tickSpacing", value.asInstanceOf[js.Any])
    
    inline def setTickSpacingUndefined: Self = StObject.set(x, "tickSpacing", js.undefined)
    
    inline def setTicks(value: Double | js.Array[Double]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    inline def setTicksVarargs(value: Double*): Self = StObject.set(x, "ticks", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleAlign(value: start | middle | end): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
    
    inline def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
    
    inline def setTitleOffset(value: Double): Self = StObject.set(x, "titleOffset", value.asInstanceOf[js.Any])
    
    inline def setTitleOffsetUndefined: Self = StObject.set(x, "titleOffset", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    inline def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
    
    inline def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
    
    inline def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
  }
}
