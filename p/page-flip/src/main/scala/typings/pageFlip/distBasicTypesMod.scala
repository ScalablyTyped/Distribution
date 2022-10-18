package typings.pageFlip

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBasicTypesMod {
  
  trait PageRect extends StObject {
    
    var height: Double
    
    var left: Double
    
    /** Page width. If portrait mode is equal to the width of the book. In landscape mode - half of the total width. */
    var pageWidth: Double
    
    var top: Double
    
    var width: Double
  }
  object PageRect {
    
    inline def apply(height: Double, left: Double, pageWidth: Double, top: Double, width: Double): PageRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], pageWidth = pageWidth.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageRect]
    }
    
    extension [Self <: PageRect](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setPageWidth(value: Double): Self = StObject.set(x, "pageWidth", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rect extends StObject {
    
    var height: Double
    
    var left: Double
    
    var top: Double
    
    var width: Double
  }
  object Rect {
    
    inline def apply(height: Double, left: Double, top: Double, width: Double): Rect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    extension [Self <: Rect](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait RectPoints extends StObject {
    
    /** Coordinates of the bottom left corner */
    var bottomLeft: Point
    
    /** Coordinates of the bottom right corner */
    var bottomRight: Point
    
    /** Coordinates of the top left corner */
    var topLeft: Point
    
    /** Coordinates of the top right corner */
    var topRight: Point
  }
  object RectPoints {
    
    inline def apply(bottomLeft: Point, bottomRight: Point, topLeft: Point, topRight: Point): RectPoints = {
      val __obj = js.Dynamic.literal(bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[RectPoints]
    }
    
    extension [Self <: RectPoints](x: Self) {
      
      inline def setBottomLeft(value: Point): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      inline def setBottomRight(value: Point): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      inline def setTopLeft(value: Point): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      inline def setTopRight(value: Point): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
    }
  }
  
  type Segment = js.Tuple2[Point, Point]
}
