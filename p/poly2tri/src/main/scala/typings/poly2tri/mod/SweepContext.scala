package typings.poly2tri.mod

import typings.poly2tri.anon.Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("poly2tri", "SweepContext")
@js.native
class SweepContext protected () extends js.Object {
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

