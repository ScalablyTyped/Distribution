package typings.nivoWaffle

import typings.nivoWaffle.anon.CellSize
import typings.nivoWaffle.anon.ComputedData
import typings.nivoWaffle.anon.Height
import typings.nivoWaffle.nivoWaffleStrings.borderColor
import typings.nivoWaffle.nivoWaffleStrings.colors
import typings.nivoWaffle.nivoWaffleStrings.emptyColor
import typings.nivoWaffle.nivoWaffleStrings.fillDirection
import typings.nivoWaffle.nivoWaffleStrings.padding
import typings.nivoWaffle.nivoWaffleStrings.valueFormat
import typings.nivoWaffle.typesTypesMod.Cell
import typings.nivoWaffle.typesTypesMod.CommonProps
import typings.nivoWaffle.typesTypesMod.ComputedDatum
import typings.nivoWaffle.typesTypesMod.DataProps
import typings.nivoWaffle.typesTypesMod.Datum
import typings.nivoWaffle.typesTypesMod.EmptyCell
import typings.nivoWaffle.typesTypesMod.FillDirection
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("@nivo/waffle/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeCellSize(width: Double, height: Double, rows: Double, columns: Double, padding: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCellSize")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def computeGrid(
    width: Double,
    height: Double,
    rows: Double,
    columns: Double,
    fillDirection: FillDirection,
    padding: Double,
    emptyColor: String
  ): CellSize = (^.asInstanceOf[js.Dynamic].applyDynamic("computeGrid")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], fillDirection.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], emptyColor.asInstanceOf[js.Any])).asInstanceOf[CellSize]
  
  inline def mergeCellsData[RawDatum /* <: Datum */](cells: js.Array[EmptyCell], data: js.Array[ComputedDatum[RawDatum]]): js.Array[Cell[RawDatum]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCellsData")(cells.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell[RawDatum]]]
  
  inline def useMergeCellsData[RawDatum /* <: Datum */](cells: js.Array[EmptyCell], data: js.Array[ComputedDatum[RawDatum]]): js.Array[Cell[RawDatum]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMergeCellsData")(cells.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell[RawDatum]]]
  
  inline def useWaffle[RawDatum /* <: Datum */](
    hasWidthHeightDataValueFormatTotalRowsColumnsFillDirectionPaddingColorsEmptyColorBorderColor: (Pick[
      CommonProps[RawDatum], 
      valueFormat | fillDirection | padding | colors | emptyColor | borderColor
    ]) & DataProps[RawDatum] & Height
  ): ComputedData[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useWaffle")(hasWidthHeightDataValueFormatTotalRowsColumnsFillDirectionPaddingColorsEmptyColorBorderColor.asInstanceOf[js.Any]).asInstanceOf[ComputedData[RawDatum]]
}
