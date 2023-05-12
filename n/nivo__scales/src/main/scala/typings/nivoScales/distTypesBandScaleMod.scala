package typings.nivoScales

import typings.d3Scale.mod.ScaleBand_
import typings.nivoScales.distTypesTypesMod.ComputedSerieAxis
import typings.nivoScales.distTypesTypesMod.ScaleAxis
import typings.nivoScales.distTypesTypesMod.ScaleBand
import typings.nivoScales.distTypesTypesMod.ScaleBandSpec
import typings.nivoScales.distTypesTypesMod.StringValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBandScaleMod {
  
  @JSImport("@nivo/scales/dist/types/bandScale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def castBandScale[Input /* <: StringValue */](scale: ScaleBand_[Input]): ScaleBand[Input] = ^.asInstanceOf[js.Dynamic].applyDynamic("castBandScale")(scale.asInstanceOf[js.Any]).asInstanceOf[ScaleBand[Input]]
  
  inline def createBandScale[Input /* <: StringValue */](param0: ScaleBandSpec, data: ComputedSerieAxis[Input], size: Double, axis: ScaleAxis): ScaleBand[Input] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBandScale")(param0.asInstanceOf[js.Any], data.asInstanceOf[js.Any], size.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[ScaleBand[Input]]
}
