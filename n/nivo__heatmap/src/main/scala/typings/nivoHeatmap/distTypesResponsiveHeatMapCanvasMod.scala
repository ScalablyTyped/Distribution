package typings.nivoHeatmap

import typings.nivoHeatmap.distTypesTypesMod.HeatMapCanvasProps
import typings.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typings.nivoHeatmap.nivoHeatmapStrings.height
import typings.nivoHeatmap.nivoHeatmapStrings.width
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveHeatMapCanvasMod {
  
  @JSImport("@nivo/heatmap/dist/types/ResponsiveHeatMapCanvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveHeatMapCanvas[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](props: Omit[HeatMapCanvasProps[Datum, ExtraProps], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveHeatMapCanvas")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
