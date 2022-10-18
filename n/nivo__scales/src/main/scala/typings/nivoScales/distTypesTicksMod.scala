package typings.nivoScales

import typings.nivoScales.distTypesTypesMod.AnyScale
import typings.nivoScales.distTypesTypesMod.ScaleValue
import typings.nivoScales.distTypesTypesMod.ScaleWithBandwidth
import typings.nivoScales.distTypesTypesMod.TicksSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTicksMod {
  
  @JSImport("@nivo/scales/dist/types/ticks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def centerScale[Value](scale: ScaleWithBandwidth): ScaleWithBandwidth | (js.Function1[/* d */ Value, Double]) = ^.asInstanceOf[js.Dynamic].applyDynamic("centerScale")(scale.asInstanceOf[js.Any]).asInstanceOf[ScaleWithBandwidth | (js.Function1[/* d */ Value, Double])]
  
  inline def getScaleTicks[Value /* <: ScaleValue */](scale: AnyScale): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScaleTicks")(scale.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def getScaleTicks[Value /* <: ScaleValue */](scale: AnyScale, spec: TicksSpec[Value]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getScaleTicks")(scale.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}
