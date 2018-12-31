package typings
package poly2triLib.poly2triMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("poly2tri", "Triangle")
@js.native
class Triangle protected () extends js.Object {
  def this(a: XY, b: XY, c: XY) = this()
  def containsPoint(point: XY): scala.Boolean = js.native
  def containsPoints(p1: XY, p2: XY): scala.Boolean = js.native
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
  def getPoint(index: poly2triLib.poly2triLibNumbers.`0`): XY = js.native
  def getPoint(index: poly2triLib.poly2triLibNumbers.`1`): XY = js.native
  def getPoint(index: poly2triLib.poly2triLibNumbers.`2`): XY = js.native
  /**
    * Get all 3 vertices of the triangle as an array
    */
  def getPoints(): js.Tuple3[XY, XY, XY] = js.native
  def isInterior(): scala.Boolean = js.native
}

