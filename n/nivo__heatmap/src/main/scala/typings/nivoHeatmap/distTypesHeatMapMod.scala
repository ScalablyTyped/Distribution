package typings.nivoHeatmap

import typings.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typings.nivoHeatmap.distTypesTypesMod.HeatMapSvgProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHeatMapMod {
  
  @JSImport("@nivo/heatmap/dist/types/HeatMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def HeatMap[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](param0: HeatMapSvgProps[Datum, ExtraProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeatMap")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
