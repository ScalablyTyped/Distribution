package typings.nivoScatterplot

import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotDatum
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotSvgProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesScatterPlotMod {
  
  @JSImport("@nivo/scatterplot/dist/types/ScatterPlot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ScatterPlot[RawDatum /* <: ScatterPlotDatum */](param0: ScatterPlotSvgProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ScatterPlot")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
