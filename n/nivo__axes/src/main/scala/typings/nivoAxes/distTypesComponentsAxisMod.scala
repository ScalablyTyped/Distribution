package typings.nivoAxes

import typings.nivoAxes.anon.Length
import typings.nivoAxes.distTypesTypesMod.AxisProps
import typings.nivoScales.distTypesTypesMod.ScaleValue
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsAxisMod {
  
  @JSImport("@nivo/axes/dist/types/components/Axis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Axis[Value /* <: ScaleValue */](param0: AxisProps[Value] & Length[Value]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Axis")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
