package typings.nivoHeatmap

import typings.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typings.nivoAnnotations.distTypesTypesMod.BoundAnnotation
import typings.nivoHeatmap.anon.ActiveCell
import typings.nivoHeatmap.anon.Cells
import typings.nivoHeatmap.anon.Data
import typings.nivoHeatmap.anon.Width
import typings.nivoHeatmap.distTypesTypesMod.ComputedCell
import typings.nivoHeatmap.distTypesTypesMod.HeatMapCommonProps
import typings.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typings.nivoHeatmap.nivoHeatmapStrings.activeOpacity
import typings.nivoHeatmap.nivoHeatmapStrings.borderColor
import typings.nivoHeatmap.nivoHeatmapStrings.colors
import typings.nivoHeatmap.nivoHeatmapStrings.emptyColor
import typings.nivoHeatmap.nivoHeatmapStrings.forceSquare
import typings.nivoHeatmap.nivoHeatmapStrings.hoverTarget
import typings.nivoHeatmap.nivoHeatmapStrings.inactiveOpacity
import typings.nivoHeatmap.nivoHeatmapStrings.label
import typings.nivoHeatmap.nivoHeatmapStrings.labelTextColor
import typings.nivoHeatmap.nivoHeatmapStrings.opacity
import typings.nivoHeatmap.nivoHeatmapStrings.sizeVariation
import typings.nivoHeatmap.nivoHeatmapStrings.valueFormat
import typings.nivoHeatmap.nivoHeatmapStrings.xInnerPadding
import typings.nivoHeatmap.nivoHeatmapStrings.xOuterPadding
import typings.nivoHeatmap.nivoHeatmapStrings.yInnerPadding
import typings.nivoHeatmap.nivoHeatmapStrings.yOuterPadding
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/heatmap/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCellAnnotations[Datum /* <: HeatMapDatum */](
    cells: js.Array[ComputedCell[Datum]],
    annotations: js.Array[AnnotationMatcher[ComputedCell[Datum]]]
  ): js.Array[BoundAnnotation[ComputedCell[Datum]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCellAnnotations")(cells.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any])).asInstanceOf[js.Array[BoundAnnotation[ComputedCell[Datum]]]]
  
  inline def useComputeCells[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](
    param0: (Data[Datum, ExtraProps]) & (Pick[
      HeatMapCommonProps[Datum], 
      forceSquare | xInnerPadding | xOuterPadding | yInnerPadding | yOuterPadding
    ])
  ): Cells[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useComputeCells")(param0.asInstanceOf[js.Any]).asInstanceOf[Cells[Datum]]
  
  inline def useHeatMap[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](
    param0: (Width[Datum, ExtraProps]) & (Partial[
      Pick[
        HeatMapCommonProps[Datum], 
        borderColor | opacity | label | labelTextColor | valueFormat | forceSquare | sizeVariation | xInnerPadding | xOuterPadding | yInnerPadding | yOuterPadding | activeOpacity | inactiveOpacity | colors | emptyColor | hoverTarget
      ]
    ])
  ): ActiveCell[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHeatMap")(param0.asInstanceOf[js.Any]).asInstanceOf[ActiveCell[Datum]]
}
