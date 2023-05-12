package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeometryMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/geometry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("misc-utils-of-mine-generic/dist/src/geometry", "Point")
  @js.native
  open class Point protected () extends StObject {
    def this(x: Double, y: Double) = this()
    
    def add(x: Double, y: Double): this.type = js.native
    
    def equals(x: Double, y: Double): Boolean = js.native
    
    def isZero(): Boolean = js.native
    
    def map(f: NumberMapFn): this.type = js.native
    
    def scale(s: Double): this.type = js.native
    
    def set(x: Double, y: Double): this.type = js.native
    
    def subtract(x: Double, y: Double): this.type = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  
  @JSImport("misc-utils-of-mine-generic/dist/src/geometry", "Rect")
  @js.native
  open class Rect protected () extends StObject {
    def this(left: Double, top: Double, right: Double, bottom: Double) = this()
    
    /**
      * Blends two rectangles together.
      * @param rect Rectangle to blend this one with
      * @param scalar Ratio from 0 (returns a clone of this rect) to 1 (clone of rect).
      * @return New blended rectangle.
      */
    def blend(rect: Rect, scalar: Double): Rect = js.native
    
    var bottom: Double = js.native
    
    def center(): Point = js.native
    
    def contains(other: Rect): Boolean = js.native
    
    def copyFrom(other: Rect): this.type = js.native
    
    def equals(): js.UndefOr[Boolean] = js.native
    def equals(other: Rect): js.UndefOr[Boolean] = js.native
    
    /**
      * Expand this rectangle to the union of both rectangles.
      */
    def expandToContain(other: Rect): this.type = js.native
    
    def height: Double = js.native
    def height_=(v: Double): Unit = js.native
    
    /**
      * Grows or shrinks the rectangle while keeping the center point.
      * Accepts single multipler, or separate for both axes.
      */
    def inflate(xscl: Double, yscl: Double): this.type = js.native
    
    /**
      * Grows or shrinks the rectangle by fixed amount while keeping the center point.
      * Accepts single fixed amount
      */
    def inflateFixed(fixed: Double): this.type = js.native
    
    def intersect(other: Rect): Rect = js.native
    
    def intersects(other: Rect): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    var left: Double = js.native
    
    def map(f: NumberMapFn): this.type = js.native
    
    /**
      * Restrict area of this rectangle to the intersection of both rectangles.
      */
    def restrictTo(other: Rect): this.type = js.native
    
    var right: Double = js.native
    
    /**
      * Expands to the smallest rectangle that contains original rectangle and is bounded
      * by lines with integer coefficients.
      */
    def round(): this.type = js.native
    
    def scale(xscl: Double, yscl: Double): this.type = js.native
    
    def setBounds(l: Double, t: Double, r: Double, b: Double): this.type = js.native
    
    def setRect(x: Double, y: Double, w: Double, h: Double): this.type = js.native
    
    /**
      * Subtract other area from this. Returns array of rects whose union is this-other.
      */
    def subtract(other: Rect): js.Array[Rect] = js.native
    
    var top: Double = js.native
    
    def translate(x: Double, y: Double): this.type = js.native
    
    /**
      * Ensure this rectangle is inside the other, if possible. Preserves w, h.
      */
    def translateInside(other: Rect): this.type = js.native
    
    /**
      * Return a new rect that is the union of that one and this one
      */
    def union(other: Rect): Rect = js.native
    
    def width: Double = js.native
    def width_=(v: Double): Unit = js.native
    
    def x: Double = js.native
    def x_=(v: Double): Unit = js.native
    
    def y: Double = js.native
    def y_=(v: Double): Unit = js.native
  }
  
  inline def pointInside(p: IPoint, viewport: IRect): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointInside")(p.asInstanceOf[js.Any], viewport.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait IPoint extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object IPoint {
    
    inline def apply(x: Double, y: Double): IPoint = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPoint] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRect
    extends StObject
       with IPoint {
    
    var height: Double
    
    var width: Double
  }
  object IRect {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): IRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRect] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type NumberMapFn = js.Function1[/* n */ Double, Double]
}
