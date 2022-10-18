package typings.nivoHeatmap

import typings.nivoHeatmap.distTypesTypesMod.CellComponentProps
import typings.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHeatMapCellCircleMod {
  
  @JSImport("@nivo/heatmap/dist/types/HeatMapCellCircle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def HeatMapCellCircle[Datum /* <: HeatMapDatum */](
    hasCellBorderWidthAnimatedPropsOnMouseEnterOnMouseMoveOnMouseLeaveOnClickEnableLabels: CellComponentProps[Datum]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeatMapCellCircle")(hasCellBorderWidthAnimatedPropsOnMouseEnterOnMouseMoveOnMouseLeaveOnClickEnableLabels.asInstanceOf[js.Any]).asInstanceOf[Element]
}
