package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shape extends js.Object {
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

