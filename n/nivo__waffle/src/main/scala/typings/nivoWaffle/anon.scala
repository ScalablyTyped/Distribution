package typings.nivoWaffle

import typings.nivoWaffle.distTypesTypesMod.Cell
import typings.nivoWaffle.distTypesTypesMod.ComputedDatum
import typings.nivoWaffle.distTypesTypesMod.Datum
import typings.nivoWaffle.distTypesTypesMod.DatumId
import typings.nivoWaffle.distTypesTypesMod.EmptyCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CellSize extends StObject {
    
    var cellSize: Double
    
    var cells: js.Array[EmptyCell]
    
    var origin: X
  }
  object CellSize {
    
    inline def apply(cellSize: Double, cells: js.Array[EmptyCell], origin: X): CellSize = {
      val __obj = js.Dynamic.literal(cellSize = cellSize.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellSize] (val x: Self) extends AnyVal {
      
      inline def setCellSize(value: Double): Self = StObject.set(x, "cellSize", value.asInstanceOf[js.Any])
      
      inline def setCells(value: js.Array[EmptyCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsVarargs(value: EmptyCell*): Self = StObject.set(x, "cells", js.Array(value*))
      
      inline def setOrigin(value: X): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    }
  }
  
  trait Color extends StObject {
    
    var color: String
    
    var id: DatumId
    
    var label: DatumId
  }
  object Color {
    
    inline def apply(color: String, id: DatumId, label: DatumId): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setId(value: DatumId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: DatumId): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComputedData[RawDatum /* <: Datum */] extends StObject {
    
    var computedData: js.Array[ComputedDatum[RawDatum]]
    
    def getBorderColor(d: Cell[RawDatum]): Any
    
    var grid: CellSize
    
    var legendData: js.Array[Color]
  }
  object ComputedData {
    
    inline def apply[RawDatum /* <: Datum */](
      computedData: js.Array[ComputedDatum[RawDatum]],
      getBorderColor: Cell[RawDatum] => Any,
      grid: CellSize,
      legendData: js.Array[Color]
    ): ComputedData[RawDatum] = {
      val __obj = js.Dynamic.literal(computedData = computedData.asInstanceOf[js.Any], getBorderColor = js.Any.fromFunction1(getBorderColor), grid = grid.asInstanceOf[js.Any], legendData = legendData.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputedData[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComputedData[?], RawDatum /* <: Datum */] (val x: Self & ComputedData[RawDatum]) extends AnyVal {
      
      inline def setComputedData(value: js.Array[ComputedDatum[RawDatum]]): Self = StObject.set(x, "computedData", value.asInstanceOf[js.Any])
      
      inline def setComputedDataVarargs(value: ComputedDatum[RawDatum]*): Self = StObject.set(x, "computedData", js.Array(value*))
      
      inline def setGetBorderColor(value: Cell[RawDatum] => Any): Self = StObject.set(x, "getBorderColor", js.Any.fromFunction1(value))
      
      inline def setGrid(value: CellSize): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setLegendData(value: js.Array[Color]): Self = StObject.set(x, "legendData", value.asInstanceOf[js.Any])
      
      inline def setLegendDataVarargs(value: Color*): Self = StObject.set(x, "legendData", js.Array(value*))
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
