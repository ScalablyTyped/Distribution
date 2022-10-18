package typings.nivoHeatmap

import typings.nivoHeatmap.distTypesTypesMod.CellComponent
import typings.nivoHeatmap.distTypesTypesMod.CellShape
import typings.nivoHeatmap.distTypesTypesMod.ComputedCell
import typings.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typings.nivoHeatmap.distTypesTypesMod.TooltipComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHeatMapCellsMod {
  
  @JSImport("@nivo/heatmap/dist/types/HeatMapCells", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def HeatMapCells[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](
    hasCellsCellComponentBorderRadiusBorderWidthIsInteractiveSetActiveCellOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltipEnableLabels: HeatMapCellsProps[Datum, ExtraProps]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeatMapCells")(hasCellsCellComponentBorderRadiusBorderWidthIsInteractiveSetActiveCellOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltipEnableLabels.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait HeatMapCellsProps[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */] extends StObject {
    
    var borderRadius: NonNullable[js.UndefOr[Double]] = js.native
    
    var borderWidth: NonNullable[js.UndefOr[Double]] = js.native
    
    var cellComponent: NonNullable[js.UndefOr[CellShape | CellComponent[Datum]]] = js.native
    
    var cells: js.Array[ComputedCell[Datum]] = js.native
    
    var enableLabels: NonNullable[js.UndefOr[Boolean]] = js.native
    
    var isInteractive: NonNullable[js.UndefOr[Boolean]] = js.native
    
    var onClick: js.UndefOr[
        js.Function2[
          /* cell */ ComputedCell[Datum], 
          /* event */ MouseEvent[typings.std.Element, NativeMouseEvent], 
          Unit
        ]
      ] = js.native
    
    var onMouseEnter: js.UndefOr[
        js.Function2[
          /* cell */ ComputedCell[Datum], 
          /* event */ MouseEvent[typings.std.Element, NativeMouseEvent], 
          Unit
        ]
      ] = js.native
    
    var onMouseLeave: js.UndefOr[
        js.Function2[
          /* cell */ ComputedCell[Datum], 
          /* event */ MouseEvent[typings.std.Element, NativeMouseEvent], 
          Unit
        ]
      ] = js.native
    
    var onMouseMove: js.UndefOr[
        js.Function2[
          /* cell */ ComputedCell[Datum], 
          /* event */ MouseEvent[typings.std.Element, NativeMouseEvent], 
          Unit
        ]
      ] = js.native
    
    def setActiveCell(): Unit = js.native
    def setActiveCell(cell: ComputedCell[Datum]): Unit = js.native
    
    var tooltip: NonNullable[js.UndefOr[TooltipComponent[Datum]]] = js.native
  }
}
