package typings.nivoScatterplot

import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotDatum
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotSvgProps
import typings.nivoScatterplot.nivoScatterplotStrings.height
import typings.nivoScatterplot.nivoScatterplotStrings.width
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveScatterPlotMod {
  
  @JSImport("@nivo/scatterplot/dist/types/ResponsiveScatterPlot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveScatterPlot[RawDatum /* <: ScatterPlotDatum */](props: Omit[ScatterPlotSvgProps[RawDatum], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveScatterPlot")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
