package typings.nivoAxes

import typings.nivoAxes.anon.Engine
import typings.nivoAxes.anon.Height
import typings.nivoAxes.anon.TextAlign
import typings.nivoAxes.typesMod.Line
import typings.nivoAxes.typesMod.ValueFormatter
import typings.nivoScales.typesMod.AnyScale
import typings.nivoScales.typesMod.ScaleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeMod {
  
  @JSImport("@nivo/axes/dist/types/compute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeCartesianTicks[Value /* <: ScaleValue */](hasAxisScaleTicksPositionTickValuesTickSizeTickPaddingTickRotationEngine: Engine[Value]): TextAlign[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCartesianTicks")(hasAxisScaleTicksPositionTickValuesTickSizeTickPaddingTickRotationEngine.asInstanceOf[js.Any]).asInstanceOf[TextAlign[Value]]
  
  inline def computeGridLines[Value /* <: ScaleValue */](hasWidthHeightScaleAxis_values: Height[Value]): js.Array[Line] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeGridLines")(hasWidthHeightScaleAxis_values.asInstanceOf[js.Any]).asInstanceOf[js.Array[Line]]
  
  inline def getFormatter[Value /* <: ScaleValue */](format: String, scale: AnyScale): js.UndefOr[ValueFormatter[Value]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatter")(format.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ValueFormatter[Value]]]
  inline def getFormatter[Value /* <: ScaleValue */](format: Unit, scale: AnyScale): js.UndefOr[ValueFormatter[Value]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatter")(format.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ValueFormatter[Value]]]
  inline def getFormatter[Value /* <: ScaleValue */](format: ValueFormatter[Value], scale: AnyScale): js.UndefOr[ValueFormatter[Value]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatter")(format.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ValueFormatter[Value]]]
}
