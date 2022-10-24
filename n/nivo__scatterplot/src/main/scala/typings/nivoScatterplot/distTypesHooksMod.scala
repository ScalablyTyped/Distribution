package typings.nivoScatterplot

import typings.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typings.nivoAnnotations.distTypesTypesMod.BoundAnnotation
import typings.nivoScatterplot.anon.Colors
import typings.nivoScatterplot.anon.LegendData
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotDatum
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotNodeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/scatterplot/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useScatterPlot[RawDatum /* <: ScatterPlotDatum */](param0: Colors[RawDatum]): LegendData[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useScatterPlot")(param0.asInstanceOf[js.Any]).asInstanceOf[LegendData[RawDatum]]
  
  inline def useScatterPlotAnnotations[RawDatum /* <: ScatterPlotDatum */](
    items: js.Array[ScatterPlotNodeData[RawDatum]],
    annotations: js.Array[AnnotationMatcher[ScatterPlotNodeData[RawDatum]]]
  ): js.Array[BoundAnnotation[ScatterPlotNodeData[RawDatum]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useScatterPlotAnnotations")(items.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any])).asInstanceOf[js.Array[BoundAnnotation[ScatterPlotNodeData[RawDatum]]]]
}
