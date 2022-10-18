package typings.nivoHeatmap

import typings.nivoHeatmap.distTypesTypesMod.CellComponentProps
import typings.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHeatMapCellRectMod {
  
  @JSImport("@nivo/heatmap/dist/types/HeatMapCellRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def HeatMapCellRect[Datum /* <: HeatMapDatum */](
    hasCellBorderWidthBorderRadiusAnimatedPropsOnMouseEnterOnMouseMoveOnMouseLeaveOnClickEnableLabels: CellComponentProps[Datum]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeatMapCellRect")(hasCellBorderWidthBorderRadiusAnimatedPropsOnMouseEnterOnMouseMoveOnMouseLeaveOnClickEnableLabels.asInstanceOf[js.Any]).asInstanceOf[Element]
}
