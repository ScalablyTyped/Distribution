package typings.nivoColors

import typings.d3Scale.mod.ScaleSequential_
import typings.nivoColors.distTypesScalesContinuousColorScaleMod.ContinuousColorScaleConfig
import typings.nivoColors.distTypesScalesContinuousColorScaleMod.ContinuousColorScaleValues
import typings.nivoColors.distTypesSchemesInterpolatorsMod.ColorInterpolatorId
import typings.nivoColors.nivoColorsStrings.sequential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesScalesSequentialColorScaleMod {
  
  @JSImport("@nivo/colors/dist/types/scales/sequentialColorScale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSequentialColorScale(config: SequentialColorScaleConfig, values: SequentialColorScaleValues): ScaleSequential_[String, scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSequentialColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ScaleSequential_[String, scala.Nothing]]
  
  object sequentialColorScaleDefaults {
    
    @JSImport("@nivo/colors/dist/types/scales/sequentialColorScale", "sequentialColorScaleDefaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/colors/dist/types/scales/sequentialColorScale", "sequentialColorScaleDefaults.scheme")
    @js.native
    def scheme: ColorInterpolatorId = js.native
    inline def scheme_=(x: ColorInterpolatorId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scheme")(x.asInstanceOf[js.Any])
  }
  
  inline def useSequentialColorScale(config: SequentialColorScaleConfig, values: SequentialColorScaleValues): ScaleSequential_[String, scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSequentialColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ScaleSequential_[String, scala.Nothing]]
  
  trait SequentialColorScaleBaseConfig extends StObject {
    
    var maxValue: js.UndefOr[Double] = js.undefined
    
    var minValue: js.UndefOr[Double] = js.undefined
    
    var `type`: sequential
  }
  object SequentialColorScaleBaseConfig {
    
    inline def apply(): SequentialColorScaleBaseConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("sequential")
      __obj.asInstanceOf[SequentialColorScaleBaseConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SequentialColorScaleBaseConfig] (val x: Self) extends AnyVal {
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      inline def setType(value: sequential): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SequentialColorScaleColorsConfig
    extends StObject
       with SequentialColorScaleBaseConfig
       with SequentialColorScaleConfig {
    
    var colors: js.Tuple2[String, String]
  }
  object SequentialColorScaleColorsConfig {
    
    inline def apply(colors: js.Tuple2[String, String]): SequentialColorScaleColorsConfig = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sequential")
      __obj.asInstanceOf[SequentialColorScaleColorsConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SequentialColorScaleColorsConfig] (val x: Self) extends AnyVal {
      
      inline def setColors(value: js.Tuple2[String, String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleSchemeConfig
    - typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleColorsConfig
    - typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleInterpolatorConfig
  */
  trait SequentialColorScaleConfig
    extends StObject
       with ContinuousColorScaleConfig
  object SequentialColorScaleConfig {
    
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
  
  trait SequentialColorScaleInterpolatorConfig
    extends StObject
       with SequentialColorScaleBaseConfig
       with SequentialColorScaleConfig {
    
    def interpolator(t: Double): String
  }
  object SequentialColorScaleInterpolatorConfig {
    
    inline def apply(interpolator: Double => String): SequentialColorScaleInterpolatorConfig = {
      val __obj = js.Dynamic.literal(interpolator = js.Any.fromFunction1(interpolator))
      __obj.updateDynamic("type")("sequential")
      __obj.asInstanceOf[SequentialColorScaleInterpolatorConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SequentialColorScaleInterpolatorConfig] (val x: Self) extends AnyVal {
      
      inline def setInterpolator(value: Double => String): Self = StObject.set(x, "interpolator", js.Any.fromFunction1(value))
    }
  }
  
  trait SequentialColorScaleSchemeConfig
    extends StObject
       with SequentialColorScaleBaseConfig
       with SequentialColorScaleConfig {
    
    var scheme: js.UndefOr[ColorInterpolatorId] = js.undefined
  }
  object SequentialColorScaleSchemeConfig {
    
    inline def apply(): SequentialColorScaleSchemeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("sequential")
      __obj.asInstanceOf[SequentialColorScaleSchemeConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SequentialColorScaleSchemeConfig] (val x: Self) extends AnyVal {
      
      inline def setScheme(value: ColorInterpolatorId): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    }
  }
  
  trait SequentialColorScaleValues
    extends StObject
       with ContinuousColorScaleValues {
    
    var max: Double
    
    var min: Double
  }
  object SequentialColorScaleValues {
    
    inline def apply(max: Double, min: Double): SequentialColorScaleValues = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[SequentialColorScaleValues]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SequentialColorScaleValues] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
}
