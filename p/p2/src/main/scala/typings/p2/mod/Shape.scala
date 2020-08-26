package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Shape")
@js.native
class Shape () extends js.Object {
  def this(options: ShapeOptions) = this()
  var angle: Double = js.native
  var area: Double = js.native
  var body: Body = js.native
  var boundingRadius: Double = js.native
  var collisionGroup: Double = js.native
  var collisionMask: Double = js.native
  var collisionResponse: Boolean = js.native
  var id: Double = js.native
  var material: Material = js.native
  var position: js.Tuple2[Double, Double] = js.native
  var sensor: Boolean = js.native
  var `type`: Double = js.native
  def computeAABB(): Unit = js.native
  def computeAABB(out: js.UndefOr[scala.Nothing], position: js.UndefOr[scala.Nothing], angle: Double): Unit = js.native
  def computeAABB(out: js.UndefOr[scala.Nothing], position: js.Tuple2[Double, Double]): Unit = js.native
  def computeAABB(out: js.UndefOr[scala.Nothing], position: js.Tuple2[Double, Double], angle: Double): Unit = js.native
  def computeAABB(out: AABB): Unit = js.native
  def computeAABB(out: AABB, position: js.UndefOr[scala.Nothing], angle: Double): Unit = js.native
  def computeAABB(out: AABB, position: js.Tuple2[Double, Double]): Unit = js.native
  def computeAABB(out: AABB, position: js.Tuple2[Double, Double], angle: Double): Unit = js.native
  def computeMomentOfInertia(): Double = js.native
  def computeMomentOfInertia(mass: Double): Double = js.native
  def raycast(): Unit = js.native
  def raycast(
    result: js.UndefOr[scala.Nothing],
    ray: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    angle: Double
  ): Unit = js.native
  def raycast(
    result: js.UndefOr[scala.Nothing],
    ray: js.UndefOr[scala.Nothing],
    position: js.Tuple2[Double, Double]
  ): Unit = js.native
  def raycast(
    result: js.UndefOr[scala.Nothing],
    ray: js.UndefOr[scala.Nothing],
    position: js.Tuple2[Double, Double],
    angle: Double
  ): Unit = js.native
  def raycast(result: js.UndefOr[scala.Nothing], ray: Ray): Unit = js.native
  def raycast(result: js.UndefOr[scala.Nothing], ray: Ray, position: js.UndefOr[scala.Nothing], angle: Double): Unit = js.native
  def raycast(result: js.UndefOr[scala.Nothing], ray: Ray, position: js.Tuple2[Double, Double]): Unit = js.native
  def raycast(result: js.UndefOr[scala.Nothing], ray: Ray, position: js.Tuple2[Double, Double], angle: Double): Unit = js.native
  def raycast(result: RaycastResult): Unit = js.native
  def raycast(
    result: RaycastResult,
    ray: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    angle: Double
  ): Unit = js.native
  def raycast(result: RaycastResult, ray: js.UndefOr[scala.Nothing], position: js.Tuple2[Double, Double]): Unit = js.native
  def raycast(
    result: RaycastResult,
    ray: js.UndefOr[scala.Nothing],
    position: js.Tuple2[Double, Double],
    angle: Double
  ): Unit = js.native
  def raycast(result: RaycastResult, ray: Ray): Unit = js.native
  def raycast(result: RaycastResult, ray: Ray, position: js.UndefOr[scala.Nothing], angle: Double): Unit = js.native
  def raycast(result: RaycastResult, ray: Ray, position: js.Tuple2[Double, Double]): Unit = js.native
  def raycast(result: RaycastResult, ray: Ray, position: js.Tuple2[Double, Double], angle: Double): Unit = js.native
  def updateArea(): Unit = js.native
  def updateBoundingRadius(): Double = js.native
}

/* static members */
@JSImport("p2", "Shape")
@js.native
object Shape extends js.Object {
  var BOX: Double = js.native
  var CAPSULE: Double = js.native
  var CIRCLE: Double = js.native
  var CONVEX: Double = js.native
  var HEIGHTFIELD: Double = js.native
  var LINE: Double = js.native
  var PARTICLE: Double = js.native
  var PLANE: Double = js.native
  var idCounter: Double = js.native
}

