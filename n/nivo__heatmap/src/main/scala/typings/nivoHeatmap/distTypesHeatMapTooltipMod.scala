package typings.nivoHeatmap

import typings.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typings.nivoHeatmap.distTypesTypesMod.TooltipProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHeatMapTooltipMod {
  
  @JSImport("@nivo/heatmap/dist/types/HeatMapTooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def HeatMapTooltip[Datum /* <: HeatMapDatum */](param0: TooltipProps[Datum]): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("HeatMapTooltip")(param0.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
}
