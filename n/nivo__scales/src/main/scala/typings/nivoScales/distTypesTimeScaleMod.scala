package typings.nivoScales

import typings.d3Scale.mod.NumberValue
import typings.nivoScales.distTypesTypesMod.ComputedSerieAxis
import typings.nivoScales.distTypesTypesMod.ScaleTime
import typings.nivoScales.distTypesTypesMod.ScaleTimeSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTimeScaleMod {
  
  @JSImport("@nivo/scales/dist/types/timeScale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTimeScale[Input /* <: js.Date | NumberValue */](
    hasFormatPrecisionMinMaxUseUTCNice: ScaleTimeSpec,
    data: ComputedSerieAxis[String | js.Date],
    size: Double
  ): ScaleTime[Input] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTimeScale")(hasFormatPrecisionMinMaxUseUTCNice.asInstanceOf[js.Any], data.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[ScaleTime[Input]]
}
