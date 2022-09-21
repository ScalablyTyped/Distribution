package typings.nivoColors

import typings.d3Scale.mod.ScaleDiverging_
import typings.nivoColors.continuousColorScaleMod.ContinuousColorScaleConfig
import typings.nivoColors.continuousColorScaleMod.ContinuousColorScaleValues
import typings.nivoColors.interpolatorsMod.ColorInterpolatorId
import typings.nivoColors.nivoColorsStrings.diverging
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object divergingColorScaleMod {
  
  @JSImport("@nivo/colors/dist/types/scales/divergingColorScale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object divergingColorScaleDefaults {
    
    @JSImport("@nivo/colors/dist/types/scales/divergingColorScale", "divergingColorScaleDefaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/colors/dist/types/scales/divergingColorScale", "divergingColorScaleDefaults.divergeAt")
    @js.native
    def divergeAt: Double = js.native
    inline def divergeAt_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("divergeAt")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors/dist/types/scales/divergingColorScale", "divergingColorScaleDefaults.scheme")
    @js.native
    def scheme: ColorInterpolatorId = js.native
    inline def scheme_=(x: ColorInterpolatorId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scheme")(x.asInstanceOf[js.Any])
  }
  
  inline def getDivergingColorScale(config: DivergingColorScaleConfig, values: DivergingColorScaleValues): ScaleDiverging_[String, scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDivergingColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ScaleDiverging_[String, scala.Nothing]]
  
  inline def useDivergingColorScale(config: DivergingColorScaleConfig, values: DivergingColorScaleValues): ScaleDiverging_[String, scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDivergingColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ScaleDiverging_[String, scala.Nothing]]
  
  trait DivergingColorScaleBaseConfig extends StObject {
    
    var divergeAt: js.UndefOr[Double] = js.undefined
    
    var maxValue: js.UndefOr[Double] = js.undefined
    
    var minValue: js.UndefOr[Double] = js.undefined
    
    var `type`: diverging
  }
  object DivergingColorScaleBaseConfig {
    
    inline def apply(): DivergingColorScaleBaseConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("diverging")
      __obj.asInstanceOf[DivergingColorScaleBaseConfig]
    }
    
    extension [Self <: DivergingColorScaleBaseConfig](x: Self) {
      
      inline def setDivergeAt(value: Double): Self = StObject.set(x, "divergeAt", value.asInstanceOf[js.Any])
      
      inline def setDivergeAtUndefined: Self = StObject.set(x, "divergeAt", js.undefined)
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      inline def setType(value: diverging): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DivergingColorScaleColorsConfig
    extends StObject
       with DivergingColorScaleBaseConfig
       with DivergingColorScaleConfig {
    
    var colors: js.Tuple3[String, String, String]
  }
  object DivergingColorScaleColorsConfig {
    
    inline def apply(colors: js.Tuple3[String, String, String]): DivergingColorScaleColorsConfig = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("diverging")
      __obj.asInstanceOf[DivergingColorScaleColorsConfig]
    }
    
    extension [Self <: DivergingColorScaleColorsConfig](x: Self) {
      
      inline def setColors(value: js.Tuple3[String, String, String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoColors.divergingColorScaleMod.DivergingColorScaleSchemeConfig
    - typings.nivoColors.divergingColorScaleMod.DivergingColorScaleColorsConfig
    - typings.nivoColors.divergingColorScaleMod.DivergingColorScaleInterpolatorConfig
  */
  trait DivergingColorScaleConfig
    extends StObject
       with ContinuousColorScaleConfig
  object DivergingColorScaleConfig {
    
    inline def DivergingColorScaleColorsConfig(colors: js.Tuple3[String, String, String]): typings.nivoColors.divergingColorScaleMod.DivergingColorScaleColorsConfig = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("diverging")
      __obj.asInstanceOf[typings.nivoColors.divergingColorScaleMod.DivergingColorScaleColorsConfig]
    }
    
    inline def DivergingColorScaleInterpolatorConfig(interpolator: Double => String): typings.nivoColors.divergingColorScaleMod.DivergingColorScaleInterpolatorConfig = {
      val __obj = js.Dynamic.literal(interpolator = js.Any.fromFunction1(interpolator))
      __obj.updateDynamic("type")("diverging")
      __obj.asInstanceOf[typings.nivoColors.divergingColorScaleMod.DivergingColorScaleInterpolatorConfig]
    }
    
    inline def DivergingColorScaleSchemeConfig(): typings.nivoColors.divergingColorScaleMod.DivergingColorScaleSchemeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("diverging")
      __obj.asInstanceOf[typings.nivoColors.divergingColorScaleMod.DivergingColorScaleSchemeConfig]
    }
  }
  
  trait DivergingColorScaleInterpolatorConfig
    extends StObject
       with DivergingColorScaleBaseConfig
       with DivergingColorScaleConfig {
    
    def interpolator(t: Double): String
  }
  object DivergingColorScaleInterpolatorConfig {
    
    inline def apply(interpolator: Double => String): DivergingColorScaleInterpolatorConfig = {
      val __obj = js.Dynamic.literal(interpolator = js.Any.fromFunction1(interpolator))
      __obj.updateDynamic("type")("diverging")
      __obj.asInstanceOf[DivergingColorScaleInterpolatorConfig]
    }
    
    extension [Self <: DivergingColorScaleInterpolatorConfig](x: Self) {
      
      inline def setInterpolator(value: Double => String): Self = StObject.set(x, "interpolator", js.Any.fromFunction1(value))
    }
  }
  
  trait DivergingColorScaleSchemeConfig
    extends StObject
       with DivergingColorScaleBaseConfig
       with DivergingColorScaleConfig {
    
    var scheme: js.UndefOr[ColorInterpolatorId] = js.undefined
  }
  object DivergingColorScaleSchemeConfig {
    
    inline def apply(): DivergingColorScaleSchemeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("diverging")
      __obj.asInstanceOf[DivergingColorScaleSchemeConfig]
    }
    
    extension [Self <: DivergingColorScaleSchemeConfig](x: Self) {
      
      inline def setScheme(value: ColorInterpolatorId): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    }
  }
  
  trait DivergingColorScaleValues
    extends StObject
       with ContinuousColorScaleValues {
    
    var max: Double
    
    var min: Double
  }
  object DivergingColorScaleValues {
    
    inline def apply(max: Double, min: Double): DivergingColorScaleValues = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[DivergingColorScaleValues]
    }
    
    extension [Self <: DivergingColorScaleValues](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
}
