package typings.nivoLegends.distTypesTypesMod

import typings.d3Scale.mod.ScaleDiverging_
import typings.d3Scale.mod.ScaleQuantize_
import typings.d3Scale.mod.ScaleSequential_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnchoredContinuousColorsLegendProps
  extends StObject
     with ContinuousColorsLegendProps {
  
  var anchor: LegendAnchor
  
  var containerHeight: Double
  
  var containerWidth: Double
  
  var translateX: js.UndefOr[Double] = js.undefined
  
  var translateY: js.UndefOr[Double] = js.undefined
}
object AnchoredContinuousColorsLegendProps {
  
  inline def apply(
    anchor: LegendAnchor,
    containerHeight: Double,
    containerWidth: Double,
    scale: (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])
  ): AnchoredContinuousColorsLegendProps = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchoredContinuousColorsLegendProps]
  }
  
  extension [Self <: AnchoredContinuousColorsLegendProps](x: Self) {
    
    inline def setAnchor(value: LegendAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setContainerHeight(value: Double): Self = StObject.set(x, "containerHeight", value.asInstanceOf[js.Any])
    
    inline def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
    
    inline def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    inline def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
    
    inline def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
    
    inline def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
  }
}
