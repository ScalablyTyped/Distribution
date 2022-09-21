package typings.nivoScales

import typings.nivoScales.typesMod.ComputedSerieAxis
import typings.nivoScales.typesMod.ScaleAxis
import typings.nivoScales.typesMod.ScaleSymlog
import typings.nivoScales.typesMod.ScaleSymlogSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symlogScaleMod {
  
  @JSImport("@nivo/scales/dist/types/symlogScale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSymlogScale(
    hasConstantMinMaxReverse: ScaleSymlogSpec,
    data: ComputedSerieAxis[Double],
    size: Double,
    axis: ScaleAxis
  ): ScaleSymlog = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymlogScale")(hasConstantMinMaxReverse.asInstanceOf[js.Any], data.asInstanceOf[js.Any], size.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[ScaleSymlog]
}
