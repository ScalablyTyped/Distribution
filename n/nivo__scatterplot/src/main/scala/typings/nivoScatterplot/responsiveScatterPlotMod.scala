package typings.nivoScatterplot

import typings.nivoScatterplot.nivoScatterplotStrings.height
import typings.nivoScatterplot.nivoScatterplotStrings.width
import typings.nivoScatterplot.typesMod.ScatterPlotDatum
import typings.nivoScatterplot.typesMod.ScatterPlotSvgProps
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responsiveScatterPlotMod {
  
  @JSImport("@nivo/scatterplot/dist/types/ResponsiveScatterPlot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveScatterPlot[RawDatum /* <: ScatterPlotDatum */](props: Omit[ScatterPlotSvgProps[RawDatum], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveScatterPlot")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
