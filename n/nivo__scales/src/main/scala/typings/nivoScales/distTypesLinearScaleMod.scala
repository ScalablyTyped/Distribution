package typings.nivoScales

import typings.d3Scale.mod.NumberValue
import typings.d3Scale.mod.ScaleLinear_
import typings.nivoScales.distTypesTypesMod.ComputedSerieAxis
import typings.nivoScales.distTypesTypesMod.ScaleAxis
import typings.nivoScales.distTypesTypesMod.ScaleLinear
import typings.nivoScales.distTypesTypesMod.ScaleLinearSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLinearScaleMod {
  
  @JSImport("@nivo/scales/dist/types/linearScale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def castLinearScale[Range_1, Output](scale: ScaleLinear_[Range_1, Output, scala.Nothing]): ScaleLinear[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("castLinearScale")(scale.asInstanceOf[js.Any]).asInstanceOf[ScaleLinear[Double]]
  inline def castLinearScale[Range_1, Output](scale: ScaleLinear_[Range_1, Output, scala.Nothing], stacked: Boolean): ScaleLinear[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("castLinearScale")(scale.asInstanceOf[js.Any], stacked.asInstanceOf[js.Any])).asInstanceOf[ScaleLinear[Double]]
  
  inline def createLinearScale[Output /* <: NumberValue */](
    hasMinMaxStackedReverseClampNice: ScaleLinearSpec,
    data: ComputedSerieAxis[Output],
    size: Double,
    axis: ScaleAxis
  ): ScaleLinear[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLinearScale")(hasMinMaxStackedReverseClampNice.asInstanceOf[js.Any], data.asInstanceOf[js.Any], size.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[ScaleLinear[Double]]
}
