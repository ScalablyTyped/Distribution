package typings.nivoWaffle

import typings.nivoWaffle.anon.X
import typings.nivoWaffle.distTypesTypesMod.Cell
import typings.nivoWaffle.distTypesTypesMod.ComputedDatum
import typings.nivoWaffle.distTypesTypesMod.Datum
import typings.nivoWaffle.distTypesTypesMod.EmptyCell
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCellsSvgMod {
  
  @JSImport("@nivo/waffle/dist/types/CellsSvg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CellsSvg[RawDatum /* <: Datum */](param0: CellsSvgProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CellsSvg")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait CellsSvgProps[RawDatum /* <: Datum */] extends StObject {
    
    var borderWidth: Double
    
    var cellSize: Double
    
    var cells: js.Array[EmptyCell]
    
    var computedData: js.Array[ComputedDatum[RawDatum]]
    
    def getBorderColor(cell: Cell[RawDatum]): String
    
    var origin: X
  }
  object CellsSvgProps {
    
    inline def apply[RawDatum /* <: Datum */](
      borderWidth: Double,
      cellSize: Double,
      cells: js.Array[EmptyCell],
      computedData: js.Array[ComputedDatum[RawDatum]],
      getBorderColor: Cell[RawDatum] => String,
      origin: X
    ): CellsSvgProps[RawDatum] = {
      val __obj = js.Dynamic.literal(borderWidth = borderWidth.asInstanceOf[js.Any], cellSize = cellSize.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], computedData = computedData.asInstanceOf[js.Any], getBorderColor = js.Any.fromFunction1(getBorderColor), origin = origin.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellsSvgProps[RawDatum]]
    }
    
    extension [Self <: CellsSvgProps[?], RawDatum /* <: Datum */](x: Self & CellsSvgProps[RawDatum]) {
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setCellSize(value: Double): Self = StObject.set(x, "cellSize", value.asInstanceOf[js.Any])
      
      inline def setCells(value: js.Array[EmptyCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsVarargs(value: EmptyCell*): Self = StObject.set(x, "cells", js.Array(value*))
      
      inline def setComputedData(value: js.Array[ComputedDatum[RawDatum]]): Self = StObject.set(x, "computedData", value.asInstanceOf[js.Any])
      
      inline def setComputedDataVarargs(value: ComputedDatum[RawDatum]*): Self = StObject.set(x, "computedData", js.Array(value*))
      
      inline def setGetBorderColor(value: Cell[RawDatum] => String): Self = StObject.set(x, "getBorderColor", js.Any.fromFunction1(value))
      
      inline def setOrigin(value: X): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    }
  }
}
