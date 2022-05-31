package typings.poly2tri

import typings.poly2tri.mod.SweepContextOptions
import typings.poly2tri.mod.XY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object poly2tri {
    
    @JSGlobal("poly2tri.Point")
    @js.native
    /**
      * Construct a point
      * @example
      *      const point = new poly2tri.Point(150, 150);
      * @param x    coordinate (0 if undefined)
      * @param y    coordinate (0 if undefined)
      */
    class Point ()
      extends typings.poly2tri.mod.Point {
      def this(x: Double) = this()
      def this(x: Double, y: Double) = this()
      def this(x: Unit, y: Double) = this()
    }
    /* static members */
    object Point {
      
      @JSGlobal("poly2tri.Point")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Add two points component-wise and return the result as a new Point object.
        * @param a - any "Point like" object with {x,y}
        * @param b - any "Point like" object with {x,y}
        * @return the resulting Point object.
        */
      inline def add(a: XY, b: XY): typings.poly2tri.mod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.poly2tri.mod.Point]
      
      /**
        * Compare two points component-wise. Ordered by y axis first, then x axis.
        * @param a - point object with {x,y}
        * @param b - point object with {x,y}
        * @return `< 0` if `a < b` ; `> 0` if `a > b` ; `0` otherwise.
        */
      inline def compare(a: XY, b: XY): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def cross(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def cross(a: Double, b: XY): typings.poly2tri.mod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.poly2tri.mod.Point]
      inline def cross(a: XY, b: Double): typings.poly2tri.mod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.poly2tri.mod.Point]
      /**
        * Perform the cross product on either two points (result is a scalar)
        * or a point and a scalar (result is a point).
        * This function requires two parameters, either may be a Point object or a
        * number.
        * @param  a - Point object or scalar.
        * @param  b - Point object or scalar.
        * @return a Point object or a number, depending on the parameters.
        */
      inline def cross(a: XY, b: XY): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Peform the dot product on two vectors.
        * @param a - any "Point like" object with {x,y}
        * @param b - any "Point like" object with {x,y}
        * @return the dot product
        */
      inline def dot(a: XY, b: XY): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Test two Point objects for equality.
        * @param a - point object with {x,y}
        * @param b - point object with {x,y}
        * @return `true` if `a == b`, `false` otherwise.
        */
      inline def equals(a: XY, b: XY): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /**
        * Multiply a point by a scalar and return the result as a new Point object.
        * @param s - the scalar
        * @param p - any "Point like" object with {x,y}
        * @return the resulting Point object.
        */
      inline def mul(s: Double, p: XY): typings.poly2tri.mod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(s.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[typings.poly2tri.mod.Point]
      
      /**
        * Negate a point component-wise and return the result as a new Point object.
        * @param p - any "Point like" object with {x,y}
        * @return the resulting Point object.
        */
      inline def negate(p: XY): typings.poly2tri.mod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("negate")(p.asInstanceOf[js.Any]).asInstanceOf[typings.poly2tri.mod.Point]
      
      /**
        * Subtract two points component-wise and return the result as a new Point object.
        * @param a - any "Point like" object with {x,y}
        * @param b - any "Point like" object with {x,y}
        * @return the resulting Point object.
        */
      inline def sub(a: XY, b: XY): typings.poly2tri.mod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.poly2tri.mod.Point]
      
      /**
        * Point pretty printing. Delegates to the point's custom "toString()" method if exists,
        * else simply prints x and y coordinates.
        * @example
        *      xy.toString({x:5, y:42})
        *      // → "(5;42)"
        * @example
        *      xy.toString({x:5,y:42,toString:function() {return this.x+":"+this.y;}})
        *      // → "5:42"
        * @param p - point object with {x,y}
        * @returns `"(x;y)"`
        */
      inline def toString(p: XY): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(p.asInstanceOf[js.Any]).asInstanceOf[String]
    }
    
    @JSGlobal("poly2tri.PointError")
    @js.native
    class PointError protected ()
      extends typings.poly2tri.mod.PointError {
      /**
        * Custom exception class to indicate invalid Point values
        * @param message - error message
        * @param points - invalid points
        */
      def this(message: String, points: js.Array[XY]) = this()
    }
    
    @JSGlobal("poly2tri.SweepContext")
    @js.native
    class SweepContext protected ()
      extends typings.poly2tri.mod.SweepContext {
      /**
        * Constructor for the triangulation context.
        * It accepts a simple polyline (with non repeating points),
        * which defines the constrained edges.
        *
        * @example
        *          const contour = [
        *              new poly2tri.Point(100, 100),
        *              new poly2tri.Point(100, 300),
        *              new poly2tri.Point(300, 300),
        *              new poly2tri.Point(300, 100)
        *          ];
        *          const swctx = new poly2tri.SweepContext(contour, {cloneArrays: true});
        * @example
        *          const contour = [{x:100, y:100}, {x:100, y:300}, {x:300, y:300}, {x:300, y:100}];
        *          const swctx = new poly2tri.SweepContext(contour, {cloneArrays: true});
        *
        * @param contour - array of point objects. The points can be either {@linkcode Point} instances,
        *          or any "Point like" custom class with `{x, y}` attributes.
        * @param options - constructor options
        */
      def this(contour: js.Array[XY]) = this()
      def this(contour: js.Array[XY], options: SweepContextOptions) = this()
    }
    
    @JSGlobal("poly2tri.Triangle")
    @js.native
    class Triangle protected ()
      extends typings.poly2tri.mod.Triangle {
      def this(a: XY, b: XY, c: XY) = this()
    }
    
    @JSGlobal("poly2tri.VERSION")
    @js.native
    val VERSION: String = js.native
  }
}
