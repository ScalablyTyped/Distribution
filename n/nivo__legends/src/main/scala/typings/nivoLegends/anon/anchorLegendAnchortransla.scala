package typings.nivoLegends.anon

import typings.d3Scale.mod.ScaleDiverging_
import typings.d3Scale.mod.ScaleQuantize_
import typings.d3Scale.mod.ScaleSequential_
import typings.nivoCore.mod.CompleteTheme
import typings.nivoCore.mod.ValueFormat
import typings.nivoLegends.distTypesTypesMod.LegendAnchor
import typings.nivoLegends.distTypesTypesMod.LegendDirection
import typings.nivoLegends.nivoLegendsStrings.after
import typings.nivoLegends.nivoLegendsStrings.before
import typings.nivoLegends.nivoLegendsStrings.end
import typings.nivoLegends.nivoLegendsStrings.middle
import typings.nivoLegends.nivoLegendsStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  anchor :@nivo/legends.@nivo/legends/dist/types/types.LegendAnchor,   translateX :number | undefined,   translateY :number | undefined,   containerWidth :number,   containerHeight :number,   theme :@nivo/core.@nivo/core.CompleteTheme} & @nivo/legends.@nivo/legends/dist/types/types.ContinuousColorsLegendProps */
trait anchorLegendAnchortransla extends StObject {
  
  var anchor: LegendAnchor
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var containerHeight: Double
  
  var containerWidth: Double
  
  var direction: js.UndefOr[LegendDirection] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var scale: (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])
  
  var theme: CompleteTheme
  
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
object anchorLegendAnchortransla {
  
  inline def apply(
    anchor: LegendAnchor,
    containerHeight: Double,
    containerWidth: Double,
    scale: (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]),
    theme: CompleteTheme
  ): anchorLegendAnchortransla = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[anchorLegendAnchortransla]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: anchorLegendAnchortransla] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: LegendAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setContainerHeight(value: Double): Self = StObject.set(x, "containerHeight", value.asInstanceOf[js.Any])
    
    inline def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: LegendDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setScale(
      value: (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])
    ): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: CompleteTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    inline def setTickFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "tickFormat", value.asInstanceOf[js.Any])
    
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
