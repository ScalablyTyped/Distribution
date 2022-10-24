package typings.nivoAxes

import typings.nivoAxes.anon.AnimatedProps
import typings.nivoAxes.anon.Left
import typings.nivoAxes.anon.Length
import typings.nivoAxes.anon.Lines
import typings.nivoAxes.anon.Width
import typings.nivoAxes.distTypesTypesMod.AxisProps
import typings.nivoAxes.distTypesTypesMod.AxisTickProps
import typings.nivoScales.distTypesTypesMod.ScaleValue
import typings.react.mod.MemoExoticComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsMod {
  
  @JSImport("@nivo/axes/dist/types/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nivo/axes/dist/types/components", "Axes")
  @js.native
  val Axes: MemoExoticComponent[js.Function1[/* param0 */ Left[ScaleValue, ScaleValue], Element]] = js.native
  
  inline def Axis[Value /* <: ScaleValue */](param0: AxisProps[Value] & Length[Value]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Axis")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def AxisTick[Value /* <: ScaleValue */](param0: AxisTickProps[Value]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AxisTick")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@nivo/axes/dist/types/components", "Grid")
  @js.native
  val Grid: MemoExoticComponent[js.Function1[/* param0 */ Width[ScaleValue, ScaleValue], Element]] = js.native
  
  @JSImport("@nivo/axes/dist/types/components", "GridLine")
  @js.native
  val GridLine: MemoExoticComponent[js.Function1[/* param0 */ AnimatedProps, Element]] = js.native
  
  @JSImport("@nivo/axes/dist/types/components", "GridLines")
  @js.native
  val GridLines: MemoExoticComponent[js.Function1[/* param0 */ Lines, Element]] = js.native
}
