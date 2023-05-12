package typings.nivoGrid

import typings.nivoGrid.distTypesTypesMod.GridCell
import typings.nivoGrid.distTypesTypesMod.GridFillDirection
import typings.nivoGrid.distTypesTypesMod.Vertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(): js.Array[Vertex] = js.native
    
    def addLeft(vertices: Vertex*): Unit = js.native
    
    def addRight(vertices: Vertex*): Unit = js.native
    
    def debug(): Left = js.native
  }
  
  trait CellHeight[C /* <: GridCell */] extends StObject {
    
    var cellHeight: Double
    
    var cellWidth: Double
    
    var cells: js.Array[C]
    
    var x: Double
    
    var y: Double
  }
  object CellHeight {
    
    inline def apply[C /* <: GridCell */](cellHeight: Double, cellWidth: Double, cells: js.Array[C], x: Double, y: Double): CellHeight[C] = {
      val __obj = js.Dynamic.literal(cellHeight = cellHeight.asInstanceOf[js.Any], cellWidth = cellWidth.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellHeight[C]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellHeight[?], C /* <: GridCell */] (val x: Self & CellHeight[C]) extends AnyVal {
      
      inline def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
      
      inline def setCellWidth(value: Double): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
      
      inline def setCells(value: js.Array[C]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsVarargs(value: C*): Self = StObject.set(x, "cells", js.Array(value*))
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Columns extends StObject {
    
    var columns: Double
    
    var height: Double
    
    var padding: Double
    
    var rows: Double
    
    var square: Boolean
    
    var width: Double
  }
  object Columns {
    
    inline def apply(columns: Double, height: Double, padding: Double, rows: Double, square: Boolean, width: Double): Columns = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], square = square.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Columns]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setSquare(value: Boolean): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Extend[C /* <: GridCell */] extends StObject {
    
    var columns: Double
    
    var extend: js.UndefOr[js.Function2[/* cell */ GridCell, /* origin */ js.Tuple2[Double, Double], C]] = js.undefined
    
    var fillDirection: js.UndefOr[GridFillDirection] = js.undefined
    
    var height: Double
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var rows: Double
    
    var square: js.UndefOr[Boolean] = js.undefined
    
    var width: Double
  }
  object Extend {
    
    inline def apply[C /* <: GridCell */](columns: Double, height: Double, rows: Double, width: Double): Extend[C] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extend[C]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Extend[?], C /* <: GridCell */] (val x: Self & Extend[C]) extends AnyVal {
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setExtend(value: (/* cell */ GridCell, /* origin */ js.Tuple2[Double, Double]) => C): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
      
      inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
      
      inline def setFillDirection(value: GridFillDirection): Self = StObject.set(x, "fillDirection", value.asInstanceOf[js.Any])
      
      inline def setFillDirectionUndefined: Self = StObject.set(x, "fillDirection", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setSquare(value: Boolean): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Left extends StObject {
    
    var left: js.Array[Vertex]
    
    var right: js.Array[Vertex]
  }
  object Left {
    
    inline def apply(left: js.Array[Vertex], right: js.Array[Vertex]): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
      
      inline def setLeft(value: js.Array[Vertex]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftVarargs(value: Vertex*): Self = StObject.set(x, "left", js.Array(value*))
      
      inline def setRight(value: js.Array[Vertex]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightVarargs(value: Vertex*): Self = StObject.set(x, "right", js.Array(value*))
    }
  }
}
