package typings.nivoColors

import typings.d3Scale.mod.ScaleDiverging_
import typings.d3Scale.mod.ScaleQuantize_
import typings.d3Scale.mod.ScaleSequential_
import typings.nivoColors.anon.Key
import typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleColorsConfig
import typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleInterpolatorConfig
import typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleSchemeConfig
import typings.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleColorsConfig
import typings.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleSchemeConfig
import typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleColorsConfig
import typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleInterpolatorConfig
import typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleSchemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesScalesContinuousColorScaleMod {
  
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
    - typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleConfig
    - typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleConfig
    - typings.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleConfig
  */
  trait ContinuousColorScaleConfig extends StObject
  object ContinuousColorScaleConfig {
    
    inline def DivergingColorScaleColorsConfig(colors: js.Tuple3[String, String, String]): typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleColorsConfig = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("diverging")
      __obj.asInstanceOf[typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleColorsConfig]
    }
    
    inline def DivergingColorScaleInterpolatorConfig(interpolator: Double => String): typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleInterpolatorConfig = {
      val __obj = js.Dynamic.literal(interpolator = js.Any.fromFunction1(interpolator))
      __obj.updateDynamic("type")("diverging")
      __obj.asInstanceOf[typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleInterpolatorConfig]
    }
    
    inline def DivergingColorScaleSchemeConfig(): typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleSchemeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("diverging")
      __obj.asInstanceOf[typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleSchemeConfig]
    }
    
    inline def QuantizeColorScaleColorsConfig(colors: js.Array[String]): typings.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleColorsConfig = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("quantize")
      __obj.asInstanceOf[typings.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleColorsConfig]
    }
    
    inline def QuantizeColorScaleSchemeConfig(): typings.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleSchemeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("quantize")
      __obj.asInstanceOf[typings.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleSchemeConfig]
    }
    
    inline def SequentialColorScaleColorsConfig(colors: js.Tuple2[String, String]): typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleColorsConfig = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sequential")
      __obj.asInstanceOf[typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleColorsConfig]
    }
    
    inline def SequentialColorScaleInterpolatorConfig(interpolator: Double => String): typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleInterpolatorConfig = {
      val __obj = js.Dynamic.literal(interpolator = js.Any.fromFunction1(interpolator))
      __obj.updateDynamic("type")("sequential")
      __obj.asInstanceOf[typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleInterpolatorConfig]
    }
    
    inline def SequentialColorScaleSchemeConfig(): typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleSchemeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("sequential")
      __obj.asInstanceOf[typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleSchemeConfig]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleValues
    - typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleValues
    - typings.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleValues
  */
  trait ContinuousColorScaleValues extends StObject
  object ContinuousColorScaleValues {
    
    inline def DivergingColorScaleValues(max: Double, min: Double): typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleValues = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleValues]
    }
    
    inline def QuantizeColorScaleValues(max: Double, min: Double): typings.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleValues = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleValues]
    }
    
    inline def SequentialColorScaleValues(max: Double, min: Double): typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleValues = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleValues]
    }
  }
}
