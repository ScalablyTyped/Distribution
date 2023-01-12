package typings.nivoColors

import typings.d3Scale.mod.ScaleQuantize_
import typings.nivoColors.distTypesScalesContinuousColorScaleMod.ContinuousColorScaleConfig
import typings.nivoColors.distTypesScalesContinuousColorScaleMod.ContinuousColorScaleValues
import typings.nivoColors.distTypesSchemesInterpolatorsMod.ColorInterpolatorId
import typings.nivoColors.nivoColorsStrings.quantize
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesScalesQuantizeColorScaleMod {
  
  @JSImport("@nivo/colors/dist/types/scales/quantizeColorScale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getQuantizeColorScale(config: QuantizeColorScaleConfig, values: QuantizeColorScaleValues): ScaleQuantize_[String, scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("getQuantizeColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ScaleQuantize_[String, scala.Nothing]]
  
  object quantizeColorScaleDefaults {
    
    @JSImport("@nivo/colors/dist/types/scales/quantizeColorScale", "quantizeColorScaleDefaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/colors/dist/types/scales/quantizeColorScale", "quantizeColorScaleDefaults.scheme")
    @js.native
    def scheme: ColorInterpolatorId = js.native
    inline def scheme_=(x: ColorInterpolatorId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scheme")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors/dist/types/scales/quantizeColorScale", "quantizeColorScaleDefaults.steps")
    @js.native
    def steps: NonNullable[js.UndefOr[Double]] = js.native
    inline def steps_=(x: NonNullable[js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("steps")(x.asInstanceOf[js.Any])
  }
  
  inline def useQuantizeColorScale(config: QuantizeColorScaleConfig, values: QuantizeColorScaleValues): ScaleQuantize_[String, scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuantizeColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ScaleQuantize_[String, scala.Nothing]]
  
  trait QuantizeColorScaleColorsConfig
    extends StObject
       with QuantizeColorScaleConfig {
    
    var colors: js.Array[String]
    
    var domain: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var `type`: quantize
  }
  object QuantizeColorScaleColorsConfig {
    
    inline def apply(colors: js.Array[String]): QuantizeColorScaleColorsConfig = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("quantize")
      __obj.asInstanceOf[QuantizeColorScaleColorsConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuantizeColorScaleColorsConfig] (val x: Self) extends AnyVal {
      
      inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setDomain(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setType(value: quantize): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleSchemeConfig
    - typings.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleColorsConfig
  */
  trait QuantizeColorScaleConfig
    extends StObject
       with ContinuousColorScaleConfig
  object QuantizeColorScaleConfig {
    
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
  }
  
  trait QuantizeColorScaleSchemeConfig
    extends StObject
       with QuantizeColorScaleConfig {
    
    var domain: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var scheme: js.UndefOr[ColorInterpolatorId] = js.undefined
    
    var steps: js.UndefOr[Double] = js.undefined
    
    var `type`: quantize
  }
  object QuantizeColorScaleSchemeConfig {
    
    inline def apply(): QuantizeColorScaleSchemeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("quantize")
      __obj.asInstanceOf[QuantizeColorScaleSchemeConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuantizeColorScaleSchemeConfig] (val x: Self) extends AnyVal {
      
      inline def setDomain(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setScheme(value: ColorInterpolatorId): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setType(value: quantize): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait QuantizeColorScaleValues
    extends StObject
       with ContinuousColorScaleValues {
    
    var max: Double
    
    var min: Double
  }
  object QuantizeColorScaleValues {
    
    inline def apply(max: Double, min: Double): QuantizeColorScaleValues = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuantizeColorScaleValues]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuantizeColorScaleValues] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
}
