package typings.nivoHeatmap

import typings.nivoHeatmap.anon.Cells
import typings.nivoHeatmap.anon.Columns
import typings.nivoHeatmap.anon.Data
import typings.nivoHeatmap.anon.Height
import typings.nivoHeatmap.anon.Size
import typings.nivoHeatmap.anon.X
import typings.nivoHeatmap.distTypesTypesMod.ComputedCell
import typings.nivoHeatmap.distTypesTypesMod.HeatMapCommonProps
import typings.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typings.nivoHeatmap.distTypesTypesMod.SizeVariationConfig
import typings.nivoHeatmap.nivoHeatmapBooleans.`false`
import typings.nivoHeatmap.nivoHeatmapStrings.forceSquare
import typings.nivoHeatmap.nivoHeatmapStrings.xInnerPadding
import typings.nivoHeatmap.nivoHeatmapStrings.xOuterPadding
import typings.nivoHeatmap.nivoHeatmapStrings.yInnerPadding
import typings.nivoHeatmap.nivoHeatmapStrings.yOuterPadding
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComputeMod {
  
  @JSImport("@nivo/heatmap/dist/types/compute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeCells[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](
    param0: (Data[Datum, ExtraProps]) & (Pick[
      HeatMapCommonProps[Datum], 
      forceSquare | xInnerPadding | xOuterPadding | yInnerPadding | yOuterPadding
    ])
  ): Cells[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCells")(param0.asInstanceOf[js.Any]).asInstanceOf[Cells[Datum]]
  
  inline def computeLayout(param0: Columns): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("computeLayout")(param0.asInstanceOf[js.Any]).asInstanceOf[Height]
  
  inline def computeSizeScale(size: SizeVariationConfig, min: Double, max: Double): js.Function1[/* value */ Double | Null, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSizeScale")(size.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Double | Null, Double]]
  
  inline def computeSizeScale_false(size: `false`, min: Double, max: Double): js.Function1[/* value */ Double | Null, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSizeScale")(size.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Double | Null, Double]]
  
  inline def getCellAnnotationDimensions[Datum /* <: HeatMapDatum */](cell: ComputedCell[Datum]): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellAnnotationDimensions")(cell.asInstanceOf[js.Any]).asInstanceOf[Size]
  
  inline def getCellAnnotationPosition[Datum /* <: HeatMapDatum */](cell: ComputedCell[Datum]): X = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellAnnotationPosition")(cell.asInstanceOf[js.Any]).asInstanceOf[X]
}
