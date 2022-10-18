package typings.nivoColors

import typings.d3Scale.mod.ScaleDiverging_
import typings.d3Scale.mod.ScaleQuantize_
import typings.d3Scale.mod.ScaleSequential_
import typings.nivoColors.anon.Key
import typings.nivoColors.distTypesScalesContinuousColorScaleMod.ContinuousColorScaleConfig
import typings.nivoColors.distTypesScalesContinuousColorScaleMod.ContinuousColorScaleValues
import typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleColorsConfig
import typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleConfig
import typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleInterpolatorConfig
import typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleSchemeConfig
import typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleValues
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.DatumIdentityAccessor
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScale
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleColorsConfig
import typings.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleConfig
import typings.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleSchemeConfig
import typings.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleValues
import typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleColorsConfig
import typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleConfig
import typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleInterpolatorConfig
import typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleSchemeConfig
import typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleValues
import typings.nivoColors.distTypesSchemesInterpolatorsMod.ColorInterpolatorId
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesScalesMod {
  
  @JSImport("@nivo/colors/dist/types/scales", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeContinuousColorScaleColorStops(scale: ScaleDiverging_[String, scala.Nothing]): js.Array[Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key]]
  inline def computeContinuousColorScaleColorStops(scale: ScaleDiverging_[String, scala.Nothing], steps: Double): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  inline def computeContinuousColorScaleColorStops(scale: ScaleQuantize_[String, scala.Nothing]): js.Array[Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key]]
  inline def computeContinuousColorScaleColorStops(scale: ScaleQuantize_[String, scala.Nothing], steps: Double): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  inline def computeContinuousColorScaleColorStops(scale: ScaleSequential_[String, scala.Nothing]): js.Array[Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key]]
  inline def computeContinuousColorScaleColorStops(scale: ScaleSequential_[String, scala.Nothing], steps: Double): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  
  object divergingColorScaleDefaults {
    
    @JSImport("@nivo/colors/dist/types/scales", "divergingColorScaleDefaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/colors/dist/types/scales", "divergingColorScaleDefaults.divergeAt")
    @js.native
    def divergeAt: Double = js.native
    inline def divergeAt_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("divergeAt")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors/dist/types/scales", "divergingColorScaleDefaults.scheme")
    @js.native
    def scheme: ColorInterpolatorId = js.native
    inline def scheme_=(x: ColorInterpolatorId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scheme")(x.asInstanceOf[js.Any])
  }
  
  inline def getContinuousColorScale(config: DivergingColorScaleColorsConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: DivergingColorScaleInterpolatorConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: DivergingColorScaleSchemeConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: QuantizeColorScaleColorsConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: QuantizeColorScaleSchemeConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: SequentialColorScaleColorsConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: SequentialColorScaleInterpolatorConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: SequentialColorScaleSchemeConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  
  inline def getDivergingColorScale(config: DivergingColorScaleConfig, values: DivergingColorScaleValues): ScaleDiverging_[String, scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDivergingColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ScaleDiverging_[String, scala.Nothing]]
  
  inline def getOrdinalColorScale[Datum](config: OrdinalColorScaleConfig[Datum]): OrdinalColorScale[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrdinalColorScale")(config.asInstanceOf[js.Any]).asInstanceOf[OrdinalColorScale[Datum]]
  inline def getOrdinalColorScale[Datum](config: OrdinalColorScaleConfig[Datum], identity: String): OrdinalColorScale[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrdinalColorScale")(config.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[OrdinalColorScale[Datum]]
  inline def getOrdinalColorScale[Datum](config: OrdinalColorScaleConfig[Datum], identity: DatumIdentityAccessor[Datum]): OrdinalColorScale[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrdinalColorScale")(config.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[OrdinalColorScale[Datum]]
  
  inline def getQuantizeColorScale(config: QuantizeColorScaleConfig, values: QuantizeColorScaleValues): ScaleQuantize_[String, scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("getQuantizeColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ScaleQuantize_[String, scala.Nothing]]
  
  inline def getSequentialColorScale(config: SequentialColorScaleConfig, values: SequentialColorScaleValues): ScaleSequential_[String, scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSequentialColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ScaleSequential_[String, scala.Nothing]]
  
  object quantizeColorScaleDefaults {
    
    @JSImport("@nivo/colors/dist/types/scales", "quantizeColorScaleDefaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/colors/dist/types/scales", "quantizeColorScaleDefaults.scheme")
    @js.native
    def scheme: ColorInterpolatorId = js.native
    inline def scheme_=(x: ColorInterpolatorId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scheme")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors/dist/types/scales", "quantizeColorScaleDefaults.steps")
    @js.native
    def steps: NonNullable[js.UndefOr[Double]] = js.native
    inline def steps_=(x: NonNullable[js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("steps")(x.asInstanceOf[js.Any])
  }
  
  object sequentialColorScaleDefaults {
    
    @JSImport("@nivo/colors/dist/types/scales", "sequentialColorScaleDefaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/colors/dist/types/scales", "sequentialColorScaleDefaults.scheme")
    @js.native
    def scheme: ColorInterpolatorId = js.native
    inline def scheme_=(x: ColorInterpolatorId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scheme")(x.asInstanceOf[js.Any])
  }
  
  inline def useContinuousColorScale(config: ContinuousColorScaleConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("useContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  
  inline def useDivergingColorScale(config: DivergingColorScaleConfig, values: DivergingColorScaleValues): ScaleDiverging_[String, scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDivergingColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ScaleDiverging_[String, scala.Nothing]]
  
  inline def useOrdinalColorScale[Datum](config: OrdinalColorScaleConfig[Datum], identity: String): OrdinalColorScale[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("useOrdinalColorScale")(config.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[OrdinalColorScale[Datum]]
  inline def useOrdinalColorScale[Datum](config: OrdinalColorScaleConfig[Datum], identity: DatumIdentityAccessor[Datum]): OrdinalColorScale[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("useOrdinalColorScale")(config.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[OrdinalColorScale[Datum]]
  
  inline def useQuantizeColorScale(config: QuantizeColorScaleConfig, values: QuantizeColorScaleValues): ScaleQuantize_[String, scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuantizeColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ScaleQuantize_[String, scala.Nothing]]
  
  inline def useSequentialColorScale(config: SequentialColorScaleConfig, values: SequentialColorScaleValues): ScaleSequential_[String, scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSequentialColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ScaleSequential_[String, scala.Nothing]]
}
