package typings.poly2tri

import typings.poly2tri.anon.Max
import typings.poly2tri.poly2triNumbers.`0`
import typings.poly2tri.poly2triNumbers.`1`
import typings.poly2tri.poly2triNumbers.`2`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("poly2tri", "Point")
  @js.native
  /**
    * Construct a point
    * @example
    *      const point = new poly2tri.Point(150, 150);
    * @param x    coordinate (0 if undefined)
    * @param y    coordinate (0 if undefined)
    */
  class Point ()
    extends StObject
       with IPointLike {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    
    /**
      * Add another Point object to this instance. (component-wise)
      * @param n - Point object.
      * @return this (for chaining)
      */
    def add(n: XY): Point = js.native
    
    /**
      * Test this Point object with another for equality.
      * @param p - any "Point like" object with {x,y}
      * @return `true` if same x and y coordinates, `false` otherwise.
      */
    def equals(p: XY): Boolean = js.native
    
    /**
      * Return the distance of this Point instance from the origin.
      * @return distance
      */
    def length(): Double = js.native
    
    /**
      * Multiply this Point instance by a scalar. (component-wise)
      * @param s   scalar.
      * @return this (for chaining)
      */
    def mul(s: Double): Point = js.native
    
    /**
      * Negate this Point instance. (component-wise)
      * @return this (for chaining)
      */
    def negate(): Point = js.native
    
    /**
      * Normalize this Point instance (as a vector).
      * @return The original distance of this instance from the origo.
      */
    def normalize(): Double = js.native
    
    /**
      * Set the coordinates of this instance.
      * @param {number} x   coordinate
      * @param {number} y   coordinate
      * @return this (for chaining)
      */
    def set(x: Double, y: Double): Point = js.native
    
    /**
      * Set this Point instance to the origin `(0; 0)`
      * @return this (for chaining)
      */
    def set_zero(): Point = js.native
    
    /**
      * Subtract this Point instance with another point given. (component-wise)
      * @param n - Point object.
      * @return this (for chaining)
      */
    def sub(n: XY): Point = js.native
    
    /**
      * JSON output, only coordinates
      * @example
      *      JSON.stringify(new poly2tri.Point(1,2))
      *      // → '{"x":1,"y":2}'
      */
    def toJSON(): js.Any = js.native
    
    /** x coordinate */
    /* CompleteClass */
    var x: Double = js.native
    
    /** y coordinate */
    /* CompleteClass */
    var y: Double = js.native
  }
  /* static members */
  object Point {
    
    @JSImport("poly2tri", "Point")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Add two points component-wise and return the result as a new Point object.
      * @param a - any "Point like" object with {x,y}
      * @param b - any "Point like" object with {x,y}
      * @return the resulting Point object.
      */
    inline def add(a: XY, b: XY): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    /**
      * Compare two points component-wise. Ordered by y axis first, then x axis.
      * @param a - point object with {x,y}
      * @param b - point object with {x,y}
      * @return `< 0` if `a < b` ; `> 0` if `a > b` ; `0` otherwise.
      */
    inline def compare(a: XY, b: XY): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def cross(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def cross(a: Double, b: XY): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Point]
    inline def cross(a: XY, b: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Point]
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
    inline def mul(s: Double, p: XY): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(s.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    /**
      * Negate a point component-wise and return the result as a new Point object.
      * @param p - any "Point like" object with {x,y}
      * @return the resulting Point object.
      */
    inline def negate(p: XY): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("negate")(p.asInstanceOf[js.Any]).asInstanceOf[Point]
    
    /**
      * Subtract two points component-wise and return the result as a new Point object.
      * @param a - any "Point like" object with {x,y}
      * @param b - any "Point like" object with {x,y}
      * @return the resulting Point object.
      */
    inline def sub(a: XY, b: XY): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Point]
    
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
  
  @JSImport("poly2tri", "PointError")
  @js.native
  class PointError protected ()
    extends StObject
       with Error {
    /**
      * Custom exception class to indicate invalid Point values
      * @param message - error message
      * @param points - invalid points
      */
    def this(message: String, points: js.Array[XY]) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Invalid points
      */
    val points: js.Array[XY] = js.native
  }
  
  @JSImport("poly2tri", "SweepContext")
  @js.native
  class SweepContext protected () extends StObject {
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
    
    /**
      * Add a hole to the constraints
      * @example
      *      const swctx = new poly2tri.SweepContext(contour);
      *      const hole = [
      *          new poly2tri.Point(200, 200),
      *          new poly2tri.Point(200, 250),
      *          new poly2tri.Point(250, 250)
      *      ];
      *      swctx.addHole(hole);
      * @example
      *      const swctx = new poly2tri.SweepContext(contour);
      *      swctx.addHole([{x:200, y:200}, {x:200, y:250}, {x:250, y:250}]);
      *
      * @param polyline - array of "Point like" objects with {x,y}
      */
    def addHole(polyline: js.Array[XY]): SweepContext = js.native
    
    /**
      * Add several holes to the constraints.
      * @example
      *      const swctx = new poly2tri.SweepContext(contour);
      *      const holes = [
      *          [ new poly2tri.Point(200, 200), new poly2tri.Point(200, 250), new poly2tri.Point(250, 250) ],
      *          [ new poly2tri.Point(300, 300), new poly2tri.Point(300, 350), new poly2tri.Point(350, 350) ]
      *      ];
      *      swctx.addHoles(holes);
      * @example
      *      const swctx = new poly2tri.SweepContext(contour);
      *      const holes = [
      *          [{x:200, y:200}, {x:200, y:250}, {x:250, y:250}],
      *          [{x:300, y:300}, {x:300, y:350}, {x:350, y:350}]
      *      ];
      *      swctx.addHoles(holes);
      *
      * @param holes - array of array of "Point like" objects with {x,y}
      */
    def addHoles(holes: js.Array[js.Array[XY]]): SweepContext = js.native
    
    /**
      * Add a Steiner point to the constraints
      * @example
      *      const swctx = new poly2tri.SweepContext(contour);
      *      const point = new poly2tri.Point(150, 150);
      *      swctx.addPoint(point);
      * @example
      *      const swctx = new poly2tri.SweepContext(contour);
      *      swctx.addPoint({x:150, y:150});
      *
      * @param point - any "Point like" object with {x,y}
      */
    def addPoint(point: XY): SweepContext = js.native
    
    /**
      * Add several Steiner points to the constraints
      * @example
      *      const swctx = new poly2tri.SweepContext(contour);
      *      const points = [
      *          new poly2tri.Point(150, 150),
      *          new poly2tri.Point(200, 250),
      *          new poly2tri.Point(250, 250)
      *      ];
      *      swctx.addPoints(points);
      * @example
      *      const swctx = new poly2tri.SweepContext(contour);
      *      swctx.addPoints([{x:150, y:150}, {x:200, y:250}, {x:250, y:250}]);
      *
      * @param points - array of "Point like" object with {x,y}
      */
    def addPoints(point: js.Array[XY]): SweepContext = js.native
    
    /**
      * Get the bounding box of the provided constraints (contour, holes and
      * Steinter points). Warning : these values are not available if the triangulation
      * has not been done yet.
      *
      * @returns object with 'min' and 'max' Point
      */
    def getBoundingBox(): Max = js.native
    
    /**
      * Get result of triangulation.
      * The output triangles have vertices which are references
      * to the initial input points (not copies): any custom fields in the
      * initial points can be retrieved in the output triangles.
      *
      * @example
      *      const swctx = new poly2tri.SweepContext(contour);
      *      swctx.triangulate();
      *      const triangles = swctx.getTriangles();
      * @example
      *      const contour = [{x:100, y:100, id:1}, {x:100, y:300, id:2}, {x:300, y:300, id:3}];
      *      const swctx = new poly2tri.SweepContext(contour);
      *      swctx.triangulate();
      *      const triangles = swctx.getTriangles();
      *      typeof triangles[0].getPoint(0).id
      *      // → "number"
      *
      * @returns array of triangles
      */
    def getTriangles(): js.Array[Triangle] = js.native
    
    /**
      * Triangulate the polygon with holes and Steiner points.
      * Do this AFTER you've added the polyline, holes, and Steiner points
      * @example
      *      const swctx = new poly2tri.SweepContext(contour);
      *      swctx.triangulate();
      *      const triangles = swctx.getTriangles();
      */
    def triangulate(): SweepContext = js.native
  }
  
  @JSImport("poly2tri", "Triangle")
  @js.native
  class Triangle protected () extends StObject {
    def this(a: XY, b: XY, c: XY) = this()
    
    def containsPoint(point: XY): Boolean = js.native
    
    def containsPoints(p1: XY, p2: XY): Boolean = js.native
    
    /**
      * Get one vertice of the triangle.
      * The output triangles of a triangulation have vertices which are references
      * to the initial input points (not copies): any custom fields in the
      * initial points can be retrieved in the output triangles.
      * @example
      *      const contour = [{x:100, y:100, id:1}, {x:100, y:300, id:2}, {x:300, y:300, id:3}];
      *      const swctx = new poly2tri.SweepContext(contour);
      *      swctx.triangulate();
      *      const triangles = swctx.getTriangles();
      *      typeof triangles[0].getPoint(0).id
      *      // → "number"
      * @param index - vertice index: 0, 1 or 2
      * @returns point
      */
    @JSName("getPoint")
    def getPoint_0(index: `0`): XY = js.native
    @JSName("getPoint")
    def getPoint_1(index: `1`): XY = js.native
    @JSName("getPoint")
    def getPoint_2(index: `2`): XY = js.native
    
    /**
      * Get all 3 vertices of the triangle as an array
      */
    def getPoints(): js.Tuple3[XY, XY, XY] = js.native
    
    def isInterior(): Boolean = js.native
  }
  
  @JSImport("poly2tri", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  trait IPointLike extends StObject {
    
    /** x coordinate */
    var x: Double
    
    /** y coordinate */
    var y: Double
  }
  object IPointLike {
    
    inline def apply(x: Double, y: Double): IPointLike = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPointLike]
    }
    
    extension [Self <: IPointLike](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait SweepContextOptions extends StObject {
    
    /**
      * cloneArrays - if `true`, do a shallow copy of the Array parameters (contour, holes).
      * Points inside arrays are never copied.
      * Default is `false` : keep a reference to the array arguments, who will be modified in place.
      */
    var cloneArrays: js.UndefOr[Boolean] = js.undefined
  }
  object SweepContextOptions {
    
    inline def apply(): SweepContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SweepContextOptions]
    }
    
    extension [Self <: SweepContextOptions](x: Self) {
      
      inline def setCloneArrays(value: Boolean): Self = StObject.set(x, "cloneArrays", value.asInstanceOf[js.Any])
      
      inline def setCloneArraysUndefined: Self = StObject.set(x, "cloneArrays", js.undefined)
    }
  }
  
  type XY = IPointLike
}
