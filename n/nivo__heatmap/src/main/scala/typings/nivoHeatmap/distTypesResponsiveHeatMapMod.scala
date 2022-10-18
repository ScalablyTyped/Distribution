package typings.nivoHeatmap

import typings.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typings.nivoHeatmap.distTypesTypesMod.HeatMapSvgProps
import typings.nivoHeatmap.nivoHeatmapStrings.height
import typings.nivoHeatmap.nivoHeatmapStrings.width
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveHeatMapMod {
  
  @JSImport("@nivo/heatmap/dist/types/ResponsiveHeatMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveHeatMap[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](props: Omit[HeatMapSvgProps[Datum, ExtraProps], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveHeatMap")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
