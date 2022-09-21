package typings.nivoScales

import typings.d3Scale.mod.ScalePoint_
import typings.nivoScales.typesMod.ComputedSerieAxis
import typings.nivoScales.typesMod.ScalePoint
import typings.nivoScales.typesMod.ScalePointSpec
import typings.nivoScales.typesMod.StringValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointScaleMod {
  
  @JSImport("@nivo/scales/dist/types/pointScale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def castPointScale[Input /* <: StringValue */](scale: ScalePoint_[Input]): ScalePoint[Input] = ^.asInstanceOf[js.Dynamic].applyDynamic("castPointScale")(scale.asInstanceOf[js.Any]).asInstanceOf[ScalePoint[Input]]
  
  inline def createPointScale[Input /* <: StringValue */](_spec: ScalePointSpec, data: ComputedSerieAxis[Input], size: Double): ScalePoint[Input] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPointScale")(_spec.asInstanceOf[js.Any], data.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[ScalePoint[Input]]
}
