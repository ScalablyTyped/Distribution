package typings.nivoScales

import typings.nivoScales.typesMod.ComputedSerieAxis
import typings.nivoScales.typesMod.ScaleAxis
import typings.nivoScales.typesMod.ScaleLog
import typings.nivoScales.typesMod.ScaleLogSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logScaleMod {
  
  @JSImport("@nivo/scales/dist/types/logScale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLogScale(hasBaseMinMax: ScaleLogSpec, data: ComputedSerieAxis[Double], size: Double, axis: ScaleAxis): ScaleLog = (^.asInstanceOf[js.Dynamic].applyDynamic("createLogScale")(hasBaseMinMax.asInstanceOf[js.Any], data.asInstanceOf[js.Any], size.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[ScaleLog]
}
