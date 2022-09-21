package typings.nivoScatterplot

import typings.nivoScatterplot.typesMod.ScatterPlotDatum
import typings.nivoScatterplot.typesMod.ScatterPlotSvgProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scatterPlotMod {
  
  @JSImport("@nivo/scatterplot/dist/types/ScatterPlot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ScatterPlot[RawDatum /* <: ScatterPlotDatum */](hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps: ScatterPlotSvgProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ScatterPlot")(hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
