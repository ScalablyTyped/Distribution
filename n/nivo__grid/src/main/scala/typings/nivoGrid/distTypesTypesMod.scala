package typings.nivoGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  trait BoundingBox extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object BoundingBox {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): BoundingBox = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundingBox]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BoundingBox] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait GridCell extends StObject {
    
    var column: Double
    
    var height: Double
    
    var index: Double
    
    var key: String
    
    var row: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object GridCell {
    
    inline def apply(
      column: Double,
      height: Double,
      index: Double,
      key: String,
      row: Double,
      width: Double,
      x: Double,
      y: Double
    ): GridCell = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridCell]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridCell] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoGrid.nivoGridStrings.top
    - typings.nivoGrid.nivoGridStrings.right
    - typings.nivoGrid.nivoGridStrings.bottom
    - typings.nivoGrid.nivoGridStrings.left
  */
  trait GridFillDirection extends StObject
  object GridFillDirection {
    
    inline def bottom: typings.nivoGrid.nivoGridStrings.bottom = "bottom".asInstanceOf[typings.nivoGrid.nivoGridStrings.bottom]
    
    inline def left: typings.nivoGrid.nivoGridStrings.left = "left".asInstanceOf[typings.nivoGrid.nivoGridStrings.left]
    
    inline def right: typings.nivoGrid.nivoGridStrings.right = "right".asInstanceOf[typings.nivoGrid.nivoGridStrings.right]
    
    inline def top: typings.nivoGrid.nivoGridStrings.top = "top".asInstanceOf[typings.nivoGrid.nivoGridStrings.top]
  }
  
  type Vertex = js.Tuple2[Double, Double]
}
