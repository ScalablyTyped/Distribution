package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Shape")
@js.native
class Shape () extends js.Object {
  def this(options: ShapeOptions) = this()
  var angle: scala.Double = js.native
  var area: scala.Double = js.native
  var body: Body = js.native
  var boundingRadius: scala.Double = js.native
  var collisionGroup: scala.Double = js.native
  var collisionMask: scala.Double = js.native
  var collisionResponse: scala.Boolean = js.native
  var id: scala.Double = js.native
  var material: Material = js.native
  var position: js.Tuple2[scala.Double, scala.Double] = js.native
  var sensor: scala.Boolean = js.native
  var `type`: scala.Double = js.native
  def computeAABB(): scala.Unit = js.native
  def computeAABB(out: AABB): scala.Unit = js.native
  def computeAABB(out: AABB, position: js.Tuple2[scala.Double, scala.Double]): scala.Unit = js.native
  def computeAABB(out: AABB, position: js.Tuple2[scala.Double, scala.Double], angle: scala.Double): scala.Unit = js.native
  def computeMomentOfInertia(): scala.Double = js.native
  def computeMomentOfInertia(mass: scala.Double): scala.Double = js.native
  def raycast(): scala.Unit = js.native
  def raycast(result: RaycastResult): scala.Unit = js.native
  def raycast(result: RaycastResult, ray: Ray): scala.Unit = js.native
  def raycast(result: RaycastResult, ray: Ray, position: js.Tuple2[scala.Double, scala.Double]): scala.Unit = js.native
  def raycast(
    result: RaycastResult,
    ray: Ray,
    position: js.Tuple2[scala.Double, scala.Double],
    angle: scala.Double
  ): scala.Unit = js.native
  def updateArea(): scala.Unit = js.native
  def updateBoundingRadius(): scala.Double = js.native
}

/* static members */
@JSImport("p2", "Shape")
@js.native
object Shape extends js.Object {
  var BOX: scala.Double = js.native
  var CAPSULE: scala.Double = js.native
  var CIRCLE: scala.Double = js.native
  var CONVEX: scala.Double = js.native
  var HEIGHTFIELD: scala.Double = js.native
  var LINE: scala.Double = js.native
  var PARTICLE: scala.Double = js.native
  var PLANE: scala.Double = js.native
  var idCounter: scala.Double = js.native
}

