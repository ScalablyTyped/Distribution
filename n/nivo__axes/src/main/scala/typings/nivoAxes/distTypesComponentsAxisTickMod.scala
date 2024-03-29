package typings.nivoAxes

import typings.nivoAxes.distTypesTypesMod.AxisTickProps
import typings.nivoScales.distTypesTypesMod.ScaleValue
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsAxisTickMod {
  
  @JSImport("@nivo/axes/dist/types/components/AxisTick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AxisTick[Value /* <: ScaleValue */](param0: AxisTickProps[Value]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AxisTick")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
