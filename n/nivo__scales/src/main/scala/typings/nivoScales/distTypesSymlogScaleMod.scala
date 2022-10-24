package typings.nivoScales

import typings.nivoScales.distTypesTypesMod.ComputedSerieAxis
import typings.nivoScales.distTypesTypesMod.ScaleAxis
import typings.nivoScales.distTypesTypesMod.ScaleSymlog
import typings.nivoScales.distTypesTypesMod.ScaleSymlogSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSymlogScaleMod {
  
  @JSImport("@nivo/scales/dist/types/symlogScale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSymlogScale(param0: ScaleSymlogSpec, data: ComputedSerieAxis[Double], size: Double, axis: ScaleAxis): ScaleSymlog = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymlogScale")(param0.asInstanceOf[js.Any], data.asInstanceOf[js.Any], size.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[ScaleSymlog]
}
