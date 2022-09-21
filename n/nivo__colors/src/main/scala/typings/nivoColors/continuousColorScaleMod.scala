package typings.nivoColors

import typings.d3Scale.mod.ScaleDiverging_
import typings.d3Scale.mod.ScaleQuantize_
import typings.d3Scale.mod.ScaleSequential_
import typings.nivoColors.anon.Key
import typings.nivoColors.divergingColorScaleMod.DivergingColorScaleColorsConfig
import typings.nivoColors.divergingColorScaleMod.DivergingColorScaleInterpolatorConfig
import typings.nivoColors.divergingColorScaleMod.DivergingColorScaleSchemeConfig
import typings.nivoColors.quantizeColorScaleMod.QuantizeColorScaleColorsConfig
import typings.nivoColors.quantizeColorScaleMod.QuantizeColorScaleSchemeConfig
import typings.nivoColors.sequentialColorScaleMod.SequentialColorScaleColorsConfig
import typings.nivoColors.sequentialColorScaleMod.SequentialColorScaleInterpolatorConfig
import typings.nivoColors.sequentialColorScaleMod.SequentialColorScaleSchemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object continuousColorScaleMod {
  
  @JSImport("@nivo/colors/dist/types/scales/continuousColorScale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeContinuousColorScaleColorStops(scale: ScaleDiverging_[String, scala.Nothing]): js.Array[Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key]]
  inline def computeContinuousColorScaleColorStops(scale: ScaleDiverging_[String, scala.Nothing], steps: Double): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  inline def computeContinuousColorScaleColorStops(scale: ScaleQuantize_[String, scala.Nothing]): js.Array[Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key]]
  inline def computeContinuousColorScaleColorStops(scale: ScaleQuantize_[String, scala.Nothing], steps: Double): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  inline def computeContinuousColorScaleColorStops(scale: ScaleSequential_[String, scala.Nothing]): js.Array[Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key]]
  inline def computeContinuousColorScaleColorStops(scale: ScaleSequential_[String, scala.Nothing], steps: Double): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  
  inline def getContinuousColorScale(config: DivergingColorScaleColorsConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: DivergingColorScaleInterpolatorConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: DivergingColorScaleSchemeConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: QuantizeColorScaleColorsConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: QuantizeColorScaleSchemeConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: SequentialColorScaleColorsConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: SequentialColorScaleInterpolatorConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: SequentialColorScaleSchemeConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  
  inline def useContinuousColorScale(config: ContinuousColorScaleConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("useContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoColors.sequentialColorScaleMod.SequentialColorScaleConfig
    - typings.nivoColors.divergingColorScaleMod.DivergingColorScaleConfig
    - typings.nivoColors.quantizeColorScaleMod.QuantizeColorScaleConfig
  */
  trait ContinuousColorScaleConfig extends StObject
  object ContinuousColorScaleConfig {
    
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
    
    inline def QuantizeColorScaleColorsConfig(colors: js.Array[String]): typings.nivoColors.quantizeColorScaleMod.QuantizeColorScaleColorsConfig = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("quantize")
      __obj.asInstanceOf[typings.nivoColors.quantizeColorScaleMod.QuantizeColorScaleColorsConfig]
    }
    
    inline def QuantizeColorScaleSchemeConfig(): typings.nivoColors.quantizeColorScaleMod.QuantizeColorScaleSchemeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("quantize")
      __obj.asInstanceOf[typings.nivoColors.quantizeColorScaleMod.QuantizeColorScaleSchemeConfig]
    }
    
    inline def SequentialColorScaleColorsConfig(colors: js.Tuple2[String, String]): typings.nivoColors.sequentialColorScaleMod.SequentialColorScaleColorsConfig = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sequential")
      __obj.asInstanceOf[typings.nivoColors.sequentialColorScaleMod.SequentialColorScaleColorsConfig]
    }
    
    inline def SequentialColorScaleInterpolatorConfig(interpolator: Double => String): typings.nivoColors.sequentialColorScaleMod.SequentialColorScaleInterpolatorConfig = {
      val __obj = js.Dynamic.literal(interpolator = js.Any.fromFunction1(interpolator))
      __obj.updateDynamic("type")("sequential")
      __obj.asInstanceOf[typings.nivoColors.sequentialColorScaleMod.SequentialColorScaleInterpolatorConfig]
    }
    
    inline def SequentialColorScaleSchemeConfig(): typings.nivoColors.sequentialColorScaleMod.SequentialColorScaleSchemeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("sequential")
      __obj.asInstanceOf[typings.nivoColors.sequentialColorScaleMod.SequentialColorScaleSchemeConfig]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoColors.sequentialColorScaleMod.SequentialColorScaleValues
    - typings.nivoColors.divergingColorScaleMod.DivergingColorScaleValues
    - typings.nivoColors.quantizeColorScaleMod.QuantizeColorScaleValues
  */
  trait ContinuousColorScaleValues extends StObject
  object ContinuousColorScaleValues {
    
    inline def DivergingColorScaleValues(max: Double, min: Double): typings.nivoColors.divergingColorScaleMod.DivergingColorScaleValues = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nivoColors.divergingColorScaleMod.DivergingColorScaleValues]
    }
    
    inline def QuantizeColorScaleValues(max: Double, min: Double): typings.nivoColors.quantizeColorScaleMod.QuantizeColorScaleValues = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nivoColors.quantizeColorScaleMod.QuantizeColorScaleValues]
    }
    
    inline def SequentialColorScaleValues(max: Double, min: Double): typings.nivoColors.sequentialColorScaleMod.SequentialColorScaleValues = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nivoColors.sequentialColorScaleMod.SequentialColorScaleValues]
    }
  }
}
