package typings.nivoScales

import typings.d3Scale.mod.ScalePoint_
import typings.nivoScales.distTypesTypesMod.ComputedSerieAxis
import typings.nivoScales.distTypesTypesMod.ScalePoint
import typings.nivoScales.distTypesTypesMod.ScalePointSpec
import typings.nivoScales.distTypesTypesMod.StringValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPointScaleMod {
  
  @JSImport("@nivo/scales/dist/types/pointScale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def castPointScale[Input /* <: StringValue */](scale: ScalePoint_[Input]): ScalePoint[Input] = ^.asInstanceOf[js.Dynamic].applyDynamic("castPointScale")(scale.asInstanceOf[js.Any]).asInstanceOf[ScalePoint[Input]]
  
  inline def createPointScale[Input /* <: StringValue */](_spec: ScalePointSpec, data: ComputedSerieAxis[Input], size: Double): ScalePoint[Input] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPointScale")(_spec.asInstanceOf[js.Any], data.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[ScalePoint[Input]]
}
