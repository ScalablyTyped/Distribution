package typings.nivoScatterplot

import typings.nivoScatterplot.typesMod.ScatterPlotDatum
import typings.nivoScatterplot.typesMod.ScatterPlotNodeProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("@nivo/scatterplot/dist/types/Node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Node[RawDatum /* <: ScatterPlotDatum */](
    hasNodeStyleBlendModeIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClick: ScatterPlotNodeProps[RawDatum]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Node")(hasNodeStyleBlendModeIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClick.asInstanceOf[js.Any]).asInstanceOf[Element]
}
